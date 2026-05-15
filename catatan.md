# Catatan Kuliah (Kelas Java 2026)

## Pertemuan 1

- [Pengenalan Java](docs/01-intro.md)
- Persiapan
	- [JDK](https://www.oracle.com/asean/java/technologies/downloads/) (disarankan versi 21)
	- [Visual Studio Code](https://code.visualstudio.com/download)
		- [Extension Pack for Java](marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- [Setup & membuat program sederhana](docs/02-setup.md)
- Istilah penting:
	  - Java Runtime --> supaya kita bisa menjalankan program yang dibuat.
	  - Java EE --> untuk membuat web menggunakan java
	  - JDK --> _Java Development Kit_ --> supaya kita bisa membuat program java 
	  - Java SE --> untuk membuat program di desktop/windows
- 💼 **Tugas 1:**\
  Pelajari bab [Syntax](docs/03-syntax.md) dan [Standard Input & Output](docs/04-input-output.md), kemudian buat program yang  meminta input _nama_ dan _nilai_. Jika _nilai_ > 60 maka tampilkan informasi "lulus", _nilai_ <=60, tampilkan informasi "tidak lulus"\
    contoh 1:
    ```
    Nama: Budi
    Nilai: 80
    Grade: A
    
    Halo Budi, kamu LULUS dengan grade A
    ```
    contoh 2:
    ```
    Nama: Budi
    Nilai: 40
    Grade: B
    
    Halo Budi, kamu TIDAK LULUS dengan grade B
    ```
    Untuk membaca input, gunakan class `Scanner`, simpan dan kirim menggunakan nama `ProgramScanner.java`.
* 💼 Download & Install **Github Desktop**.


## Pertemuan 2

- Review Tugas
- Dasar yang dipelajari ketika mempelajari program baru:
	- penggunaan variabel
	- operasi aritmatika
	- input output
	- IF
	- LOOPING
	- Fungsi standar
	- Fungsi buatan
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
- **Tugas:**
	- Kerjakan [latihan IF 1](https://github.com/ruang-belajar/java/blob/main/docs/latihan/02-if.md)
	- Simpan file program dengan nama 💼 `LatihanIf1.java` di repository.

## Pertemuan 3

* Review Tugas
* Latihan: **Pos1.java**
	- Soal 1:
		- Buat program menanyakan `namaBarang`, `qty` dan `harga`.
		- Tampilkan `total` sebagai dengan rumus `qty * harga`
	- Soal 2:
		- Jika `qty` > **10**, maka berikan diskon **5%** 
* [Pengulangan/looping](docs/08-pengulangan.md)
	* [Latihan Loop](https://github.com/ruang-belajar/java/blob/main/docs/latihan/04-loop.md)
	* [Latihan Loop Bintang](https://github.com/ruang-belajar/java/blob/main/docs/latihan/04-loop-bintang.md)
* **Tugas:**
	* Kerjakan latihan [Loop Kotak](https://github.com/ruang-belajar/java/blob/main/docs/latihan/04-loop-kotak.md)
	* Simpan file p rogram dengan nama 💼 `LoopKotak.java` di repository

## Pertemuan 4

* Review Tugas
* Review Loop
* [Fungsi](docs/09-fungsi.md)
* Latihan
	* fungsi *faktorial*
	* fungsi *namaLengkap*
	* [Latihan Soal (Fungsi)](docs/latihan/07-fungsi-1.md)
* **Tugas:**
	* Buat file 💼 `LatihanBilanganPrima.java`, fungsi `bilanganPrima()`
	* fungsi `bilanganPrima()` menerima 1 parameter `int` dan memberikan `return true` jika bilangan yang diinput itu adalah bilangan prima.


## Pertemuan 5 (🤔)


## Pertemuan 6

- Review tugas
- Standard Class
	- [Scanner](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)
	- [Math](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)
	- [LocalDateTime](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html)
		- [java.time.LocalDateTime Class in Java](https://www.geeksforgeeks.org/java/java-time-localdatetime-class-in-java/)
	- [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
		- [ArrayList in Java](https://www.geeksforgeeks.org/java/arraylist-in-java/)
- Perhatikan:
	- Membaca dokumentasi: pelajari pola
- Latihan:
	- Buat program menghitung nilai *sinus* dan *cosinus* dari sudut (file: `HitungSudut.java`)
	- Buat program input daftar siswa.  (file: `DaftarSiswa1.java`)

## Pertemuan 7

- Review Standard Class
- [ArrayList class](https://github.com/ruang-belajar/java/blob/main/docs/10-array.md#array-list)
- 
