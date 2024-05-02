
public class Circle2D extends Body2D{

    private float radius;
    private float diameter;

    public Circle2D(Vector2D position, float radius, float mass, float bounciness){
        super(position,mass,bounciness);
        this.area = radius*radius;
        this.density = mass/area;
        this.diameter = 2*radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float getDiameter(){
        return this.diameter;
    }

}