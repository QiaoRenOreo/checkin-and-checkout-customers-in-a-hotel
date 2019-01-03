//P-2.8 specify a class
package ss.week3.hotel;
public class Password
{
	static java.lang.String INITIAL="ab1234";//static is for constant variables; this is a constant variable. So the variable name should all be capital
	java.lang.String password; //not constant. used for store new password

	public Password() //constructor does not return any value
	{
		password=INITIAL; //create a variable
		//for example, when UT creates an account for a student. the student should always receive an initial password in the beginning. 
	}
	
	public static boolean containsWhiteSpace(String testCode)
	{
	    if(testCode != null)
	    {
	        for(int i = 0; i < testCode.length(); i++)
	        {
	            if(Character.isWhitespace(testCode.charAt(i)))
	            {
	                return false;
	            }
	        }
	    }
	    return true;
	}
	//indexof(" ") return -1 when no space, index when space occurs. contains ("  ")
	
	//Test if a given string is an acceptable password.
	boolean  acceptable(java.lang.String suggestion)  
	{	
		return !((suggestion.length()<6)||(!containsWhiteSpace(suggestion)));//faulse become true, true becomes false
	}
	
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
	
	
/*	Method setWord should do the following:
 * 	Check if the old password is correct;
	Check if the new password is acceptable;
	If so, update the password.*/
	public boolean setWord(java.lang.String oldpass,
							java.lang.String newpass)
	{
		if (testWord(oldpass))//if the condition is true. in boolean case: if true
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
