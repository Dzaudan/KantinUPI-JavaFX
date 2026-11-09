package kelas;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import kelas.controller.daftarController;
import kelas.controller.detailController;
import kelas.controller.formController;
import kelas.data.dataProduk;
import kelas.model.Produk;

public class Navigator {
    private final Stage stage;
    private final dataProduk data;
    private Scene scene;

    public Navigator(Stage stage, dataProduk data) {
        this.stage = stage;
        this.data = data;
    }

    private FXMLLoader loader(String nama) {
        return new FXMLLoader(getClass().getResource("/kelas/" + nama + ".fxml"));
    }

    private void tampil(Parent root) {
        if (scene == null) {
            scene = new Scene(root, 850, 600);
            scene.getStylesheets().add(getClass().getResource("/kelas/styles/app.css").toExternalForm());
            stage.setScene(scene);
            stage.setTitle("Kantin UPI Purwakarta");
            stage.setMinWidth(640);
            stage.setMinHeight(480);
        } else {
            scene.setRoot(root);
        }
        stage.show();
    }

    public void bukaForm() throws IOException {
        FXMLLoader l = loader("form");
        Parent root = l.load();
        formController c = l.getController();
        c.setKonteks(this, data);
        tampil(root);
    }

    public void bukaDaftar() throws IOException {
        FXMLLoader l = loader("daftar");
        Parent root = l.load();
        daftarController c = l.getController();
        c.setKonteks(this, data);
        tampil(root);
    }

    public void bukaDetail(Produk produk) throws IOException {
        FXMLLoader l = loader("detail");
        Parent root = l.load();
        detailController c = l.getController();
        c.setData(this, produk);
        tampil(root);
    }
}