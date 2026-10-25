Nama: Daffa Surya Atmaja
NPM: 2410010334

------------------------------------------------------------------------

## 1. Peta Event Form Anggota Perpustakaan

  ---------------------------------------------------------------------------
  Komponen           Menu Events       Event                Aksi
  ------------------ ----------------- -------------------- -----------------
  Kotak centang      Item              `itemStateChanged`   Tombol Daftar
  persetujuan                                               hanya aktif jika
  (`setujuCheck`)                                           kotak dicentang.

  Tombol Batal       Action            `actionPerformed`    Mengosongkan
  (`batalButton`)                                           seluruh isian dan
                                                            mengembalikan
                                                            fokus ke NPM.

  Tombol Daftar      Action            `actionPerformed`    Menampilkan
  (`daftarButton`)                                          ringkasan data
                                                            anggota
                                                            menggunakan
                                                            `JOptionPane`.

  Isian NPM          Key               `keyReleased`        Memperbarui label
  (`npmField`)                                              jumlah digit NPM,
                                                            misalnya "8 dari
                                                            10 digit".

  Form JFrame        Window            `windowClosing`      Meminta
                                                            konfirmasi
                                                            sebelum aplikasi
                                                            ditutup.
  ---------------------------------------------------------------------------

**Pengaturan form:** `defaultCloseOperation` diatur ke
`DO_NOTHING_ON_CLOSE`, dan tombol Daftar dibuat tidak aktif (`enabled`
tidak dicentang) saat form pertama kali dibuka.

------------------------------------------------------------------------

## 2. Tabel Pengamatan Praktikum 2 --- Mengamati Event

  --------------------------------------------------------------------------
                           No. Tindakan              Event yang tercatat
  ---------------------------- --------------------- -----------------------
                             1 Arahkan kursor ke     `MouseEvent` --- kursor
                               tombol, lalu jauhkan. masuk ke tombol
                                                     (`mouseEntered`), lalu
                                                     kursor keluar dari
                                                     tombol (`mouseExited`).

                             2 Klik tombol "Klik     `ActionEvent` ---
                               saya".                tombol diklik
                                                     (`actionPerformed`).

                             3 Centang lalu hapus    `ItemEvent` --- kotak
                               centang "Aktifkan     dicentang, lalu centang
                               fitur".               dihapus
                                                     (`itemStateChanged`).

                             4 Ganti pilihan dari    `ItemEvent` --- pilihan
                               Pagi menjadi Malam.   baru "Malam" dipilih.
                                                     Dengan pemeriksaan
                                                     `ItemEvent.SELECTED`,
                                                     pencatatan dilakukan
                                                     untuk pilihan yang
                                                     dipilih, bukan pilihan
                                                     lama yang dibatalkan.

                             5 Klik isian, lalu      `FocusEvent` --- isian
                               ketik kata "abc".     mendapat fokus;
                                                     `KeyEvent` --- karakter
                                                     `a`, `b`, dan `c`
                                                     diketik.

                             6 Klik tombol setelah   `FocusEvent` --- isian
                               mengetik di isian.    kehilangan fokus
                                                     (`focusLost`). Klik
                                                     tombol juga dapat
                                                     menghasilkan
                                                     `MouseEvent`
                                                     masuk/keluar dan
                                                     `ActionEvent` jika
                                                     tombol tersebut
                                                     memiliki handler aksi.
  --------------------------------------------------------------------------

------------------------------------------------------------------------

## 3. Jawaban Eksperimen Praktikum 3 --- Konversi Suhu

### Eksperimen 1

**Pertanyaan:** Hapus pemeriksaan if (evt.getStateChange() == ItemEvent.SELECTED) dan tambahkan
System.out.println("item berubah"); di dalam event handler. Berapa kali pesan tercetak setiap
pilihan diganti?

**Jawaban:** Pesan tercetak **dua kali** setiap pilihan diganti.
`itemStateChanged` dipanggil untuk pilihan lama yang berstatus
`DESELECTED` dan pilihan baru yang berstatus `SELECTED`. Pemeriksaan
`ItemEvent.SELECTED` membatasi aksi agar dijalankan hanya untuk pilihan
baru.

### Eksperimen 2

**Pertanyaan:** Di jendela Properties bagian Events, kosongkan event keyReleased pada celsiusField, lalu buat event
keyPressed yang memanggil konversi(). Mengapa hasil yang tampil terlambat satu karakter?

