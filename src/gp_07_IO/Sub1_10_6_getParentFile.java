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
import java.io.IOException;

public class Sub1_10_6_getParentFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		File		file;
		File		p				= null;
		String	file_path	= null;	/* file path			*/
		
		/* initialize		*/
		if (args.length > 0) {
			file	= new File(args[0]);
			System.out.println("args[0]=" + args[0]);
		} else {
//			file	= new File("sub1.dat");
			try {
				/* set path	*/
				/* Canonical				*/
				System.out.println("new File(\".\").getCanonicalPath()="
						+ new File(".").getCanonicalPath());
				
				/* 	Absolute			*/
				System.out.println("new File(\".\").getAbsolutePath()="
						+ new File(".").getAbsolutePath());
				
				/* 	Parent file			*/
				System.out.println("new File(\".\").getParentFile()="
						+ new File(".").getParentFile());
				
				file_path		= String.format("%s\\sub1.dat", new File(".").getCanonicalPath());
				System.out.println(file_path);
				//debug
//				System.exit(0);
				
				/* file			*/
//				file	= new File("sub1.dat");
				file	= new File(file_path);
				
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
				file	= new File("sub1.dat");
			}
		}//if (args.length > 0)

		/* processes	*/
		if (file.exists()) {
			if (file.isFile()) {
				p	= file.getParentFile();
			} else {
				p	= file;
			}//if (file.isFile())
		} else {
			System.out.println("No file or Directory");
			
			System.exit(1);
		}//if (file.exists())
		
		/* show	*/
		System.out.println("p.toString()=" + p.toString());
		System.out.println("file.toString()=" + file.toString());
		
		/* return		*/

	}

}//Sub1_Sample_1_2
