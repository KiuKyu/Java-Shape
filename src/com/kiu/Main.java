package com.kiu;

public class Main {
    public static void main(String[] args) {
        // Shape
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", true);
        System.out.println(shape);

        // Circle
        Circle circ = new Circle();
        System.out.println(circ);

        circ = new Circle(3.8);
        System.out.println(circ);

        circ = new Circle("red", false, 2);
        System.out.println(circ);

        // Rectangle
        Rectangle rect = new Rectangle();
        System.out.println(rect);

        rect = new Rectangle(70, 56.7);
        System.out.println(rect);

        rect = new Rectangle("blue", true, 70, 50);
        System.out.println(rect);

        // Square
        Square sqr = new Square();
        System.out.println(sqr);

        sqr = new Square(3.9);
        System.out.println(sqr);

        sqr = new Square("orange", true, 7);
        System.out.println(sqr);
    }
}
