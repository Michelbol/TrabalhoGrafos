/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopalavras;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;

/**
 *
 * @author miche
 */
public class Vertice extends JPanel {
    private String nome;
    private int low;
    private int initTmpDesc;
    private int finalTmpDesc;
    
    @Override
	protected void paintComponent(Graphics g){
	  	super.paintComponent(g);
	  	Graphics2D g2 = (Graphics2D) g.create();
                g2.drawOval(100, 100, 100, 100);
                g2.fillOval(0, 0, 0, 0);
	}
}
