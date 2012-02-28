/************************************`
 * GettingStartedWithUML2.java
 * Author: Iwabuchi Ken				*
 * Date: 20120209_090456
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1.http://www.math.meiji.ac.jp/~mk/labo/java/intro-java/node10.html
 *									*
 ************************************/

//import java.lang.*;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

public class GettingStartedWithUML2
{
    public static boolean	DEBUG	= true;
    
    protected static void out(String output) {
    	if (DEBUG) {
    		System.out.println(output);
    	}
    }
    
    protected static void err(String error) {
    	System.err.println(error);
    }
}