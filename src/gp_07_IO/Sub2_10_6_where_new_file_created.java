/************************************
 * Sub1_Sample_1_2.java 
 * Author: iwabuchiken 
 * Date: 2012/2012/03/07/8:24:32 
 * Aim: 
 *	1.
 * <Usage> 1. Run the program <Source> 1.
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

public class Sub2_10_6_where_new_file_created {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		File				file;
		File				p				= null;
		String			file_path	= null;	/* file path			*/
		String			file_path_absolute	= null;	/* file absolute path	*/
		FileWriter		fr				= null;	/* file reader		*/
//		STDLIB			slib			= new STDLIB();
		
		/* initialize		*/
		/* file path				*/
		file_path	= STDLIB.get_file_name();
		System.out.println("file_path=" + file_path);
		
		/* absolute path	*/
		file_path_absolute	= STDLIB.get_file_absolute_path(file_path);
		System.out.println("file_path_absolute is..." + file_path_absolute);
		
		file			= new File("sub2.dat");
		try {
			fr			= new FileWriter(file);
			fr.write("Hi.\n");
			fr.close();
			System.out.println("file written");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		/* process				*/
		
		
		/* return		*/

	}//public static void main(String[] args)

//	public static String get_file_name() {
//		return new Throwable().getStackTrace()[1].getFileName();
//	}//public static String get_file_name()
	
	

}//Sub1_Sample_1_2
