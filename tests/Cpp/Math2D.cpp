#include "Vector2D.cpp"
#include <math.h>

class Math2D{
public:
    static float Dot(Vector2D u, Vector2D v){
        return u.X*v.X + u.Y*v.Y;
    }

    static float Length(Vector2D v){
        return sqrt((v.X*v.X)+(v.Y*v.Y));
    }

    static float Distance(Vector2D a, Vector2D b){
        return Length(b-a);
    }

    static Vector2D Projection(Vector2D u, Vector2D v){
        return v * ( Dot(u,v) / Length(v)*Length(v) );
    }

    static Vector2D Normalize(Vector2D v){
        return v / Length(v);
    }

    static bool isUnitary(Vector2D v){
        return Length(v) == 1;
    }

    // W = U x V
    // W = {(Uy*Vz)-(Uz*Vy) , (Uz * Vx)-(Ux * Vz) , (Ux * Vy)-(Uy * Vx)}
    // In 2D, z = 0 
    // W = {0, 0, Ux*Vy - Uy*Vx}
    static float Cross(Vector2D u, Vector2D v){
        return u.X*v.Y - u.Y-v.X;
    }

};