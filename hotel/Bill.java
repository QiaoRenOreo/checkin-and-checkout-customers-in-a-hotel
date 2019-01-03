//P 3.8, 3.9, 3.10
package ss.week3.hotel;
import java.io.PrintStream;
public class Bill 
{
	private PrintStream printStream;
	private double sumPrice;
	
	public interface Item //P 3.10 
	{
		public double getAmount();		
		public String toString();
	}
	
	//P3.9 ___________________constructor__________________________
	
	/**Constructs: a Bill sending the output to a given PrintStream. 
	 * If the PrintStream is null there will be no output.
	 * Parameters:theOutStream - output stream; 
		or null if you don't want output.*/	
	public Bill (PrintStream theOutStream) 
	{
		this.printStream=theOutStream;
		this.sumPrice=0;
	}
	
	//P 3.9 ______________________commands___________________________________
	  
	//newItem: Add an item to the Bill. 
	//If there is an output, 
	//		the item will be printed on this output 
	//		and the amount will be added to the sum of the Bill
	//Parameters: item - the new item
	public void printLine(String text, double amount)
	{
		this.printStream.printf("%-20s .2f%n", text, amount);
	}
	
	/**methods newItem: attempt to write to the PrintStream
	 * methods close: attempt to write to the PrintStream*/
	public void newItem(ItemExample item)
	{
		if (item!=null)
		{
			printLine(item.toString(), item.getAmount());
			Bill.this.sumPrice+=item.getAmount();
		}
	}
	
	//getSum:Returns the sum of the Bill.
	public double getSum()
	{
		return Bill.this.sumPrice;
	}
	
	//close:Print the sum of the bill on the output stream.
	public void close()
	{
		printLine("sum", this.getSum());
	
	}
	

}
