/************************************
 * Sub7_Frame_subclass.java 
 * Author: iwabuchiken 
 * Date: 20120322_091449 
 * Aim: 
 *	1.
 * <Usage> 1. Run the program <Source> 1.
 ************************************/
package swing.javadrive.STOR;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sub7_Frame_subclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		MyFrame		frame	= new MyFrame("MyFrame");
		frame.setVisible(true);
		
		/* modify the frame		*/
		/* show			*/
//		frame.setVisible(true);
		
		/* return		*/

	}

}//Sub1_Sample_1_2

class MyFrame extends JFrame {
	MyFrame(String title) {
		setTitle(title);
		setBounds(100, 200, 300, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}//class MyFrame extends JFrame