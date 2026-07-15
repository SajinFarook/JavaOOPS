package Task;

import java.util.ArrayList;

public class dup_remove {
    static void main(String[] args) {
        int arr[] = new int[]{1, 2, 2, 3, 4, 4};
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            arr1.add(arr[i]);
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);
                i++;
            }
//            else{
//                arr1.add(arr[i]);
//            }
        }
        System.out.println(arr1);
    }
}
