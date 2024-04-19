import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Menikah(y/t)?");
        String menikah = scan.nextLine();

        System.out.print("Jenis kelamin(l/p)?");
        String jk = scan.nextLine();

        System.out.print("Umur?");
        Integer umur = scan.nextInt();

        if(menikah.equals("y")) { //menikah
            if(jk.equals("l")) {
                System.out.println("Halo pa");
            } else {
                System.out.println("Halo mba");
            }
        } else { // tidak menikah
    
            if(umur>20) {
                if(jk.equals("l")) {
                    System.out.println("Halo pa");
                } else {
                    System.out.println("Halo ibu");
                }
            } else {
                if(jk.equals("l")) {
                    System.out.println("Halo mas");
                } else {
                    System.out.println("Halo mba");
                }
            }
        }
    }     
}
