package ss.week3.hotel;
import ss.week3.hotel.Room;

public class Guest 
{
	private String name;
	private Room room;
	
	
	public Guest (String n)
	{
		this.name=n;
	}
	public String getName()//Returns the name of this Guest.
	{
		return this.name;
	}
	public Room getRoom()//Returns the Room that is rented by this Guest.
	{
		return room;
	}
	public boolean checkin (Room r)
	{
		if ((r.getGuest()==null)&&(this.getRoom()==null))
		{
			this.room=r;
			r.setGuest(this);
			return true;
		}
		else
		{
			return false;	
		}

	}
	public boolean checkout ()
	{
		if (this.getRoom()==null)
			return false;
		else
		{
			this.room.setGuest(null);//Also resets the Guest-reference of the (current) Room.
			this.room=null;//Sets the Room of this Guest to null.		 
			return true;
		}
	}
	
    public String toString()
    {
    	return this.name;
    }
}
