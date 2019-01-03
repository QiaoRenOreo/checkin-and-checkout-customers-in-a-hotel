/*P-2.14*/ //specification
package ss.week3.hotel;

import static org.junit.Assert.*;

import ss.week2.hotel.Room;

public class HotelSpecification
{
	private String hotelName;
	private Room roomA;
	private Room roomB;
	private Password hotelPassword; //the password of the hotel


	//----------------constructor-----------------------------
	public HotelSpecification(String string)//can have paramenter
	{
	}
	//----------------query-----------------------------

	public String getHotelName()
	{
		return null;
	}
	
	public Room getFreeRoom()
	{
			return null;
	}
	
	public Room getRoom(String guestName)
	{
			return null;
	}
	
	public Password getPassword()
	{
		return null;
	}
	

	//----------------command----------------------------
	/*the password should be correct, no guests have this name, hotel is not full.*/

	
	public Room checkIn(String inputPassword, String guestName)
	{
		return null;
	}
	

	public void checkOut(String guestName) 
	{
	}

	public String toString()
	{
		return null;
	}
}