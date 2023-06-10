# Java Referensi: GUI

Berikut beberapa _referensi cepat_ yang bisa Anda gunakan dalam pemubuatan GUI di Java.



## Menampilkan _Message Box_
```java
JOptionPane.showMessageDialog(null,"Hallo");
```
Catatan:
- Menggunakan _JOptionPane_ memerlukan library _javax.swing.JOptionPane_
  
Referensi:
- https://www.javatpoint.com/java-joptionpane

## Membaca dan menulis text pada _jTextField_
**Membaca _jTextField_**
```java
String nama = jTextField1.getText();
```

**Menulis ke _jTextField_**
```java
jTextField1.setText("Budi");
```
Referensi:
- https://www.codejava.net/java-se/swing/jtextfield-basic-tutorial-and-examples
- https://rizkypratama.id/blog/2019/07/25/cara-menggunakan-gettext-dan-settext-pada-pemrograman-java-gui/


## Menampilkan form/JFrame
**Cara 1:**
```java
new NewJFrame().setVisibility(true);
```

**Cara 2:**
```java
NewJFrame f = new NewJFrame();

// Anda bisa menambahkan beberapa setup opsional di sini sebelum form ditampilkan
f.setLocationRelativeTo(null); // set posisi form ke tengah

f.setVisible(true);
```

Referensi:
- http://bahtiarimran.blogspot.com/2015/09/cara-pemanggilan-form-dan-hide-form.html


## Menutup Window
```java
dispose();
```

## Menghentikan Program
```java
System.exit(0);
```

## Menambahkan event _on change_ pada _ComboBox_
Referensi:
* http://www.java2s.com/Tutorial/Java/0240__Swing/ListeningforChangestotheSelectedIteminaJComboBoxComponent.htm

## Konversi nilai _Integer_ ke _String_ (dan sebaliknya)
Referensi:
* https://www.freecodecamp.org/news/java-string-to-int-how-to-convert-a-string-to-an-integer/