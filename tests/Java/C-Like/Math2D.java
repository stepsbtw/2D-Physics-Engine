package alternative;

public class Math2D {

    public static Vector2D add(Vector2D u, Vector2D v){
        return new Vector2D(u.X + v.X, u.Y + v.Y);
    }
    
    public static Vector2D subtract(Vector2D u, Vector2D v){
        return new Vector2D(u.X - v.X, u.Y - v.Y);
    }
    
    public static Vector2D opposite(Vector2D v){
        return new Vector2D(-v.X, -v.Y);
    }
    
    public static Vector2D multiply(Vector2D v, float s){
        return new Vector2D(v.X * s, v.Y * s);
    }
    
    public static Vector2D divide(Vector2D v, float s){
        return new Vector2D(v.X / s, v.Y / s);
    }

    public float dot(Vector2D u, Vector2D v){
        return u.X*v.X + u.Y*v.Y;
    }

    //public float cross(Vector2D u, Vector2D v){}
    
}
