//Main class untuk menjalankan program
public class main {
    public static void main(String[] args) throws Exception {
        
        //Mmebuat object masing-masing class
        Coffee myCoffee = new Coffee("Latte", "Large", 30000);
        Tea myTea = new Tea("Earl Grey", "Medium", 20000);
        Juice myJuice = new Juice("Orange Juice", "Small", 25000);

        //mengambil data
        System.out.println(myCoffee.getName());
        System.out.println();
        
        //Memanggil method prepare (Polymorphism) dari setiap object
        myCoffee.prepare();
        myTea.prepare();
        myJuice.prepare();
    }
}
