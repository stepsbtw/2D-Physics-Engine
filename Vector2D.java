
public class Vector2D {
    
    public float X;
    public float Y;
    
    public Vector2D(float x, float y){
        this.X = x;
        this.Y = y;
    }

    // OPERATIONS OVERLOAD
    public Vector2D add(Vector2D v){
        return new Vector2D(this.X+v.X, this.Y+v.Y);
    }

    public Vector2D subtract(Vector2D v){
        return new Vector2D(this.X-v.X, this.Y-v.Y);
    }

    public Vector2D opposite(){
        return new Vector2D(-this.X, -this.Y);
    }

    public Vector2D multiply(float s){
        return new Vector2D(this.X*s, this.Y*s);
    }

    public Vector2D divide(float s){
        return new Vector2D(this.X/s, this.Y/s);
    }

}
