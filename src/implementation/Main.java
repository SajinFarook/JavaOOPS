package implementation;

public class Main {
    static void main(String[] args) {

        System.out.println("_____________________\n");
        Tablet t=new Tablet("Paracetamol",24.99,"14/6",10);
        t.display();

        System.out.println("_____________________\n");
        Syrup s=new Syrup("Cough Syrup",150.99,"18/12",1);
        s.display();

    }
}
