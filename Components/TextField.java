package gradebook.application.components;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

public class TextField extends JTextField {
    Icon prefixIcon;
    
    public TextField() {
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 1, 5));
        setFont(new java.awt.Font("Candara", 0, 15));
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        initBorder();
        paintIcon(g);
    }
     

    public Icon getPrefixIcon() {
        return prefixIcon;
    }

    public void setPrefixIcon(Icon prefixIcon) {
        this.prefixIcon = prefixIcon;
    }
    
    
    private void initBorder() {
        int left = 5;
        
        if(prefixIcon != null)
            left = prefixIcon.getIconWidth() + 15;
        
        
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, left, 1, 5));
    }

    private void paintIcon(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        
        if(prefixIcon != null) {
            Image prefix = ((ImageIcon) prefixIcon).getImage();
            int y = (getHeight() - prefixIcon.getIconHeight())/2;
            g2d.drawImage(prefix,10,y,this);
        }
    }
    
}
