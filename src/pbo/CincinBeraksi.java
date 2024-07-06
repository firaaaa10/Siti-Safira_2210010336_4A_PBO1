package pbo;
import java.util.Scanner;

public class CincinBeraksi {
    public static void main(String[] args) {
        // io sederhana
        try {
            Scanner scanner = new Scanner(System.in);

            // array
            CincinDetail[] cincin = new CincinDetail[2];

            for (int i = 0; i < cincin.length; i++) {
                System.out.print("Masukkan nama cincin " + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan kode cincin " + (i + 1) + ": ");
                String kodeCincin = scanner.nextLine();

                // objek
                cincin[i] = new CincinDetail(nama, kodeCincin);
            }

            for (CincinDetail data : cincin) {
                System.out.println("============");
                System.out.println("Data Cincin: ");
                System.out.println(data.displayInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor" + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode cincin: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum" + e.getMessage());
}
}
}
 
 


