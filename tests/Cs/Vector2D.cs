public struct Vector2D{

  // java "final" = c# "readonly"
  public readonly float X;
  public readonly float Y;

  public static readonly Vector2D Zero = new Vector2D(0,0);

  public Vector2D{
    this.X = x;
    this.Y = y;
  }
  // operators overload.
  public static Vector2D operator +(Vector2D u, Vector2D v){
    return new Vector2D(u.X + v.X, u.Y + v.Y);
  }

  public static Vector2D operator -(Vector2D u, Vector2D v){
    return new Vector2D(u.X - v.X, u.Y - v.Y);
  }

  public static Vector2D operator -(Vector2D u){
    return new Vector2D(-v.X, -v.Y);
  }

  public static Vector2D operator *(Vector2D v, float s){
    return new Vector2D(v.X * s, v.Y * s);
  }

  public static Vector2D operator /(Vector2D v, float s){
    return new Vector2D(v.X / s, v.Y / s);
  }

  public override bool Equals(object obj){
    if(obj is Vector2D v){
      return (this.X == v.X) && (this.Y == v.Y);
    }
    return false;
  }
  
  public override string ToString(){
    return "("+this.X + ", " + this.Y + ")";
  }

};


