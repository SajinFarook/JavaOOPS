package Task2;

import java.util.Scanner;

public class Person {
    int age;
    String name;

    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Details");
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        System.out.println("Enter Name: ");
        String name= sc.nextLine();
        Person p1=new Person(age,name);
    }
}
