# 2023 Kelas Pemrograman Java: Catatan
## Pertemuan 6
* Buat _jFrame_: `FormUtama`
* Buat _Menu Bar_:
  * File
    * Master
      * Barang
    * Exit: Menutup Program
  * Help
    * About: Menampilkan Message Dialog dengan pesan _Dibuat oleh [nama]_.
* Menampilkan _Message Dialog_:
  ```java
  JOptionPane.showMessageDialog(null, "Dibuat oleh En Tay");
  ```

## Pertemuan 7
* Download & restore database [tokobuku.sql](https://github.com/pujangga123/ruang-belajar-java/raw/main/src/tokobuku.sql)
* Setup _Mysql Connector J_ (lihat [Java - Koneksi ke Database](https://pujangga123.github.io/ruang-belajar-java/22-koneksi-database.html))
* Menu _File - Master - Barang_: Menampilkan `FormBarang`
* Buat _jFrame_: `FormBarang`
  * _jTable_: `tabelBarang`
    * Kolom: _Kode (String)_, _Nama (String)_
  * _jButton_: `tombolSelesai`
    * Menutup window
  * _jButton_: `tombolReload`
    ```java
    Connection conn;
    try {
        // below two lines are used for connectivity.
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tokobuku","root","");

        Statement st;
        st = conn.createStatement();
        ResultSet rs;
        rs = st.executeQuery("select * from barang");
        
        DefaultTableModel model = (DefaultTableModel)tabelBarang.getModel();
        while(model.getRowCount()>0) { model.removeRow(0); }
        
        String kode;
        String nama;
        while (rs.next()) {
            kode = rs.getString("kode");
            nama = rs.getString("nama");
            model.addRow(new Object[]{kode, nama});
        }
        rs.close();
        st.close();
        conn.close();
    } catch (Exception exception) {
        JOptionPane.showMessageDialog(null,"Error");
    }
    ```
    ![](images/7-formbarang-1.jpg)

## Pertemuan 8
1. Pada menu bar di `Form Utama`, tambahkan menu:
  * Utility
    * `menuUtilityJamPublic`: _Jam (public)_
    * `menuUtilityJamPrivate`: _Jam (private)_
2. Buat `FormJamPrivate`
  * _jLabel_: `labelSalam`
  * _jLabel_: `labelHari`
  * tambahkan function berikut pada `FormJamPrivate`
    ```java
    public void tampilkan(String tanggal) {
        labelSalam.setText("Halo, "+Global.NAMA);
        labelHari.setText(tanggal);
        setVisible(true);
    }
    ```
  * Pada `menutUtilityJamPrivate`, ketika di klik, sisipkan kode berikut:
    ```java
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy");  
    LocalDateTime now = LocalDateTime.now();  
    new FormJamPrivate().tampilkan(dtf.format(now));
    ```
3. Buat `FormJamPublic`
   * _jLabel_: `labelSalam`
   * _jLabel_: `labelHari`
     * klik kanan `labelHari`
     * _Customize code_
     * rubah _access_ dari _private_ menjadi _public_
  * Pada `menutUtilityJamPublic`, ketika di klik, sisipkan kode berikut:
    ```java
    FormJamPublic f = new FormJamPublic();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MMM yyyy");  
    LocalDateTime now = LocalDateTime.now();  
    f.labelHari.setText(dtf.format(now));
    f.labelSalam.setText("Halo, "+Global.NAMA);
    f.setVisible(true);
    ```
4. Buat `FormDetailBarang`
   * _jLabel_: `textKode`
   * _jLabel_: `textNama`
   * _jComboBox_: `comboJenis`
   * _jButton_: `tombolBatal`
     ```java
     setVisible(false);
     ```  
   * _jButton_: `tombolSimpan`
    ```java
    Connection conn;
    try {
        // below two lines are used for connectivity.
        Class.forName(Global.DBDRIVER);
        conn = DriverManager.getConnection(Global.DBCONNECTION,Global.DBUSER, Global.DBPASS);
        
        // baca data
        String kode = textKode.getText();
        String nama = textNama.getText();
        String jenis = comboJenis.getSelectedItem().toString();
        int harga = Integer.parseInt(textHarga.getText());
        
        // SQL
        String sql = "insert into barang (kode, nama, jenis, harga) values (?,?,?,?)";
        
        // siapkan statement untuk INSERT
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, kode);
        pst.setString(2, nama);
        pst.setString(3, jenis);
        pst.setInt(4, harga);
        
        // eksekusi SQL
        pst.execute(); 
        
        // hapus objek 
        pst.close();
        conn.close();
        
        // tampilkan pesan
        JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
    } catch(Exception e) {
        //JOptionPane.showMessageDialog(null,e.getMessage().toString());
        JOptionPane.showMessageDialog(null,e.getMessage().toString());
    } 
    ```