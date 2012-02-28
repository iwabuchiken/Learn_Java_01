/************************************`
 * Sub4_text_10_4_PrivatteConstructor.java
 * Author: Iwabuchi Ken				*
 * Date:
 * Aim:								*
 * 	1. Show the type name of a variable
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. 
 *									*
 ************************************/

//import java.lang.*;

//v=1.0
//created_at=20120130_110230
//project=C:\workspaces\ws_ubuntu_1\G20120130_110230_J_learn_01\Main.java

public class Sub4_text_10_4_PrivatteConstructor
{
//	static private PrivateClass getPrivateClass() {
	private PrivateClass getPrivateClass() {
		return new PrivateClass();
	}
	class PrivateClass {
		private String name = "PrivateClass";
		public String getName() {
			return this.name;
//			return name;
		}
	}
	
    public static void main(String[] args)
    {
    	/* Variables */
//    	PrivateClass pc = getPrivateClass();
    	PrivateClass pc = 
    			new Sub4_text_10_4_PrivatteConstructor().getPrivateClass();
    	PrivateClass2 pc2 = 
    			new PrivateClass2();
    	/* Show name */
    	System.out.print(pc.name);
    	System.out.print(pc2.name);
    	
    }//public static void main(String[] args)
}//Sub4_text_10_4_PrivatteConstructor.java

class PrivateClass2 {
	private String name = "PrivateClass2";
	public String getName() {
		return name;
//		return name;
	}
}