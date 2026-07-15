package Task2;

public class Shape {
    void area(){
        System.out.println("Area Calculation");
    }

    static void main(String[] args) {
        Shape s1=new Circle();
        s1.area();
        Shape s2=new Rectangle();
        s2.area();
    }
    static class Circle extends Shape{
        void area(){
            System.out.println("Area of Circle is pi*r*r");
        }
    }
    static class Rectangle extends Shape{
        void area(){
            System.out.println("Area of Rectangle is l*b");
        }
    }
}