# Exception: Try ... Catch

Hal-hal di luar harapan bisa terjadi ketika program kita dijalankan. Hal ini bisa menyebabkan program berhenti (_runtime error_). Hal yang bisa menyebabkan muncul _runtime error_: pada bagian membaca input dari user, membaca file, membaca data lewat jaringan.

Berikut contoh program sederhana membaca input dari user:
```java
import java.util.Scanner;

public class Bilangan1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        System.out.print("A? ");
        n1 = scan.nextInt();

        System.out.print("B? ");
        n2 = scan.nextInt();

        System.out.print("A x B = "+(n1*n2));

        scan.close();
    }
}
```
Program diatas, akan meminta user memasukan 2 angka dan mengkalikannya. Masalah yang akan timbul adalah jika user menginput sesuatu yang bukan angka _integer_, jika itu terjadi, maka _Java_ akan menghentikan progran dan memberitahukan _runtime error_. 
```
C:\latihan>java Bilangan1.java
A? 32i
Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at Bilangan1.main(Bilangan1.java:10)
```
Menampilkan _runtime error_ pada user adalah sesuatu yang buruk, karena itu menandakan bahwa ada kesalahan yang tidak ditangani oleh program. Untuk mengantisipasi kesalahan yang mungkin muncul, kita bisa menggunakan blok perintah `try` ... `catch` pada bagian-bagian program yang mungkin terjadi _runtime error_.

Contoh program dengan `try`...`catch`:
```java
import java.util.Scanner;

public class Bilangan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        try {
            System.out.print("A? ");
            n1 = scan.nextInt();

            System.out.print("B? ");
            n2 = scan.nextInt();

            System.out.print("A x B = "+(n1*n2));
        } catch (Exception e) {
            System.out.println("Anda memasukan input yang salah");
            System.out.println("Pesan error"+e.getMessage());
        }

        scan.close();
    }
}

```

## Jenis Exception
_Exception_ di Java dibagi ke dalam dua kategori besar:
1. Checked Exception
2. Unchecked Exception (Runtime Exception)

### Checked Exception
Diperiksa oleh compiler pada saat _compile-time_. Harus ditangani menggunakan _try-catch_ atau dideklarasikan dengan throws.

Biasanya terkait dengan masalah eksternal seperti I/O, akses database, dll.

Contoh:
| Exception | 	Deskripsi |
| - | - |
| IOException | 	Terjadi saat ada kesalahan I/O (baca/tulis file) |
| SQLException | 	Terjadi saat ada kesalahan database SQL |
| FileNotFoundException | 	File yang diminta tidak ditemukan |
| ClassNotFoundException | 	Kelas tidak ditemukan saat load class |

Contoh kode:
```java
public void bacaFile(String namaFile) throws IOException {
    FileReader fr = new FileReader(namaFile);
}
```

### Unchecked Exception (Runtime Exception)
Tidak diperiksa saat compile-time. Terjadi akibat kesalahan logika dalam program.

Contoh:
| Exception | 	Deskripsi |
| - | - |
| ArithmeticException | 	Kesalahan aritmetika (mis. pembagian dengan nol) |
| NullPointerException | 	Mengakses method/atribut dari objek _null_ |
| ArrayIndexOutOfBoundsException | 	Akses indeks di luar batas array |
| IllegalArgumentException | 	Argumen method tidak valid |
| NumberFormatException | 	Gagal konversi string ke angka |

Contoh kode:
```java
int[] arr = new int[3];
System.out.println(arr[5]); // ArrayIndexOutOfBoundsException

String angka = "abc";
int x = Integer.parseInt(angka); // NumberFormatException
```

### Error
Menunjukkan kondisi serius yang biasanya tidak bisa ditangani program.

Tidak dianjurkan untuk ditangani (dengan try-catch) karena mengindikasikan masalah sistem (JVM, memory, dll).

| Error	| Deskripsi |
| - | - |
| OutOfMemoryError	| JVM kehabisan memori |
| StackOverflowError	| Terlalu banyak pemanggilan rekursif |
| VirtualMachineError	| Masalah serius di JVM |

```java
public void rekursifTakBerhenti() {
    rekursifTakBerhenti();
}
```


## Multiple Catch

Pada sebuah proses tentu kesalahan itu berbagai macam. Kita bisa memberikan response try - catch untuk berbagai jenis kesalahan yang berbeda.

```java
public class ContohMultipleCatch {
    public static void main(String[] args) {
        try {
            // Contoh 1: Aritmetika (bagi nol)
            int a = 10;
            int b = 0;
            int hasil = a / b; // Akan melempar ArithmeticException

            // Contoh 2: Akses indeks array
            int[] data = {1, 2, 3};
            System.out.println(data[5]); // Akan melempar ArrayIndexOutOfBoundsException

            // Contoh 3: Konversi string ke angka
            String teks = "abc";
            int angka = Integer.parseInt(teks); // Akan melempar NumberFormatException

        } catch (ArithmeticException e) {
            System.out.println("Kesalahan aritmetika: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Kesalahan indeks array: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format angka: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }

        System.out.println("Program tetap berjalan setelah exception ditangani.");
    }
}
```

## `throw`
`throw` adalah keyword dalam Java yang digunakan untuk melempar (`throw`) exception secara eksplisit dalam program. Dengan kata lain, `throw` digunakan saat kita secara manual ingin memunculkan exception dari dalam kode.

```java
throw new ExceptionType("Pesan error");
```

- `ExceptionType`: adalah kelas `Exception`.
- `"Pesan error"`: pesan yang bisa dijelaskan ke pengguna atau log error

