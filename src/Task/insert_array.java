package Task;

import java.util.Arrays;
import java.util.Scanner;
public class insert_array {
    public static void Insert_first(int[] arr,int n,int space) {
        for (int i = arr.length-1; i >0 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[n]=10;
        System.out.println("After inserting at first position:");
        System.out.println(Arrays.toString(Arrays.copyOf(arr,arr.length-space)));
    }
    public static void Insert_middle(int[] arr,int n1,int space) {
        for (int i = arr.length-1;i>n1 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[n1]=20;
        System.out.println("After inserting at second position:");
        System.out.println(Arrays.toString(Arrays.copyOf(arr,arr.length-space)));
    }
    public static void Insert_last(int[] arr,int n2,int space) {
        arr[n2]=30;
        System.out.println("After inserting at last position:");
        System.out.println(Arrays.toString(Arrays.copyOf(arr,arr.length-space)));
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[7];
        System.out.println("Enter no.of element to be inserted:");
        int element=sc.nextInt();
        int space= arr.length-element;
        System.out.println("Enter array element:");
        for (int i = 0; i <element ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before inserting:");
        System.out.println(Arrays.toString(arr));
        System.out.println("No.of spaces available: "+space);
        while(space>0){
            if(space==3){
                int n=0;
                Insert_first(arr,n,space);
                space--;
            }
            else if(space==2){
                int n1=2;
                Insert_middle(arr,n1,space);
                space--;
            }
            else if(space==1){
                int n2= arr.length-1;
                Insert_last(arr,n2,space);
                space--;
            }
        }
        System.out.println("No space left");
    }
}
