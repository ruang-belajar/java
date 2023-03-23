# Fungsi dan Prosedur

Pada contoh program di pembahasan sebelumnya, kita hanya menulis kode intruksi pada fungsi `main()` saja. Fungsi `main()` adalah fungsi utama dalam program Java. Semua kode yang kita tulis di dalamnya, akan langsung dieksekusi.

Ketika program kita semakin bertambah besar, kita tidak mungkin menulis semua kode program di dalam fungsi `main()`. Hal itu akan menyebabkan penambahan program dan pencarian kesalahan semakin sulit. Untuk mengatasi masalah ini, kita akan membagi-bagi program menjadi _potongan-potongan_ kecil, membungkusnya sesuai dengan fungsi masing-masing sebagai sub program. Sub program inilah yang kita sebut _fungsi_, _prosedur_ dan _method_.


## Pengertian Prosedur, Fungsi, dan Method

Jangan bingung…karena ketiga-tiganya sama.

Prosedur, Fungsi, dan Method itu sama.

Prosedur adalah sebutan untuk fungsi yang tidak mengembalikan nilai. Prosedur biasanya ditandai dengan kata kunci void.

Fungsi adalah sebutan untuk fungsi yang mengembalikan nilai.

Method adalah fungsi yang berada di dalam Class. Sebutan ini, biasanya digunakan pada OOP.

Untuk memudahkan, mari kita sebut semuanya fungsi.

Cara Membuat Fungsi di Java
Fungsi harus dibuat atau ditulis di dalam class.

Struktur dasarnya seperti ini:
```java
static TypeDataKembalian namaFungsi(){
    // statemen atau kode fungsi
}
```
Penjelasan:

Kata kunci `static`, artinya kita membuat fungsi yang dapat dipanggil tanpa harus membuat instansiasi objek.

Bingung? Nanti saya jelaskan.

* `TypeDataKembalian` adalah tipe data dari nilai yang dikembalikan setelah fungsi dieksekusi.

* `namaFungsi()` adalah nama fungsinya. Biasanya ditulis dengan huruf kecil di awalnya. Lalu, kalau terdapat lebih dari satu suku kata, huruf awal di kata kedua ditulis kapital.

Contoh:

static void ucapSalam(){
    System.out.println("Selamat Pagi");
}
Tipe data void artinya kosong, fungsi tersebut tidak mengebalikan nilai apa-apa.

Cara Memanggil/Eksekusi Fungsi
Setelah kita membuat fungsi, selanjutnya kita akan mengeksekusi fungsinya.

Fungsi dapat dipanggil dari fungsi main atau dari fungsi yang lainnya.

Contoh pemanggilan fungsi dalam dalam funsgi main:

public static void main(String[] args){
    ucapSalam();
}
Maka akan menghasilkan output:

Selamat Pagi
Kode lengkapnya, silahkan dicoba sendiri:

class BelajarFungsi {
    
    // membuat fungsi ucapSalam()
    static void ucapSalam(){
        System.out.println("Selamat Pagi");
    }

    // membuat fungsi main()
    public static void main(String[] args){
        // memanggil/eksekusi fungsi ucapSalam()
        ucapSalam();
    }
}
Fungsi dengan Parameter
Parameter adalah variabel yang menampung nilai untuk diproses di dalam fungsi. Parameter berperan sebagai input untuk fungsi.

Struktur dasarnya seperti ini:

static TipeData namaFungsi(TipeData namaParameter, TipeData namaParameterLain){
    // kode fungsi
}
Penjelasan:

Parameter ditulis di antara tanda kurung (...);
Parameter harus diberikan tipe data;
Bila terdapat lebih dari satu parameter, maka dipisah dengan tanda koma.
Contoh fungsi yang memiliki parameter:

static void ucapin(String ucapan){
    System.out.println(ucapan);
}
Pada contoh tersebut, kita membuat parameter bernama ucapan dengan tipe String. Sehingga kita bisa menggunakan variabel ucapan di dalam fungsi.

Cara pemanggilan fungsi yang memiliki parameter:

ucapin("Hallo!");
ucapin("Selamat datang di pemrograman Java");
ucapin("Saya kira ini bagian terakhir");
ucapin("Sampai jumpa lagi, ya!");
Hasil outputnya:

Hallo!
Selamat datang di pemrograman Java
Saya kira ini bagian terakhir
Sampai jumpa lagi, ya!
Fungsi yang Mengembalikan Nilai
Setelah fungsi memproses data yang diinputkan melalui parameter, selanjutnya fungsi harus mengembalikan nilai agar dapat diolah pada proses berikutnya.

Pengembalian nilai pada fungsi menggunakan kata kunci return.

Contoh:

static int luasPersegi(int sisi){
    int luas = sisi * sisi;
    return luas;
}
Pada contoh tersebut, kita membuat sebuah parameter bernama sisi. Kemudian fungsi akan mengembalikan nilai dengan tipe int (integer) dari variabel luas.

Contoh pemanggilanya:

