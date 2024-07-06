package pbo;

public class CincinDetail extends cincin {
    // constructor
    public CincinDetail(String nama, String kodeCincin) {
        super(nama, kodeCincin);
    }

    public int getBerat() {
        return Integer.parseInt(getKodeCincin().substring(0, 2));
    }

    public String getJenisBatu() {
        String kodeBatu = getKodeCincin().substring(2, 4);
        // seleksi if
        if (kodeBatu.equals("01")) {
            return "Berlian";
        } else if (kodeBatu.equals("02")) {
            return "Shappire";
        } else if (kodeBatu.equals("03")) {
            return "Topaz";
        } else if (kodeBatu.equals("04")) {
            return "Giok";
        } else {
            return "Jenis Batu Lainnya";
        }
    }
    
    public String getModelBatu() {
        String kodeBatu = getKodeCincin().substring(4, 5);
        // seleksi if
        if (kodeBatu.equals("a")) {
            return "round cut";
        } else if (kodeBatu.equals("b")) {
            return "flawless precious stone";
        } else if (kodeBatu.equals("c")) {
            return "peony";
        } else if (kodeBatu.equals("d")) {
            return "emerald cut";
        } else {
            return "Model Batu Lainnya";
        }
    }

    public String getBentukCincin() {
        String kodeBatu = getKodeCincin().substring(5, 6);
        // seleksi if
        if (kodeBatu.equals("1")) {
            return "Tension Setting Ring";
        } else if (kodeBatu.equals("2")) {
            return "Tension Style Setting Ring";
        } else if (kodeBatu.equals("3")) {
            return "Channel Setting Ring";
        } else if (kodeBatu.equals("4")) {
            return "Pave Setting Ring";
        } else {
            return "Bentuk Batu Lainnya";
        }
    }
    public String getUkuran() {
        String kodeUkuran = getKodeCincin().substring(6, 7);
        // seleksi switch
        switch (kodeUkuran) {
            case "e":
                return "19,8 mm";
            case "f":
                return "20,6 mm";
            case "g":
                return "21,4 mm";
            case "h":
                return "22,2 mm";
            default:
                return "Ukuran Lain";
        }
    }

    public int getHarga() {
        return Integer.parseInt(getKodeCincin().substring(7,9));
    }

    // polymorphism overriding
    @Override
    public String displayInfo() {
        return super.displayInfo() +
                "\nBerat: " + getBerat() +
                "\nJenis Batu: " + getJenisBatu() +
                "\nModel: "+ getModelBatu()+
                "\nBentuk: "+ getBentukCincin()+
                "\nUkuran: " + getUkuran() +
                "\nHarga: " + getHarga();
}
}
 
 
