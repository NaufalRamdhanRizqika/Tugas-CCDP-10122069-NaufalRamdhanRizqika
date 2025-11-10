/**
 * Kelas Mahasiswa merepresentasikan entitas data mahasiswa
 * dengan atribut nama, NIM, dan jurusan.
 */
public class Mahasiswa {

    private String nama;
    private String nim;
    private String jurusan;

    /**
     * Konstruktor untuk membuat objek Mahasiswa baru.
     *
     * @param nama    Nama mahasiswa
     * @param nim     Nomor Induk Mahasiswa
     * @param jurusan Jurusan mahasiswa
     */
    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    /**
     * Mengambil nama mahasiswa.
     *
     * @return Nama mahasiswa
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil NIM mahasiswa.
     *
     * @return NIM mahasiswa
     */
    public String getNim() {
        return nim;
    }

    /**
     * Mengambil jurusan mahasiswa.
     *
     * @return Jurusan mahasiswa
     */
    public String getJurusan() {
        return jurusan;
    }

    /**
     * Mengembalikan representasi string dari objek Mahasiswa.
     *
     * @return String berisi informasi lengkap mahasiswa
     */
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "Nama='" + nama + '\'' +
                ", NIM='" + nim + '\'' +
                ", Jurusan='" + jurusan + '\'' +
                '}';
    }
}
