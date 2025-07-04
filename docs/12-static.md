# Static Method & Property

## Static Property

Static property (atau _static_ variable) adalah variabel yang nilainya dimiliki bersama oleh seluruh objek dari kelas tersebut.

Hanya satu salinan dari variabel yang dibuat, tidak peduli berapa banyak objek yang dibuat dari kelas tersebut. Dengan demikian, ini cocok untuk menyimpan data bersama/global seperti counter objek, konfigurasi kelas, dsb.

**Contoh Penggunaan Static Property**
```java
public class Produk {
    static int banyakBarang = 0; // static property

    public Produk() {
        banyakBarang++;
    }

    public static void main(String[] args) {
        Produk barang1 = new Produk();
        Produk barang2 = new Produk();
        System.out.println(Produk.banyakBarang); // Output: 2
    }
}
```

## Static Method

Static method adalah method yang bisa dipanggil tanpa harus membuat objek (instance) dari class terlebih dahulu. 

Ciri-ciri s tatic method
- Dideklarasikan dengan kata kunci `static`
- Dapat dipanggil langsung menggunakan nama class
- Tidak bisa mengakses anggota non-static secara langsung
- Sering digunakan untuk utility/helper method (misalnya: `Math.sqrt()`, `Math.random()`)

**Contoh program 1:**
```java
public class ContohStatic {
    // Static method
    public static void halo() {
        System.out.println("Halo dari static method!");
    }

    // Non-static method
    public void sapa() {
        System.out.println("Hai dari non-static method!");
    }

    public static void main(String[] args) {
        // Memanggil static method tanpa membuat objek
        ContohStatic.halo();

        // Membuat objek untuk memanggil non-static method
        ContohStatic contoh = new ContohStatic();
        contoh.sapa();
    }
}
```

**Output:**
```
Halo dari static method!
Hai dari non-static method!
```

**Contoh program 2:**
```java
public class Kalkulator {
    public static int tambah(int a, int b) {
        return a + b;
    }

    public static int kurang(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Hasil tambah: " + Kalkulator.tambah(5, 3));
        System.out.println("Hasil kurang: " + Kalkulator.kurang(5, 3));
    }
}
```

**Output:**
```
Hasil tambah: 8
Hasil kurang: 2
```

Contoh program di atas menunjukkan bahwa kita tidak perlu membuat _instance_ dari class `Kalkulator` dengan perintah `Kalkulator kalkulator = new Kalkulator`. Karena `tambah()` dan `kurang()` didefinisikan sebagai _static_, maka kita bisa langsung memanggil method tersebut dengan perintah `Kalkulator.tambah()` dan `Kalkulator.kurang()`.

**Batasan Static Method**
- Tidak bisa menggunakan keyword `this` atau `super`
- Tidak bisa mengakses non-static variable atau non-static method secara langsung