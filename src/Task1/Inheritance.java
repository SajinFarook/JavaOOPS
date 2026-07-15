package Task1;

public class Inheritance {
    static void main(String[] args) {
        dog d1=new dog();
        d1.sound();
        d1.breed();
    }
    static class Animal{
        void breed(){
            System.out.println("Its an animal");
        }
    }

    static class dog extends Animal{
        void sound(){
        System.out.println("Bark");
        }
    }
}
