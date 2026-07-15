package Overloading;
public class Addition {
    public static void Add(int a, int b){
        System.out.println("Addition of two numbers:"+(a+b));
    }
    public static void Add(int a, int b, int c){
        System.out.println("Addition of three numbers:"+(a+b+c));
    }
    public static void Add(int a, int b, int c, int d){
        System.out.println("Addition of four numbers:"+(a+b+c+d));
    }
}
class Main {
    static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        int d=40;
        Addition.Add(a,b);
        Addition.Add(a,b,c);
        Addition.Add(a,b,c,d);
    }
}
