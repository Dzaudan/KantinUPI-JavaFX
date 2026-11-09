package kelas.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import kelas.model.Produk;

public class dataProduk {
    private final ObservableList<Produk> daftar = FXCollections.observableArrayList();
    private int urutan = 1;

    // Constructor: Menambahkan 5 data awal menu Kantin UPI Purwakarta
    public dataProduk() {
        tambah("Baso", "Makanan", 10000);
        tambah("Mie Ayam", "Makanan", 8000);
        tambah("Batagor", "Makanan", 7000);
        tambah("Nutrisari", "Minuman", 5000);
        tambah("Air Mineral", "Minuman", 5000);
    }

    public ObservableList<Produk> getDaftar() {
        return FXCollections.unmodifiableObservableList(daftar);
    }

    public Produk tambah(String nama, String kategori, double harga) {
        String kode = String.format("PRD%03d", urutan);
        Produk p = new Produk(kode, nama, kategori, harga);
        daftar.add(p);
        urutan++;
        return p;
    }
}