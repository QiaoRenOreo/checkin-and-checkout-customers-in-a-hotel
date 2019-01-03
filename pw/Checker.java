//P3.3,3.4
package ss.week3.pw;

public interface Checker 
{
	/**
	 * return true if the parameter is an acceptable password
	 * */
	public boolean acceptable (String password);
	public String generatePassword();//returns an acceptable string
}
