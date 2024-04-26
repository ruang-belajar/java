import java.util.*;
public class List1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> daftar = new ArrayList<Integer>();

        Integer n = 99;

        int count = 0;
        while(n>0) {
            System.out.print("Angka?");
            n = scan.nextInt();

            if(n>0) {
                daftar.add(n);
                count++;
            }
        }

        System.out.println("=====================");
        n=0;
        while(n<daftar.size()) {
            System.out.print(daftar.get(n));
            System.out.print(", ");
            n++;
        }
        

    }
}
