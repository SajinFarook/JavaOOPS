package Task;

public class nonrepeating {
    public static void main(String[] args) {
//        String name="swiss";
//        char non_repeat=' ';
//        boolean non=true;
//        for (int i =0;i<name.length();i++ ){
//            for(int j=i+1;j<name.length();j++){
//                if(name.charAt(i)==name.charAt(j)){
//                    non=false;
//                }
//                else{
//                    non=true;
//                }
//            }
//            if(non){
//                non_repeat=name.charAt(i);
//                break;
//            }
//        }
//        System.out.println(non_repeat)
        String s="loveleetcode";
        int non_repeat_index=0;
        boolean non=true;
        int n=0;
        for (int i =0;i<s.length();i++ ){
            n=0;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    non=false;
                    break;
                }
                else{
                    n=i;
                    non=true;
                }
            }
        }
        if(non){
            non_repeat_index=n;
        }
        else{
            System.out.println(-1);
        }
        System.out.println(non_repeat_index);
    }
}
