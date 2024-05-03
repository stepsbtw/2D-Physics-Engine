package Graphics;

import Entities.Vector2D;
import Entities.Circle2D;
import Entities.Rectangle2D;

import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;


public class MyPanel extends JPanel{
    private final int WIDTH = 1280;
    private final int HEIGHT = 720;

    public MyPanel(){
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        this.setBackground(Color.black);
    }

    // printar na tela.
    @Override
    public void paint(Graphics g){
        super.paintComponent(g);

        Vector2D[] testVectors = {new Vector2D(200,100),new Vector2D(100,200)};

        Circle2D testCircle = new Circle2D(new Vector2D(WIDTH-100*2,HEIGHT-100*2),100,100,1);
        Rectangle2D testRect = new Rectangle2D(new Vector2D(WIDTH-100,HEIGHT-100),100,100,100,1);

        g.setColor(Color.red);
        testCircle.draw(g);

        g.setColor(Color.blue);
        testRect.draw(g);

        g.setColor(Color.green);
        testVectors[0].draw(g);
        testVectors[1].draw(g);

        g.setColor(Color.yellow);
        testVectors[0].drawLine(g,testVectors[1]);

        System.out.println(""+testCircle+testRect);

    }

    /*
    public void debugPaint(Graphics g){
        List<Body2D> bodyList = Generator.randomBodyList(5,WIDTH,HEIGHT);
        List<Vector2D> vecList = Generator.randomVector2DList(10,WIDTH,HEIGHT);
        g.setColor(Color.green);
        for(Body2D body: bodyList){
            System.out.println(body);
            if(body instanceof Circle2D circ){
                circ.draw(g);
            }else if(body instanceof Rectangle2D rect){
                rect.draw(g);
            }
        }
        g.setColor(Color.yellow);
        for(Vector2D vec : vecList){
            System.out.println(vec);
            vec.drawPosition(g);
        }
        g.setColor(Color.red);
        for(int i = 0; i<vecList.size();i+=2){
            Vector2D vec1 = vecList.get(i);
            Vector2D vec2 = vecList.get(i+1);
            vec1.drawLine(g,vec2);
        }
        
    }
    */

}
