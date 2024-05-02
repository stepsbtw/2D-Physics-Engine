public class Rectangle2D extends Body2D{
    private final float width;
    private final float height;

    public Rectangle2D(Vector2D position, float width, float height, float mass, float bounciness){
        super(position,mass,bounciness);
        this.width = width;
        this.height= height;
        this.area = width*height;
        this.density = mass/area;
    }

    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }

    
}