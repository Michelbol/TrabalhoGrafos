/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopalavras;

import java.awt.AlphaComposite;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author miche
 */
public class TrabalhoPalavras extends JFrame {

    /**
     * @param args the command line arguments
     */
    
    public TrabalhoPalavras() {
    	setExtendedState(JFrame.MAXIMIZED_BOTH);
    	getContentPane().add(new Vertice());
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
    	new TrabalhoPalavras().setVisible(true);
    }
}
