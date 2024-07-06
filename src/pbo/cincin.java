package pbo;

public class cincin {
    // atribut enkapsulasi
    private String nama;
    private String kodeCincin;

    // constructor
    public cincin(String nama, String kodeCincin) {
        this.nama = nama;
        this.kodeCincin = kodeCincin;
    }

    // mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKodeCincin(String kodeCincin) {
        this.kodeCincin = kodeCincin;
    }

    // accessor (getter)
    public String getNama() {
        return nama;
    }

    public String getKodeCincin() {
        return kodeCincin;
    }

    public String displayInfo() {
        return "Nama: " + getNama() +
                "\nKode Cincin: " + getKodeCincin();
    }

    // polymorphism overloading
    public String displayInfo(String bahan) {
        return displayInfo()+ "\nBahan: "+bahan;
}
}