import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.util.List;
import java.util.Vector;

public class MyPanel extends JPanel{
    private final int WIDTH = 1280;
    private final int HEIGHT = 720;

    MyPanel(){
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        this.setBackground(Color.black);
    }

    @Override
    public void paint(Graphics g){
        super.paintComponent(g);
        List<Body2D> bodyList = Generator.randomBodyList(5,WIDTH,HEIGHT);
        List<Vector2D> vecList = Generator.randomVector2DList(10,WIDTH,HEIGHT);

        g.setColor(Color.green);
        
        for(Body2D body: bodyList){
            if(body instanceof Circle2D circ){
                g.drawOval((int)circ.getX(),(int)circ.getY(),(int)circ.getDiameter(),(int)circ.getDiameter());
            }else if(body instanceof Rectangle2D rect){
                g.drawRect((int)rect.getX(), (int)rect.getY(), (int)rect.getWidth(), (int)rect.getHeight());
            }
        }

        g.setColor(Color.yellow);
        for(Vector2D vec : vecList){
            g.drawLine(0,0,(int)vec.X,(int)vec.Y);
        }
        g.setColor(Color.red);

        for(int i = 0; i<vecList.size();i+=2){
            Vector2D vec1 = vecList.get(i);
            Vector2D vec2 = vecList.get(i+1);
            //Vector2D vecLine = vec1.subtract(vec2);
            g.drawLine((int)vec1.X,(int)vec1.Y,(int)vec2.X,(int)vec2.Y);
        }
        
    }

}
