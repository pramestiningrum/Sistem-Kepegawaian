import nama.String;

public class Karyawan {
    //instance variabel
    private int nik;
    private int gajiPokok;
    private String nama;
    public static int currentNIK = 0;

    private double tunjanganTransportasi;
    private double misc;
    private double pajak;

    public void hitungGaji(){
        int tunjanganTransportasi = (int) 0.05 * gajiPokok;
        int subTotalGaji = gajiPokok + tunjanganTransportasi;
        int pajak = subTotalGaji * (int) 0.25;
        int TotalGajiMinggu = subTotalGaji + pajak;
    }

    // overloading construktor
    public Karyawan( int gajiPokok, String nama) {
        currentNIK++;
        this.nik = currentNIK=0;
        this.gajiPokok = gajiPokok;
        this.nama = nama;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setgajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getNik() {
        return this.nik = nik;
    }

    public String getnama() {
        return this.nama = nama;

    }

    public int getgajiPokok() {
        return this.gajiPokok = gajiPokok;

    }
    public void hitunggaji(){
        int tunjanganTran = (int) 0.05 * gajiPokok;
        int subGaji = gajiPokok + tunjanganTran;
        int pajak = subGaji * (int) 0.025;
        int totalGaji = subGaji - pajak;
    }
}