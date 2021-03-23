// Nama  : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM   : 11200930000025

package bank;

public class BankBeraksi
{
    public static void main(String[] args){
        Bank transaksi = new Bank(100000);
        System.out.println("Selamat datang di Bank ABC");
        transaksi.getSaldo();
        transaksi.simpanUang(500000);
        transaksi.ambilUang(150000);
    }
}
