//P 3.2
package ss.week3.pw;

public class BasicChecker implements Checker
{
	public static boolean containsWhiteSpace(String testCode)
	{
	    if(testCode != null)
	    {
	        for(int i = 0; i < testCode.length(); i++)
	        {
	            if(Character.isWhitespace(testCode.charAt(i)))
	            {
	                return true;//the password contains white space
	            }
	        }
	    }
	    return false;//password does not contain white space
	}
	
	public boolean acceptable (String password)
	{
		return ((password.length()>=6)&&(!containsWhiteSpace(password)));
	}
	public String generatePassword()
	{
		return "123456abc";

	}
	
	//a method INITPASS ??
/*	public String INIPASS ()
	{
		
	}*/
}
