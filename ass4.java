//____________Assignment 4____________________
//__________________Dynamic Binding________________


import java.util.*;

abstract class Shap {
    public double height, width;

    public void setValues(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    abstract public double compute_area();
}

class Triangle extends Shap {
    public double compute_area() {
        return (getHeight() * getWidth()) / 2;
    }
}

class Rectangle extends Shap {
    public double compute_area() {
        return (getHeight() * getWidth());
    }
}

public class Main4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height of rectangle");
        double h = sc.nextDouble();
        System.out.println("Enter width of rectangle");
        double w = sc.nextDouble();
        System.out.println("Enter height of triangle");
        double h1 = sc.nextDouble();
        System.out.println("Enter width of triangle");
        double w1 = sc.nextDouble();
        Shap s;
        Rectangle rec = new Rectangle();
        s = rec;
        s.setValues(h, w);
        System.out.println("Area of rectangle of " + s.compute_area());
        Triangle tri = new Triangle();
        s = tri;
        s.setValues(h1, w1);
        System.out.println("Area of triangle of " + s.compute_area());
    }
}
