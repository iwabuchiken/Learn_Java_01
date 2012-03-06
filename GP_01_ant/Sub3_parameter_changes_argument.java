/************************************`
 * Sub3_parameter_changes_argument.java
 * Author: Iwabuchi Ken				*
 * Date: 20120131_073542			*
 * Aim:								*
 * 	1. Show the type name of a variable
 * <Usage>
 *	1. Run the program; Shown:
 *		1. Variable literal
 *		2. Variable value
 *		3. Variable type name
 * <Source>
 * 	1. http://www.mkc.zaq.ne.jp/libra/java/java_11.html
 *									*
 ************************************/

//import java.lang.*;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

public class Sub3_parameter_changes_argument
{
	static private void change_value(int num) {
		num = 100;
	}//private void change_value(int num) {
	
	static private void change_value(int[] nums) {
		nums[0] = 100;
	}//private void change_value(int num) {
	
    public static void main(String[] args)
    {
    	/* Variables */
    	int		num = 10;
    	int[]	nums = new int[3];
    	
    	/* Show num */
    	System.out.println("num=" + num);
    	System.out.println("nums[0]=" + nums[0]);
    	/* Do the func */
    	change_value(num);
    	change_value(nums);
    	/* Show num */
    	System.out.println("num=" + num);
    	System.out.println("nums[0]=" + nums[0]);
    	
    }//public static void main(String[] args)
}//Sub3_parameter_changes_argument.java
