/*P-2.15*/ //implement
package ss.week3.hotel;

import static org.junit.Assert.*;

import ss.week3.hotel.Guest;
import ss.week3.hotel.Room;

public class Hotel
{
	private String hotelName;
	private Room roomA;
	private Room roomB;
	private Password hotelPassword; //the password of the hotel

	//----------------constructor-----------------------------
	public Hotel(String string)//can have paramenter
	{
		this.hotelName=string;
	}
	//----------------query-----------------------------

	public String getHotelName()
	{
		return this.hotelName;
	}
	
	public Room getFreeRoom()
	{
		if (roomA.getGuest()==null)
		{
			return roomA;
		}
		else if (roomB.getGuest()==null)
		{
			return roomB;
		}
		else
		{
			return null;
		}
	}
	
	//receive the name of a guest as parameter. 
	//return the Room object where the guest is checked in.
	//return null if there is no such room
	public Room getRoom(String guestName)
	//is there a more simple way?
	{
		if (roomA.getGuest()!=null)
			//if roomA has been checked in by somebody
		{
			if (roomA.getGuest().getName().equals(guestName))
				//if the person who checked in roomA is the person with this guest name
			{
				return roomA;
			}
			else if (roomB.getGuest()!=null)
				//if roomB has been checked in by somebody
			{
				if (roomB.getGuest().getName().equals(guestName))
					//if the person who checked in roomB is the person with this guest name
				{
					return roomB;
				}
			}
		}
		return null;
	}
	
	
	public Password getPassword()
	{
		assertEquals(this.hotelPassword,this.hotelPassword);
		return this.hotelPassword;
	}
	

	//--------------------------command----------------------------
	/*the password should be correct, no guests have this name, hotel is not full.*/
	
/**	checkIn: receives two String objects as parameters. 
 * The first parameter is the password for checking in; 
 * the second parameter is the name of the guest. 
 * returns a Room object with a (new) Guest of the given name checked in; 
 * or returns null if :
			-either the password is wrong, 
			-there already is a guest with this name, 
			-or the hotel is full.*/
	
	public Room checkIn(String inputPassword, String guestName)
	{
		if ( (hotelPassword.testWord(inputPassword))
			&&(this.getRoom(guestName)==null)
			&&(this.getFreeRoom()!=null) )
			{
				Guest guest=new Guest (guestName);//create a Guest class for the guestName
				Room r=this.getFreeRoom();//find a free room, store the free room into variable r
				guest.checkin(r);//set room to the guest class
				
				assertEquals(guest, r.getGuest());
				assertEquals(r, guest.getRoom());
				
				return guest.getRoom();//return the room
			}
		else
			{
				return null;
			}
	}
	
	
/** receiving the name of a guest as a parameter. 
 * The guest is checked out, and
 * the safe in his room is deactivated. 
 * If there is no guest with this name, 
 * nothing happens.*/
	public void checkOut(String guestName) 
	{
		if (this.getRoom(guestName)!=null)
		{
			this.getRoom(guestName).getGuest().checkout();
			this.getRoom(guestName).getSafe().deactivate();
				
			assertEquals(null, roomA.getGuest());
			assertEquals(false, roomA.getSafe().isActive());
		}
	}

	public void setRoomPrice(double priceRoomA, double priceRoomB)
	{
		this.roomA.setPrice(priceRoomA);
		this.roomB.setPrice(priceRoomB);
	}

	public String toString()
	{
		return (getHotelName()+
				"\n"+"room"+roomA.getNumber()+" "+roomA.getGuest().getName()+
				"\n"+"room"+roomB.getNumber()+" "+roomB.getGuest().getName());
	}
	
	//P 3.14
	public Bill getBill(String guestName, int nightNum, java.io.PrintStream printBill)
	{
		Room r=this.getRoom(guestName);//without this is also fine
		Bill bill=new Bill(printBill);
		
		if (r instanceof PricedRoom)
		{
			for (int i=0;i<nightNum;i=i+1)
			{
				bill.newItem((Bill.Item)r);
			}	
		}
		
		if (  (r.getSafe() instanceof PricedSafe)
				&&(r.getSafe().isActive()) )
		{
			bill.newItem( (Bill.Item)(r.getSafe()) );
		}
		bill.close();
		return bill;
	}
}