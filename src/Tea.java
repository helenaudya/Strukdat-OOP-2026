//Inheritance. Child class dari Drink
public class Tea extends Drink {

    //Constructor memanggil constructor parent dengan super
    public Tea (String name, String size, int price){
        super (name, size, price);
    }

    //Polymorphism. Method diubah perilakunya untuk Tea
    @Override
    public void prepare(){
        System.out.println(getName() + " tea is steeping");
    }
}