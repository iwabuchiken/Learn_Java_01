/************************************
 * Sub3_use_stdlib.java 
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

public class Sub3_use_stdlib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		String			file_name;
		String			file_name_absolute;
		String			project_path;
		
		/* processes				*/
		file_name		= STDLIB.get_file_name();
		System.out.println("file_name is=" + file_name);
		
		/* absolute path				*/
		file_name_absolute	= STDLIB.get_file_absolute_path(file_name);
		System.out.println("file_name_absolute=" + file_name_absolute);
		
		/* project path				*/
		project_path				= STDLIB.get_project_path("src", file_name);
		System.out.println("project_path=" + project_path);
		
		/* return		*/

	}//public static void main(String[] args)

//	public static String get_file_name() {
//		return new Throwable().getStackTrace()[1].getFileName();
//	}//public static String get_file_name()
	
	

}//Sub3_use_stdlib
