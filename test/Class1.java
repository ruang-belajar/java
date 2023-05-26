

public class Class1 {
    public static void main(String[] args) {
        Mahasiswa peserta = new Mahasiswa();

        peserta.nama = "Budi";
        peserta.jurusan = "Dudi";

        System.out.println(peserta.nama+" - "+peserta.jurusan);
    }
}


class Mahasiswa {
    String nama;
    String jurusan;
}