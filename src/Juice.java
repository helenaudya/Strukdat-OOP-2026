//Inheritance. Child class dari Drink
public class Juice extends Drink {
    
    //Constructor memanggil constructor parent dengan super
    public Juice (String name, String size, int price){
        super (name, size, price);
    }

    //Polymorphism. Method diubah perilakunya untuk Juice
    @Override
    public void prepare (){
        System.out.println(getName() + " is being blended");
    }
}
