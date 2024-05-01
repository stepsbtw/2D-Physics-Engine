import java.util.List;
import java.util.ArrayList;
import java.util.Random;
public class Test{
    public static void main(String[] args) {
        Random rnd = new Random();
        List<Body2D> bodyList = new ArrayList<Body2D>();
        for(Body2D body : bodyList){
            int choice = rnd.nextInt(2);
            float x = (float)rnd.nextDouble(100);
            float y = (float)rnd.nextDouble(100);
            float mass = (float)rnd.nextDouble(10);
            float bounciness = (float)rnd.nextDouble(1);
            if(choice==0){
                float radius = (float)rnd.nextDouble(100);
                body = new Circle2D(new Vector2D(x, y), radius, mass, bounciness);
            }else{
                float width = (float)rnd.nextDouble(100);
                float height = (float)rnd.nextDouble(100);
                body = new Rect2D(new Vector2D(x, y), width, height, mass, bounciness);
            }
        }

        // RENDERING

    }
}
