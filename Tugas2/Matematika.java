// Nama  : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM   : 11200930000025

package Tugas2;

public class Matematika
{
    int hasil1;
    double hasil2;

    void pertambahan(int a, int b){
        hasil1 = a+b;
        System.out.println("Hasil dari " + a + " + " + b + " = " + hasil1);
    }

    void pengurangan(int a, int b){
        hasil1 = a-b;
        System.out.println("Hasil dari " + a + " - " + b + " = " + hasil1);
    }

    void perkalian(int a, int b){
        hasil1 = a*b;
        System.out.println("Hasil dari " + a + " x " + b + " = " + hasil1);
    }

    void pembagian(int a, int b){
        hasil1 = a/b;
        System.out.println("Hasil dari " + a + " : " + b + " = " + hasil1);
    }

    // Method baru bertipe data double
    void pertambahan(double a, double b, double c){
        hasil2 = a+b+c;
        System.out.println("Hasil dari " + a + " + " + b + " + " + c + " = " + hasil2);
    }

    void pengurangan(double a, double b, double c){
        hasil2 = a-b-c;
        System.out.println("Hasil dari " + a + " - " + b + " - " + c + " = " + hasil2);
    }

    void perkalian(double a, double b, double c){
        hasil2 = a*b*c;
        System.out.println("Hasil dari " + a + " x " + b + " x " + c + " = " + hasil2);
    }

    void pembagian(double a, double b, double c){
        hasil2 = a/b/c;
        System.out.println("Hasil dari " + a + " : " + b + " : " + c + " = " + hasil2);
    }

}
