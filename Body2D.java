
public abstract class Body2D{

    private Vector2D position;
    private Vector2D velocity;

    public final float mass; // kg
    public final float bounciness;

    public float area; // m²
    public float density; // g/cm³

    Body2D(Vector2D position, float mass, float bounciness){
        this.position = position;
        this.mass = mass;
        this.bounciness = bounciness;
    }

    public Vector2D getPosition() {
        return this.position;
    }

    public void setPosition(Vector2D position){
        this.position = position;
    }

    public float getX(){
        return this.position.X;
    }
    
    public float getY(){
        return this.position.Y;
    }

    public Vector2D getVelocity() {
        return this.velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    
}