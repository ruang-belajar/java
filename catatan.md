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
- [Java Online Compiler](https://www.programiz.com/java-programming/online-compiler/)
- [Array](docs/10-array.md)
	- [Soal Latihan Array 1](docs/latihan/05-array-1.md)
- [ArrayList class](docs/10-array.md#array-list)
- [Simulasi UTS](https://docs.google.com/forms/d/e/1FAIpQLSco9hkcFV78rdCKJF8MencuiiBPnjOrHIAqoMXdRy1hw60-oA/viewform?usp=header)
- **Tugas:**
	- Buat class `Member` (💼 `Member.java`) dengan properti `nama` (String) dan `score` (int).
	- Buat program yang menanyakan *nama* dan _score_ (💼 `LatihanMember.java`) kepada user, sampai user input "-" pada nama, sebagai tanda akhir proses menginputan. Data dimasukan ke  *ArrayList*. 
	- Setelah selesai input, tampilkan kembali *ArrayList*.

---

## UTS

---

## Pertemuan 8

* Review Tugas [🗝](https://github.com/pujangga123/latihan-java/blob/main/Member.java) [🗝](https://github.com/pujangga123/latihan-java/blob/main/LatihanMember.java)
	* [Class & Object](docs/12-class.md) 
* [Exception Handling](docs/13-exception.md)
	* Tambahkan exception handling ke `LatihanMember.java`.
* **Tugas:**
	* Install Netbeans
		* Download [Netbeans](https://netbeans.apache.org/download/index.html)
	* Kerjakan [Latihan GUI Hello World](docs/latihan/10-gui-hello-world.md)
	* Pastikan project disimpan di repositori tugas (💼 Folder: **HelloWorld**)

## Pertemuan 9

* Buat folder 💼 `GUI`.
	* ⚠️ Selanjutnya, semua project yang dibuat menggunakan Netbeans, simpan dalam folder `GUI`.
* [Java GUI](docs/20-gui.md)
	* Membuat Project
	* Membuat JFrame dan menjalankan program
- [Referensi GUI](docs/20-gui-referensi.md)
- [Cheatsheet](docs/00-cheatsheet-1.md)
- Referensi:
	- [Kelas Tersembunyi - Tutorial GUI Java - Mengubah Nilai TextField Dan Jlabel Dengan Tombol](https://www.youtube.com/watch?v=28KrP9615DQ)
	- [MDN Channel - hitung luas dan keliling persegi panjang menggunakan JFrame Netbeans](https://www.youtube.com/watch?v=2q8Xwh4Cu78)
- Latihan:
	- folder: **Hallo1**
		- form yang berisi TextBoxt, Label & Button.
		- Ketika Button di klik, maka pada TextBox dan Label muncul tulisan : "Halo"
	- folder: **Persegi1**
		- buat form untuk menghitung luas dan keliling persegi panjang.
		- Ketika tombol "Hitung" diklik, maka *Luas* dan *Keliling* akan muncul.
- **Tugas:**
	- 💼 folder: **Persegi2**
		- buat form seperti di project Persegi1, gunakan `JSpinner` untuk input
		- Ketika tombol *Hitung* diklik, maka *Luas* dan *Keliling* akan muncul.
		- Buat tombol *About*, menampilkan message box (menggunakan `JOptionPane`) menampilkan tulisan "program ini dibuat oleh [nama kamu]"

## Pertemuan 10

- Review tugas
- [Referensi GUI](docs/20-gui-referensi.md)
- Multi form application
	- Buat project 💼 `ProjectLatihan1`
	- Tambahkan menu
		- File
			- Exit: menutup program
		- Utility
			- Hitung Lingkaran
			- Daftar Nama
		- Help
			- About: menampilkan message box "program ini dibuat oleh _[nama kamu]_"
	- Buat `FormHitungLingkaran`
- Catatan:
	- Perintah untuk menampilkan `FormHitungLingkaran` adalah dengan menambahkan kode berikut pada menu _Hitung Lingkaran_ event `actionPerformed`:
		```java
		new FormHitungLingkaran().setVisible(true);
		```
	- Exit:
		```java
		System.exit(0);
		```
	- Menutup window (tanpa menutup program)
		```java
		this.dispose();
		```

## Pertemuan 11

- Lanjutan `ProjectLatihan1`
	- Buat `FormTransaksi`
	- Tambahkan *Harga* : `JLabel`
	- Tambahkan *Jenis Kain* : `JComboBox`
		- Model: 
			- Sutra : Rp. 300.000
			- Katun: Rp. 200.000
			- Polyester: Rp. 150.000
		- Setiap perubahan Jenis kain, tampilkan harga di label *Harga*.
	- Tambahkan *Ukuran* : `JSlider`
		- Set range minimum 1, maximum 10
		- Setiap perubahan Ukuran, update harga dengan rumus **[Harga Kain] * [ukuran]**.

## Pertemuan 12

- Check [GUI Referensi](docs/20-gui-referensi.md).
- Modifikasi `FormTransaksi`
	- Tambahkan `gambarKain`: `JLabel`
		- kosongkan property `text`
	- Untuk setiap perubahan *jenis kain*, tampilkan gambar sesuai pilihan.
	- Gunakan gambar berikut: [kain-katun.jpg](src/kain-katun.jpg), [kain-sutra.jpg](src/kain-sutra.jpg), [kain-polyester.jpg](src/kain-polyester.jpg)
- Buat 💼 `FormDaftar`
	- Tambahkan `daftarDaftar`: `JTable`
	- Tombol _Selesai_ : tambahkan kode untuk menutup form
	- Tambahkan `tombolReload` : `JButton`
		- `text` : *Reload*
		- `actionPerformed`
			```java
			DefaultTableModel model = (DefaultTableModel) tabelDaftar.getModel();

	        ArrayList<String[]> dataList = new ArrayList<>();
	        dataList.add(new String[]{"SUTRA", "300000"});
	        dataList.add(new String[]{"KATUN", "200000"});
	        dataList.add(new String[]{"POLYESTER", "150000"});
	
	        for (String[] row : dataList) {
	            model.addRow(row);
	        }
			```
	- Tambahkan `tombolHapus` : `JButton`
		- `text` : *Hapus Semua*
		- `actionPerformed`:
			```java
			DefaultTableModel model = (DefaultTableModel) tabelDaftar.getModel();
	        model.setRowCount(0);
			```

## Pertemuan 13

- Prep database `kampus`.
	- Buat tabel `mahasiswa`
		- `nik`: VARCHAR(20) PRIMARY
		- `nama`: VARCHAR(50)
		- `jeniskelamin`: CHAR(1)
		- `lahirTahun`: INT
	- Buat tabel `dosen`
		- `nip`: VARCHAR(20) PRIMARY
		- `nama`: VARCHAR(50)
		- `masukTahun`: INT
- [Koneksi ke database](docs/22-koneksi-database.md)
- Buat 💼 `FormMahasiswa1`
	- Buat Text Field *NIM* & *Nama*
	- Buat tombol **CARI**, **UPDATE**, **TAMBAH**
		- actionPerformed: tambahkan kode untuk *SELECT, UPDATE, INSERT*
	- Modifikasi `FormUtama`, 
		- Menu *Utility*, tambah `menuFormMahasiswa1`: *Data Mahasiswa*
			- tambahkan kode untuk menampilkan `FormMahasiswa1`
- **Tugas & kehadiran pertemuan 14:**
	- Tambahkan text field *Tahun Lahir* dan *Jenis Kelamin*
		- text: *[kosong]*
	- Update tombol **CARI, UPDATE, INSERT** sehingga membaca *Tahun Lahir* dan *Jenis Kelamin*
	- Tambahkan tombol **DELETE**.
		- text: *Hapus*
		- actionPerformed: tambahkan code untuk menghapus data dari database