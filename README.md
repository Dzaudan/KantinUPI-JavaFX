Tugas Mata Kuliah Pemrograman Lanjut
Nama : Muhammad Dzaudan Arsyal Al-Haqqi
Kelas/NIM : 3A/2508294 
Dosen Pengampu: Liptia Venica, S.T., M.T.
Program Studi: Mekatronika dan Kecerdasan Buatan
Institusi: UPI Kampus Purwakarta

Aplikasi Pencatatan Menu Kantin UPI Purwakarta
  Aplikasi Pencatatan Menu Kantin UPI Purwakarta adalah aplikasi desktop berbasis JavaFX yang 
dirancang untuk membantu pengelolaan data produk atau menu makanan dan minuman di lingkungan kantin kampus. 

Fitur
1. Pre-loaded Data Menu Awal
   Saat aplikasi pertama kali dijalankan, sistem secara otomatis memuat 5 data produk awal kantin
   (Baso, Mie Ayam, Batagor, Nutrisari, dan Air Mineral) tanpa perlu menginput dari nol.
      Tampilan
      <img width="1365" height="717" alt="Screenshot 2026-11-09 225246" src="https://github.com/user-attachments/assets/7cf35a59-d6fc-44d2-bb53-75285a4d27bd" />
2. Tabel Daftar Produk & Menu
   Menampilkan seluruh daftar menu kantin dalam bentuk TableView yang rapi lengkap dengan
   Kode Produk otomatis (PRD001, PRD002, dst.), Nama, Kategori (Makanan/Minuman), dan Harga.
   <img width="1364" height="597" alt="Screenshot 2026-11-09 225419" src="https://github.com/user-attachments/assets/9292c95a-b955-40fa-98cb-3cb7307ad7f7" />

4. Pencarian Menu Interaktif
   Pengguna dapat mencari produk berdasarkan nama menu secara spesifik melalui tombol Cari.
    TAMPILAN
   <img width="1360" height="710" alt="Screenshot 2026-11-09 225434" src="https://github.com/user-attachments/assets/3e804b9e-efb9-4b59-8bba-d58d73f6cc6f" />

5. Form Input & Validasi Data
   Fasilitas penambahan menu baru yang dilengkapi dengan sistem validasi:
   - Nama produk tidak boleh kosong.
   - Harga wajib bernilai numerik positif (> 0).
   - Menampilkan pesan kesalahan (error message) secara langsung jika input tidak sesuai
  <img width="1363" height="708" alt="Screenshot 2026-11-09 225409" src="https://github.com/user-attachments/assets/bf56bda1-72fe-4b61-b7c4-141518ba2797" />

6. Halaman Detail Produk
   Menampilkan rincian informasi lengkap dari produk yang dipilih pada tabel,
   termasuk format tampilan harga dalam konversi mata uang Rupiah (Rp).

   <img width="1365" height="717" alt="Screenshot 2026-11-09 225301" src="https://github.com/user-attachments/assets/7164110d-03c8-4ad6-abed-6bf9ec924d66" />

7. Navigasi Satu Jendela (Single Window Navigation)
   Perpindahan antar halaman (Daftar, Form Input, dan Detail) berjalan mulus dalam satu jendela tanpa membuat popup atau window baru


   Teknologi yang Digunakan
- Bahasa Pemrograman: Java (JDK 17+)
- GUI Framework: JavaFX 21 (OpenJFX)
- Build Tool & Dependency Manager: Apache Maven  
- UI Layout & Styling: FXML + Cascading Style Sheets (CSS)
- IDE: Apache NetBeans

Cara Kerja Sistem

1. Model : Menyimpan atribut produk dengan enkapsulasi dan aturan validasi data.
2. Data Store : Berfungsi sebagai penyimpan data sementara di RAM menggunakan ObservableList.
                Class ini juga yang memuat 5 data awal Kantin UPI Purwakarta dan mengenerate kode produk otomatis.
3. View : Menentukan tata letak visual (layout) UI berbasis XML dan dekorasi tampilan melalui CSS.
4. Controller : Mengubungkan logika JavaFX dengan data model, membaca input user dari TextField/ComboBox, serta mengendalikan aksi tombol.
5. Navigator : Mengatur proses pemuatan FXML (loader) dan mengganti root dari Scene yang sedang aktif tanpa membuat Stage baru.








