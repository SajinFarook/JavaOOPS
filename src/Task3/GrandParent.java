package Task3;

public class GrandParent {
    void house(){
        System.out.println("Granparent Class");
        System.out.println("owns a house");
    }
    static class Parent extends GrandParent{
        void car(){
            System.out.println("Parent Class");
            System.out.println("Owns a car");
        }
    }
    static class Child extends Parent{
        void bike(){
            System.out.println("Child Class");
            System.out.println("Drives cycle");
        }
    }

    static void main(String[] args) {
        Child c1=new Child();
        c1.bike();
        System.out.println();
        c1.car();
        System.out.println();
        c1.house();

    }
}
