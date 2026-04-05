package DataMahasiswa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class urutanMhs implements Comparable <urutanMhs> {
    String nama;
    int nilai;

    public urutanMhs(String nama, int nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    @Override 
    public int compareTo(urutanMhs a) {
        return a.nilai - this.nilai;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList <urutanMhs> anjay = new ArrayList <>();
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumlah = input.nextInt();
        input.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = input.nextLine();


            System.out.print("Masukkan Nilai Mahasiswa: ");
            int nilai = input.nextInt();
            input.nextLine();
            anjay.add(new urutanMhs(nama, nilai));
        }

        Collections.sort(anjay);

        

        System.out.println("\nDATA MAHASISWA");
        int total = 0;

        for (urutanMhs a : anjay) {
            System.out.println(a.nama + " - " + a.nilai);
            total += a.nilai;
        }

        double ratarata = (double) total / anjay.size();
        System.out.println("Rata - Rata: " + ratarata);

        System.out.println("Nilai tertinggi: " + anjay.get(0).nilai);
    }

}