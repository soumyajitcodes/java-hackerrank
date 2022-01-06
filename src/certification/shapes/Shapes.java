package certification.shapes;

import java.util.Scanner;

class Shape {
    int length;
    int breadth;

    Shape(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public void area() {
        System.out.println(this.length + " " + this.breadth);
    }
}

class Rectangle extends Shape {
    int length, breadth;

    Rectangle(int l, int b) {
        super(l, b);
        this.length = l;
        this.breadth = b;
    }

    public void area() {
        System.out.println(length * breadth);
    }
}

public class Shapes {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        Shape shape = new Shape(l, b);
        shape.area();

        Shape rectangle = new Rectangle(l, b);
        rectangle.area();
    }
}
