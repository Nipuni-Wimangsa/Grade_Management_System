package gradebook.application.components;

import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Button extends JButton {
    
    public Button() {
        setContentAreaFilled(false);
        setBorder(BorderFactory.createLineBorder(new Color(165,178,209), 3, true));
        setFont(new java.awt.Font("Candara", 0, 18));
        setBackground(new Color(165,178,209));
        setOpaque(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
      
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
               MouseEntered(evt);
            }
            
            public void mouseExited(java.awt.event.MouseEvent evt) {
               MouseExited(evt);
            }
            
            public void mousePressed(java.awt.event.MouseEvent evt) {
               MousePressed(evt);
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
               MouseReleased(evt);
            }
        });
    }
    
    private void MouseEntered(MouseEvent evt) {
        setBackground(new Color(231,233,243));
    }
      
    private void MouseExited(MouseEvent evt) {
        setBackground(new Color(165,178,209));
    }
    
    private void MousePressed(MouseEvent evt) {
        setFont(new java.awt.Font("Candara", 1, 18));
    }
    
    private void MouseReleased(MouseEvent evt) {
        setFont(new java.awt.Font("Candara", 0, 18));
    }
}
