public class Vector2D {
    public float X;
    public float Y;
    
    public Vector2D(float x, float y){
        this.X = x;
        this.Y = y;
    }

    public void add(Vector2D v){
        this.X += v.X;
        this.Y += v.Y;
    }

    public void sub(Vector2D v){
        this.X -= v.X;
        this.Y -= v.Y;
    }

    public void opposite(){
        this.X = -this.X;
        this.Y = -this.Y;
    }

    public void multiply(float s){
        this.X *= s;
        this.Y *= s;
    }

    public void divide(float s){
        this.X /= s;
        this.Y /= s;
    }

}
