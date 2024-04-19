import java.util.Scanner; // uncomment jika diperlukan

public class Jumlah1 { // rubah nama class utama, samakan dengan nama file
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer a, b, c;

        System.out.print("A = ");
        a = scan.nextInt();

        System.out.print("B = ");
        b = scan.nextInt();

        c = a + b;

        System.out.println("A + B = "+c.toString());

        scan.close();

    }

}