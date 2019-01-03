//P 3.6
package ss.week3.pw;
import java.lang.System;

public class TimedPassword extends Password
{
	private int validTime;//indicate how long a password is valid
	private long millis;
	
	//___________________________two constructors ___________________________
	/**whenever the password is reset, the validity period restarts.
	make sure that when the TimedPassword object is constructed, 
	validTime immediately should have a sensible value.*/
	
	/**has expiration time as argument*/
	public TimedPassword (int expirationTime)
	{
		super();
		this.millis=System.currentTimeMillis();
		this.validTime=expirationTime;

	}
	
	/**sets expiration time as default value.
	 * whenever the password is reset, the validity period restarts*/
	public TimedPassword()
	{
		this(3600);
	}
	
	//___________________________queries ___________________________
	public boolean isExpired()//whether the password has expired or not
	{
		return !( (System.currentTimeMillis()-this.millis) <this.validTime);
	}
	
//P 3.6	
	/**you make a method to reset your password. 
similar to how Password has a method to change a password (setWord), 
you should now have a similar method in TimedPassword 
which does the same, 
but which also makes sure that the validity period is reset.
*/
	public boolean testWord(String oldpass,String newpass)
	{
		if (super.setWord(oldpass, newpass)==true)
		{
			this.millis=System.currentTimeMillis();
			return true;
		}
		else
		{
			return false;
		}
	}
}
