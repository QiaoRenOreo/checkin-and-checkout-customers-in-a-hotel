//P-2.8 specify a class
//P 3.5
package ss.week3.pw;
import ss.week3.pw.Checker;
public class Password
{
	static String INITIAL="ab1234";//static is for constant variables; this is a constant variable. So the variable name should all be capital
	String password; //not constant. used for store new password
	private Checker checker;
	private String factoryPassword;
	
	//_____________________________two constructors___________________________
	public Password (Checker checker1)
	{
		this.checker=checker1;
		this.factoryPassword=checker1.generatePassword();
	}
	public Password ()
	{
		this(new BasicChecker());
		
	}
	
	//P3.5_____________________________queries___________________________
	public Checker getChecker()
	{
		return this.checker;
	}
	
	//factoryPassword: initialize the Password object with a known value.
	//this value can be passed to a password client who can change it
	public String getFactoryPassword()
	{
		return this.factoryPassword;
	}
	
	
	//Test if a given string is an acceptable password.
	boolean  acceptable(java.lang.String suggestion)  
	{	
		return checker.acceptable(suggestion); 
	}
	
	//___________________________________________________________________
	//	Tests if a given word is equal to the current password.
	boolean testWord(String test) 
	{
		for (int i = 0; i < test.length(); i++)
		{
			if (test.charAt(i)!=password.charAt(i))
				return false;
		}
		return true;
	}
	
	
/**	Method setWord should do the following:
  	Check if the old password is correct;
	Check if the new password is acceptable;
	If so, update the password.*/
	public boolean setWord(String oldpass,String newpass)
	{
		if (testWord(oldpass))//if the condition is true. 
		{
			if (acceptable(newpass))
			{
				password=newpass;
				return true;				
			}
			else
			{
				System.out.println("the new password is not acceptable"); 
				return false;				
			}
		}
		else
		{
			System.out.println("the old password is wrong");
			return false;
		}	
	}
	

	

}
