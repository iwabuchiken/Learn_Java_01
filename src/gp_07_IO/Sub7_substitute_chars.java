/************************************
 * Sub6_get_project_path.java 
 * Author: iwabuchiken 
 * Date: 2012/2012/03/07/8:24:32 
 * Aim: 
 *	1.
 * <Usage> 1. Run the program 
 * <Source> 1. __FILE__ => http://d.hatena.ne.jp/fumokmm/20070724/1185294796
 ************************************/
package gp_07_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * mylib.STDLIB
 * 	1. get_file_name()
 */
import mylib.STDLIB;

public class Sub7_substitute_chars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables				*/
		String		s1		= "abcde";	/* target string		*/
		String		s2;						/* new string			*/
		
		/* processes				*/
		s2 = STDLIB.substitute_chars(s1, 'c', '/');
		System.out.println("s2=" + s2);
		
		/* return		*/

	}//public static void main(String[] args)

}//Sub6_get_project_path
