package Entities;
import java.awt.Graphics;

public class Circle2D extends Body2D{

    private final float radius;

    public Circle2D(Vector2D position, float radius, float mass, float bounciness){
        super(position,mass,bounciness);
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float area(){
        return (float)Math.PI*radius*radius;
    }

    public void draw(Graphics g){
        g.fillOval((int)this.getX(),(int)this.getY(),(int)this.radius*2,(int)this.radius*2);
    }

    @Override
    public String toString(){
        return super.toString() + "Radius: "+this.radius+"\n";
    }
}