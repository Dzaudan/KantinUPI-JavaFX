package kelas;

import javafx.application.Application;
import javafx.stage.Stage;
import kelas.data.dataProduk;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        dataProduk data = new dataProduk();
        Navigator navigator = new Navigator(stage, data);
        
        // Membuka halaman tabel daftar produk saat aplikasi di-run
        navigator.bukaDaftar();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
