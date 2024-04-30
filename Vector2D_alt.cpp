struct Vector2D{
private:
    float X;
    float Y;
public:
    Vector2D(float x, float y){
        this->X = x;
        this->Y = y;
    }

    static const Vector2D Zero;

    // Operator overloads
    Vector2D operator+(const Vector2D &v){
        return Vector2D(X + v.X, Y + v.Y);
    }

    Vector2D operator-(const Vector2D &v){
        return Vector2D(X - v.X, Y - v.Y);
    }

    Vector2D operator-(){
        return Vector2D(-X, -Y);
    }

    Vector2D operator*(float s){
        return Vector2D(X * s, Y * s);
    }

    Vector2D operator/(float s){
        return Vector2D(X / s, Y / s);
    }
};

const Vector2D Vector2D::Zero(0,0);