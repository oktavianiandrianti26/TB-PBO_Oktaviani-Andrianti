import java.util.*;

public class Antrian { // Collection Framework
    public static String queue[] = new String[5]; // Mendeklarasikan array untuk menyimpan antrian
    public static int a = 0; // Variabel untuk mengontrol jumlah elemen dalam antrian

    Scanner data = new Scanner(System.in); // Objek Scanner untuk input data

    // Konstruktor Kosong
    public Antrian(int i) {

    }

    // Metode untuk memeriksa apakah antrian masih memiliki kapasitas
    public boolean queueStorage() {
        if (a < queue.length) {
            return true;
        } else {
            return false;
        }
    }

    // Metode untuk membuat antrian dengan menambahkan nama pembeli
    public void CreateQueue() {
        String nama;
        System.out.print("Masukkan Nama Pembeli : ");
        nama = data.nextLine();
        queue[a] = nama; // Menambahkan nama ke dalam antrian
        a++; // Menambah jumlah elemen dalam antrian
    }

    // Metode untuk menghapus elemen pertama dari antrian
    public void removeQueue() {
        a--; // Mengurangi jumlah elemen dalam antrian
        for (int i = 0; i < a; i++) {
            queue[i] = queue[i + 1]; // Menggeser elemen ke posisi sebelumnya
        }
    }

    // Metode untuk menampilkan daftar antrian
    public void displayQue() {
        System.out.println("Daftar Antrian : ");
        for (int i = 0; i < a; i++) {
            System.out.println((i + 1) + ". " + queue[i]); // Menampilkan nomor antrian dan nama pembeli
        }
        System.out.println("");
    }
}
