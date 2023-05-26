import java.util.Random;  // Import the Scanner class
public class LatihanMath3 {
    public static void main(String[] args) {
        int[] hitung = new int[7];
        Random rnd = new Random();
        int num ;

        for(int i=0; i<30;i++) {
            num = rnd.nextInt(6)+1;
            hitung[num]++;
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println("Frekuensi:");
        for(int i=1; i<=6; i++) {
            System.out.println("Angka "+i+" muncul "+hitung[i]+"x");
        }

    }
}
