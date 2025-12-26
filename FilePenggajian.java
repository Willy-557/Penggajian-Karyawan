import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;



public class FilePenggajian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Karyawan> dataKaryawan = new HashMap<>();

        while (true) {
            System.out.println("=== Penggajian Karyawan ===");
            System.out.println("1. Tambah data karyawan");
            System.out.println("2. Cetak Slip Gaji");
            System.out.println("3. Keluar");

            System.out.print(">> ");
            int opsi = scanner.nextInt();

            if (opsi == 3) {
                System.out.println("Terimakasih!");
                break;
            }
            else if (opsi > 3 || opsi < 1) {
                System.out.println("Invalid input!");
                continue;
            }
            else {
                switch (opsi) {
                    case 1:
                        System.out.println("Masukkan NIK: ");
                        break;
                }
            }
        }
        
    }
}

