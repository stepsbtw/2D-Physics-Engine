
public class Circle2D extends Body2D{

    private final float radius;
    private final float diameter;

    public Circle2D(Vector2D position, float radius, float mass, float bounciness){
        super(position,mass,bounciness);
        this.radius = radius;
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