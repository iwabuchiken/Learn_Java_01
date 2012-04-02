/************************************
 * Sub9_Sample_6_1_Pane_and_Component.java 
 * Author: iwabuchiken 
 * Date: 20120322_091449 
 * Aim: 
 *	1.
 * <Usage> 1. Run the program <Source> 1.
 ************************************/
package swing.javadrive;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Sub9_Sample_6_1_Pane_and_Component extends JFrame {

	/* fields				*/
	JButton		btn;
	Container	contentPane;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		Sub9_Sample_6_1_Pane_and_Component	frame	= 
								new Sub9_Sample_6_1_Pane_and_Component("Sub8_Frame_innerclass");
		frame.setVisible(true);

	}
	
	Sub9_Sample_6_1_Pane_and_Component(String title) {
//		setTitle(title);
		/* frame			*/
		setTitle(this.getClass().getName());
		setBounds(100, 200, 600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* button			*/
		btn	= new JButton("btn");
		
		/* container		*/
		contentPane	= getContentPane();
		contentPane.add(btn, BorderLayout.NORTH);
	}

}//Sub1_Sample_1_2

//class MyFrame extends JFrame {
//	MyFrame(String title) {
//		setTitle(title);
//		setBounds(100, 200, 300, 150);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	}
//}//class MyFrame extends JFrame