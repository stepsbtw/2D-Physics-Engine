package Entities;
import java.awt.Graphics;

public abstract class Body2D{

    private Vector2D position;
    private Vector2D velocity;

    private final float mass; // kg
    private final float bounciness;

    public Body2D(Vector2D position, float mass, float bounciness){
        this.position = position;
        this.mass = mass;
        this.bounciness = bounciness;
    }


    public abstract float area();

    public abstract void draw(Graphics g);

    public float density(){
        return this.mass/this.area();
    }

    public Vector2D getPosition() {
        return this.position;
    }

    public Vector2D getVelocity() {
        return this.velocity;
    }

    public float getX(){
        return this.position.X;
    }
    
    public float getY(){
        return this.position.Y;
    }

    public float getMass(){
        return this.mass;
    }

    public float getBounciness(){
        return this.bounciness;
    }

    // "set position"
    public void moveTo(Vector2D position){
        this.position = position;
    }

    // "add position"
    public void move(Vector2D amount){
        this.position = this.position.add(amount);
    }

    @Override
    public String toString(){
        return "Position, Velocity, Area, Mass, Density, Bounciness:\n"+
                this.position+" "+this.velocity+" "+this.mass+" "+this.area()+" "+this.density()+" "+this.bounciness+"\n";
    }
    
}