/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod;

/**
 *
 * @author T
 */

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}


class ShapeFactory {
    public  Shape createShape(String shapeType) {
        if (shapeType.isEmpty() || shapeType == "")
        {
            return null;
        }
       else if (shapeType == "circle") {
            return new Circle();
        } else if (shapeType == "rectangle") {
            return new Rectangle();
        } else if (shapeType == "triangle") {
            return new Triangle();
        } else {
            return null;
        }
    }
}

public class Factorymethod {
    public static void main(String[] args) {
        ShapeFactory shapeobj = new ShapeFactory();
        Shape circle = shapeobj.createShape("circle");
        circle.draw();

        Shape rectangle = shapeobj.createShape("rectangle");
        rectangle.draw();

        Shape triangle = shapeobj.createShape("triangle");
        triangle.draw();
    }
}
