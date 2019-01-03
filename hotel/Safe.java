//P-2.10 specify a class, assert statement
//P-2.12 main method
package ss.week3.hotel;
import static org.junit.Assert.*;
public class Safe
{
	private Password password;
	private boolean activateStatus;//{true means activated, false means deactivated }
	private boolean openStatus;//{true means opened, false means closed }
	
	//constructor
	public Safe()
	{
		this.password=new Password();//should the password be initialized or not?
		this.activateStatus=false;
		this.openStatus=false;
	}
	
	//@queries: 
	/*
	public Password setPassword(String aPassword) //??
	{
		this.password=aPassword;
	}
	*/
	//isActive: indicates whether the safe if active
	public boolean isActive()
	{
		assertEquals(this.activateStatus,isActive());
		return this.activateStatus;
	}
	
	
	//isOpen: indicates whether the safe if open
	public boolean isOpen()
	{
		assertEquals(this.openStatus,isOpen());
		return this.openStatus;
	}
	
	
	//returns a password object 
	//on which the method testWord can be called to check the password
	public Password getPassword()
	{
		assertEquals(this.password,getPassword());
		return this.password;
	}
	
	
	//receives a string with a password text as a parameter, 
	//and activates the safe if the password is correct
	//compare the input string with the initial password
	public void activate (java.lang.String inputPassword)
	{
		if (password.testWord(inputPassword))//Tests if a given word is equal to the current password.
		{
			this.activateStatus=true;
			assertEquals(true,this.activateStatus);
			assertEquals(false,this.openStatus);
		}
	}
	

	//without parameters, closes the safe and deactivates it
	public void deactivate()
	{
		this.activateStatus=false;
		this.openStatus=false;
		assertEquals(false,this.activateStatus);
		assertEquals(false,this.openStatus);
	}

	
	//receives a string with a password text as a parameter, 
	//opens the safe if it is active and the password is correct
	public void open (java.lang.String openPassword)
	{
		assertEquals(true,openPassword!=null);
		if (password.testWord(openPassword)&&(isActive()))
		{
			this.openStatus=true;
			assertEquals(true,this.openStatus);
			assertEquals(true,this.activateStatus);
		}
	}
	
	//without parameters, closes the safe (but does not change its activity status)
	public void close ()
	{
		this.openStatus=false;
		assertEquals(false,this.openStatus);
		assertEquals(true,this.activateStatus);
	}
	
	//P2.12 calls the constructor or a method of Safe so that the precondition is violated. 
	public static void main(String [ ] args)
	{
		Safe safe=new Safe();
		safe.open(null);// violate:¡¡password is not a string, for example: an integer 
		//class SafeTest; //execute the test?
		
	}
}
