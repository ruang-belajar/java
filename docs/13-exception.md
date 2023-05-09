# Exception: Try ... Catch

Hal-hal di luar harapan bisa terjadi ketika program kita dijalankan. Hal ini bisa menyebabkan program berhenti (_runtime error_). Hal yang bisa menyebabkan muncul _runtime error_: pada bagian membaca input dari user, membaca file, membaca data lewat jaringan.

Berikut contoh program sederhana membaca input dari user:
```java
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
```
Program diatas, akan meminta user memasukan 2 angka dan mengkalikannya. Masalah yang akan timbul adalah jika user menginput sesuatu yang bukan angka _integer_, jika itu terjadi, maka _Java_ akan menghentikan progran dan memberitahukan _runtime error_. 
```
C:\latihan>java Bilangan1.java
A? 32i
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at Bilangan1.main(Bilangan1.java:10)
```
Menampilkan _runtime error_ pada user adalah sesuatu yang buruk, karena itu menandakan bawa ada bagian proses yang tidak ditangani dengan baik oleh program. Untuk itu, kita bisa mengantisipasinya dengan menggunakan blok perintah `try` ... `catch` pada bagian-bagian program yang mungkin terjadi _runtime error_.

Contoh program dengan `try`...`catch`:
```java
import java.util.Scanner;

public class Bilangan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        try {
            System.out.print("A? ");
            n1 = scan.nextInt();

            System.out.print("B? ");
            n2 = scan.nextInt();

            System.out.print("A x B = "+(n1*n2));
        } catch (Exception e) {
            System.out.println("Anda memasukan input yang salah");
        }

        scan.close();
    }
}

```

**Latihan:**
* Pelajari [Java Exception - Try...Catch](https://www.w3schools.com/java/java_try_catch.asp) dan file [Hitung1.java](https://github.com/pujangga123/ruang-belajar-java/blob/main/latihan/src/Hitung1.java), kemudian kerjakan [Soal Latihan (File)](https://github.com/pujangga123/ruang-belajar-java/blob/main/latihan/06-class-5.md)


Referensi:
- [Java Exception - Try...Catch](https://www.w3schools.com/java/java_try_catch.asp)