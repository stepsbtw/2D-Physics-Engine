package Main;

import Entities.Body2D;
import Entities.Circle2D;
import Entities.Rectangle2D;
import Entities.Vector2D;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public abstract class Generator {

    public static List<Body2D> randomBodyList(int n,int screenWidth, int screenHeight){
        List<Body2D> bodyList = new ArrayList<Body2D>();
        for (int i = 0; i < n; i++) {
            bodyList.add(randomBody(screenWidth,screenHeight));
        }
        return bodyList;
    }

    public static Body2D randomBody(int screenWidth, int screenHeight) {
        Random rnd = new Random();
        int choice = rnd.nextInt(2);
        float mass = (float) rnd.nextDouble(10);
        float bounciness = (float) rnd.nextDouble(1);
        if (choice == 0) {

            float radius = (float) rnd.nextDouble(100);
            // making sure it stays in bounds
            float maxX = screenWidth - radius;
            float maxY = screenHeight - radius;

            Vector2D position = randomVector2D((int)Math.min(screenWidth,maxX),(int)Math.min(screenWidth,(maxY)));
            return new Circle2D(position, radius, mass, bounciness);

        } else {

            float width = (float) rnd.nextDouble(100);
            float height = (float) rnd.nextDouble(100);
            // making sure it stays in bounds
            float maxX = screenWidth - width;
            float maxY = screenHeight - height;

            Vector2D position = randomVector2D((int)Math.min(screenWidth,maxX),(int)Math.min(screenWidth,(maxY)));
            return new Rectangle2D(position, width, height, mass, bounciness);

        }
    }

    public static List<Vector2D> randomVector2DList(int n,int screenWidth, int screenHeight){
        List<Vector2D> vecList = new ArrayList<Vector2D>();
        for(int i = 0 ; i< n; i++){
            vecList.add(randomVector2D(screenWidth,screenHeight));
        }
        return vecList;
    }

    public static Vector2D randomVector2D(int screenWidth, int screenHeight){
        Random rnd = new Random();
        float x = (float) rnd.nextDouble(screenWidth);
        float y = (float) rnd.nextDouble(screenHeight);
        return new Vector2D(x,y);
    }
    
}
