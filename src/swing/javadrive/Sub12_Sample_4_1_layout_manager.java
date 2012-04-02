/************************************
 * Sub12_Sample_4_1_layout_manager.java 
 * Author: iwabuchiken 
 * Date: 20120323_094445
 * Aim: 
 *	1.
 * <Usage> 1. Run the program <Source> 1.
 ************************************/
package swing.javadrive;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;


public class Sub12_Sample_4_1_layout_manager extends JFrame {

	/* fields				*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		Sub12_Sample_4_1_layout_manager	frame	= 
								new Sub12_Sample_4_1_layout_manager("那就算了吧");
		frame.setVisible(true);

	}
	
	Sub12_Sample_4_1_layout_manager(String title) {
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* layout			*/
		setLayout(new FlowLayout());
		
		/* panel				*/
		JPanel		p		= new JPanel();
		p.setPreferredSize(new Dimension(200, 100));
		p.setBackground(Color.orange);
		p.setLayout(new BorderLayout());

		/* buttons			*/
		JButton		btn1		= new JButton("北方");
		JButton		btn2		= new JButton("南方");
		p.add(btn1, BorderLayout.NORTH);
		p.add(btn2, BorderLayout.SOUTH);
		
		/* container		*/
		Container		contentPane		= getContentPane();
		contentPane.add(p);		
	}

}//Sub1_Sample_1_2