**Contoh Penggunaan throw:**
```java
public void setUmur(int umur) {
    if (umur < 0) {
        throw new IllegalArgumentException("Umur tidak boleh negatif!");
    }
    System.out.println("Umur diset ke: " + umur);
}
```
**Penjelasan:**
- Jika umur < 0, maka program akan melempar exception `IllegalArgumentException` dengan pesan tertentu.

### Perbedaan throw vs throws
Perlu disadari bahasa ada selain `throw` ada juga `throws`. Perlu disadari bahwa walau mirip, keduanya ini punya fungsi yang berbeda

| throw |	throws |
| - | - |
| Digunakan dalam tubuh method	| Digunakan pada deklarasi method |
| Untuk melempar satu exception	 | Untuk menyatakan bahwa method bisa melempar exception |
| Hanya satu exception per throw |	Bisa lebih dari satu exception |

***Contoh Perbedaan:***
```java
// Menggunakan throws
public void bacaFile(String nama) throws IOException {
    FileReader fr = new FileReader(nama);
}

// Menggunakan throw
public void validasiNama(String nama) {
    if (nama == null) {
        throw new NullPointerException("Nama tidak boleh null");
    }
}
```

## `finally`

Kata kunci `finally` digunakan berpasangan dengan `try` ... `catch`, di dalamnya kita bisa menuliskan kode program yang harus dijalankan dalam keadaan program error ataupun tidak. Contoh, pada program dibawah ini, kita menuliskan `scan.close()` di dalam blok `finally` untuk memastikan objek `scan` ditutup/dibersikan dari memori sebelum akhirnya program ditutup.

```java
import java.util.Scanner;

public class Bilangan2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;

        try {
            System.out.print("A? ");
            n1 = scan.nextInt();

            System.out.print("B? ");
            n2 = scan.nextInt();

            System.out.print("A x B = "+(n1*n2));
        } catch (Exception e) {
            System.out.println("Anda memasukan input yang salah");
            System.out.println("Pesan error"+e.getMessage());
        } finally {
            scan.close();
        }

    }
}

```

# Custom Exception

_Custom Exception_ adalah exception yang dibuat sendiri oleh programmer dengan cara membuat kelas baru yang turunan dari kelas `Exception` atau `RuntimeException`.

_Custom exception_ berguna ketika kita ingin:
- Menangani kondisi khusus dalam aplikasi (misalnya: _saldo tidak cukup_, _umur tidak valid_).
- Memberi nama dan pesan error yang lebih bermakna dan lebih mudah dipahami
- Memisahkan error logic aplikasi dari error bawaan Java
- Butuh error handling yang lebih spesifik, menyaring jenis kesalahan tertentu dalam sistem besar

Berikut contoh _custom exception_ turunan dari class `Exception`.

```java
public class UmurTidakValidException extends Exception {
    public UmurTidakValidException(String pesan) {
        super(pesan);
    }
}
```

Berikut contoh _custom exception_ turunan dari class `RuntimeException`.

```java
public class UsernameKosongException extends RuntimeException {
    public UsernameKosongException(String pesan) {
        super(pesan);
    }
}
```

**Contoh Penggunaan Custom Exception**;

**Contoh Program 1:**
```java
class UmurTidakValidException extends Exception {
    public UmurTidakValidException(String pesan) {
        super(pesan);
    }
}

public class DemoCustomException {
    public static void main(String[] args) {
        try {
            cekUmur(-5);
        } catch (UmurTidakValidException e) {
            throw new RuntimeException("Terjadi exception: " + e.getMessage(), e);
        }
    }

    public static void cekUmur(int umur) throws UmurTidakValidException {
        if (umur < 0) {
            throw new UmurTidakValidException("Umur tidak boleh negatif!");
        } else {
            System.out.println("Umur valid: " + umur);
        }
    }
}
```

**Contoh Program 2:**
```java
// Custom Exceptions
class InvalidNamaException extends Exception {
    public InvalidNamaException(String pesan) {
        super(pesan);
    }
}

class UmurTidakValidException extends Exception {
    public UmurTidakValidException(String pesan) {
        super(pesan);
    }
}

class NilaiTidakCukupException extends Exception {
    public NilaiTidakCukupException(String pesan) {
        super(pesan);
    }
}

// Kelas utama
public class PendaftaranMahasiswa {
    public static void main(String[] args) {
        try {
            daftarMahasiswa("", 16, 65); // Contoh data tidak valid
        } catch (InvalidNamaException | UmurTidakValidException | NilaiTidakCukupException e) {
            System.err.println("Pendaftaran gagal: " + e.getMessage());
        }
    }

    public static void daftarMahasiswa(String nama, int umur, double nilaiRata)
            throws InvalidNamaException, UmurTidakValidException, NilaiTidakCukupException {

        if (nama == null || nama.trim().isEmpty()) {
            throw new InvalidNamaException("Nama tidak boleh kosong.");
        }

        if (umur < 17) {
            throw new UmurTidakValidException("Umur minimal untuk pendaftaran adalah 17 tahun.");
        }

        if (nilaiRata < 70) {
            throw new NilaiTidakCukupException("Nilai rata-rata minimal adalah 70.");
        }

        System.out.println("Pendaftaran berhasil untuk: " + nama);
    }
}
```


---

**Latihan:**
* Pelajari file [Hitung1.java](../src/Hitung1.java), kemudian kerjakan [Latihan (File) - Soal 2](latihan/06-class-5.md)


Referensi:
- [Java Exception - Try...Catch](https://www.w3schools.com/java/java_try_catch.asp)