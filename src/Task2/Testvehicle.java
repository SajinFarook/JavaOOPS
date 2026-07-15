package Task2;

abstract class Vehicle{
    void Start(){
    }
}

class car extends Vehicle{
    void Start(){
        System.out.println("Car is starting");
    }
}

class bike extends Vehicle{
    void Start(){
        System.out.println("Bike is starting");
    }
}
public class Testvehicle {
    static void main(String[] args) {
        Vehicle v1=new car();
        Vehicle v2=new bike();

        v1.Start();
        v2.Start();
    }
}
