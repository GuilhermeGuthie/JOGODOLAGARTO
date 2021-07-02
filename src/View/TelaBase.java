
package View;


import javax.swing.ImageIcon;
import javax.swing.JFrame;


public abstract class TelaBase extends JFrame {

    public TelaBase(String Title) {
        
        setSize(640, 480);
        setTitle(Title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocale(null);
        setIconImage(new ImageIcon("src/Assets/icon.png").getImage());
        setVisible(true);

    }
    
}
