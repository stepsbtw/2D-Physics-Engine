
public class Math2D {

    public static float length(Vector2D v){
        return (float)Math.sqrt((v.X*v.X)+(v.Y*v.Y));
    }

    public static float distance(Vector2D a, Vector2D b){
        return length(b.subtract(a));
    }

    public static float dot(Vector2D u, Vector2D v){
        return u.X*v.X + u.Y*v.Y;
    }
    
    /*public static Vector2D dot(Vector2D v, float s){
        //return v.multiply(s);
        return new Vector2D(v.X*s, v.Y*s);
    }*/

    public static Vector2D Projection(Vector2D u, Vector2D v){
        return v.multiply( dot(u,v) / length(v)*length(v) );
    }

    public static float cross(Vector2D u, Vector2D v){
        // plane z = 0
        // cross = {0,0,UxVy - UyVx}
        return u.X*v.Y - u.Y*v.X;
    }
    
    public static Vector2D Normalize(Vector2D v){
        return v.divide(length(v));
    }
}