import java.util.ArrayList;
import java.util.List;

/**
 * Kelas ManajemenMahasiswa digunakan untuk mengelola data mahasiswa.
 * Kelas ini menyediakan metode untuk menambah, menampilkan, dan menghapus mahasiswa.
 */
public class ManajemenMahasiswa {

    private List<Mahasiswa> daftarMahasiswa;

    /**
     * Konstruktor untuk inisialisasi daftar mahasiswa.
     */
    public ManajemenMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    /**
     * Menambahkan mahasiswa baru ke daftar.
     *
     * @param mahasiswa Objek Mahasiswa yang akan ditambahkan
     */
    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    /**
     * Menampilkan seluruh daftar mahasiswa ke konsol.
     */
    public void tampilkanMahasiswa() {
        if (daftarMahasiswa.isEmpty()) {
            System.out.println("Belum ada data mahasiswa.");
        } else {
            for (Mahasiswa m : daftarMahasiswa) {
                System.out.println(m);
            }
        }
    }

    /**
     * Menghapus mahasiswa berdasarkan NIM.
     *
     * @param nim NIM mahasiswa yang ingin dihapus
     * @return true jika data ditemukan dan dihapus, false jika tidak ditemukan
     */
    public boolean hapusMahasiswa(String nim) {
        for (Mahasiswa m : daftarMahasiswa) {
            if (m.getNim().equals(nim)) {
                daftarMahasiswa.remove(m);
                return true;
            }
        }
        return false;
    }
}
