public class Book_implements implements Book_inter{
    String name;
    private double price;
    Book_implements(String name,double price){
        this.name=name;
        this.price=price;

    }
    public void show(){
        System.out.println(name);
        System.out.println(price);
    }
    public void set(double price){
        this.price=price;
    }
}
