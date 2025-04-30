import java.util.Scanner;

public class SuratDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat10 tumpukanSurat = new StackSurat10(10);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat berdasarkan Nama Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi Izin (hari): ");
                    int durasi = sc.nextInt(); sc.nextLine();
                    Surat10 suratBaru = new Surat10(id, nama, kelas, jenis, durasi);
                    tumpukanSurat.push(suratBaru);
                    break;

                case 2:
                    Surat10 diproses = tumpukanSurat.pop();
                    if (diproses != null) {
                        System.out.println("Memverifikasi surat dari " + diproses.namaMahasiswa);
                        System.out.println("Jenis Izin: " + (diproses.jenisIzin == 'S' ? "Sakit" : "Izin"));
                        System.out.println("Durasi: " + diproses.durasi + " hari");
                    }
                    break;

                case 3:
                    Surat10 terakhir = tumpukanSurat.peek();
                    if (terakhir != null) {
                        System.out.println("Surat terakhir dari: " + terakhir.namaMahasiswa);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String dicari = sc.nextLine();
                    boolean ada = tumpukanSurat.cariSurat(dicari);
                    if (ada) {
                        System.out.println("Surat atas nama " + dicari + " ditemukan.");
                    } else {
                        System.out.println("Surat atas nama " + dicari + " TIDAK ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }
}
