#import "Vector2D.cpp"

class Body2D{
private:
    Vector2D position;
    Vector2D velocity;
    //float rotation;
    //float rotationalVelocity;
    float mass;
    float density;
    //float area;
    bool isImmovable;

public:
    Vector2D getPosition(){
        return this->position;
    }
    Vector2D getVelocity(){
        return this->velocity;
    }
    void setPostion(Vector2D position){
        this->position = position;
    }
    void setVelocity(Vector2D velocity){
        this->velocity = velocity;
    }
    
};