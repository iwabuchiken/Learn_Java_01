/************************************`
 * File: Sub1_split_string.java
 * Author: Iwabuchi Ken				*
 * Date: 20120222_104742
 * Aim:								*
 * 	1. 
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. split	=> http://www.javaroad.jp/java_character6.htm
 * 	2. length of an array	=> http://www.javadrive.jp/start/array/index6.html
 *	3. for each	=> http://wisdom.sakura.ne.jp/programming/java/java5_5.html
 ************************************/

//import java.lang.*;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

public class Sub1_split_string
{
    public static void main(String[] args)
    {
    	/**********************
    	 * members
    	 * 
    	 **********************/
    	String		s1 = "abc.def.ghi";
    	String[]	sAry;
//    	System.out.println("args[0]=" + args[0]);
//    	System.out.println(
//    		"args.length=" + args.length);
    	/* initialize	*/
    	sAry = s1.split("\\.");
    	
    	/* display: length of sAry	*/
    	System.out.println("s1=" + s1);
    	System.out.println(
    		"sAry.length=" + sAry.length);
    	for (String s: sAry) {
    		System.out.println(s);
    	}
    	
    }//public static void main(String[] args)
}//public class Sub1_split_string
