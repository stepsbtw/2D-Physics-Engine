#import "Body2D.cpp"

class Circle : public Body2D{
private:
    float radius;
public:
    float getRadius(){
        return this->radius;
    }
};

class Rectangle : public Body2D{
private:
    float width;
    float height;
public:
    float getWidth(){
        return this->width;
    }
    float getHeight(){
        return this->height;
    }
};