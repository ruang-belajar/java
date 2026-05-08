import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputTanggal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Menggunakan format Hari-Bulan-Tahun
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Masukkan tanggal (contoh: 25-12-2024): ");
        String inputUser = scanner.nextLine();

        // 2. Parsing ke LocalDate
        LocalDate tanggal = LocalDate.parse(inputUser, formatter);

        // 3. Menampilkan informasi
        System.out.println("\n--- Data Berhasil Disimpan ---");
        System.out.println("Tanggal          : " + tanggal.format(formatter));
        System.out.println("Nama Bulan       : " + tanggal.getMonth());
        System.out.println("Tahun            : " + tanggal.getYear());
        System.out.println("Apakah Kabisat?  : " + (tanggal.isLeapYear() ? "Ya" : "Tidak"));

        scanner.close();
    }
}