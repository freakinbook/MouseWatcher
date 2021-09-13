
package edu.javacourse;
import java.awt.Dimension;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame sf = new JFrame();
        Line line = new Line();
        sf.setTitle("First window");
        sf.add(line);
        sf.addMouseMotionListener(line);
        sf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sf.setMinimumSize(new Dimension(500,500));
        sf.setLocationRelativeTo(null);
        sf.setVisible(true);
    }
    
}
