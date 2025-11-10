import java.util.Scanner;

/**
 * Kelas MainApp berfungsi sebagai titik masuk utama program
 * untuk menjalankan aplikasi manajemen data mahasiswa.
 */
public class MainApp {

    /**
     * Metode utama untuk menjalankan program.
     *
     * @param args Argumen baris perintah
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ManajemenMahasiswa manajemen = new ManajemenMahasiswa();
        int pilihan;

        do {
            System.out.println("\n===== SISTEM MANAJEMEN MAHASISWA =====");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Mahasiswa");
            System.out.println("3. Hapus Mahasiswa");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Masukkan Jurusan: ");
                    String jurusan = input.nextLine();
                    manajemen.tambahMahasiswa(new Mahasiswa(nama, nim, jurusan));
                    System.out.println("Mahasiswa berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\nDaftar Mahasiswa:");
                    manajemen.tampilkanMahasiswa();
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang ingin dihapus: ");
                    String hapusNim = input.nextLine();
                    if (manajemen.hapusMahasiswa(hapusNim)) {
                        System.out.println("Data berhasil dihapus.");
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem ini!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 4);
    }
}
