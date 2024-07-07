# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Cincin menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan kodecincin dan memberikan output berupa informasi detail dari Berat, Jenis Batu, Model Batu, Bentuk Cincin, Ukuran, dan Harga
Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Cincin`, `CincinDetail`, dan `CincinBeraksi` adalah contoh dari class.
   
```bash
public class cincin {
    ...
}

public class CincinDetail extends Mahasiswa {
    ...
}

public class CincinBeraksi {
    ...
}
```
2. **Object** adalah instance dari class. Pada kode ini, `cincin[i] = new CincinDetail(nama, KodeCincin);` adalah contoh pembuatan object.

```bash
cincin[i] = new CincinDetail(nama, kodeCincin);
```
3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `KodeCincin` adalah contoh atribut.

```bash
String nama;
String kodeCincin;
```
4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Cincin` dan `CincinDetail`.

```bash
public cincin(String nama, String kodeCincin) {
        this.nama = nama;
        this.kodeCincin = kodeCincin;
}
public CincinDetail(String nama, String kodeCincin) {
        super(nama, kodeCincin);
}
```
5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setKodeCincin` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setKodeCincin(String kodeCincin) {
        this.kodeCincin = kodeCincin;
}
```
6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, dan `getkodeCincin` adalah contoh method accessor.

```bash
public void setNama(String nama) {
        this.nama = nama;
}

public void setKodeCincin(String kodeCincin) {
        this.kodeCincin = kodeCincin;
}
```
7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `kodeCincin` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private String kodeCincin;
```
8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `CincinDetail` mewarisi `Cincin` dengan sintaks `extends`.

```bash
public class CincinDetail extends cincin {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Cincin` merupakan overloading method `displayInfo` dan `displayInfo` di `CincinDetail` merupakan override dari method `displayInfo` di `Cincin`.

```bash
public String displayInfo() {
        return "Nama: " + getNama() +
                "\nKode Cincin: " + getKodeCincin();
}

// polymorphism overloading
public String displayInfo(String bahan) {
        return displayInfo()+ "\nBahan: "+bahan;
}
}

@Override
    public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJenisBatu`,`getModelBatu` dan`getBentukCincin` dan seleksi `switch` dalam method `getUkuran`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < cincin.length; i++)  {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama cincin " + (i + 1) + ": ");
String nama = scanner.nextLine();
System.out.print("Masukkan kode cincin " + (i + 1) + ": ");
String kodeCincin = scanner.nextLine();

System.out.println("============");
System.out.println("Data Cincin: ");
System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `CincinDetail[] cincin = new CincinDetail[2];` adalah contoh penggunaan array.

```bash
CincinDetail[] cincin = new CincinDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
} catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor" + e.getMessage());
} catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode cincin: " + e.getMessage());
} catch (Exception e) {
            System.out.println("Kesalahan umum" + e.getMessage());
}
```
## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Siti Safira
NPM: 2110010336
