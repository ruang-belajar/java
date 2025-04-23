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


## Pertemuan 5


## Pertemuan 6
- User defined class
- User defined function