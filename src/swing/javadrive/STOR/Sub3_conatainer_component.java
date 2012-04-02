/************************************
 * Sub3_conatainer_component.java 
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

public class Sub3_conatainer_component {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		JFrame		frame	= new JFrame();
		JPanel		panel	= new JPanel();
		JButton		button	= new JButton("OK.");
		
		/* assemble items		*/
		panel.add(button);
//		panel.setBounds(100, 100, 500, 300);
		frame.add(panel);
		
		/* modify frame			*/
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		/* return		*/

	}

}//Sub1_Sample_1_2
