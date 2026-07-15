package Task2;

import java.util.Scanner;

public class Calc {

    void multi(int a,int b){
        System.out.println(a*b);
    }
    void multi(int a,int b,int c){
        System.out.println(a*b*c);
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("A value for a:");
        int a=sc.nextInt();
        System.out.println("A value for b:");
        int b=sc.nextInt();
        System.out.println("A value for c:");
        int c=sc.nextInt();
        Calc c1=new Calc();
        c1.multi(a,b);
        c1.multi(a,b,c);
    }
}
