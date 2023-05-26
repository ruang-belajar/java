import java.util.Scanner;

public class Bilangan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        System.out.print("A? ");
        n1 = scan.nextInt();

        System.out.print("B? ");
        n2 = scan.nextInt();

        System.out.print("A x B = "+(n1*n2));

        scan.close();
    }
}