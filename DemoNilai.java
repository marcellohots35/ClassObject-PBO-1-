public class DemoNilai {
    public static void main(String[] args){
        Nilai n = new Nilai();

        n.npm = "2510631170041";
        n.nama = "Marsel";
        n.nAbsen = 80;
        n.nTugas = 85;
        n.nUts = 90;
        n.nUas = 95;

        n.nilai();
        n.cetakNilai();
    }
}
