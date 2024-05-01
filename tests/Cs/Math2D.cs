public static class Math2D{
    // Module
    public static float Length(Vector2D v){
        return sqrt((v.X)*(v.X) + (v.Y)*v.Y);
    }
    public static float Distance(Vector2D a, Vector2D b){}

    public static Vector2D Normalize(Vector2D u){}

    public static Vector2D Projection(Vector2D u, Vector2D v){}

    public static float Dot(Vector2D u, Vector2D v){
        return u.X * v.X + u.Y * v.Y;
    }

    public static bool IsUnitary(Vector2D v){}

    public static Vector2D UnitVector(Vector2D v){}

    // i can define cross product
    // but we will never be able to represent it fully.
    public static float Cross(Vector2D v, Vector2D u){}

}