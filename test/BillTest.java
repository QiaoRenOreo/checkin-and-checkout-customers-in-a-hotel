/**System.out is an object of the type PrintStream. 
 * Thus it should be passed to a constructor that expects to get a PrintStream. 
 * Considering that it is about the class Bill, 
 * you would probably have a constructor in the Bill class 
 * that expects a PrintStream.*/

//P 3.11
package ss.week3.test;
import static org.junit.Assert.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

import ss.week3.hotel.Bill;
import ss.week3.hotel.ItemExample;
import ss.week3.hotel.PricedSafe;
import ss.week3.pw.TimedPassword;

public class BillTest {
	Bill bill; 
	
	@Before
    public void setUp() throws Exception 
	{
		bill = new Bill(null);
    }
	@Test
	public void test() throws Exception
	{

		ItemExample item1=new ItemExample ("Single-Bed room 101", 30.0);
		assertEquals(30.0,item1.getAmount(),0.001);
		assertEquals("Single-Bed room 101",item1.toString());
		
		ItemExample item2=new ItemExample ("Double-Bed room 202", 60.0);
		assertEquals(60.0,item2.getAmount(),0.001);
		assertEquals("Double-Bed room 202",item2.toString());
		
		/**it is not clear how to test PrintStream using out setup.
		 * Therefore, set PrintStream to null. so there will be no output.
		 * if you wish to test your formatting of the bill,
		 * you can add a method main to the class
		 * 			and write to standard output
		 * 			i.e. pass System.out as argument to the constructor*/
		bill.newItem(item1);
		bill.newItem(item2);
		
		bill. getSum();
		assertEquals(90.0,bill.getSum(),0.001);
		
		bill.close();
	}
	
}
