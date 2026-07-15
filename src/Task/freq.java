package Task;

public class freq {
    static void main(String[] args) {
        int arr[]=new int[]{1,2,2,3,2};
        for (int i = 0; i <arr.length; i++) {
            int fren=1;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    fren++;
                    i++;
                }
            }
            System.out.println(arr[i]+"="+fren);
        }
    }
}
