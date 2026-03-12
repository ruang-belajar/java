# Mengenal Java


## 1. Apa itu Java

Java adalah bahasa pemrograman **tingkat tinggi**, **berorientasi objek**, dan **bersifat multiplatform**. Java dirancang agar kode program dapat dijalankan di berbagai sistem operasi tanpa perlu perubahan kode sumber.

Java pertama kali dikembangkan oleh **Sun Microsystems** pada pertengahan 1990-an dan saat ini dikelola serta dikembangkan oleh **Oracle**.

Slogan utama Java:

> _Write Once, Run Anywhere (WORA)_

Artinya, satu program Java dapat dijalankan di berbagai platform (Windows, Linux, macOS) selama tersedia lingkungan Java.

---

## 2. Sejarah Singkat Java

- **1991** – Proyek dimulai dengan nama _Oak_
- **1995** – Resmi dirilis dengan nama _Java_
- **1998–2005** – Java berkembang pesat untuk aplikasi enterprise dan web
- **Sekarang** – Java digunakan luas pada aplikasi enterprise, Android, sistem perbankan, dan big data

---

## 3. Mengapa Menggunakan Java

Java menjadi salah satu bahasa pemrograman paling populer di dunia karena keunggulan berikut:

1. **Multiplatform:** Program Java tidak bergantung pada sistem operasi tertentu. Bisa dijalankan di sistem operasi Windows, Mac, Linux.
2. **Berorientasi Objek (OOP):** Java mendukung konsep OOP (Class, Object, Encapsulation, Inheritance, Polymorphism, Abstraction). Konsep ini memudahkan pengembangan aplikasi berskala besar.
3. **Stabil dan Aman:** Java banyak digunakan pada sistem kritikal seperti Perbankan, Sistem enterprise, Aplikasi server.
4. **Komunitas dan Ekosistem Besar:** Java memiliki Dokumentasi lengkap, Library yang sangat banyak dan Dukungan komunitas global

---

## 4. Cara Kerja Java (Konsep Dasar)

![](01-intro-1.png)

Alur eksekusi program Java:
1. Kode ditulis dalam file `.java`
2. Dikompilasi menjadi **bytecode** (`.class`)
3. Bytecode dijalankan oleh **Java Virtual Machine (JVM)**

Peran JVM:
- Menjalankan program Java di berbagai platform
- Mengelola memori secara otomatis (Garbage Collection)

---

## 5. Komponen Utama Java Platform

![](01-intro-2.png)

### a. JDK (Java Development Kit)

**JDK** adalah paket lengkap untuk **mengembangkan** aplikasi Java. JDK terdiri dari:
- **JRE**
- Compiler (`javac`)
- Debugger
- Tool pengembangan lainnya (`javadoc`, `jshell`, dll.)

### b. JRE (Java Runtime Environment)

**JRE** adalah **lingkungan runtime** untuk menjalankan aplikasi Java. Tanpa JRE, program Java **tidak bisa dijalankan**. 

**JRE terdiri dari:**
- **JVM**
- Java Standard Library (API inti seperti `java.lang`, `java.util`)
- File konfigurasi runtime

Java Virtual Machine (JVM) adalah bagian dari JRE. Tugas **JVM** adalah berfungsi sebagai berikut:

- Menjalankan _bytecode_ Java (`.class`)
- Mengelola memori (heap, stack)
- Menangani _garbage collection_
- Menyediakan _runtime execution engine_

---

## 6. Contoh Program Java Pertama

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

Penjelasan singkat:

- `class HelloWorld` → mendefinisikan sebuah class
- `main` → method utama, titik awal eksekusi program
- `System.out.println` → menampilkan teks ke layar

---

## 7. Karakteristik Utama Bahasa Java

- Case-sensitive (Java ≠ java)
- Menggunakan `{ }` untuk blok kode
- Setiap pernyataan diakhiri dengan `;`
- Nama class diawali huruf besar (konvensi)

---

## 8. Contoh Penggunaan Java di Dunia Nyata

Java digunakan pada:

- Aplikasi Android
- Sistem perbankan
- Aplikasi enterprise (ERP, CRM)
- Backend web application
- Big Data (Hadoop, Spark)

