/************************************
 * Sub11_Sample_3_1_panel_to_component.java 
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;


public class Sub11_Sample_3_1_panel_to_component extends JFrame {

	/* fields				*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		/* variables	*/
		Sub11_Sample_3_1_panel_to_component	frame	= 
								new Sub11_Sample_3_1_panel_to_component("那就算了吧");
		frame.setVisible(true);

	}
	
	Sub11_Sample_3_1_panel_to_component(String title) {
		setTitle(title);
		setBounds(100, 100, 300, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/* layout			*/
		setLayout(new FlowLayout());
		
		/* panel				*/
		JPanel		p		= new JPanel();
		p.setPreferredSize(new Dimension(200, 100));
		p.setBackground(Color.orange);
		
		/* label				*/
		JLabel		label		= new JLabel("那些花儿");
		
		/* text field		*/
		JTextField		text	= new JTextField(5);
		
		/* add components to panel		*/
//		p.add(label);
		p.add(text);
		p.add(label);
		
		/* setup: border		*/
		BevelBorder	border	= new BevelBorder(BevelBorder.RAISED);
		p.setBorder(border);
		
		/* container		*/
		Container		contentPane		= getContentPane();
		contentPane.add(p);		
	}

}//Sub1_Sample_1_2
