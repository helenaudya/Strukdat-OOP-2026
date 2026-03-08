//Inheritancee. Child class dari Drink
public class Coffee extends Drink {

    //Constructor memanggil constructor parent dengan super
    public Coffee(String name, String size, int price){
        super(name, size, price);
    }

    //Polymorphism (method overriding). Method diubah perilakunya untuk coffee
    @Override
    public void prepare(){
        System.out.println(getName() + " coffee is brewing");
        System.out.println("Size: " + getSize());
        System.out.println("Price: " + getPrice());
        System.out.println();
    }
}