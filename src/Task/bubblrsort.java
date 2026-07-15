package Task;

import java.util.Arrays;

public class bubblrsort {
    static void main(String[] args) {
        int[] arr={9,1,8,2,7,4,6,5};
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j < arr.length-1 ; j++) {
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i<arr.length-1; i++) {
            int min=i;
            for (int j = i+1; j<arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
