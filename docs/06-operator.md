# 1. Operator

Operator dalam pemrograman digunakan untuk melakukan operasi tertentu.

Misalkan kita ingin menjumlahkan nilai dari variabel x dan y, maka kita bisa menggunakan operator penjumlahan (+).

```java
x + y
```

Ada enam jenis kelompok operator dalam pemrograman Java:

1. Operator Artimatika;
2. Operator Penugasan;
3. Operator Pembanding;
4. Operator Logika;
5. Operator Bitwise;
6. Operator Ternary.
   
Bila digambarkan dalam mind map, akan terlihat seperti ini:

![](images/06-operator-map.png)


## 1. Operator Aritmatika
Operator aritmatika digunakan untuk melakukan operasi aritmatika.

Operator ini terdiri dari:

| Nama | Simbol |
| --- | --- |
| Penjumlahan | + |
| Pengurangan | - |
| Perkalian | * |
| Pembagian | / |
| Sisa Bagi | % |

Contoh pemakaian:

```java
import java.util.Scanner;

public class OperatorAritmatika {

    public static void main(String[] args) {
        int angka1;
        int angka2;
        int hasil;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("Hasil = " + hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("Hasil = " + hasil);

         System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // perkalian
        hasil = angka1 * angka2;
        System.out.println("Hasil = " + hasil);


        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // Pembagian
        hasil = angka1 / angka2;
        System.out.println("Hasil = " + hasil);

        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();

        // Sisa Bagi
        hasil = angka1 % angka2;
        System.out.println("Hasil = " + hasil);

    }

}
```

Silahkan jalankan programnya:

Hasil output program java operator
Mudah bukan…?


Mau laithan lagi?
Semakin banyak latihan, semakin mantap.

Sekarang coba contoh kasus: Program menghitung keliling persegi panjang.

Program Operator aritmatika
2. Operator Penugasan
Operator penugasan (Assignment Operator) fungsinya untuk meberikan tugas pada variabel tertentu. Biasanya untuk mengisi nilai.

Contoh:

int a = 10;
Variabel a ditugaskan untuk menyimpan nilai 10.

Operator Penugasan terdiri dari:

Nama Operator	Sombol
Pengisian Nilai	=
Pengisian dan Penambahan	+=
Pengisian dan Pengurangan	-=
Pengisian dan Perkalian	*=
Pengisian dan Pembagian	/=
Pengisian dan Sisa bagi	%=
Mari Kita Coba…
Sekarang, buatlah sebuah kelas baru beranama OperatorPenugasan.

Kemudian ikuti kode berikut:

public class OperatorPenugasan {

    public static void main(String[] args) {
        int a;
        int b;

        // Pengisian nilai
        a = 5;
        b = 10;

        // penambahan
        b += a;
        // sekarang b = 15
        System.out.println("Penambahan : " + b);

        // pengurangan
        b -= a;
        // sekarang b = 10 (karena 15-5)
        System.out.println("Pengurangan : " + b);

        // perkalian
        b *= a;
        // sekarang b = 50 (karena 10*5)
        System.out.println("Perkalian : " + b);

        // Pembagian
        b /= a;
        // sekarang b=10
        System.out.println("Pembagian : " + b);

        // Sisa bagi
        b %= a;
        // sekarang b=0
        System.out.println("Sisa Bagi: " + b);

    }

}
Hasil outputnya:

Hasil output operator penugasan
3. Operator Pambanding
Sepeti namanya, tugas oprator ini untuk membandingkan.

Operator ini juga dikenal dengan opeartor relasi.

Nilai yang dihasilkan dari operator ini berupa boolean, yaitu: true dan false.

Operator ini terdiri dari:

Nama	Simbol
Lebih Besar	>
Lebih Kecil	<
Sama Dengan	==
Tidak Sama dengan	!=
Lebih Besar Sama dengan	>=
Lebih Kecil Sama dengan	<=
contoh:

boolean x = 10 < 12
Maka x akan bernilai true, karena 10 lebih kecil dari 12.

Untuk lebih jelasnya…

Mari kita coba dalam kode
Buatlah sebuah kelas baru bernama OperatorPembanding. Kemudian ikuti kode berikut:

public class OperatorPembanding {

    public static void main(String[] args) {
        int nilaiA = 12;
        int nilaiB = 4;
        boolean hasil;

        // apakah A lebih besar dari B?
        hasil = nilaiA > nilaiB;
        System.out.println(hasil);

        // apakah A lebih kecil dari B?
        hasil = nilaiA < nilaiB;
        System.out.println(hasil);

        // apakah A lebih besar samadengan B?
        hasil = nilaiA >= nilaiB;
        System.out.println(hasil);

        // apakah A lebih kecil samadengan B?
        hasil = nilaiA <= nilaiB;
        System.out.println(hasil);

        // apakah nilai A sama dengan B?
        hasil = nilaiA == nilaiB;
        System.out.println(hasil);

        // apakah nilai A tidak samadengan B?
        hasil = nilaiA != nilaiB;
        System.out.println(hasil);

    }

}
Kode program di atas, akan menghasilkan output seperti ini:

