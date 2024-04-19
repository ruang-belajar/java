import java.util.Scanner; 
public class StringCompare1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Anda mau (y/t)?");
        String jawaban =  scan.nextLine();

        if(jawaban.equals("y")) {
            System.out.println("OK, Anda mau");
        } else {
            if(jawaban.equals("t")) {
                System.out.println("Anda tidak mau");
            } else {
                System.out.println("Saya tidak mengerti jawaban Anda");
            }
        }
    }
}
