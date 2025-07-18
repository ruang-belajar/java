# Class & Object

## Membuat Class Sederhana
Bahasa pemrograman Java sangat kental dalam menerapkan paradigma _Object Oriented Programming_ (OOP). Dalam pengertian sederhana: Dalam pemrograman OOP, variabel dan fungsi/prosedur dikelompokan dalam struktur data _Class_.

Misalnya, kita mau menyimpan data mahasiswa. Data mahasiswa ini terdiri dari `nama` dan `jurusan`. Tanpa struktur _class_, kita akan membuatnya seperti contoh berikut:

```java
public class Class0 {
    public static void main(String[] args) {
        String nama;
        String jurusan;

        nama = "Budi";
        jurusan = "Tehnik Informatika";

        System.out.println(nama+" - "+jurusan);
    }
}

```

Pada program di atas, `nama` dan `jurusan` sebenarnya adalah sebuah kesatuan dari data yang disebut _data mahasiswa_. Dalam OOP, kita bisa membuat _data mahasiswa_ ini sebagai _Class_. Sebagai contoh, kita bisa membuatnya sebagai _Class_ `Mahasiswa`. Perhatikan contoh program berikut:

```java
public class Class1 {
    public static void main(String[] args) {
        // inisialisasi/menyiapkan objek Mahasiswa
        Mahasiswa peserta = new Mahasiswa();

        peserta.nama = "Budi";
        peserta.jurusan = "Tehnik Informatika";

        System.out.println(peserta.nama+" - "+peserta.jurusan);
    }
}

// definisi class Mahasiswa
class Mahasiswa {
    String nama;
    String jurusan;
}
```

**Penjelasan:**
* Idealnya, definisi `class Mahasiswa` dibuat di file terpisah. Itu akan kita pelajari nanti, tapi untuk kesederhanaan penjelasan, saat ini definisi class akan dibuat pada file yang sama.
* `Mahasiswa peserta = new Mahasiswa()` adalah cara menyiapkan objek dari class `Mahasiswa`. Hal ini diperlukan sebelum objek `peserta` digunakan.
* Dalam OOP, `nama` dan `jurusan` disebut _properti_ atau _atribut_ bagi class `Mahasiswa`. 
* `peserta.nama = "Budi"` berarti mengisi _properti_ `nama` dengan nilai _string_ `Budi`.

## Class & Loop
Kita bisa menggunakan class sebagai elemen array. Kita bisa loop array class menggunakan `for`.

```java
import java.util.Scanner;
import java.util.ArrayList;

class Mahasiswa {
    public String nim;
    public String nama;
}

public class CobaList2 {
    public static void main(String[] args) {
        // deklarasi array
        ArrayList<Mahasiswa> daftar = new ArrayList<Mahasiswa>();

        Scanner scan = new Scanner(System.in);

        for(int i=0; i<=3; i++) {
            // siapkan elemen array            
            Mahasiswa data = new Mahasiswa();

            System.out.println("NIM: ");
            data.nim = scan.nextLine();
            System.out.println("Nama: ");
            data.nama = scan.nextLine();

            daftar.add(data);
            System.out.println();
        }

        System.out.prinln("=========================");
        // loop setiap elemen pada ArrayList
        for(Mahasiswa baris:daftar) {
            System.out.println(baris.nim+" "+baris.nama);
        }

        scan.close();
    }
}

```
