package Entities;
import java.awt.Graphics;

public class Rectangle2D extends Body2D{

    private final float width;
    private final float height;

    public Rectangle2D(Vector2D position, float width, float height, float mass, float bounciness){
        super(position,mass,bounciness);
        this.width = width;
        this.height= height;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    public float area(){
        return this.width * this.height;
    }
    public void draw(Graphics g){
        g.fillRect((int)this.getX(),(int)this.getY(),(int)this.width,(int)this.height);
    }

    @Override
    public String toString(){
        return super.toString() + "Width, Height: "+this.width+" "+this.height+"\n";
    }
}