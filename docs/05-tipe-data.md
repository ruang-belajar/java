# Tipe Data

## Variabel & Primitive Data Type

Variabel adalah tempat penyimpanan data sementar. Java menerapkan sistem _static data type_. Artinya, setiap variabel harus ditentukan jenisnya pada saat deklarasi.

Umumnya setiap data yang digunakan di Java dinyatakan sebagai class (yang kita akan pelajari kemudian), namun Java tetap support primitive data type. Primitive data type ini ditandai dengan penulisannya menggunakan huruf kecil.

Berikut ini macam-macam primitive data type yang di support Java:
| Tipe data | Deskripsi |
| --- | --- |
| byte  |	Menyimpan bilangan bulat dari -128 to 127 |
| short |	Menyimpan bilangan bulat dari -32,768 to 32,767 |
| int   |	Menyimpan bilangan bulat dari -2,147,483,648 to 2,147,483,647 |
| long  |	Menyimpan bilangan bulat dari -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float |	Menyimpan bilangan pecahan. Menyimpan 6-7 angka di belakang koma |
| double    |	Menyimpan bilangan pecahan. Menyimpan 15-16 angka di belakang koma. |
| boolean   |	Menyimpan nilai `true` atau `false` |
| char  |	Menyimpan data berupa satu karakter |


Contoh deklarasi:
```java
int umur = 30;
boolean lulus = true;
char jenisKelamin = 'L';
float diameter = 4.2;
```

## Non Primitive Data Type

Perbedaan antara primitive data type dan non primitive data type adalah:

- Non primitive data type dapat digunakan untuk memanggil metode untuk melakukan operasi tertentu, sedangkan primitive data type tidak dapat.
- Primitive data type dimulai dengan huruf kecil (seperti int), sedangkan tipe non-primitif biasanya dimulai dengan huruf besar (seperti String).
- Primitive data type selalu memegang suatu nilai, sedangkan tipe non-primitif dapat berupa null.

Contoh non primitive data type adalah `String`, `Array`, `Integer`, `Double`, dan lain-lain.



---
**Referensi:**
- [https://www.petanikode.com/java-variabel-dan-tipe-data/](https://www.petanikode.com/java-variabel-dan-tipe-data/)