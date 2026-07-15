package Overloading;
public class Calculate {
    public static void main(String[] args) {
    double x=2.00000;
    int n=10;
    double sum=0;
    while(n>0){
        sum*=x;
        n--;
    }
    System.out.println(sum);
    }
}