Hasil output operator penugasan
4. Operator Logika
Kalau kamu pernah belajar logika matematika, pasti tidak akan asing dengan operator ini.

Nama	Simbol di Java
Logika AND	&&
Logika OR	||
Negasi/kebalikan	!
Operator Logika digunakan untuk membuat operasi logika.

Misalnya seperti ini:

Pernyataan 1: Petani Kode seorang programmer
Pernyattan 2: Petanikode menggunakan Linux
Jika ditanya, apakah Petani Kode programmer yang menggunakan Linux?

Tentu kita akan cek dulu kebenarannya

Pernyataan 1: Petani Kode seorang programmer = true.
Pernyattan 2: Petanikode menggunakan Linux = true.
Apa petanikode programmer dan menggunakan Linux?

Pertnyataan 1 && Pernyataan 2 = true
Bingung?

Coba cek lagi tabel kebenaran untuk logika AND.

Pernyatan 1	Pernytaan 2	Logika AND
true	true	true
true	false	false
false	true	false
false	false	false
Masih bingung…?

Sepertinya kamu harus buka lagi pelajarann logika matematika 😄.

Lalu bagaimana pengunaanya di program?

Langsung Saja dicoba Program Berikut
Buatlah sebuah kelas baru beranama OperatorLogika. Kemudian ikuti kode berikut ini:

Kode program operator logika
Silahkan jalankan dan perhatikan hasilnya:

Program operator logika di Java
5. Operator Bitwise
Operator bitwise merupkan operator yang digunakan untuk operasi bit (biner). Operator bitwise terdiri dari:

Nama	Simbol di Java
AND	&
OR	|
XOR	^
Negasi/kebalikan	~
Left Shift	<<
Right Shift	>>
Left Shift (unsigned)	<<<
Right Shift (unsigned)	>>>
Operator ini berlaku untuk tipe data int, long, short, char, dan byte.

Operator ini akan menghitung dari bit-ke-bit.

Misalnya, kita punya variabel a = 60 dan b = 13.

Bila dibuat dalam bentuk biner, akan menjadi seperti ini:

a = 00111100
b = 00001101
Kemudian, dilakukan operasi bitwise

Operasi AND

a = 00111100
b = 00001101
a & b = 00001100
Operasi OR

a = 00111100
b = 00001101
a | b = 00111101
Operasi XOR

a = 00111100
b = 00001101
a ^ b = 00110001
Opearsi NOT (Negasi/kebalikan)

a = 00111100
~a  = 11000011
Konsepnya memang hampir sama dengan opeartor Logika. Bedanya, Bitwise digunakan untuk biner.

Untuk lebih jelasnya…

Mari kita coba dalam program
Buat kelas baru dengan nama OperatorBitwise, kemudian ikuti isinya sebagai berikut.

public class OperatorBitwise {

    public static void main(String[] args) {
        int a = 60;    /* 60 = 0011 1100 */
        int b = 13;    /* 13 = 0000 1101 */
        int c = 0;

        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c);

        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c);

        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c);

        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c);

        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c);

        c = a >> 2;     /* 215 = 1111 */
        System.out.println("a >> 2  = " + c);

        c = a >>> 2;     /* 215 = 0000 1111 */
        System.out.println("a >>> 2 = " + c);
    }

}
Perhatikanlah hasil outputnya:



6. Operator Ternary
Opertor ini unik, seperti membuat pertanyaan.

Simbolnya menggunakan tanda tanya (?) dan titik-dua (:) untuk memisah jawabannya.

Operator ternary di Java
Pada contoh di atas, “Kamu suka aku” adalah pertanyaan atau kondisi yang akan diperiksa.

Kalau jawabannya benar, maka iya. Sebaliknya akan tidak.

Lebih jelasnya, mari kita coba…

Program dengan Operator Ternary
Buatlah sebuah kelas baru dengan nama OperatorTernary, kemudian ikuti kode berikut.

public class OperatorTernary {
    public static void main(String[] args) {

        boolean suka = true;
        String jawaban;

        // menggunakan operator ternary
        jawaban = suka ? "iya" : "tidak";

        // menampilkan jawaban
        System.out.println(jawaban);

    }
}
Hasil outputnya:

iya
Sekarang coba ganti nilai variabel suka menjadi false, lalu dijalankan lagi.

Pasti akan menghasilkan tidak.

Cara lain, dapat juga membuat kondisi seperti ini:

int suka = 8;

String jawaban = (suka > 5) ? "iya" : "tidak";

---
Referensi:
- https://www.petanikode.com/java-operator/