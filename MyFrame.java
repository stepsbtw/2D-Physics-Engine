import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame{
    MyPanel panel;

    MyFrame(){

        panel = new MyPanel();
        this.add(panel);
        this.pack(); // need to pack before continuing.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    
    }
}