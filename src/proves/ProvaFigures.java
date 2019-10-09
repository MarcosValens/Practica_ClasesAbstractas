package proves;

import figures.Cercle;
import figures.Rectangle;
import figures.Triangle;

import java.awt.*;

public class ProvaFigures {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(1, "figures.Cercle 1", Color.green, 42.42);
        Rectangle rectangle = new Rectangle(1, "figures.Rectangle 1", Color.green, 3,4);
        Rectangle rectangle1 = new Rectangle(1, "figures.Rectangle 2", Color.red, 5,9);
        Triangle triangle = new Triangle(1, "figures.Triangle 1", Color.yellow, 3,4);
        System.out.println(cercle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
        System.out.println(cercle.equals(rectangle));
        System.out.println(triangle.equals(triangle));
        System.out.println(rectangle.equals(rectangle1));
    }
}