System.out.println("Luas Persegi dengan panjang sisi 5 adalah " + luasPersegi(5));
Hasil Output:

Luas Persegi dengan panjang sisi 5 adalah 25
Pemanggilan Fungsi di Fungsi Lain
Fungsi-fungsi dapat saling memanggil untuk memproses data.

Contoh, sebuah program Kalkulator Bangun Ruang memiliki fungsi-fungsi: luasPersegi(), luasPersegiPanjang(), luasSegitiga(), luasBalok(), luasKubus() dsb.

Fungsi-fungsi tersebut dapat saling membantu, contoh fungsi luasKubus() membutuhkan fungsi luasPersegi().

Rumus:

Luas Kubus = 6 *  luasPersegi;
Luas Persegi = sisi * sisi;
Maka programnya bisa dibuat seperti ini:

public class BangunRuang {

    public static void main(String[] args) {
        int s = 12;
        int luas = luasKubus(s);

        System.out.println(luas);
    }

    // membuat fungsi luasPersegi()
    static int luasPersegi(int sisi){
        return sisi * sisi;
    }

    // membuat fungsi luasKubus()
    static int luasKubus(int sisi){
        
        // memanggil fungsi luasPersegi
        return 6 * luasPersegi(sisi);
    }

}
Hasil output

864

Fungsi Static dan Non-Static
Pada contoh-contoh diatas, kita menggunakan kata kunci static sebelum membuat fungsi.

Kata kunci static akan membuat fungsi dapat dieksekusi langsung, tanpa harus membuat instansiasi objek dari class.

Contoh:

public class FungsiStatic {
    
    // Fungsi non-static
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }
    
    // fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }
    
    // fungsi main
    public static void main(String[] args) {
        
        // pemanggilan fungsi static
        minum("Kopi");
        
        
        // mambuat instansiasi objek saya dari class FungsiStatic
        FungsiStatic saya = new FungsiStatic();
        // pemanggilan fungsi non-static
        saya.makan("Nasi Goreng");
        
    }
    
}
Pada contoh tersebut, fungsi makan() adalah fungsi non-static. Sedangkan fungsi minum() adalah fungsi static.

Hasil output dari program di atas:

Saya sedang minum Kopi
Hi!
Saya sedang makan Nasi Goreng
Apabila kita tidak membuat objek untuk memanggil fungsi non-static, maka akan terjadi error.

Variabel Global dan Variabel Lokal pada Java
Variabel global adalah variabel yang bisa diakses dari semua fungsi. Sedangkan variabel lokal adalah variabel yang hanya bisa diakses dari dalam fungsi tempat variabel itu berada.

Bingung?

Mari kita lihat contohnya:

class ProgramKu{

    // ini variabel global
    static String nama = "Programku";
    static String version = "1.0.0";

    static void help(){

        // ini variabel lokal
        String nama = "Petani Kode";

        // mengakses variabel global di dalam fungso help()
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);
    }

    public static void main(String args[]){
        
        // panggil fungsi help()
        help();
        
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);

    }

}
Hasil outputnya:

Nama: Petani Kode
Versi: 1.0.0
Nama: Programku
Versi: 1.0.0
Saat pemanggilan fungsi help() kita membuat ulang variabel nama. Sehingga variabel nama menjadi variabel lokal pada fungsi help() dan nilainya berubah menjadi "Petani Kode".

Sedangkan, saat kita akases lagi variabel nama melalui fungsi main() nilainya tetap sama seperti yang didefinisikan.

Contoh Program dengan Fungsi dan Prosedur
Program ini adalah program sederhana dengan fitur sebagai berikut:

Baca data dari ArrayList
Simpan data ke ArrayList
Ubah data
Hapus Data
Keluar
Belum tahu tentang ArrayList?

Silahkan baca meteri: Mengenal Array di Java

Baiklah, silahkan buat class baru bernama FungsiProsedur. Lalu impor class-class yang dibutuhkan.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
Setelah itu buat variabel global di dalam class FungsiProsedur:

static ArrayList listBuah = new ArrayList();
static boolean isRunning = true;
static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
static BufferedReader input = new BufferedReader(inputStreamReader);
Penjelasan:

Variabel listBuah adalah variabel global untuk menyimpan nama-nama buah.
Variabel isRunning adalah variabel global untuk membuat loop.
Kemudian inputStreamReader dan input adalah objek yang kita butuhkan untuk mengambil input dari keyboard.
Setelah itu, buat masing-masing fungsi.

Fungsi untuk menampilkan menu:

static void showMenu() throws IOException {
        
    System.out.println("========= MENU ========");
    System.out.println("[1] Show All Buah");
    System.out.println("[2] Insert Buah");
    System.out.println("[3] Edit Buah");
    System.out.println("[4] Delete Buah");
    System.out.println("[5] Exit");
    System.out.print("PILIH MENU> ");
    
    int selectedMenu = Integer.valueOf(input.readLine());
    
    switch(selectedMenu){
        case 1:
            showAllBuah();
            break;
        case 2:
            insertBuah();
            break;
        case 3:
            editBuah();
            break;
        case 4:
            deleteBuah();
            break;
        case 5:
            System.exit(0);
            break;
        default:
            System.out.println("Pilihan salah!");
                 
    }
        
}
Fungsi tersebut bertugas untuk menampilkan menu dan menentukan fungsi mana yang akan dipanggil berdasarkan nomer menu yang diinputkan.

