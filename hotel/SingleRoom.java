package ss.week3.hotel;

public class SingleRoom implements Bill.Item
{
	private double price;
	//constructor
	private SingleRoom(double singleRoomPri)
	{
		this.price=singleRoomPri;
	}
	//commands
	public double getAmount()
	{
		return this.price;//euros per night
	}
	public String toString()
	{
		return "Single-Bed room"+this.price;
	}
}
