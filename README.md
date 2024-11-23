# BIODATA
NAMA   : Muhammad Riswan Badali<br>
NPM    : 2210010039<br>
Kelas  : REG PAGI 5B BJB<br>

# UJIAN TENGAH SEMESTER (UTS)
1. Bentuk ujian tengah semester (UTS) adalah pembuatan sebuah aplikasi GUI sederhana.<br>
2. Spesifikasi aplikasi :<br>
    - Dalam pembuatan aplikasinya harus menerapkan konsep pemrograman berorientasi objek.
    - Gunakan berbagai komponen GUI seperti JFrame, JPanel, JTextArea, JList, JButton, dll.
    - Aplikasi harus memiliki kemampuan untuk menambah, mengubah, dan menghapus entri.
    - Pastikan aplikasi Anda memiliki desain yang menarik dan user-friendly.
3. Anda diberikan kebebasan penuh dalam mendesain dan mengembangkan aplikasi, selama memenuhi spesifikasi di atas.
4. Aplikasi dapat dipilih salah satu dari daftar di bawah :
    - Aplikasi agenda pribadi.
    - Aplikasi buku alamat.
    - Aplikasi keuangan pribadi.
    - Aplikasi inventaris barang.
    - Aplikasi catatan harian.
    - Aplikasi resep masakan.
5. Jangan lupa untuk menyertakan dokumentasi atau komentar dalam kode Anda.
6. Anda diperbolehkan untuk menggunakan library eksternal atau framework tambahan jika diperlukan.

# APLIKASI YANG SAYA BUAT
Aplikasi yang saya pilih pada UTS ini adalah membuat Aplikasi Keuangan Pribadi.

# FITUR PADA APLIKASI YANG SAYA BUAT (APLIKASI KEUANGAN PRIBADI)
- Panel input, pengguna dapat melakukan :
  - Pemilihan kategori transaksi (Pengeluaran atau Pemasukan).
  - Menginputkan Nominal yang hanya dapat dimsaukkan berupa angka, jika pengguna mencoba menginputkan huruf maka tidak bisa.
  - Memilih tanggal.
  - Memasukkan keterangan.
  - Ada button Tambah Transaksi, yang mana jika di tekan maka semua yang di inputkan tadi akan masuk ke dalam tabel. Dan juga akan langsung mengosongkan kolom inputan
  - Ada Button Clear untuk membersihkan kolom inputan jika diperlukan.
  - Setiap kolom inputan harus terisi, jika tidak saat button Tambah Transaksi di tekan program tidak akan jalan, dan akan muncul peringatan beserta pesannya.
  - Pada JComboBox pengguna hanya dapat memilih pemasukan atau pengeluaran saja. tidak dapat memilih "~Pilih Kategori Transaksi~".
    
- Panel Filter Data, pengguna dapat melakukan :
  - Memfilter data yang ada pada tabel berdasarkan kategori transaksi yang dapat dipilih melalui jComboBox (pemasukan atau pengeluaran), ketika dipilih maka datanya langsung tampil di tabel.
  - Memfilter data berdasarkan Tanggal yang dapat di pilih melalui jDateChooser, setelah tanggal dipilih maka datanya akan tampil di tabel.
  - Dapat juga di gunakan berbarengan secara langsung, untuk menemukan data yang lebih spesifik.
  - Ada button Clear untuk membersihkan inputan filter data.

- Terdapat satu Tabel untuk menampilakan semua data yang telah di inputkan.
- Ada button Edit untuk mengedit data. dengan cara pilih dahulu salah satu data yang pada tabel setelah itu data secara otomatis masuk ke kolom inputan awal, setelah itu lakukan perubahan lalu tekan button Edit.
  - Jika data tidak ada yang dipilih pada tabel lalu menekan button Edit, maka akan muncul peringatan.
- Ada button Hapus untuk menghapus data. dengan cara pilih dahulu salah satu data yang pada tabel, lalu tekan button Hapus.
  - Jika data tidak ada yang dipilih pada tabel lalu menekan button Hapus, maka akan muncul peringatan.
- Ada button Simpan data, untuk melakukan penyimpana seluruh data yang ada pada tabel, dan kita dapat memilih lokasi simpannya. Jika tabel masih kosong, lalu menekan button Simpan Data maka akan muncul peringatan.
- Ada button Reset Data ketika di tekan muncul peringatan, lalu di lanjutkan dengan konfirmasi "yes" atau "no".
- Ada button Import Data ketika di tekan pengguna dapat memasukkan file yang sesuai dengan format aplikasi yang dibuat, setelah itu muncul konfirmasi "yes" dan "no" beserta isi pesannya.
  - Misalnya untuk mencekak file keuangan pribadi di bulan bulan sebelumnya. yang telah disimpan.
- Terdapat dua panel lagi pada bagian bawah untuk menampilkan total keseluruhan pemasukan dan pengeluaran.

# TAMPILAN APLIKASI YANG DIBUAT (KEUANGAN PRIBADI)
1. Tampilan awal aplikasi.<br>
<img width="567" alt="1" src="https://github.com/user-attachments/assets/3c90600d-93ff-4503-9c88-33182eb23dde"><br>
2. Tampilan ketika menekan button Tambah Transaksi, tetapi inputan belum terisi semua.<br>
   a. kategori transaksi belum di pilih.<br>
      <img width="569" alt="2" src="https://github.com/user-attachments/assets/6c38775f-2952-4d03-abee-44127f971e7d"><br>
   b. Belum mengimputkan nominal.<br>
      <img width="569" alt="image" src="https://github.com/user-attachments/assets/76b35a11-243b-43f7-8a57-afb1a4d4158f"><br>
   c. 
