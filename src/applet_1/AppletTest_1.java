/************************************`
 * AppletTest_1.java
 * Author: iwabuchiken
 * Date: 20120324_205108
 * Aim:								*
 * 	1.
 * <Usage>
 *	1. Run the program
 * <Source>
 * 	1. 
 ************************************/
/**
 * 
 */
package applet_1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import mylib.STDLIB;

/*
<applet code="AppletTest_1.class" width="150" height="150"></applet>
 */

/**
 * @author iwabuchiken
 *
 */

public class AppletTest_1 extends Applet{

	/**
	 * @param args
	 */
	public void paint(Graphics g) {
		g.setColor(Color.red);
		
		Dimension	size	= getSize();
		
		g.fillRect(0, 0, size.width - 1, size.height - 1);
		
	}//methodName()
	
}//class AppletTest_1
