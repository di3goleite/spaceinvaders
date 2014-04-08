/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Oto;

import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author marc
 */
public class Repaint extends JPanel {

    private int x, y;
    private int side, height;

    public Repaint(int side, int height, int x, int y) {

        this.side = side;
        this.height = height;
        
        this.x = x;
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {

        g.drawRect(side, height, x, y);
    }

    public void setXY(int x, int y) {

        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}
