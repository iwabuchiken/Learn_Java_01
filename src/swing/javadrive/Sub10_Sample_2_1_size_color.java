/************************************
 * Sub10_Sample_2_1_size_color.java 
 * Author: iwabuchiken 
 * Date: 20120323_094445
 * Aim: 
 *	1.
 * <Usage> 1. Run the program <Source> 1.
 ************************************/
package swing.javadrive;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;


public class Sub10_Sample_2_1_size_color extends JFrame {

	/* fields				*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		Sub10_Sample_2_1_size_color	frame	= 
								new Sub10_Sample_2_1_size_color("各自奔天涯");
		frame.setVisible(true);

	}
	
	Sub10_Sample_2_1_size_color(String title) {
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* layout			*/
		setLayout(new FlowLayout());
		
		/* panel	: 1			*/
		JPanel		p1		= new JPanel();
		p1.setPreferredSize(new Dimension(100, 50));
		p1.setBackground(Color.blue);
		
		/* panel	: 1			*/
		JPanel		p2		= new JPanel();
		p2.setPreferredSize(new Dimension(50, 100));
		p2.setBackground(Color.orange);
		
		/* setup: border		*/
		BevelBorder	border	= new BevelBorder(BevelBorder.RAISED);
		p2.setBorder(border);
		
		/* container		*/
		Container		contentPane		= getContentPane();
		contentPane.add(p1);
		contentPane.add(p2);
	}

}//Sub1_Sample_1_2
