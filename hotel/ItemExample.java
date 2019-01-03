package ss.week3.hotel;

public class ItemExample implements Bill.Item
{
	String str;
	double amount;
	//________________constructor______________
	public ItemExample (String s,double itemAmount)
	{
		str=s;
		amount=itemAmount;
	}
	//_________________Queries____________________
	@Override
	public double getAmount() 
	{
		return amount;
	}
	public String toString()
	{
		return str;
	}
}
