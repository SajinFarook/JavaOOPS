package Task;

import java.util.Scanner;

public class common_element {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=3;
        int[] arr1=new int[size];
        int[] arr2=new int[size];
        System.out.println("Enter Array 1 element:");
        for (int i = 0; i <size; i++) {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter Array 2 element:");
        for (int i = 0; i <size ; i++) {
            arr2[i]=sc.nextInt();
        }
        int common=0;
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                if(arr1[i]==arr2[j]){
                    System.out.println(arr1[i]);
                }
            }

        }
    }
}
