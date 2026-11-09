package kelas.controller;

import java.io.IOException;
import java.util.Locale;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import kelas.Navigator;
import kelas.data.dataProduk;
import kelas.model.Produk;

public class daftarController {
    @FXML private TableView<Produk> tabel;
    @FXML private TableColumn<Produk, String> kodeCol;
    @FXML private TableColumn<Produk, String> namaCol;
    @FXML private TableColumn<Produk, String> kategoriCol;
    @FXML private TableColumn<Produk, Double> hargaCol;
    @FXML private TextField cariField;
    @FXML private Label pesanLabel;

    private Navigator navigator;
    private dataProduk data;
    private final ObservableList<Produk> dataTampilan = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        kodeCol.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getKode()));
        namaCol.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getNama()));
        kategoriCol.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getKategori()));
        hargaCol.setCellValueFactory(cell -> new javafx.beans.property.SimpleObjectProperty<>(cell.getValue().getHarga()));

        tabel.setItems(dataTampilan);
        tabel.setPlaceholder(new Label("Belum ada produk yang sesuai."));
    }

    public void setKonteks(Navigator navigator, dataProduk data) {
        this.navigator = navigator;
        this.data = data;
        cari();
    }

    @FXML
    private void cari() {
        if (data == null) return;
        dataTampilan.clear();
        String kata = cariField.getText().trim().toLowerCase(Locale.ROOT);

        for (Produk p : data.getDaftar()) {
            if (kata.isEmpty() || p.getNama().toLowerCase(Locale.ROOT).contains(kata)) {
                dataTampilan.add(p);
            }
        }
        pesanLabel.setText("Jumlah produk ditemukan: " + dataTampilan.size());
    }

    @FXML
    private void tambah() {
        try {
            navigator.bukaForm();
        } catch (IOException e) {
            pesanLabel.setText("Gagal membuka form.");
        }
    }

    @FXML
    private void detail() {
        Produk terpilih = tabel.getSelectionModel().getSelectedItem();
        if (terpilih == null) {
            pesanLabel.setText("Pilih satu produk pada tabel terlebih dahulu.");
            return;
        }
        try {
            navigator.bukaDetail(terpilih);
        } catch (IOException e) {
            pesanLabel.setText("Gagal membuka detail.");
        }
    }
}