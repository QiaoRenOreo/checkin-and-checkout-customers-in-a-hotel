//P 3.12
package ss.week3.hotel;

//extends Safe and implement Item

public class PricedSafe extends Safe implements Bill.Item 
{
	private String description;
	private double amount;
	//__________________constructor__________________
	public PricedSafe (double priceInput)
	{
		this.description="Safe";
		this.amount=priceInput;
	}
	public double getAmount()
	{
		return this.amount;
	}
	
	public String toString()
	{
		return (this.description+"  "+this.amount);
	}
}
