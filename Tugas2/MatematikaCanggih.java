// Nama  : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM   : 11200930000025

package Tugas2;

public class MatematikaCanggih extends Matematika
{
    void modulus(int a, int b){
        int hasil1 = a%b;
        System.out.println("Hasil dari " + a + " % " + b + " = " + hasil1);
    }

    void modulus(double a, double b, double c){
        double hasil2 = a%b%c;
        System.out.println("Hasil dari " + a + " % " + b + " % " + c + " = " + hasil2);
    }
}