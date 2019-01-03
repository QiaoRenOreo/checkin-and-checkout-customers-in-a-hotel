package ss.week3.hotel;

public class DoubleRoom 
{
	private double price;
	//constructor
	private DoubleRoom(double doubleRoomPri)
	{
		this.price=doubleRoomPri;
	}
	//commands
	public double getAmount()
	{
		return this.price;//euros per night
	}
	public String toString()
	{
		return "Double-Bed room"+this.price;
	}

}
