/************************************
 * Sub1_10_6_getParentFile.java 
 * Author: iwabuchiken 
 * Date: 2012/2012/03/07/8:24:32 
 * Aim: 
 *	1.
 * <Usage> 1. Run the program 
 * <Source> 1. split	=> http://www.javaroad.jp/java_character6.htm
 ************************************/
package mylib;

import java.io.File;

public class STDLIB {
	/*
	 * param:	None
	 * return:	the file name
	 */
	public static String get_file_name() {
		return new Throwable().getStackTrace()[1].getFileName();
	}//public static String get_file_name()
	
	/*
	 * param:	file name	:String
	 * return:	absolute path	:String
	 */
	public static String get_file_absolute_path(String file_name) {
		/* variable				*/
//		String			file_name	= get_file_name();
		
		/* get the path				*/
		return new File(file_name).getAbsolutePath();
	}//public static String get_file_absolute_path(String file_name)
	/*
	 * 
	 */
	public static String get_project_path
		(String root_name, String target_name) {
		/* prosecces
		 * 1. get a File object (f1)
		 * 2. Check if the file exists (if doesn't => return null)
		 * 3. get the absolute path of f1 (s1)
		 * 4. get an array made up of each dir in s1 (a1)
		 * 5. find the root name in a1 (n1) (if doesn't => return null)
		 * 6. generate an array made up of dirs below n1 (a2)
		 * 7. turn a2 into a string (s1)
		 * 8. return s1
		 */
		/* 1			*/
//		File			f1		= new File(target_name);
		File			f1		= new File(get_file_absolute_path(target_name));
		/* 2				*/
		if (!f1.exists()) {
			System.out.println("f1.toString()=" + f1.getName());
			return null;
		} else {
			//debug
			System.out.println(target_name + " exists: " + f1.toString());
			System.exit(0);
		}
		/* 3				*/
		String		s1		= get_file_absolute_path(target_name);
		
		/* 4				*/
		String[]		a1		= s1.split("\\");
		
		/* 5				*/
//		if (get_index(a1, target_name))
		
		return null;
	}//public static String get_project_path
	
	public static int get_index(String[] sarray, String target) {
		/* processes
		 * 1. start 'for' statement: index i=0
		 * 2. do 'equals'
		 * 3. if match, return i
		 * 4. n mathc, then return -1
		 */
		for (int i = 0; i < sarray.length; i++) {
			if (sarray[i].equalsIgnoreCase(target)) {
				return i;
			}
		}//for (int i = 0; i < sarray.length; i++)
		
		return -1;
	}

}
