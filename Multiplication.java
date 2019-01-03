//P 3.1
/**model a binary integer operation with identity
 * define a class Multiplication that models the integer operation of multiplication,
 * and implements the interface
 */

package ss.week3;
import ss.week3.OperatorWithIdentity;

class Multiplication implements OperatorWithIdentity
{
	/**
	 * Perform this operation with the specified operands.
	 */
	public int operate(int left, int right)
	{
		int multi= left * right;
		String strMulti=Integer.toBinaryString(multi);
		int intMulti=Integer.parseInt(strMulti);
		return intMulti;

	}
	
	/**
	 * The identity for this operator. For any int i,
	 * this.operate(this.identity, i) == i
	 * this.operate(i, this.identity) == i
	 * identity is a special number. for addition, is 0;
	 * because 0+x=x+0+x for every x
	 */
	public int identity()
	{
		return 1;
	}
}