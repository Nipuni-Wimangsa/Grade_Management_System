
package gradebook.application.components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class JPanelGradient extends JPanel{    
    
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
       
        Color color1 = new Color(148,185,255);
        Color color2 = new Color(205,255,216);
            
        GradientPaint gp = new GradientPaint(0,0,color1,500,width,color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
    }
}
