/************************************
 * Sub6_window_to_center.java 
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

public class Sub6_window_to_center {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		/* variables	*/
		JFrame		frame	= new JFrame();
		
		/* modify the frame		*/
		frame.setTitle("This is a Frame");
//		frame.setBounds(200, 200, 500, 300);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* show			*/
		frame.setVisible(true);
		
		/* return		*/

	}

}//Sub1_Sample_1_2