Apa itu throws IOException?

Nanti saya akan bahas di kesempatan berikutnya. Untuk saat ini diabaikan saja dulu. Ini karena kita menggunakan Buffereader, jadi throws IOException wajib ditulis.

Fungsi untuk menampilkan data:

static void showAllBuah(){
    if(listBuah.isEmpty()){
       System.out.println("Belum ada data");
    } else {
         // tampilkan semua buah
        for(int i = 0; i < listBuah.size(); i++){
            System.out.println(String.format("[%d] %s",i, listBuah.get(i)));
        }
    }
}
Fungsi tersebut bertugas menampilkan isi dari listBuah. Kalau listBuah kosong, maka akan ditampilkan pesan "Belum ada data".

Fungsi untuk menambah data buah:

static void insertBuah() throws IOException{
    System.out.print("Nama buah: ");
    String namaBuah = input.readLine();
    listBuah.add(namaBuah);
}
Pada fungsi tersebut, kita menggunakan method listBuah.add(namaBuah); untuk menambah data ke dalam listBuah berdasarkan namaBuah yang diberikan.

Fungsi untuk mengubah data buah:

static void editBuah() throws IOException{
    showAllBuah();
    System.out.print("Pilih nomer buah: ");
    int indexBuah = Integer.valueOf(input.readLine());
    
    System.out.print("Nama Baru: ");
    String namaBaru = input.readLine();
    
    // ubah nama buah
    listBuah.set(indexBuah, namaBaru);
}
Pertama kita perlu tampilkan dulu daftar buahnya, lalu kita minta user untuk memilih buah mana yang akan diedit.

Setelah itu, kita update buahnya dengan method listBuah.set(indexBuah, namaBaru);.

Fungsi untuk menghapus buah:

static void deleteBuah() throws IOException{
    showAllBuah();
    System.out.print("Pilih nomer buah: ");
    int indexBuah = Integer.valueOf(input.readLine());
    // hapus buah
    listBuah.remove(indexBuah);
}
Hampir sama seperti edit buah, untuk menghapus buah kita juga butuh nomer indeks buah yang akan dihapus.

Lalu mengapusnya dengan method listBuah.remove(indexBuah);.

Fungsi main:

public static void main(String[] args) throws IOException {
        
    do {
        showMenu();
    } while (isRunning);
    
}
Lengkap sudah, berikut ini bentuk kode lengkapnya.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FungsiProsedur {
    
    static ArrayList listBuah = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showMenu() throws IOException{
        
        System.out.println("========= MENU ========");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU> ");
        
        int selectedMenu = Integer.valueOf(input.readLine());
        
        switch(selectedMenu){
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deleteBuah();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
                     
        }
        
        
    }

    static void showAllBuah(){
        if(listBuah.isEmpty()){
           System.out.println("Belum ada data");
        } else {
             // tampilkan semua buah
            for(int i = 0; i < listBuah.size(); i++){
                System.out.println(String.format("[%d] %s",i, listBuah.get(i)));
            }
        }
    }
    
    static void insertBuah() throws IOException{
        System.out.print("Nama buah: ");
        String namaBuah = input.readLine();
        listBuah.add(namaBuah);
    }
    
    static void editBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = Integer.valueOf(input.readLine());
        
        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();
        
        // ubah nama buah
        listBuah.set(indexBuah, namaBaru);
    }
    
    static void deleteBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomer buah: ");
        int indexBuah = Integer.valueOf(input.readLine());
        // hapus buah
        listBuah.remove(indexBuah);
    }
    
    public static void main(String[] args) throws IOException {
        
        do {
            showMenu();
        } while (isRunning);
        
    }
    
}
Setelah itu, silahkan dijalankan dan perhatikanlah hasilnya.

========= MENU ========
[1] Show All Buah
[2] Insert Buah
[3] Edit Buah
[4] Delete Buah
[5] Exit
PILIH MENU> 1
Belum ada data
========= MENU ========
[1] Show All Buah
[2] Insert Buah
[3] Edit Buah
[4] Delete Buah
[5] Exit
PILIH MENU> 2
Nama buah: Apel
========= MENU ========
[1] Show All Buah
[2] Insert Buah
[3] Edit Buah
[4] Delete Buah
[5] Exit
PILIH MENU> 1
[0] Apel
========= MENU ========
[1] Show All Buah
[2] Insert Buah
[3] Edit Buah
[4] Delete Buah
[5] Exit
PILIH MENU> 
Silahkan coba untuk melakukan insert, edit, dan delete.

---
**Referensi:**
- https://www.petanikode.com/java-prosedur-dan-fungsi/