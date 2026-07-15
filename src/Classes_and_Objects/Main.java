package Classes_and_Objects;

class IDConstructor {
    static int nextID=1;

    static int generateID(){
        return nextID++;
    }
}
public class Main{
    static void main(String[] args) {
        System.out.println(IDConstructor.generateID());
        System.out.println(IDConstructor.generateID());
        System.out.println(IDConstructor.generateID());
        System.out.println(IDConstructor.generateID());
    }
}
