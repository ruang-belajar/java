# Array

Misal kita memiliki beberapa nama. Tentu kita bisa menyimpannya masing-masing dalam variabel, tapi tentu ini akan sulit dalam pengolahannya terutama jika datanya banyak.

```
String namaTeman1 = "Linda";
String namaTeman2 = "Santi";
String namaTeman3 = "Susan";
String namaTeman4 = "Mila";
String namaTeman5 = "Ayu";
```

Untuk keperluan ini bisa menggunakan struktur data Array. **Array adalah struktur data yang digunakan untuk menyimpan kumpulan data yang sejenis**. Array menggunakan indeks untuk memudahkan akses terhadap data yang disimpannya.

Contoh Array
Indeks array selalu dimulai dari 0…

…dan perlu diketahui juga, indeks tidak selalu dalam bentuk angka. Bisa juga karakter atau teks.

## Cara Membuat Array di Java
Cara membuat array kosong:
```java
// cara pertama
String[] nama;

// cara kedua
String nama[];

// cara ketiga dengan kata kunci new
String[] nama = new String[5];
```

Parhatikan:

Kita menggunakan kurung siku [] untuk membuat array;
Kurung siku bisa diletakkan setelah tipe data atau nama array;
Angka 5 dalam kurung artinya batas atau ukuran array-nya.
Array yang kosong siap diisi dengan data. Pastikan mengisinya dengan data yang sesuai dengan tipe datanya.

Kita bisa mengisinya seperti ini:
```java
nama[0] = "Linda";
nama[1] = "Santi";
nama[2] = "Susan";
nama[3] = "Mila";
nama[4] = "Ayu";
```
Atau kalau tidak mau repot, kita bisa membuat array dan langsung mengisinya.
```java
String[] nama = {"Linda", "Santi", "Susan", "Mila", "Ayu"};
```

## Membaca Data dari Array
Seperti yang sudah kita ketahui, array memiliki indeks untuk memudahkan kita mengakses datanya.

Karena itu, kita bisa mengambil datanya dengan cara seperti ini:
```java
// membuat array
String[] nama = {"Linda", "Santi", "Susan", "Mila", "Ayu"};

// mengambil data array
System.out.println(teman[2]);
```

Kira-kira apa hasil outputnya?

Yep! benar sekali, hasil outputnya adalah:

Susan
Karena Susan terletak di indeks ke-2.


Menggunakan Perulangan
Mengambil data satu per satu dari array mungkin cukup melelahkan, karena kita harus mengtik ulang nama array-nya dengan indeks yang berbeda.

Contoh:
```
System.out.println(teman[0]);
System.out.println(teman[1]);
System.out.println(teman[2]);
System.out.println(teman[3]);
```

Bagaimana kalau data array-nya sampai 1000, maka kita harus mengetik kode sebanyak seribu kali.

Karena itu, disinilah peran perulangan.

Contoh Array yang diaskes dengan perulangan
Perhatikan:

Di sana kita menggunakan atribut length untuk mengambil panjang array-nya.

Jadi, perulangan akan dilakukan sebanyak isi array-nya.

Sekarang Mari Kita Latihan
Silahkan buat class bernama Buah, kemudian ikuti kode berikut:

import java.util.Scanner;

public class Buah {
    public static void main(String[] args) {

        // membuat array buah-buahan
        String[] buah = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : buah ){
            System.out.println(b);
        }

    }
}
Hasil outputnya:

Hasil output program array
Perhatikan:

Di sana kita menggunakan perulangan foreach untuk menampilkan isi array.

Seperti yang sudah kita pelajari pada materi Perulangan di Java, perulangan ini dapat kita gunakan untuk menampilkan isi array.


Array Multi Dimensi
Array multi dimensi artinya array yang memiliki lebih dari satu dimensi.

Atau kita bisa sebut, array di dalam array.

Jumlah dimensinya tidak terbatas, tergantung kita mampunya sampai berapa 😄.

Contoh berikut ini adalah array dua dimensi:

