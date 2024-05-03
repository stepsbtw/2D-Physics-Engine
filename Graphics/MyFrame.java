package Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
    MyPanel panel;

    public MyFrame(){

        this.setSize(1280,720);
        this.setResizable(false);
        panel = new MyPanel();
        this.add(panel);
        this.pack(); // need to pack before continuing.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    
    }
}