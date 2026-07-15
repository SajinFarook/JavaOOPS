package Task2;
class Car {
    String model;
    String brand;
    int year;

    Car(String model, String brand, int year){
        this.model=model;
        this.brand=brand;
        this.year=year;
    }

    void display(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    static void main(String[] args) {
        Car c1=new Car("M Series","BMW",2025);
        c1.display();
        System.out.println();
        Car c2=new Car("Q Series","AUDI",2025);
        c2.display();
    }
}
