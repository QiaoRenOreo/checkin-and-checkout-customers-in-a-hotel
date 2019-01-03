//3.13
package ss.week3.hotel;
//extends Room and implements Bill.Item
public class PricedRoom extends Room implements Bill.Item
{
	private double roomPrice;
	
	//_______________constructor______________
	public PricedRoom (int roomNum, double roomPri, double safePri)
	{
		super(roomNum, new PricedSafe(safePri) );
		this.roomPrice=roomPri;
	}
	
	/**In the constructor a new PricedSafe should be created
	 *  and given to the parent(Room). 
	 *  Therefore you should add an extra constructor to 
	 *  Room which receives and uses that given Safe.*/

	public double getAmount()
	{
		return this.roomPrice;
	}
	
	//override the ToString method: it returns the price per night
	public String toString() 
	{
		return ("Room Price Per Night  "+this.roomPrice);
	}
	
}
