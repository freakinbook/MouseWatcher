/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacourse;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JComponent;

/**
 *
 * @author D.Zviagin
 */
public class Line extends JComponent implements MouseMotionListener{
    private int x = 250;
    private int y = 250;
       
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(getWidth()/2, getHeight()/2, x, y);
    }
    
    private void drawTriangle(Graphics g){
        int zeroX=getWidth()/2;
        int zeroY=getHeight()/2;
    }
    
    private double angle(){
        double a;
        if (y < getHeight()/2){
        a = Math.acos((x-getWidth()/2)/hypotenuse());
        } else {
            a = 2*Math.PI - Math.acos((x-getWidth()/2)/hypotenuse());
        }       
        return a;
    }
    
    private double sqr(double arg){
        return arg*arg;
    }
    
    private double hypotenuse(){
        return Math.sqrt(sqr(x-getWidth()/2)+sqr(y-getHeight()/2));
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        this.x = me.getX()-8;
        this.y = me.getY()-31;
        System.out.println("Mouse dragged. ("+me.getX()+", "+me.getY()+")");
        System.out.println("Angle: "+ angle());
        System.out.println("Length: "+ hypotenuse());
        System.out.println("------------------");
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        this.x = me.getX()-8;
        this.y = me.getY()-31;
        System.out.println("Mouse moved. ("+me.getX()+", "+me.getY()+")");
        System.out.println("Angle: "+ (angle()*180)/Math.PI);
        System.out.println("Length: "+ hypotenuse());
        System.out.println("cos of angle: " + (x-getWidth()/2)/hypotenuse());
        System.out.println("------------------");
        repaint();
    }
    
    
}
