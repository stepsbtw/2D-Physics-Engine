package Entities;

import java.awt.Graphics;

public class Vector2D {
    
    public float X;
    public float Y;
    
    public Vector2D(float x, float y){
        this.X = x;
        this.Y = y;
    }

    // OPERATIONS OVERLOAD
    public Vector2D add(Vector2D v){
        return new Vector2D(this.X+v.X, this.Y+v.Y);
    }

    public Vector2D subtract(Vector2D v){
        return new Vector2D(this.X-v.X, this.Y-v.Y);
    }

    public Vector2D opposite(){
        return new Vector2D(-this.X, -this.Y);
    }

    public Vector2D multiply(float s){
        return new Vector2D(this.X*s, this.Y*s);
    }

    public Vector2D divide(float s){
        return new Vector2D(this.X/s, this.Y/s);
    }

    public void draw(Graphics g){
        g.drawLine(0,0,(int)this.X,(int)this.Y);
    }

    public void drawLine(Graphics g, Vector2D v) {
        //Vector2D vecLine = vec1.subtract(vec2);
        g.drawLine((int) this.X, (int) this.Y, (int) v.X, (int) v.Y);
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Vector2D vec){
            return (this.X == vec.X) && (this.Y == vec.Y);
        }else {
            return false;
        }
    }
    @Override
    public String toString(){
        return "("+this.X + ", " + this.Y + ")";
    }
}
