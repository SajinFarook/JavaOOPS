package Classes_and_Objects;

import java.util.Scanner;
class newbook{
    String bookauth;
    String booktitle;
    Long bookisbn;

    void add_book(String bookauth,String booktitle,Long bookisbn){
        this.bookisbn=bookisbn;
        this.bookauth=bookauth;
        this.booktitle=booktitle;
        disp_book();
    }
    void disp_book(){
        System.out.println("BookTitle: "+booktitle);
        System.out.println("BookAuth: "+bookauth);
        System.out.println("BookISBN: "+bookisbn);
    }

}
public class book {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book auth:");
        String auth=sc.nextLine();
        System.out.println("Enter book title:");
        String title=sc.nextLine();
        System.out.println("Enter book isbn:");
        Long isbn=sc.nextLong();
        newbook obj=new newbook();
        obj.add_book(auth,title,isbn);

    }
}
