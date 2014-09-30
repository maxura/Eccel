package ua.max.pochercushki.typedinfo;

import gui.List;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mmusienko on 9/29/14.
 */

abstract class Shape {
    void draw() {
        System.out.println(this + ". draw() ");
    }

    abstract public String toString();
}

class Circle extends Shape {

    @Override
    public String toString() {
        return "Circle";
    }
}

class Square extends Shape {

    @Override
    public String toString() {
        return "Square";
    }
}

class Triangle extends Shape {

    @Override
    public String toString() {
        return "Triangle";
    }
}

public class Shapes {

    public static void main(String[] args) {
        java.util.List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList) {
            shape.draw();
        }

    }

}
