public class Rect2D extends Body2D{
    public float width;
    public float height;
    public Rect2D(Vector2D position, float width, float height, float mass, float bounciness){
        super(position,mass,bounciness);
        this.area = width*height;
        this.density = mass/area;
    }
}