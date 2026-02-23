public class Nilai {
    String nama,npm;
    double nAbsen,nTugas,nUts,nUas;
    double nilaiAkhir;

    void nilai(){
         nilaiAkhir = (0.10 * nAbsen) + (0.20 * nTugas) + (0.30 * nUts) + (0.40 * nUas);
    }
    void cetakNilai(){
        System.out.println("NPM:" + npm);
        System.out.println("Nama:" + nama);
        System.out.println("Nilai absen:" + nAbsen);
        System.out.println("Nilai tugas:" + nTugas);
        System.out.println("Nilai UTS:" + nUts);
        System.out.println("Nilai UAS:" + nUas);
        System.out.println("Nilai Akhir:" + nilaiAkhir);
    }
}
