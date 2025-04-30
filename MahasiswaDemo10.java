import java.util.Scanner;

public class MahasiswaDemo10 {
    public static void main(String[] args) {
        StackTugasMahasiswa10 stack = new StackTugasMahasiswa10(5);
        Scanner input = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas ");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Lihat Jumlah Tugas yang Sudah Dikumpulkan");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa10 mhs = new Mahasiswa10(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa10 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = input.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa10 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas teratas adalah " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa10 palingAwal = stack.pengumpulAwal();
                    if (palingAwal != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + palingAwal.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.jumlahTugas());
                    break;                
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 6); 
    }
}
