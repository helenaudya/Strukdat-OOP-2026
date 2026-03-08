<<<<<<< HEAD
# Data Structure Object-Oriented Programming
Project ini merupakan implementasi dari konsep Object-Oriented Programming (OOP) dalam Java menggunakan studi kasus Cafe Drink System.

Pada project ini terdapat main class (parent class) yaitu `Drink` yang merepresentasikan minuman secara umum. Kemudian dibuat kelas turunannya (sub class) berupa:

1. Coffee
2. Tea
3. Juice

## 4 Pilar Object-Oriented Programming
### 1. Encapsulation
Encapsulation merupakan sebuah konsep untuk mengemas data bersamaan dengan metode yang beroperasi pada data tersebut dalam sebuah class. Atribut dalam class `Drink` dibuat private, sehingga tidak bisa diakses langsung dari luar class dan perlu menggunakan metode `getter` untuk mengambilnya.
```Java
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

```
### 2. Inheritance
Inheritance merupakan konsep pewarisan sifat dari satu class ke kelas lain. Dalam program ini, class `Drink` menjadi `Parent class` atau `kelas induk`. Class lain seperti `Coffee`, `Tea`, dan `Juice` merupakan `Child class` atau `kelas turunan` yang mewarisi dari `Drink`.
```Java
//Inheritance. Child class dari Drink
public class Tea extends Drink {

    //Constructor memanggil constructor parent dengan super
    public Tea (String name, String size, int price){
        super (name, size, price);
    }
```
Dengan menggunakan `extends`, class `Tea` mewarisi atribut `name`, `size`, dan `price` serta method dari class `Drink`. 
Keyword `super` digunakan untuk memanggil constructor pada class `Drink`, sehingga nilai name, size, dan price bisa langsung diisi saat object dibuat.
### 3. Polymorphism
Polymorphism berarti memiliki banyak bentuk. Polymorphism merupakan kemampuan sebuah method yang sama untuk memiliki perilaku yang berbeda pada subclass yang berbeda. Pada project ini, method `prepare()` didefinisikan pada class `Drink`:
```Java
 //Method umum yang dimiliki semua minuman
    public void prepare(){
        System.out.println(name + " is being prepared");
    }
```
Kemudian di-override pada Class Tea:
```Java
 //Polymorphism. Method diubah perilakunya untuk Tea
    @Override
    public void prepare(){
        System.out.println(getName() + " tea is steeping");
    }
```
Sehingga setiap subclass memiliki implementasi method `prepare()` yang berbeda sesuai dengan jenis minumannya.
### 4. Abstraction
Abstraction adalah konsep menyembunyikan detail implementasi dan hanya menampilkan fungsi yang dibutuhkan pengguna. Dalam program ini class main hanya memanggil method tanpa mengetahui bagaimana proses di dalam class tersebut:
```Java
//Memanggil method prepare (Polymorphism) dari setiap object
        myCoffee.prepare();
        myTea.prepare();
        myJuice.prepare();
```
Dengan demikian, pengguna cukup memanggil method yang tersedia tanpa perlu memahami bagaimana proses di dalam method tersebut dijalankan.
=======
# Strukdat-OOP-2026
>>>>>>> 3206dae56f55e7854f757be3c2fa372b8f0b190d
