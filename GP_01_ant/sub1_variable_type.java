/************************************`
 * sub1_variable_type.java			*
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

public class sub1_variable_type
{
    public static void main(String[] args)
    {
//    	String name = Object.objectClass().getName();
    	String name = "abc".getClass().getName();

    	System.out.println("Variable: name");
    	System.out.println("Type: " + name);

    	//02
    	System.out.println
			("<02: String.class>");
    	System.out.println
			(String.class);
    	//03
    	System.out.println
			("<03: String.class.getName()>");
    	System.out.println
			(String.class.getName());
    }
}