String[][] kontak = {
    {"Lili","08111"},
    {"Lala","08122"},
    {"Maya","08133"}
};
Indek ke-0 pada array kontak berisi array {"lili","08111"}.

Array 2 dimensi
Contoh cara mengakses data dari array dua dimensi:

Contoh Array dua dimensi di Java
Contoh Program Array Multi Dimensi
Biar makin mantap pemahaman kita tentang array multi dimensi, mari kita coba membuat sebuah program.

Silahkan buat class baru bernama RuangKelas kemudian ikuti kode berikut:

import java.util.Scanner;

public class RuangKelas {
    public static void main(String[] args) {

        // Membuat Array dan Scanner
        String[][] meja = new String[2][3];
        Scanner scan = new Scanner(System.in);

        // mengisi setiap meja
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("Siapa yang akan duduk di meja (%d,%d): ", bar, kol);
                meja[bar][kol] = scan.nextLine();
            }
        }

        // menampilkan isi Array
        System.out.println("-------------------------");
        for(int bar = 0; bar < meja.length; bar++){
            for(int kol = 0; kol < meja[bar].length; kol++){
                System.out.format("| %s | \t", meja[bar][kol]);
            }
            System.out.println("");
        }
        System.out.println("-------------------------");
    }
}
Hasil outputnya:

Hasil output contoh program array dua dimensi
Pada program tersebut, kita menggunakan perulangan bersarang untuk mengambil input dan menampilkan outputnya.

Karena array dua dimensi mirip seperti tabel, maka kita harus melakukan perulangan terhadap baris dan kolomnya.

Lalu bagaimana dengan array 3D, 4D, 5D, dan seterusnya?

Tentu saja kita harus membuat perulangan bersarang sebanyak dimensinya.

Kalau tiga, ya buat tiga perulangan.

Array List
Array yang kita bahas di atas sebenarnya memiliki beberapa kekurangan, seperti:

Tidak mampu menyimpan data dengan tipe yang berbeda.
Ukurannya tidak dinamis.
Maka dari itu, ada Array List yang menutupi kekurangan tersebut.

Array list merupakan sebuah class yang memungkinkan kita membuat sebuah objek untuk menampung apapun.

Untuk menggunakan Array List, kita harus mengimpornya terlebih dahulu.

import java.util.ArrayList;
Setelah itu, baru kita bisa membuat sebuah objek Array List seperti ini:

 ArrayList al = new ArrayList();
Mari kita coba….

Contoh Program dengan Array List
Silahkan membuat class dengan nama Doraemon, kemudian ikuti kode berikut:

import java.util.ArrayList;

public class Doraemon {
    public static void main(String[] args) {

        // membuat objek array list
        ArrayList kantongAjaib = new ArrayList();

        // Mengisi kantong ajaib dengan 5 benda
        kantongAjaib.add("Senter Pembesar");
        kantongAjaib.add(532);
        kantongAjaib.add("tikus");
        kantongAjaib.add(1231234.132);
        kantongAjaib.add(true);

        // menghapus tikus dari kantong ajaib
        kantongAjaib.remove("tikus");

        // Menampilkan isi kantong ajaib
        System.out.println(kantongAjaib);

        // menampilkan banyak isi kantong ajaib
        System.out.println("Kantong ajaib berisi "+ kantongAjaib.size() +" item");
    }
}
Hasil outputnya:

Hasil output program array list
Karena array list (kantongAjaib) merupakan sebuah objek yang terbuat dari class Array List, maka dia punya method (fungsi) untuk melakukan sesuatu.

Fungsi add() untuk menambahkan sesuatu ke dalam Array List;
Fungsi remove() untuk menghapus sesuatu ke dalam Array List;
Fungsi size() untuk mengambil ukuran Array List;
Fungsi get(id) untuk mengambil item dalam Array List berdasarkan id atau indeks tertentu.
dan masih banyak fungsi yang lainnya.

---
**Referensi:**
- https://www.petanikode.com/java-array/