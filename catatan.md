# Catatan Kuliah (Kelas Java 2025)

## Pertemuan 1
- [Pengenalan Java](docs/01-intro.md)
- Persiapan
  - [JDK 23](https://download.oracle.com/java/23/latest/jdk-23_windows-x64_bin.exe)
  - [Netbeans 25](https://downloads.apache.org/netbeans/netbeans-installers/25/Apache-NetBeans-25-bin-windows-x64.exe.sha512)
- [Setup & membuat program sederhana](docs/02-setup.md)
- Dasar yang dipelajari ketika mempelajari program baru:
  - penggunaan variabel
  - operasi aritmatika
  - input output
  - IF
  - LOOPING
  - Fungsi standar
  - Fungsi buatan
- Istilah penting:
  - Java Runtime --> supaya kita bisa menjalankan program yang dibuat.
  - Java EE --> untuk membuat web menggunakan java
  - JDK --> _Java Development Kit_ --> supaya kita bisa membuat program java 
  - Java SE --> untuk membuat program di desktop/windows
- **Tugas 1:**\
  Pelajari bab [Syntax](docs/03-syntax.md) dan [Standard Input & Output](docs/04-input-output.md), kemudian buat program yang  meminta input _nama_ dan _nilai_. Jika _nilai_ > 60 maka tampilkan informasi "lulus", _nilai_ <=60, tampilkan informasi "tidak lulus"\
    contoh 1:
    ```
    Nama: Budi
    Nilai: 80
    Halo Budi, kamu LULUS
    ```
    contoh 2:
    ```
    Nama: Budi
    Nilai: 40
    Halo Budi, kamu TIDAK LULUS
    ```
    Untuk membaca input, gunakan class `Scanner`, simpan dan kirim menggunakan nama `ProgramScanner.java`.

## Pertemuan 2
- Review Tugas
- [Syntax dasar](docs/03-syntax.md)
- [Input & Output](docs/04-input-output.md)
- [Data Type](docs/05-tipe-data.md)
- [Operator](docs/06-operator.md)
- Hal yang perlu diperhatikan
  - Java adalah bahasa pemrograman yang _case sensitive_
  - aturan penulisan
  - Nama class selalu sama dengan nama file
  - nama _package_ harus sama dengan _nama folder_    
- [IF](docs/07-pengambilan-keputusan.md)
- [Pengulangan/looping](docs/08-pengulangan.md)

## Pertemuan 3
- Review [Pengulangan/looping](docs/08-pengulangan.md)
- [Array](docs/10-array.md)
- Pelajari
  - Pelajari [RandomNumberWriter.java](src/RandomNumberWriter.java)
  - Pelajari [ReadFile.java](src/ReadFile.java)
- Latihan:
  - Rubah `ReadFile.java` sehingga bukan loop untuk menampilkan data dari file, tapi memasukannya ke dalam array kemudian menampilkannya kembali pada bagian akhir
- Tugas:
  - Lengkapi file `ReadFile.java` sehingga sebelum array ditampilkan, array diurutkan terlebih dahulu secara _ascending_.
  - Referensi: [Java ArrayList sort() Method](https://www.w3schools.com/java/ref_arraylist_sort.asp)


## Pertemuan 4
- Class ArrayList
  - [Ruang Belajar - ArrayList](docs/10-array.md#array-list)
  - [Java ArrayList sort() Method](https://www.w3schools.com/java/ref_arraylist_sort.asp)
- Review tugas
  - [try .. cath](https://www.w3schools.com/java/java_try_catch.asp)
  - [String to Integer](https://www.geeksforgeeks.org/how-to-convert-string-to-int-in-java/)
- Tugas:
  - Simpan `ReadFile.java` menjadi `ReadFile3.java`, tambahkan:
    - Menampilkan nilai terkecil dan terbesar
    - Menampilkan nilai rata-rata

## Pertemuan 5
- Review tugas
- Latihan: Berikut ini adalah program untuk generate data simulasi suhu terendah dan tertinggi setiap harinya. Angka pertama adalah tanggal, angka kedua adalah suhu terendah, angka ketiga adalah suhu tertinggi.
  - Buat program untuk mencetak file text berisi 30 baris angka seperti berikut:
    ```
    1,20,30
    2,18,27
    3,17,26
    4,16,24
    5,15,23
    6,14,22
    ...
    ```
    Angka pertama adalah nomor yang berurut\
    Angka kedua adalah bilang acak antara 10-25\
    Angka ketiga adalah bilangan acak antara 10-30, tapi bilangan ketiga selalu lebih besar dari bilangan kedua
  - Data digenerate tersimpan dengan nama file `data1.txt`
  - Simpan file dengan nama `GeneratorData1.java`  
- Latihan: Buat untuk membaca file `data1.txt`.\
  Tampilkan tanggal dan suhu pada kondisi suhu terendah dan suhu tertinggi.\
  Simpan program dengan nama file `PeriksaData1.java`

## Pertemuan 6

## Pertemuan 9
- Pelajari tentang bagaimana [membaca input dari user lewat keyboard](docs/04-input-output.md)
- Pelajari tentang [Exception](docs/13-exception.md)
- Latihan: [Soal Latihan (File)](docs/latihan/06-class-5.md)

## Pertemuan 10
- [Class](docs/12-class.md)
- file: `DemoOrang1.java`
  ```java
  package class1;

  import java.util.ArrayList;

  public class DemoOrang1 {
      public static void main(String[] args) {
          // membuat objek list
          // <Orang> menunjukan jenis data/class yang ditampung dalam list
          ArrayList<Orang> list = new ArrayList<Orang>();
          
          // membuat objek orang
          Orang data1 = new Orang();
          data1.namaDepan = "Budi"; // mengisi properti
          data1.namaBelakang = "Hendrawan";
          list.add(data1); // menambahkan objek ke dalam list
          
          Orang data2 = new Orang();
          data2.namaDepan = "Dyah";
          data2.namaBelakang = "Ayu";
          list.add(data2);
          
          // method get() digunakan untuk mengambil elemen dalam list
          System.out.println(list.get(0).namaDepan);
          System.out.println(list.get(1).namaDepan);
          
          System.out.println(list.get(0).namaDepan+" "+ list.get(0).namaBelakang);
          System.out.println(list.get(1).namaDepan+" "+ list.get(1).namaBelakang);
          
          // menggunakan method yang tidak memberikan nilai balik
          list.get(0).sensor();
          list.get(1).sensor();
          
          // menampilkan nama lewat method
          System.out.println(list.get(0).namaLengkap());
          System.out.println(list.get(1).namaLengkap());
      }
  }
- file: `Orang.java`
  ```java
  package class1;

  // class Orang
  // nama class selalu diawali huruf besar
  public class Orang {
      // deklarasi properti/atribut
      public String namaDepan;
      public String namaBelakang;
      
      // method yang menghasilkan nilai balik
      // ciri: menyertakan jenis data yang akan dikembalikan
      // oleh method, contoh: String, Integer, boolean,...
      // terdapat juga perintah return untuk memberikan
      // nilai balik
      public String namaLengkap() {
          return this.namaDepan + " " + this.namaBelakang;
      }
      
      // method yang tidak menghasilkan nilai balik
      // ciri: menggunakan kata kunci void
      // tidak ada return
      public void sensor() {
          this.namaDepan = this.namaDepan.replace('a', '*');
          this.namaBelakang = this.namaBelakang.replace('a', '*');
      }
      
  }
  ```