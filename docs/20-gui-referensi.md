# Referensi GUI

![](20-gui-referensi-1.png)
## Visual Component
### JTextField
* ***Property**
	- `Color foreground` : menentukan warna font
	- `Font font` : jenis dan besar font
	- `String text` : tulisan yang muncul
- **Method**
	- `void setText(String text)` method untuk set tulisan pada text field
	- `String getText()` method untuk membaca text pada text field

### JButton
- **Event**
	 - **Action**: program yang dijalankan ketika tombol di klik

### JFrame
- **Method**
	- `void setVisible(boolean mode)` : menampilkan atau menyembunyikan JFrame

### JLabel
Komponen yang digunakan untuk menampilkan label

* ***Property**
	- `foreground` : menentukan warna font
	- `font` : jenis dan besar font
	- `text` : tulisan yang muncul
* ***Method**
	- `void setText(String text)`: merubah tulisan yang muncul pada label

### JOptionPane
* ***Method**
	- `void showMessageDialog(null, String pesan)`: menampilkan kotak pesan

### JComboBox
- **Method**
	- `Object getSelectedItem()`: Membaca opsi yang dipilih. Contoh:
		```java
		// cari 1
		String item1 = (String) jComboBox1.getSelectedItem();
		
		// cara 2
		String item2 = jComboBox1.getSelectedItem().toString();
		```


---

## Non Visual Component

### Color
- **Contructor**
	- `Color(int r, int g, int b)` : `r`, `g`, `b` adalah kode warna untuk red/green/blue  berupa angka 0-255.
### Font
- **Construtor**
	- `Font(String name, int style, int size)`
		- `String name`: *Dialog, DialogInput, Monospaced, Serif, SansSerif*
		- `int style`: `Font.PLAIN`/`Font.BOLD`/`Font.ITALIC`
		- `int size`: ukuran font.

### JOptionPane
- **Static methods**
	- `void showMessageDialog(Component parentComponent, Object message)`: menampilkan pop up kotak pesan berisi tulisan `message`. Contoh: 
		```java
		JOptionPane.showMessageDialog(null, "Pesan Message Box");
		```