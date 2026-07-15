package implementation;
public class Medicine {
    private String name;
    private double price;
    private String expiry_date;
    private int quantity;

//    void setName(String name){
//        this.name=name;
//    }
//    void setPrice(double price){
//        this.price=price;
//    }
//    void setExpiry_date(String expiry_date){
//        this.expiry_date=expiry_date;
//    }
//    void setQuantity(int quantity){
//        this.quantity=quantity;
//    }

    Medicine(String name,double price, String expiry_date,int quantity){
        this.name=name;
        this.price=price;
        this.expiry_date=expiry_date;
        this.quantity=quantity;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public String getExpiry_date(){
        return expiry_date;
    }
    public int getQuantity(){
        return quantity;
    }

    void display() {

    }
}
class Syrup extends Medicine {

    public Syrup(String name,double price, String expiry_date,int quantity){
        super(name,price,expiry_date,quantity);
    }

    public void display(){
        System.out.println("Medicine type:Syrup");
        System.out.println("Name:"+getName());
        System.out.println("Price:"+getPrice());
        System.out.println("Quantity:"+getQuantity());
        System.out.println("Expiry:"+getExpiry_date());
    }
}
class Tablet extends Medicine {

    public Tablet(String name,double price, String expiry_date,int quantity){

        super(name,price,expiry_date,quantity);
    }
    public void display(){
        System.out.println("Medicine type:Tablet");
        System.out.println("Name:"+getName());
        System.out.println("Price:"+getPrice());
        System.out.println("Quantity:"+getQuantity());
        System.out.println("Expiry:"+getExpiry_date());
    }
}