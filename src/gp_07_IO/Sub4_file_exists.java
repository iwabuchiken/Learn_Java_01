/************************************
 * Sub4_file_exists.java 
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

public class Sub4_file_exists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		String			file_name;
		String			file_path_absolute;
		String			project_path;
		File				file;
		
		/* processes				*/
		file_name		= (new Throwable()).getStackTrace()[0].getFileName();
		file_path_absolute	= new File(file_name).getAbsolutePath();
		file				= new File(file_path_absolute);
//		file				= new File("Sub4_file_exists.java");
		file				= new File("./gp_07_IO/Sub4_file_exists.java");
		
		/* show				*/
		System.out.println("file_path_absolute=" + file_path_absolute);
		
		/* processes		*/
		if (file.exists()) {
			System.out.println("Yes, file exists");
		} else {
			System.out.print("No, file exists not: ");
			System.out.println("file.toString()=" + file.toString());
		}
		
		/* return		*/

	}//public static void main(String[] args)

}//Sub4_file_exists
