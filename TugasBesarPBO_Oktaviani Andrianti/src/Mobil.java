import java.util.Scanner; 
import java.sql.*; //semua sintak sql di java akan dimasukkan, krn kita sudah memanggil dgn simbol bintang
import java.io.*;

public class Mobil implements Showroom { 
    static Connection con; //menghubungkan ke database 
    String url = "jdbc:mysql://localhost:3306/showroom"; 
    String merk, tipe, status; //deklarasi variabel
    Integer id, harga;
    Scanner input = new Scanner(System.in); //menerima input

    // Konstruktor
    public Mobil(Integer id, String merk, String tipe, Integer harga, String status) {
        this.id = id;
        this.merk = merk;
        this.tipe = tipe;
        this.harga = harga;
        this.status = status;
    }

    // Metode untuk memasukkan ID Mobil
    @Override
    public void idMobil() {
        System.out.print("Masukkan ID Mobil\t:");
        id = input.nextInt();
    }

    // Metode untuk memasukkan Merk Mobil
    @Override
    public void merkMobil() {
        System.out.print("Masukkan Merk Mobil\t:");
        merk = input.next();
    }

    // Metode untuk memasukkan Tipe Mobil
    @Override
    public void tipeMobil() {
        System.out.print("Masukkan Tipe Mobil\t:");
        tipe = input.next();
    }

    // Metode untuk memasukkan Harga Mobil
    @Override
    public void Harga() {
        System.out.print("Masukkan Harga Mobil\t:");
        harga = input.nextInt();
    }

    // Metode untuk memasukkan Status Mobil
    @Override
    public void statusMobil() {
        System.out.print("Status mobil saat ini\t:");
        status = input.next();
    }

    // Metode abstrak yang diimplementasikan dari antarmuka Showroom
    @Override
    public void totalharga() {
        // Implementasi diserahkan ke kelas yang mengimplementasikan interface
    }

    // Metode abstrak yang diimplementasikan dari antarmuka Showroom
    @Override
    public void pelanggan() {
        // Implementasi diserahkan ke kelas yang mengimplementasikan interface
    }

    // Metode untuk memasukkan data mobil ke dalam database
    public void InsertDbMobil() throws SQLException { //apabila terjadi kesalahan input nilai ke dalam database  maka akan keluar peringatan
        String sql = "INSERT INTO data_mobil (id_mobil, merk, tipe, harga, status) VALUES ('" + id + "', '" + merk + "','" + tipe + "','" + harga + "','" + status + "')";
        con = DriverManager.getConnection(url, "root", ""); //merupakan penyambungan kedatabasenya
        Statement statement = con.createStatement();
        statement.execute(sql); //apabila berhasil di execute maka akan muncul pesan 
        System.out.println("\nDATA BERHASIL DIINPUT !!!");
    }
}
