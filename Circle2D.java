
public class Circle2D extends Body2D{
    public float radius;
    public Circle2D(Vector2D position, float radius, float mass, float bounciness){
        super(position,mass,bounciness);
        this.area = radius*radius;
        this.density = mass/area;
    }
}