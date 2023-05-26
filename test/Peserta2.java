import java.util.Scanner;
import java.util.ArrayList;

public class Peserta2 {
    public static void main(String[] args) {
        ArrayList nama = new ArrayList();
        ArrayList kelas = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = 0;
        String input;

        // program meminta input nama dari user,
        // berulang sampai user input nama "kosong"
        do {
            System.out.print("Nama "+(n+1)+":");
            input = scan.nextLine();
            nama.add(input);

            System.out.print("Kelas :");
            input = scan.nextLine();
            kelas.add(input);
            n++;
        } while(!input.equals(""));

        System.out.println("======================");
        for(int i=0; i<nama.size();i++) {
            System.out.println(nama.get(i)+" - "+kelas.get(i));
        }
        scan.close();
    }
}