**Jawaban:** `keyPressed` terjadi ketika tombol baru ditekan, sebelum
karakter tersebut masuk ke teks pada field. Karena itu, saat
`konversi()` membaca isi field, karakter yang baru ditekan belum
tersedia. `keyReleased` terjadi setelah karakter diproses sehingga isi
field sudah diperbarui.

### Eksperimen 3

**Pertanyaan:** Hapus blok try dan catch di method konversi, lalu ketik huruf pada isian. Apa yang muncul di jendela
Output?

**Jawaban:** Program menghasilkan exception `NumberFormatException`
ketika teks huruf dikonversi menggunakan `Double.parseDouble()`.
Exception terlihat di jendela Output dan konversi tidak dapat
dilanjutkan untuk input tersebut. Blok `try-catch` digunakan agar input
yang bukan angka ditangani dan pesan yang sesuai dapat ditampilkan pada
label hasil.

------------------------------------------------------------------------

## 4. Jawaban Eksperimen Praktikum 4 --- Kalkulator Sederhana

### Eksperimen 1

**Pertanyaan:** Buat event actionPerformed untuk kaliButton melalui Events tanpa menghapus lambda di konstruktor, lalu
tambahkan System.out.println("kali"); di kedua tempat. Berapa kali pesan tercetak? Mengapa satu
tombol sebaiknya hanya memakai satu cara?

**Jawaban:** Pesan tercetak **dua kali** saat tombol diklik karena ada
dua listener yang menjalankan aksi yang sama: listener dari GUI Builder
dan lambda di konstruktor. Satu tombol sebaiknya hanya menggunakan satu
cara untuk mencegah aksi ganda, hasil ganda, atau efek samping yang
tidak diinginkan.

### Eksperimen 2

**Pertanyaan:** Tambahkan tombol % untuk sisa bagi (modulus). Apa saja yang diubah di tab Design dan di tab Source?

**Jawaban:** - **Design:** Tambahkan tombol `%` pada `operatorPanel` dan
atur layout agar tersedia lima tombol operator, bukan empat. -
**Source:** Tambahkan handler untuk tombol `%` atau listener yang
memanggil method hitung dengan operator modulus, misalnya `hitung('%')`.
Tambahkan penanganan operator `%` pada logika perhitungan, misalnya
menggunakan `a % b`, serta pastikan tampilan hasil tetap sesuai. Jika
diperlukan, tangani kasus pembagi nol agar perilakunya jelas.

### Eksperimen 3

**Pertanyaan:** Tekan tombol Hapus. Mengapa kursor langsung berada di isian pertama?

**Jawaban:** Karena method `hapus()` mengosongkan kedua field, mengatur
label hasil menjadi "Hasil: 0", lalu memanggil
`angka1Field.requestFocusInWindow()`. Pemanggilan tersebut meminta fokus
keyboard kembali ke field angka pertama agar pengguna dapat langsung
memasukkan angka baru.

------------------------------------------------------------------------

## 5. Pertanyaan Refleksi

1. Jelaskan peran sumber event, object event, dan listener dengan contoh dari kode.
Jawaban: Sumber event adalah komponen pemicu, misalnya klikButton. Object event berisi informasi kejadian, seperti ActionEvent. Listener menangani kejadian melalui klikButtonActionPerformed().
2. Mengapa KeyListener tidak dapat ditulis dengan lambda, dan bagaimana NetBeans mengatasinya?
Jawaban: Karena KeyListener memiliki tiga method abstrak. NetBeans menggunakan KeyAdapter agar cukup mengimplementasikan event yang dipilih, seperti keyReleased.
3. Apa keuntungan memisahkan KonverterSuhu dari form KonversiSuhu?
Jawaban: Logika konversi lebih mudah diuji, dipelihara, dan digunakan kembali karena terpisah dari tampilan.
4. Mengapa itemStateChanged perlu memeriksa ItemEvent.SELECTED?
Jawaban: Agar aksi hanya dijalankan saat pilihan baru dipilih, bukan saat pilihan lama dibatalkan.
5. Kapan memakai event handler GUI Builder, lambda, atau method reference?
Jawaban: GUI Builder untuk event pada form, lambda untuk aksi singkat, dan method reference untuk memanggil method yang sudah tersedia.