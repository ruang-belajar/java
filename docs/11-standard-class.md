# Java Standard Class

Java memiliki berbagai fungsi untuk melakukan banyak hal. Fungsi-fungsi ini dibungkus dalam class, dan class ini disimpan dalam bentuk _package_. Beberapa _package_ bisa langsung digunakan, beberapa memerlukan perintah `import` untuk class ini bisa digunakan. Daftar lengkap dari _package_ yang bisa digunakan Anda bisa check di [Java Platform SE 8 - All Classes](https://docs.oracle.com/javase/8/docs/api/allclasses-frame.html). Dalam bab ini, ita akan coba mempelajari beberapa _package_ standard yang umum dipakai.

## Membaca Dokumentasi dan Menggunakan Fungsi, Contoh: _Math_
Membaca dokumentasi adalah hal penting yang perlu dibiasakan bagi seseorang yang belajar pemrograman. Mari kita check dokumentasi _package Math_, dari sumber resmi developer Java, [Java Platform SE 8 - Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html). 

![](images/11-doc-1.jpg)

Pada halaman ini kita bisa menemukan banyak penjelasan, tapi pada bagian ini kita akan fokuskan pada 2 bagian: 1. _Field Summary_; 2. _Method Summary_

Pada _Field Summary_ Anda bisa menemukan bahwa _package Math_ menyediakan konstanta _pi_ (π) dan konstanta _e_ (basis bilangan natural).

Pada _Method Summary_ Anda bisa menemukan daftar fungsi yang bisa digunakan. Ketika kita mempelajari bagaimana menggunakan fungsi, Anda bisa mulai dari hal-hal berikut:
1. **Nama fungsi:** perhatikan penulisan nama fungsinya
2. **Parameter yang perlu digunakan:** Perhatikan bagian _Method and description_. Contoh, fungsi `abs` memerlukan 1 parameter. Perhatikan juga fungsi `abs` bisa dipanggil dengan 4 cara, tergantung dari tipe data dari parameter yang diberikan. Ia bisa dipanggil dengan menggunakan parameter `double a`, `float a`, `int a`, `long a`.
3. **Nilai kembali/_return value_:** Perhatikkan bagian _Modified and Type_. Bagian ini menunjukan jenis data hasil dari pengolahan fungsi. Contoh, jika kita menggunakan fungsi `asin(double a)`, maka output fungsi akan berupa data bertipe `double`.

Berikut contoh penggunaan fungsi pada _Math_

```java

public class Test {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = -5;
        double d = -1.75;

        System.out.println("Akar dari "+b+" adalah "+Math.sqrt(b));
        System.out.println("Akar dari "+a+" adalah "+Math.sqrt(a));
        System.out.println("Nilai absolut "+c+" adalah "+Math.abs(c));
        System.out.println("Nilai absolut "+d+" adalah "+Math.abs(d));
        System.out.println("Nilai PI: "+Math.PI);
    }
}

```
**Penjelasan:**
* Perhatikan pemanggilan konstanta _pi_ menggunakan `Math.PI`, tanpa menggunakan `()`.


**Latihan:**
* [Soal Latihan (Math)](../latihan/06-class-3.md). 
* [Soal Latihan (String)](../latihan/06-class-2.md). 

## Import Package dan Membuat Objek, Contoh: _Random_
Java menyediakan banyak _package_ yang bisa digunakan.  _Package Math_ adalah salah satu _package_ yang secara default di load dalam setiap eksekusi program. Tapi, tidak semua _package_ di load ke memory untuk setiap program yang kita buat.Untuk efisiensi, _package_ yang di-load ke memory hanyalah _package_ yang akan digunakan. Oleh sebab itu, sebagian besar _package_ perlu _dipanggil_ terlebih dahulu menggunakan perintah `import`.

Tentu Anda sudah mengenal penggunaan `import` ini ketika Anda menggunakan class `Scanner`. Memang _package Scanner_ juga adalah salah satu _package_ yang perlu di-import sebelum digunakan. Tapi pada kesempatan kali ini, kita akan menggunakan contoh _package Random_. _Package Random_ berisi berbagai fungsi untuk menghasilkan bilangan acak. Check dokumentasi package ini di [Java Platform SE 8 - Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)

Contoh 1:
```java
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
        int max;

        System.out.print("Nilai Max: ");
        max = scan.nextInt();

        System.out.println("Bilangan acak antara 0-"+max+" --> "+rnd.nextInt(max));
    }
}
```
**Penjelasan**
* Sama seperti penggunaan **Scanner**, beberapa fungsi dalam _package_ _dibungkus_ dalam bentuk class. Sehingga, untuk bisa menggunakannya kita perlu membuat objeknya terlebih dahulu. Dalam contoh di atas: `Random rnd = new Random()`.
* `rnd` adalah objek yang dibuat dari class `Random`. `scan` adalah objek yang dibuat dari class `Scanner`.
* Beberapa class memiliki _constructor_. _Construktor_ ini adalah fungsi yang dijalankan pada saat objek dibuat. Definisi mengenai _contructor_ ini Anda bisa lihat pada bagian dokumentasi.
* Beberapa class memiliki _constructor_ dengan parameter. Anda bila melihat contohnya pada perintah `Scanner scan = new Scanner(System.in)`. Class _Scanner_ memiliki _constructor_ yang minta 1 parameter. Anda bisa check definisinya di [Java Platform SE 8 - Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)


**Latihan:**
* [Soal Latihan (Random)](../latihan/06-class-1.md). 


## String
Sumber: [Java Platform SE 8 - String](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)
_Package Random_ berisi berbagai fungsi untuk memanipulasi _string_.


## Date
Sumber: [Java Platform SE 8 - Date](https://docs.oracle.com/javase/8/docs/api/java/sql/Date.html)
_Package Date_ berisi berbagai fungsi yang digunakan untuk mengolah data berupa tanggal.

## Membaca Dokumentasi
Membaca dokumentasi program adalah hal penting yang perlu dibiasakan dalam kita mempelajari program. Dokumentasi yang baik memiliki standar penulisan yang konsisten, sehingga memudahkan kita untuk mempelajarinya. Tapi, meskipun demikian perlu latihan dan pembiasaan diri untuk kita bisa membaca dokumentasi secara efektif.




===

**Referensi:**
* [Java Platform SE 8 - All Classes](https://docs.oracle.com/javase/8/docs/api/allclasses-frame.html)