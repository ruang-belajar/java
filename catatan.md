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
- **Tugas 1:**
  Pelajari bab [Syntax](../docs/03-syntax.md) dan [Standard Input & Output](../docs/04-input-output.md), kemudian buat program yang  meminta input _nama_ dan _nilai_. Jika _nilai_ > 60 maka tampilkan informasi "lulus", _nilai_ <=60, tampilkan informasi "tidak lulus"\
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
