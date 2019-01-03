package ss.week3;

public class Format 
{
	/** https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html
	 * */
	public static void printLine(String text, double amount)
	{
		System.out.printf("%-20s .2f%n", text, amount);
	}
	
	public static void main(String[] args)
	{ 
		printLine("text1", 1.00);
		printLine("other text", -12.12);
		printLine("something", 0.20);
	}
}
