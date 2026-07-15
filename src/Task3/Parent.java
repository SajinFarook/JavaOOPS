package Task3;

public class Parent {
    void show(){
        System.out.println("This is a parent class");
    }
    static class Son extends Parent{
        void show(){
            System.out.println("This is a child class");
        }
    }

    static void main(String[] args) {
        Parent s1=new Son();
        s1.show();
    }
}
