
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
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    
}