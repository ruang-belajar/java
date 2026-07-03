# Referensi GUI

![](images/20-gui-referensi-1.png)
## Visual Component
### JTextField

* *Property**
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

* **Property**
	- `foreground` : menentukan warna font
	- `font` : jenis dan besar font
	- `text` : tulisan yang muncul
* **Method**
	- `void setText(String text)`: merubah tulisan yang muncul pada label

### JComboBox

- **Method**
	- `Object getSelectedItem()`: Membaca opsi yang dipilih. Contoh:
		```java
		// cari 1
		String item1 = (String) jComboBox1.getSelectedItem();
		
		// cara 2
		String item2 = jComboBox1.getSelectedItem().toString();
		```
	- `void setSelectedItem(String item)` : set nilai pada `combo box`.

### JSlider

- **Property**:
	- `int minimum` : nilai minimum slider
	- `int maximum` : nilai maximum slider
- **Method**
	- `int getValue()` : mengambil nilai *slider*

### JSpinner

- **Method**
	- `Object getValue()` :  mengambil nilai pada *spinner*. Karena `return value` berupa `Object`, maka membacaan value harus melalui proses `casting`.
		```java
		int nilai = (Integer) spinner.getValue();
		```

### JImageView

- **Method**:
	- `void setImage(Image image)` : Menampilkan gambar dari object `Image`
		```java
		// load dari file
		File file = new File("C:/images/photo.jpg"); 
		Image image = new Image(file.toURI().toString());
		imageView.setImage(image);
		```
		```java
		// load dari resource
		Image image = new Image(getClass().getResourceAsStream("/myImage.png"));
		imageView.setImage(image);
		```

### JTable

- **Method:**
	- `void addRow(Object[] row)` : menambahkan baris baru ke table.
		```java
		// 1. model tabel
		DefaultTableModel model = (DefaultTableModel) myJTable.getModel(); 
		// 2. siapkan data yang akan diinput
		Object[] newRow = { "John Doe", 28, "Engineer" }; 
		// 3. tambahkan data ke tabel
		model.addRow(newRow);
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
	- `void showMessageDialog(Component parentComponent, Object message)`: menampilkan pop up kotak pesan berisi tulisan `message`. Mengatur `parentComponent` dengan `null` berarti message dialog akan muncul di tengah layar. Contoh: 
		```java
		JOptionPane.showMessageDialog(null, "Pesan Message Box");		
		```
	