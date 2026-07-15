package Task;

import java.util.Arrays;

public class movezero {
    static void main(String[] args) {
        int [] arr=new int[]{1,0,2,0,3};
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                for (int j = i; j < arr.length ; j++) {
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i=1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