---

## 9. Perbandingan Singkat Java dengan Bahasa Lain

|Aspek|Java|C|Python|
|---|---|---|---|
|Paradigma|OOP|Prosedural|Multi-paradigma|
|Multiplatform|Ya|Tidak|Ya|
|Manajemen Memori|Otomatis|Manual|Otomatis|
|Performa|Tinggi|Sangat tinggi|Sedang|

---

# Perkembangan, Tren, dan Aplikasi Java Saat Ini

## 1. Perkembangan Java Terkini

### a. Model Rilis Modern (Six-Month Release Cycle)

Sejak Java 9, Java menerapkan **siklus rilis 6 bulan**. Artinya, Java berkembang secara berkelanjutan dengan pembaruan fitur yang lebih cepat dan stabil.

Pihak pengelola utama:

- **Oracle** (pengembang utama OpenJDK)
- Komunitas OpenJDK global  

---

### b. Evolusi Bahasa (Language Evolution)

Java tidak lagi “kaku” seperti dahulu. Beberapa fitur modern yang merepresentasikan perkembangan Java:

- **Lambda Expression** → pemrograman fungsional
- **Stream API** → pemrosesan data deklaratif
- **Records** → struktur data ringkas dan immutable
- **Pattern Matching** → kode lebih ekspresif dan aman
- **Virtual Threads (Project Loom)** → konkurensi ringan dan skalabel

Hal ini membuat Java semakin kompetitif dibanding bahasa modern lainnya.

---

## 2. Tren Java Saat Ini

### a. Java di Era Cloud & Microservices

Java tetap dominan pada pengembangan **backend modern**, khususnya:

- Microservices architecture
- RESTful API
- Event-driven systems

Framework populer:

- **Spring / Spring Boot**
- Quarkus
- Micronaut

Java kini lebih ringan, cepat _startup_, dan efisien untuk cloud-native environment.

---

### b. Container dan Kubernetes

Java telah beradaptasi dengan ekosistem container:

- Optimasi JVM untuk Docker
- Dukungan penuh pada Kubernetes
- Native image (GraalVM) untuk startup super cepat

Java tidak lagi identik dengan “boros memori”.

---

### c. Reactive dan Asynchronous Programming

Tren aplikasi modern membutuhkan:

- High throughput
- Non-blocking I/O

Java mendukung ini melalui:

- Reactive Streams
- Project Reactor
- CompletableFuture
- Virtual Threads

---

### d. Integrasi dengan Big Data dan AI

Java tetap relevan di:

- Big Data processing
- Data pipeline
- Distributed systems

Contoh teknologi:

- **Apache Hadoop**
- **Apache Spark**

---

## 3. Aplikasi Java di Dunia Nyata Saat Ini

### a. Enterprise & Financial Systems

Java masih menjadi standar pada:

- Sistem perbankan
- Core banking
- Payment gateway
- Sistem ERP dan CRM

Alasan:

- Stabilitas tinggi
- Keamanan
- Dukungan jangka panjang (LTS)

---

### b. Backend Web dan API

Java digunakan luas untuk:

- REST API
- GraphQL backend
- High-traffic web services

Perusahaan besar yang menggunakan Java:

- Netflix
- Amazon
- Google
- LinkedIn

---

### c. Android Development

Bahasa utama Android kini adalah Kotlin, namun:

- Java **masih digunakan**
- Banyak kode legacy Android berbasis Java
- Interoperabilitas penuh Java–Kotlin

---

### d. Big Data dan Distributed Systems

Java mendominasi ekosistem:

- Data streaming
- Batch processing
- Event processing

Framework:

- Apache Kafka
- Apache Flink

---

### e. Game dan Desktop (Niche Use)

Java tetap digunakan pada:

- Aplikasi desktop (JavaFX)
- Game berbasis Java (contoh: Minecraft)

---

## 4. Masa Depan Java

Tren ke depan menunjukkan:

- Java tetap relevan di enterprise
- Virtual Threads akan menjadi _game changer_
- Java semakin modern dan ringkas
- Fokus pada cloud, scalability, dan performance

Java **tidak menurun**, melainkan **bertransformasi**.

