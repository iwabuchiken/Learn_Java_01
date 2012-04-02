/************************************
 * Sub8_Frame_innerclass.java 
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

public class Sub8_Frame_innerclass extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		Sub8_Frame_innerclass	frame	= 
								new Sub8_Frame_innerclass("Sub8_Frame_innerclass");
		frame.setVisible(true);

	}
	
	Sub8_Frame_innerclass(String title) {
		setTitle(title);
		setBounds(100, 200, 600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}//Sub1_Sample_1_2

//class MyFrame extends JFrame {
//	MyFrame(String title) {
//		setTitle(title);
//		setBounds(100, 200, 300, 150);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//}//class MyFrame extends JFrame