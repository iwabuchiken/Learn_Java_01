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

public class Sub6_get_project_path {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String	file_path_full		= STDLIB.get_project_path(
//									"src", STDLIB.get_file_name(), 
									"src", "sub6.dat",
									new Sub6_get_project_path()
									.getClass().getPackage().getName());
		
		System.out.println("file_path_full=" + file_path_full);
		
		/* write to the file		*/
		File				fout	= new File(file_path_full);
		try {
			FileWriter		fr		= new FileWriter(fout);
			fr.write(STDLIB.get_file_name());
			fr.close();
			System.out.println("File written");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
		/* processes				*/
//		System.out
//				.println("new Sub6_get_project_path().getClass().getPackage().getName()="
//						+ new Sub6_get_project_path().getClass().getPackage().getName());
		
		/* return		*/

	}//public static void main(String[] args)

}//Sub6_get_project_path
