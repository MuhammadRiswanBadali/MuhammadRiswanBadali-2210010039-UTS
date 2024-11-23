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
- Ada button Simpan data, untuk melakukan penyimpana seluruh data yang ada pada tabel, dan pengguna dapat memilih lokasi simpannya. Jika tabel masih kosong, lalu menekan button Simpan Data maka akan muncul peringatan.
- Ada button Reset Data ketika di tekan muncul peringatan, lalu di lanjutkan dengan konfirmasi "yes" atau "no".
- Ada button Import Data ketika di tekan pengguna dapat memasukkan file yang sesuai dengan format aplikasi yang dibuat, setelah itu muncul konfirmasi "yes" dan "no" beserta isi pesannya.
  - Misalnya untuk mencekak file keuangan pribadi di bulan bulan sebelumnya. yang telah disimpan.
- Terdapat dua panel lagi pada bagian bawah untuk menampilkan total keseluruhan pemasukan dan pengeluaran.

# TAMPILAN APLIKASI YANG DIBUAT (KEUANGAN PRIBADI)
1. Tampilan awal aplikasi.<br>
   <img width="567" alt="1" src="https://github.com/user-attachments/assets/3c90600d-93ff-4503-9c88-33182eb23dde"><br>
<br>
2. Tampilan ketika menekan button Tambah Transaksi, tetapi inputan belum terisi semua :<br>
    - kategori transaksi belum di pilih<br>
      - <img width="569" alt="2" src="https://github.com/user-attachments/assets/6c38775f-2952-4d03-abee-44127f971e7d"><br>
    - Belum menginputkan nominal<br>
      - <img width="569" alt="image" src="https://github.com/user-attachments/assets/76b35a11-243b-43f7-8a57-afb1a4d4158f"><br>
    - Belum menginputkan tanggal<br>
      - <img width="565" alt="image" src="https://github.com/user-attachments/assets/090f5c24-e979-44e7-b8ec-10bea753de25"><br>
    - Belum menginputkan kategori<br>
      - <img width="566" alt="image" src="https://github.com/user-attachments/assets/dc3dcdfe-7bbf-48ad-bae4-f671f40f6fe6"><br>
<br>
3. Tampilan ketika semua inputan terisi, lalu menekan button Tambah Transaksi<br>
   <img width="566" alt="image" src="https://github.com/user-attachments/assets/8f2f187a-9b08-4182-a47c-910a6a82d4ab"><br>
<br>
4. Semua data yang di inputkan tadi secara otomastis masuk ke tabel dan kolom inputan secara otomatis menjadi kosong. Untuk total keseluruhan pemasukan juga masuk ke panel pemasukan<br>
   <img width="569" alt="image" src="https://github.com/user-attachments/assets/2a590733-3b2c-4d6a-888e-31df1641d7d1"><br>
<br>
5. Menginputkan dengan kategori transaksi pengeluaran<br>
   <img width="568" alt="image" src="https://github.com/user-attachments/assets/3a75e343-e84c-4645-a62e-156699b6d1f5"><br>
<br>
6. Ketika pengguna menekan salah satu data yang ada pada tabel, maka data secara otomatis mengisi ke kolom inputan. dan jika ingin mengosongkan kolom inputan cukup tekan button Clear saja<br>
   <img width="564" alt="image" src="https://github.com/user-attachments/assets/9447be93-41a8-4736-9e81-69890bdf7774"><br>
<br>
7. Dibagian panel Filter Data, pengguna dapat mencari data berdasarkan :<br>
   a. Data sebelum di filter<br>
       <img width="567" alt="image" src="https://github.com/user-attachments/assets/04ebd929-7457-4abf-ab44-15ec8e9a4a9d"><br>
   b. Mencari berdasarkan kategori Transaksi Pemasukan<br>
       <img width="568" alt="image" src="https://github.com/user-attachments/assets/305f4a25-6f6e-4ce1-83ec-063dd09e843a"><br>
   c. Mencari berdasarkan kategori Transaksi Pengeluaran<br>
       <img width="566" alt="image" src="https://github.com/user-attachments/assets/7bb0551e-9ded-4c81-b0ce-b73d077b514d"><br>
   d. Mencari berdasarkan tanggal yang dipilih<br>
       <img width="569" alt="image" src="https://github.com/user-attachments/assets/302fe82b-a723-46d0-9251-924a67030346"><br>
       <img width="567" alt="image" src="https://github.com/user-attachments/assets/c02a8b90-0a91-4b7e-a34a-132e895a4ebd"><br>
   e. untuk mencari data yang lebih spesifik bisa gunakan keduanya berdasarkan kategori dan tanggal<br>
       <img width="566" alt="image" src="https://github.com/user-attachments/assets/d0024ece-9d3d-4bb8-9b9d-5afb14e4c8bb"><br>
   f. Gunakan button Clear pada panel Filter Data untuk mengosongkan kolom inputan filter data. dan data di tampilkan keseluruhan kembali pada tabel<br>
