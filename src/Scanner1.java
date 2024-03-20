/**
 *
 * @author En Tay
 */
import java.util.Scanner;

public class Scanner1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);       // Scanner object

        System.out.println("Enter your rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your fee");
        double fee = sc.nextDouble();
        System.out.println("Rollno:" + rollno + " name:" + name + " fee:" + fee);
        sc.close();
    }
}
