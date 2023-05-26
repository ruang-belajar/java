import java.util.Scanner;
import java.util.ArrayList;

public class Peserta1 {
    public static void main(String[] args) {
        ArrayList peserta = new ArrayList();
        Scanner scan = new Scanner(System.in);
        int n = 0;
        String input;

        // program meminta input nama dari user,
        // berulang sampai user input nama "kosong"
        do {
            System.out.print("Nama "+(n+1)+":");
            input = scan.nextLine();
            peserta.add(input);
            n++;
        } while(!input.equals(""));

        System.out.println("======================");
        for(int i=0; i<peserta.size();i++) {
            System.out.println(peserta.get(i));
        }
        scan.close();
    }
}