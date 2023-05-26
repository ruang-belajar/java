

public class Class3 {
    public static void main(String[] args) {
        Peserta peserta = new Peserta();

        peserta.nama = "Budi";
        peserta.kelas.matkul = "Dudi";
        peserta.kelas.dosen = "Yayuk";

        System.out.println(peserta.nama+" - "+peserta.kelas);
    }
}


class Peserta {
    String nama;
    public static Kelas kelas;
}

class Kelas {
    String matkul;
    String dosen;
}