//package latihan.test;

import java.util.Scanner;

public class Daftar2 {
    public static void main(String[] args) {
        String[] nama = new String[3];
        int[] nilai = new int[3];
        Scanner scan = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Nama "+(n+1)+":");
            nama[n] = scan.nextLine();
            System.out.print("Nilai:");
            nilai[n] = scan.nextInt();
            scan.nextLine();
            n++;
        } while(n<=2);

        System.out.println("======================");
        for(int i=0; i<=2;i++) {
            System.out.println(nama[i]+" >> "+nilai[i]);
        }
        scan.close();
    }
}