<br>
8. Button Edit<br>
   a. Menekan button Edit tapi belum memilih data yang ada pada tabel<br>
       <img width="564" alt="image" src="https://github.com/user-attachments/assets/87d4fefd-9948-4f11-8cb7-3e538eeaff1d"><br>
   b. Menekan salah satu data yang ada pada tabel, maka data akan mengisi kolom inputan secara otomatis dan lakukan perubahan yang pengguna inginkan lalu tekan button Edit<br>
      - Data awal<br>
        <img width="569" alt="image" src="https://github.com/user-attachments/assets/d9b0a57f-1ddc-46d6-9811-b6f7f4202add"><br>
      - Konfirmasih setelah menekan button edit<br>
        <img width="212" alt="image" src="https://github.com/user-attachments/assets/1eabe786-9d0d-4dec-856c-db64152a6e0f"><br>
        <img width="195" alt="image" src="https://github.com/user-attachments/assets/c0beb9f4-798f-415c-9639-6bfcae216e5d"><br>
      - Data setelah di edit, total pengeluaran pada panel yang dibawah juga diperbaharui<br>
        <img width="569" alt="image" src="https://github.com/user-attachments/assets/e7a13bdc-6453-400b-8777-d5b11ea38d3d"><br>
<br>
9. Button Hapus<br>
   a. Menekan button Hapus tapi belum memilih data yang ada pada tabel<br>
       <img width="565" alt="image" src="https://github.com/user-attachments/assets/d5dc8a59-6596-465f-962e-a39825d85591"><br>
   b. Menekan salah satu data yang ingin di hapus pada tabel, lalu tekan button Hapus<br>
       - Konfirmasi setelah menekan button Hapus<br>
         <img width="224" alt="image" src="https://github.com/user-attachments/assets/158fffcc-b450-42b3-9d1a-218bdc90074f"><br>
         <img width="203" alt="image" src="https://github.com/user-attachments/assets/5df7554e-e592-4808-9bcd-6a0e367e66ba"><br>
       - Data yang di hapus sudah tidak ada dalam tabel, dan total pengeluaran pada panel yang ada di bawah secara langsung terupdate<br>
         <img width="563" alt="image" src="https://github.com/user-attachments/assets/afb76960-aba5-4bc1-8bbd-029393813416"><br>
<br>
10. Menekan button Simpan Data, dan pengguna dapat langsung memilih sendiri lokasi menyimpan file data<br>
    <img width="219" alt="image" src="https://github.com/user-attachments/assets/27800c84-263d-48a4-8c13-0524f8d1fcea"><br>
    - Isi dari file yang di hasilkan<br>
      <img width="691" alt="image" src="https://github.com/user-attachments/assets/f1545b98-ae6c-4baa-9bd8-4df1f1c95806"><br>
<br>
11. Menekan button Reset Data, Pengguna akan di berikan peringatan terlebih dahulu dan dilanjutkan dengan konfirmasi dengan pilihan "yes" dan "no"<br>
    <img width="567" alt="image" src="https://github.com/user-attachments/assets/c6deae90-6ce9-4c9a-95ab-c39875674237"><br>
    <img width="231" alt="image" src="https://github.com/user-attachments/assets/090d9033-016f-45fb-9ce0-54c0b041b373"><br>
    <img width="203" alt="image" src="https://github.com/user-attachments/assets/33b1609b-18cd-4126-9f44-a8770409c95c"><br>
    - Setelah memilih pilihan "yes" maka semua data akan terhapus<br>
      <img width="566" alt="image" src="https://github.com/user-attachments/assets/8716db2d-b1dd-4c25-b9d9-75bff9bb903b"><br>
<br>
12. Menekan button Import Data, lalu pilih file data yang kita mau import<br>
    <img width="566" alt="image" src="https://github.com/user-attachments/assets/39dfc33e-93ea-43b9-a250-cddb45bc7228"><br>
    - Muncul Konfirmasi<br>
      <img width="605" alt="image" src="https://github.com/user-attachments/assets/268e96ff-b9ce-4b2f-9033-0f4560fdcdd9"><br>
    - Muncul informasi data yang kita import berhasil<br>
      <img width="566" alt="image" src="https://github.com/user-attachments/assets/46025300-60da-4fab-a62f-15dab30b4a64">
      <img width="567" alt="image" src="https://github.com/user-attachments/assets/5b198f93-8500-4ee2-9fd2-822a3e63304c">
