public struct Vector2D{
  public float X;
  public float Y;

  public Vector2D{
    this.X = x;
    this.Y = y;
  }
  // add operator overload.
  public static Vector2D operator +(Vector2D a, Vector2D b){
    return new Vector2D(a.X + b.X, a.Y + b.Y);
  }
  /*
  public static Vector2D plus(Vector2D a, Vector2D b){
    return new Vector2D(a.X + b.X, a.Y + b.Y);
  }
  */
}

