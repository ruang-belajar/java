import java.util.Scanner;


public class Daftar3 {
    public static void main(String[] args) {
        Siswa[] daftar = new Siswa[3];
        Scanner scan = new Scanner(System.in);
        int n = 0;

        do {    
            daftar[n] = new Siswa();
            System.out.print("Nama "+(n+1)+":");
            daftar[n].nama = scan.nextLine();
            System.out.print("Nilai:");
            daftar[n].nilai = scan.nextInt();
            scan.nextLine();
            n++;
        } while(n<=2);

        System.out.println("======================");
        for(int i=0; i<=2;i++) {
            System.out.println(daftar[i].nama+" >> "+daftar[i].nilai);
        }
        scan.close();
    }
}