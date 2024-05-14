# Cheatsheet 1

## Struktur program
```java
// imports: loading package yang akan digunakan
// import java.util.Scanner;
// import java.util.ArrayList;

public class NamaClass { // NamaClass harus sama dengan nama file
    public static void main(String[] args) {
        // statement
        // ...
        // ...
    }
}

```

## Statement
Statement di java hanya terdiri dari 5 pilihan:
1. Deklarasi (Declaration)
2. Penugasan (Assignment)
3. Pengambilan keputusan (if)
4. Pengulangan/loop (while/for)
5. Memanggil prosedur/Function call

## Deklarasi (Declaration)
Menyiapkan variabel/objek yang akan digunakan.
Contoh:
```java
String nama;
int n;
Mahasiswa mahasiswa;
String[] daftar;
```

## Penugasan (Assignment)
Mengisi variabel dengan nilai atau _formula_.
Contoh:
```java
nama = "Budi";
n = 1;
daftar.nama = "Yuda";
n = b + a;
namaLengkap = namaDepan + " " + namaBelakang;
```

Kadang, penggunaan _penugasan_ digabung dengan _deklarasi_. Contoh:
```java
String nama = "Budi";
int n = 1;
Double luas = (a * t) / 2;
String[] daftar = {"Budi", "Ayu", "Yuda"};
Scanner scan = new Scanner(System.in);
```

## Pengambilan Keputusan (if)
Pengambilan keputusan di java menggunakan `if`. Format penulisannya

```java
// if tunggal
if(kondisi) {
    // statement
}

// if - else
if(kondisi) {
    // statement
} else {
    // statement
}

// multiple if - else

if(kondisi) {
    // statement
} else if(kondisi) {
    // statement
} else {
    // statement
}

```

_kondisi_ adalah formula yang selalu memberikan hasil `true` atau `false` (boolean). Ciri formula yang menghasilkan nilai boolean biasanya menggunakan operator logika, seperti `==` `!=` `>` `<` `=>` `<=` `||` `&&`.

## Pengulangan
Perintah pengulangan di Java adalah `while` dan `for`. Format penulisan:
```java
while(kondisi) {
    // statement
}

do {
    // statement
} while(kondisi);

for(int i<=0; i<=10; i++) {
    // statement
}

for(TipeDate i:array) {
    // statemeent
}
```

## Memanggil prosedur/Function call
Function call biasanya adalaha statement yang diakhiri `()`. Contoh:
```java
System.out.println();
System.out.println(nilai);
scan.close();
mahasiswa.setNilai(90, 20);
mahasiswa.setIpk(3.84, 3.39);
```
variabel, nilai atau ekspresi yang berada dalam `()` disebut _parameter_.

## Formula
_Formula_ dibentuk dari operasi data. Hasil dari operasi data tersebut bisa berupa angka (numerik), string, atau boolean. Contoh:

```
// formula numerik
1 + 1
(a * 2) / 2
Math.sqrt(9)
3

// formula string
"Budi"
"Budi" + "Raharjo"
namaDepan.toUpperCase()+" "+namaBelakang.toUpperCase()
"a + b = " + hasil.toString()

// formula boolean
n>0
!found
n>0 && n<10
(b<0) || (b>10)

```
_formula boolean_ ini disebut juga dengan _kondisi_. _Kondisi_ ini adalah formula yang biasa kita gunakan dalam `if` atau `while`.



