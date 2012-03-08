/************************************
 * Sub8_create_data_in_doc_dir.java 
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

public class Sub8_create_data_in_doc_dir {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables				*/
		String		s1		= "./doc/sub8.dat";	/* target string		*/
		File			f		= new File(s1);
		try {
			FileWriter 	fr		= new FileWriter(f);
			fr.write("abcde\n");
			fr.close();
			System.out.println("File written: " + s1); 
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		/* processes				*/
		
		/* return		*/

	}//public static void main(String[] args)

}//Sub8_create_data_in_doc_dir
