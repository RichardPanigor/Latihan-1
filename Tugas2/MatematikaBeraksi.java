// Nama  : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM   : 11200930000025

package Tugas2;

public class MatematikaBeraksi
{
    public static void main(String[] args){
        Matematika latihan = new Matematika();
        System.out.println("Latihan 3");
        latihan.pertambahan(35,21);
        latihan.pengurangan(31,42);
        latihan.perkalian(8,12);
        latihan.pembagian(48,6);
        latihan.pengurangan(12.5,28.7,14.2);
        latihan.perkalian(12.5,28.7,14.2);
        latihan.pertambahan(12.5,28.7,14.2);
        latihan.pertambahan(12,28,14);
        latihan.pertambahan(23,24);

        /*
        untuk latihan.pertambahan(3.4,4.9);
        tidak bisa di eksekusi karena membutuhkan method pertambahan dengan 2 parameter dan tipe data double,
        sedangkan dalam kelas matematika tidak ada.
        Agar bisa di eksekusi maka harus dibuat method pertambahan dengan 2 parameter dan tipe data double.
         */
    }
}
