package This_Keyword;

class Record{
    int rno;
    String name;

    Record(){
        rno=23;
        name="Vel";
    }

    //Parameterised Constructor
    Record(int rno,String name){
        this.rno=rno;
        this.name=name;
    }
    void display(){
        System.out.println("Name of the student: "+name+" and rollno "+rno);
    }
}
public class Student {
    static void main(String[] args) {
        Record r0=new Record();
        r0.display();
        Record r1=new Record(70,"Sajin");
        r1.display();
    }
}
