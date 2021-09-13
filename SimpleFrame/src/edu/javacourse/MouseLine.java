/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.javacourse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author D.Zviagin
 */
public class MouseLine implements MouseMotionListener{

    private int x;
    private int y;
    
    public void newLine(MouseEvent e){
        this.x = e.getX();
        this.y = e.getY();
    }
    
    @Override
    public void mouseMoved(MouseEvent e){
        newLine(e);
    }
    
    @Override
    public void mouseDragged(MouseEvent e){
        newLine(e);
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
