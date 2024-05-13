/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    import com.person.Person;

/**
 *
 * @author A-27
 */
public class buku {
    public static void main(String[] args) {
        System.out.println("Latihan kelas");
        String judulbuku1 = "Java1";
        String authorbuku1 = "Azzura";
        String judulbuku2 = "Java2";
        String authorbuku2 = "Cut";
        System.out.println("judulbuku1");
        System.out.println("authorbuku2");
        System.out.println("judulbuku2");
        System.out.println("authorbuku2");
        
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        buku1.judul = "Java1";
        buku1.author = "Azzura";
        buku2.judul = "Java2";
        buku2.author = "Cut";
        
        System.out.println(buku1.judul);
        System.out.println(buku1.author);
        System.out.println(buku2.judul);
        System.out.println(buku1.author);
        System.out.println(buku1.tahunpenerbitan);
        System.out.println(buku1.harga.beli);
        System.out.println(buku1.penerbit.nama);
        
    }
}

class Buku{
    String judul;
    String author;
    Person author = new Person();
    int tahunpenerbitan = 2024;
    Harga harga = new Harga();
    PerusahaanBuku penerbit = new PerusahaanBuku();
}

class Harga{
    double  jual = 100000.00;
    double beli = 80000.00;
}