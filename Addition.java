//P 3.1
/**model a binary integer operation with identity
 * define a class Addition that models the integer operation of addition,
 * and implements the interface
 */

package ss.week3;
import ss.week3.OperatorWithIdentity;

class Addition implements OperatorWithIdentity
{
	/**
	 * Perform this operation with the specified operands.
	 */
	public int operate(int left, int right)
	{
		int sum = left + right;
		String strSum=Integer.toBinaryString(sum);
		int intSum=Integer.parseInt(strSum);
		return intSum;
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
		return 0;
	}
}

/** another way to convert decimal to binary
 *  public void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
     
- See more at: http://www.java2novice.com/java-interview-programs/decimal-to-binary/#sthash.uruB8VO6.dpuf*/
