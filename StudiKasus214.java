import java.util.Scanner;

public class StudiKasus214 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine().trim().toUpperCase();

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            // Cabang lomba
            System.out.print("Jumlah dokumen  : ");
            int dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + juara + ", dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }

        } else if (jenis.equals("PKM")) {
            // Cabang PKM
            System.out.print("Jumlah dokumen  : ");
            int dokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int pkm = sc.nextInt();

            if (pkm == 1) {
                if (dokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan, dokumen lengkap).");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
            }

        } else if (jenis.equals("LAINNYA")) {
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");

        } else {
            System.out.println("Jenis kegiatan tidak dikenali.");
        }

        sc.close();
    }
}