// Nama  : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM   : 11200930000025

package bank;

public class Bank
{
    int saldo;

    public Bank(int saldo) {
        this.saldo = saldo;
    }
    void simpanUang(int nilai) {
        saldo = saldo + nilai;
        System.out.println("Simpan uang : Rp. " + nilai);
        getSaldo();
    }
    void ambilUang(int nilai){
        saldo = saldo - nilai;
        System.out.println("Ambil uang : Rp. " + nilai);
        getSaldo();
    }
    int getSaldo(){
        System.out.println("Saldo saat ini : Rp. " + saldo);
        return saldo;
    }
}