// Nama  : Richard Panigor Sitompul
// Kelas : 2A-Sistem Informasi
// NIM   : 11200930000025

package mahasiswa;

public class MahasiswaBeraksi
{
    public static void main(String[] args)
    {
        System.out.println("Hari ini diadakan ujian akhir");
        Mahasiswa kegiatan = new Mahasiswa();
        kegiatan.membaca();
        kegiatan.nyontek();
        kegiatan.modifikasi();
    }
}
