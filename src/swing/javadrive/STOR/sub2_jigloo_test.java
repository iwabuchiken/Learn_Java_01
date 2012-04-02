package swing.javadrive.STOR;
import java.awt.BorderLayout;
import javax.swing.JButton;

import javax.swing.WindowConstants;
import javax.swing.SwingUtilities;


/**
* This code was edited or generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
* THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
* LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
*/
public class sub2_jigloo_test extends javax.swing.JFrame {
	private JButton jButton1;
	private JButton jButton2;

	/**
	* Auto-generated main method to display this JFrame
	*/
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				sub2_jigloo_test inst = new sub2_jigloo_test();
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
	
	public sub2_jigloo_test() {
		super();
		initGUI();
	}
	
	private void initGUI() {
		try {
			setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			this.setPreferredSize(new java.awt.Dimension(461, 351));
			{
				jButton1 = new JButton();
				getContentPane().add(jButton1, BorderLayout.NORTH);
				jButton1.setText("jButton1");
			}
			{
				jButton2 = new JButton();
				getContentPane().add(jButton2, BorderLayout.SOUTH);
				jButton2.setText("jButton2");
			}
			pack();
			this.setSize(461, 351);
		} catch (Exception e) {
		    //add your error handling code here
			e.printStackTrace();
		}
	}

}
