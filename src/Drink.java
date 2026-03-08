//parent class (merepresentasian konsep umum dari semua minuman di cafe)
public class Drink {
    
    //Encapsulation. Dibuat private agar tidak bisa diakses langsung dari luar class
    private String name;
    private String size;
    private int price;

    //Constructor
    public Drink(){
    }

    //Constructor dengan parameter atribut untuk menginisialisasi object saat dibuat
    public Drink(String name, String size, int price){
        this.name = name;
        this.size = size;
        this.price = price;
    }

    //Method umum yang dimiliki semua minuman
    public void prepare(){
        System.out.println(name + " is being prepared");
    }

    //Getter method untuk mengambil nilai atribut
    public String getName(){
        return name;
    }

    public String getSize(){
        return size;
    }

    public int getPrice(){
        return price;
    }

}
