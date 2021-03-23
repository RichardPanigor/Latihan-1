// Nama  : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM   : 11200930000025

package PelajaranMatematika;

public class MatematikaBeraksi
{
    public static void main(String[] args)
    {
        System.out.println("=== Percobaan 1 ===");
        Matematika latihan = new Matematika();
        latihan.pertambahan(20, 20);
        latihan.pengurangan(10, 5);
        latihan.perkalian(10, 20);
        latihan.pembagian(21, 2);

        System.out.println("\n === Percobaan 2 ===");
        latihan.pertambahan(35,21);
        latihan.pengurangan(31,42);
        latihan.perkalian(8,12);
        latihan.pembagian(24,6);
    }


}
