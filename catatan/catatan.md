# Catatan Kuliah (Kelas Java 2024)

## Pertemuan 1
- Pengenalan Java
- Pengenalan konsep OOP
- Persiapan
  - JDK 17:
    - https://www.oracle.com/id/java/technologies/downloads/
  - Netbeans 21:
    - https://www.apache.org/dyn/closer.lua/netbeans/netbeans-installers/21/Apache-NetBeans-21-bin-windows-x64.exe 
  - Akun Github + Github Desktop
    - https://github.com
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
- Github, menyediakan layanan _Source Code Management_.
  1. Backup
  2. Version Management
  3. Team work
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

## Pertemuan 2
- Buat akun Github + install Github Desktop
- Review Tugas: [Input & Output](../docs/04-input-output.md)
- [Variable](../docs/05-tipe-data.md), [Operasi data](../docs/06-operator.md), Class & Object
- Naming Convension (aturan penamaan objek)
  - variabel, object, method: _camelCase_
  - Class: _PascalCase_
  - constant: _UPPERCASE_
- [IF](../docs/07-pengambilan-keputusan.md)
- Program sederhana

## Pertemuan 3
- Setup Visual Studio Code (VSC)
  - Install extension Java untuk VSC
    - Set: _Settings - Text Editor - Inlay Hints_: `off`
  - Bukan folder github classroom: https://classroom.github.com/a/2Rwy0I99
- Check [Jumlah1.java](../src/Jumlah1.java), coba jalankan
- Materi [Pengambilan Keputusan - IF](../docs/07-pengambilan-keputusan.md)
- Latihan: kerjakan [Latihan IF](../docs/latihan/03-if-1.md)
- Tugas:
  - [latihan-1](../docs/latihan/02-if.md)
  - [latihan loop](../docs/latihan/04-loop.md)

## Pertemuan 4
- Check [Coba1.java](../src/Coba1.java) dan [Coba2.java](../src/Coba2.java)
- Dari kedua contoh program diatas, buat contoh program seperti berikut:
  - mencetak angka 1-20
  - mencetak angka 1-20, tapi angka 10 dan 20 diganti 'X'
  - mencetak angka 1-20, tapi angka 10 dan 20 tidak dicetak
  - mencetak angka 1-20, tapi setiap angka ganjil diganti 'X'
  - mencetak angka 1-20, tapi setiap angka kelipatan 3 diganti 'X'
  - mencetak angka 1-20, tapi setiap angka kelipatan 3 dan 5 diganti 'X'
- Program:
  ```java
  import java.util.Scanner;
  public class Loop2 {
      public static void main(String[] args) {

          Scanner scan = new Scanner(System.in);
          int nilai = 1;
          int total = 0;
          int banyak = 0;

          while(nilai!=0) {
              System.out.print("Angka?");
              nilai = scan.nextInt();        
              total = total + nilai;
              if(banyak>0) {
                  banyak = banyak + 1;
              }
          }

          System.out.print("Total = ");
          System.out.println(total);

          System.out.print("Banyak Data = ");
          System.out.println(banyak);
          
          scan.close();
      }
  }
  ```
- pastikan sudah tersambung ke classroom assignment https://classroom.github.com/a/2Rwy0I99

## Pertemuan 5
- Modul [Fungsi](../docs/09-fungsi.md)
  - Latihan: Program _mencetak bintang_
- [Fungsi standar](../docs/11-standard-class.md)
  - Random
  - Math
- Tugas: [Menghitung jumlah hari](../docs/latihan/07-fungsi-1.md)

## Pertemuan 6
- Review fungsi
  - Membaca dokumentasi
  - [Latihan Math](../docs/latihan/06-class-3.md)
  - [Latihan LocalTime](../docs/latihan/06-class-4.md)
  - [Latihan String](../docs/latihan/06-class-2.md)


## Pertemuan 7
- [List/Array](../docs/10-array.md)
- [Class](../docs/12-class.md)
- [Cheatsheet](../docs/00-cheatsheet-1.md)
  - Latihan:
    - [Jumlah1.java](../src/Jumlah1.java)
    - [Scanner1.java](../src/Scanner1.java)
    - [Hitung1.java](../src/Hitung1.java)
    - [StringCompare1.java](../src/StringCompare1.java)

## Pertemuan 8: UTS

## Pertemuan 9
- Pengenalan GUI
- Buat project baru: `TokoBuku`
- Buat _jFrame_: `FormUtama`
    - Buat _Menu Bar_, lakukan _Change Variabel Name_ dan _Edit Text_ untuk masing-masing _menu item_.     
        *   File
            *   Master
                *   Barang
        *   Exit
            *   on action perform:
                ```java
                System.exit(0);
                ```
        *   Help
            *   About
                *   on action perform:
                    ```java
                    JOptionPane.showMessageDialog(null, "Dibuat oleh En Tay");
                    ```

        ![](images/6-formutama-1.jpg)

- Program utama (_void main_), tambahkan:
  ```java
  new FormUtama().setVisible(true);
  ```
- Perhatikan:
  - nama yang diawali _huruf besar_ (Contoh: `FormUtama`) adalah _class_
  - objek dibuat dari _class_
  - perintah yang diawali _huruf kecil_ adalah _objek_.
  - perintah dengan akhiran `()` adalah fungsi. Fungsi bisa diperlakukan seperti objek


