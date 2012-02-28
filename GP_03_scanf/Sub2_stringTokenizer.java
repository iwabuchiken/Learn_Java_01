/************************************`
 * Sub2_stringTokenizer.java
 * Author: Iwabuchi Ken				*
 * Date: 20120209_090456
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. http://www.math.meiji.ac.jp/~mk/labo/java/intro-java/node10.html
 *									*
 ************************************/

//import java.lang.*;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sub2_stringTokenizer
{
    public static void main(String[] args)
    {
    	BufferedReader br =
    			new BufferedReader(
    			new InputStreamReader(System.in));
    	StringTokenizer st;

    	String s;
		try {
			/* Read the input */
			System.out.print("Input a string: ");
			s = br.readLine();
			/* Get tokens */
			st = new StringTokenizer(s, " ");
			/* Show the number of the tokens */
			System.out.print(
					"The number of the tokens: ");
			System.out.println(st.countTokens());
		} catch (Exception e) {
			System.out.println(e);
			s = "Exception!";
		}

    	System.out.printf(
    			"input=%s(length=%d)\n",
    			s, s.length());
    }//public static void main(String[] args)
}