package x.si.pkg0;

import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author Necazu
 */
public class XSi0 {

    public static void main(String[] args) {
       
        UIManager UI=new UIManager();
        UI.put("OptionPane.background",new Color(32, 40, 79));
        UI.put("Panel.background",new Color(32, 40, 79));
        UI.put("OptionPane.messageForeground", new Color(249,224,174));
        UI.put("Button.background",new Color(43,56,22));
        UI.put("Button.foreground", new Color(249,224,174));
        new frame0().setVisible(true);
        
    }
    
}
