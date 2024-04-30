#include "Vector2D.cpp";

class Math2D{
public:
    float dot(Vector2D u, Vector2D v){
        return u.X * v.X + u.Y * v.Y;
    }
    
};