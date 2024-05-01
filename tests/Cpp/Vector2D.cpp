class Vector2D{
public:
    float X;
    float Y;

    Vector2D(float x, float y){
        this->X = x;
        this->Y = y;
    }

    static const Vector2D Zero;

    // Operator overloads
    Vector2D operator+(const Vector2D &v) const {
        return Vector2D(this->X + v.X, this->Y + v.Y);
    }

    Vector2D operator-(const Vector2D &v) const {
        return Vector2D(this->X - v.X, this->Y - v.Y);
    }

    Vector2D operator-() const {
        return Vector2D(-(this->X), -(this->Y));
    }

    Vector2D operator*(float s) const {
        return Vector2D(this->X * s, this->Y * s);
    }

    Vector2D operator/(float s) const {
        return Vector2D(this->X / s, this->Y / s);
    }
};

const Vector2D Vector2D::Zero(0,0);