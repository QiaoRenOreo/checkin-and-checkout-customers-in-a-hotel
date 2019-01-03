//P-2.8 specify a class
package ss.week3.hotel;
public class SafeSpecification
{
	/*password stores the password of this safe, it is an instance*/
	private Password password;	
	/*activateStatus stores an element: {true means activated, false means deactivated }*/
	private boolean activateStatus;
	/* openStatus stores an element: {true means opened, false means closed }*/
	private boolean openStatus;
	
	/*_______________________________constructor_____________________________
	/* create a safe, give the initial value to activateStatus and openStatus */

	public SafeSpecification()
	{
	}
	
	/*_______________________________queries________________________________*/
	
	//return the activateStatus,isActive: indicates whether the safe if active
	//@requires (\result=this.activateStatus)
	public boolean isActive()
	{
		return null; 
	}
	
	//@requires (\result=this.openStatus)
	//isOpen: indicates whether the safe if open, return the openStatus
	public boolean isOpen()
	{
		return null;
	}
	
	/*returns a password object on which the method testWord can be called to check the password*/
	public Password getPassword()
	{
		return null;
	}

	
	/*
	@ensure (this.password.testWord(inputPassword))=>(activateStatus=true)&&(openStatus=false)
	activates the safe if the password is correct,
	compare the input string with the initial password
	*/
	public void activate (java.lang.String inputPassword)
	{

	}
	
/*	
 * @ensures (activateStatus==false)&&(openStatus==false)
	without parameters, closes the safe and deactivates it*/
	public void deactivate()
	{

	}
	

/* @ requires (openPassword!=null)
 * @ ensures (this.password.testWord(openPassword))&&(activateStatus)=>(openStatus)
	receives a string with a password text as a parameter, 
	opens the safe if it is active and the password is correct*/
	public void open (java.lang.String openPassword)
	{
	}
	
	/*@ensures (!openStatus)
	without parameters, closes the safe (but does not change its activity status)*/
	public void close ()
	{
	}

}