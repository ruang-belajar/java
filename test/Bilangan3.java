import java.util.Scanner;

public class Bilangan3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        boolean ok = false;


        while(!ok) {
            try {
                scan = new Scanner(System.in);
                System.out.print("A? ");
                n1 = scan.nextInt();

                scan = new Scanner(System.in);
                System.out.print("B? ");
                n2 = scan.nextInt();

                ok = true;
            } catch (Exception e) {
                System.out.println("Anda memasukan input yang salah");
            }

        }
        
        System.out.print("A x B = "+(n1*n2));

        

        scan.close();
    }
}
