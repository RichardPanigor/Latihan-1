// Nama  : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM   : 11200930000025

package hp;

public class HandphoneBeraksi{
    public static void main(String[] args){
        Handphone aksi = new Handphone();
        aksi.hidupkan();
        aksi.lakukanPanggilan();
        aksi.kirimSMS();
        aksi.matikan();
    }
}
