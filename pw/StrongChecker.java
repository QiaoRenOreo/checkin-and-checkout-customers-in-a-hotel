//P 3.2, 3.3
package ss.week3.pw;

public class StrongChecker extends BasicChecker
{
	/**
	 * Character.isDigit(string.charAt(index)) (JavaDoc) will return true if it's a digit
	 * Character.isLetter(string.charAt(index)) (JavaDoc) will return true if it's a letter
	 * */

	public boolean startsWithALetter(String password)
	{
		return Character.isLetter(password.charAt(0));
	}
	public boolean endsWithADigit(String password)
	{
		return Character.isDigit(password.charAt(password.length()-1));
	}
	public boolean acceptable (String password)
	{
		return (super.acceptable (password)
				&&(startsWithALetter(password))
				&&(endsWithADigit(password))
				);
	}
	
	//because of inheritance, necessary to write generatePassword?  
	public String generatePassword()
	{
		return "a23456ab1";
	}
}
