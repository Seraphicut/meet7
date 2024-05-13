/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-27
 */

public class Pertemuan7 {

    public static void main(String[] args) {
        // Bentuk Normal
        int angka = 10;
        if (angka % 2 == 0) {
            System.out.println("Genap (Normal)");
        } else {
            System.out.println("Ganjil (Normal)");
        }

        // Bentuk Ternary
        String hasilTernary = (angka % 2 == 0) ? "Genap (Ternary)" : "Ganjil (Ternary)";
        System.out.println(hasilTernary);

        // Bentuk Lambda Expression (tidak kompatibel dengan Java 2011)
        // **Perubahan:** Hapus blok lambda expression karena tidak kompatibel dengan Java 2011.
        // Ganti dengan if-else statement.
        int nilai = 75;
        String keterangan;
        if (nilai >= 80) {
            keterangan = "Nilai sangat baik";
        } else if (nilai >= 70) {
            keterangan = "Nilai baik";
        } else if (nilai < 60) {
            keterangan = "Nilai buruk";
        } else {
            keterangan = "Nilai cukup";
        }
        System.out.println(keterangan);

        // Bentuk Menggunakan Var
        var umur = 20;
        var kategori = (umur >= 18) ? "Dewasa (Var)" : "Anak-anak (Var)";
        System.out.println(kategori);
    }
}

