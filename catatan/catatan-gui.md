# 2023 Kelas Pemrograman Java: Catatan
## Pertemuan 6
*   Buat project baru: `TokoBuku`
*   Buat _jFrame_: `FormUtama`
*   Buat _Menu Bar_:
    *   File
        *   Master
            *   Barang
    *   Exit
        *   on action perform:
            ```java
            System.exit(0);
            ```
    *   Help
        *   About
            *   on action perform:
                ```java
                JOptionPane.showMessageDialog(null, "Dibuat oleh En Tay");
                ```
*   Program utama (_void main_), tambahkan:
    ```java
    new FormUtama().setVisible(true);
    ```

## Pertemuan 7
* Download & restore database [tokobuku.sql](https://github.com/pujangga123/ruang-belajar-java/raw/main/src/tokobuku.sql)
* Setup _Mysql Connector J_ (lihat [Java - Koneksi ke Database](https://pujangga123.github.io/ruang-belajar-java/22-koneksi-database.html))
* Menu _File - Master - Barang_: Menampilkan `FormBarang`
* Buat _jFrame_: `FormBarang`
  
  ![](images/7-formbarang-1.jpg)  
  * imports
    ```java
    import javax.swing.table.DefaultTableModel;
    ```
  * _jTable_: `tabelBarang`
    * Kolom: _Kode (String)_, _Nama (String)_
  * _jButton_: `tombolSelesai`
    * Event on action perform:
        ```java
        setVisible(false);
        ```
  * _jButton_: `tombolReload`
    * on action perform:
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

## Pertemuan 8
1.  Buat `FormDetailBarang`
   
    ![](images/8-formdetailbarang-1.jpg)
    * imports:
     ```java
     import javax.swing.JOptionPane;
     import java.sql.*;
     ```
   * _jTextField_: `textKode`
   * _jTextFiled_: `textNama`
   * _jComboBox_: `comboJenis`
     * Property:
       * model: _ATK, Buku, Snack_
   * _jTextField_: `textHarga`
     * Property:
       * horizontalAlignment: _RIGHT_
   * Buat label untuk masing-masing objek diatas: _Kode, Nama, Jenis, Harga_
   * _jButton_: `tombolBatal`
     * Event on action perform:
        ```java
        setVisible(false);
        ```  
   * _jButton_: `tombolTambah`
     * Event on action perform:
        ```java
        Connection conn;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tokobuku","root", "");
            
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
            JOptionPane.showMessageDialog(null,e.getMessage().toString());
        } 
        ```
2. Edit `FormBarang`
   * on window opened:
        ```java
        tombolReload.doClick();
        ```
   * _jButton_: `tombolTambah`
     * Event on action perform:
        ```java
        FormDetailBarang f = new FormDetailBarang();
        f.setVisible(true);
        ```
   * _jTable_: `tabelBarang`
     * Event on _mouseClicked_:
       ```java
       // membaca nomor baris yang diklik
       Point p = evt.getPoint();
       int row = tabelBarang.rowAtPoint(p);
        
       // ambil kode barang dari baris yang di klik
       String kode = tabelBarang.getModel().getValueAt(row, 0).toString();
        
       // tampilkan kode
       JOptionPane.showMessageDialog(null, kode);
       ```

## Pertemuan 9
1.  Buat file class _Global_ (ganti kata _Global_ jadi _nama Anda_), kode:
    ```java
    package TokoBuku;

    import java.sql.Connection;
    import java.sql.DriverManager;

    public class Global { // Ganti 'Global' jadi nama Anda
        public static final String NAMA = "En Tay";  // ganti jadi nama Anda
        public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
        public static final String DBCONNECTION = "jdbc:mysql://localhost:3306/tokobuku"; // sesuaikan
        public static final String DBUSER = "root"; // sesuaikan
        public static final String DBPASS = ""; // sesuaikan
        
        // fungsi untuk menyederhanakan perintah untuk koneksi ke database.
        // perintah:
        //      Connection conn;
        //      Class.forName(DBDRIVER);
        //      conn = DriverManager.getConnection(DBCONNECTION,DBUSER,DBPASS);
        // menjadi:
        //      Connection conn;
        //      conn = Global.db();
        public static Connection db() {
            try {
                Class.forName(DBDRIVER);
                return DriverManager.getConnection(DBCONNECTION,DBUSER,DBPASS);
            }catch(Exception e) {
                return null;
            }
        }

    }

    ```
4.  Edit `FormDetailBarang`
    *   buat _jButton_: `tombolUpdate`
        *   event on _action perform_:
            ```java
            Connection conn;
            try {                
                conn = Global.db();
                
                // baca data
                String kode = textKode.getText();
                String nama = textNama.getText();
                String jenis = comboJenis.getSelectedItem().toString();
                int harga = Integer.parseInt(textHarga.getText());
                
                // SQL
                String sql = "update barang set nama=?, jenis=?, harga=? where kode=?";
                
                // siapkan statement untuk INSERT
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, nama);
                pst.setString(2, jenis);
                pst.setInt(3, harga);
                pst.setString(4, kode);
                
                // eksekusi SQL
                pst.execute(); 
                
                // hapus objek 
                pst.close();
                conn.close();
                
                // tampilkan pesan
                JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null,e.getMessage().toString());
            } 
            ```
    *   Tambahkan fungsi
        ```java
        public void baca(String kode) {
            tombolUpdate.setVisible(true);
            tombolTambah.setVisible(false);
            Connection conn;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tokobuku","root", "");

                Statement st;
                st = conn.createStatement();
                ResultSet rs;
                rs = st.executeQuery("select * from barang where kode='"+kode+"'");
                if(rs.next()) {
                    textKode.setText(rs.getString("kode"));
                    textNama.setText(rs.getString("nama"));
                }
                st.close();
                rs.close();
                conn.close();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null,"gagal baca");
            } 
        }    

        public void baru() {
            textKode.setText("");
            textNama.setText("");
            comboJenis.setSelectedIndex(0);
            textHarga.setText("0");
            setVisible(true);
            
            tombolUpdate.setVisible(false);
            tombolTambah.setVisible(true);
        }    
        ```
    
5.  Edit `FormBarang`
    *   _jTable_: `tabelBarang`
        *    Edit event on _mouseClicked_:
            ```java
            // membaca nomor baris yang diklik
            Point p = evt.getPoint();
            int row = tabelBarang.rowAtPoint(p);
                
            // ambil kode barang dari baris yang di klik
            String kode = tabelBarang.getModel().getValueAt(row, 0).toString();
                
            // panggil fungsi kode di FormDetailBarang
            FormDetailBarang f = new FormDetailBarang();
            f.baca(kode);
            ```
        *   _jButton_: `tombolTambah`
            *   Edit event on _action perform_:
                ```java
                FormDetailBarang f = new FormBarangDetail();
                f.baru();
                ```