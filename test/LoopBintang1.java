
public class LoopBintang1 {
    public static void main(String[] args) {
        // BAGIAN 1
        for(int baris=1; baris<=5; baris++) {
            for(int kolom=1; kolom<=baris; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // BAGIAN 2
        for(int baris=1; baris<=5; baris++) {
            for(int kolom=1; kolom<=baris; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // BAGIAN 3
        for(int baris=1; baris<=3; baris++) {
            for(int kolom=1; kolom<=baris; kolom++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // BAGIAN 4
        for(int baris=1; baris<=3; baris++) {
            for(int kolom=1; kolom<=baris; kolom++) {
                System.out.print("X");
            }
            System.out.println();
        }
        System.out.println();

    }
}