package Task;

public class rep {
    static void main(String[] args) {
        String word="programming";
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <word.length()-1 ; i++) {
            sb.append(word.charAt(i));
            if(word.charAt(i)==word.charAt(i+1)){
                i++;
            }
        }
        System.out.println(sb.toString());
    }
}
