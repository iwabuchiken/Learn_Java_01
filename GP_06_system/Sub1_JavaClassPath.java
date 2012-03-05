import java.util.Properties;

/************************************`
 * File: Sub1_JavaClassPath.java
 * Author: Iwabuchi Ken				*
 * Date: 20120222_104742
 * Aim:								*
 * 	1. 
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. Properties.list()	=> http://www.roseindia.net/java/example/java/io/printstream.shtml
 * 	2. Properties			=> http://www.tohoho-web.com/java/other.htm
 * 	3. "sprintf" equivalent	=> http://d.hatena.ne.jp/aqvi/20080405/1207413297
 ************************************/

//import java.lang.*;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.*;

public class Sub1_JavaClassPath
{
    public static void main(String[] args)
    {
    	/**********************
    	 * members
    	 * 
    	 **********************/
    	/* variables			*/
    	Properties		prop;	/* get system properties	*/
    	File				fout;		/* output file name			*/
    	FileWriter				fw		= null;	/* file write stream		*/
    	FileOutputStream	fos	= null;		/* file output stream	*/
    	PrintStream			ps		= null;	/* print stream		*/
    	String					fout_name;	/* set string for file name	*/
    	
    	/* initialize -----------------------------------		*/
    	/* instance of Properties class	*/
    	prop	 = System.getProperties();
		
    	/* if args[0] given, generate a file accordingly
    	 * if else, the default name given
    	 */
    	if (args.length > 0) {
    		String	fout_name	= String.format("%s.dat", args[0]);    		
		    fout							= new File(fout_name);
    	} else {
    		fout	= new File("Sub1.dat");
    	}
		/* file output streams		*/
    	try {
			fw		= new FileWriter(fout);
			fos	= new FileOutputStream(fout);
			ps		= new PrintStream(fos);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.exit(1);
		}
    	
		/* show					*/
    	if (ps != null) {
    		prop.list(System.out);
    		System.out.println("Data written.");
    	}    	
    	
    	/* write to the file -------------------------	*/
//    	prop.list(fw);
//    	prop.li
    	/* write to ouput stream			*/
    	prop.list(ps);
    	
    	/* flush and close the file		*/
    	if (fw != null) {
    		try { fw.flush(); fw.close();}
    		catch (IOException e) { e.printStackTrace(); }
    	}
    	if (fos != null) {
    		try { fos.flush(); fos.close();}
    		catch (IOException e) { e.printStackTrace(); }
    	}
    	/* PrintStream object doesn't throw IOException,
    	 * hece, no "try-catch" close.
    	 */
    	if (ps != null) {
    		ps.flush(); ps.close();
    	}
    	
    }//public static void main(String[] args)
}//public class Sub1_JavaClassPath
