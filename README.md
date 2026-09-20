# UJIAN TENGAH SEMESTER 

## PEMOGRAMAN BERORIENTASI OBJEK

### Sistem Manajemen Penitipan Hewan Peliharaan

Nama : Zahra Maysita

NIM : 2509116015

Kelas : A'2025



## Penjelasan Studi Kasus

Studi kasus yang dipilih dalam program ini adalah Sistem Manajemen Penitipan Hewan. Studi kasus ini dipilih karena proses penitipan hewan membutuhkan pencatatan data yang teratur, baik data hewan maupun data penitipannya. Program ini dibuat untuk membantu pengguna dalam mengelola data tersebut melalui sistem berbasis console.

Pada program ini, pengguna dapat mencatat data hewan yang dititipkan, seperti ID hewan, nama hewan, nama pemilik, jenis hewan, dan ras. Pengguna juga dapat mencatat data penitipan yang meliputi ID penitipan, ID hewan, tanggal masuk, lama penitipan, dan status penitipan. Data yang sudah tersimpan dapat ditampilkan, dicari, diubah, maupun dihapus sesuai kebutuhan.

# BAB I PENDAHULUAN

## 1.1 Deskripsi Program

Sistem Penitipan Hewan Peliharaan merupakan program berbasis console yang dibuat untuk membantu mengelola data hewan dan data penitipan hewan. Program ini dapat digunakan untuk mencatat informasi hewan seperti ID hewan, nama hewan, nama pemilik, serta jenis dan ras hewan. Program juga menyediakan pengelolaan data penitipan seperti ID penitipan, ID hewan, tanggal masuk, lama penitipan, dan status penitipan.

Program ini memiliki beberapa fitur utama, yaitu menambah, menampilkan, mengubah, menghapus, dan mencari data hewan, serta menambah, menampilkan, mengubah, dan menghapus data penitipan. Program juga menerapkan konsep OOP, salah satunya adalah inheritance pada class Hewan, Kucing, dan Anjing.

## 1.2 Tujuan Program

Tujuan dari pembuatan program Sistem Manajemen Penitipan Hewan yaitu:

1. Membantu mengelola data hewan yang dititipkan agar lebih teratur.
2. Memudahkan pengguna dalam mencatat dan melihat informasi hewan serta data penitipannya.
3. Memudahkan pengguna dalam melakukan pencarian, perubahan, dan penghapusan data yang sudah tersimpan.
4. Mengurangi kesulitan dalam mengelola data penitipan hewan secara manual.
5. Mengurangi kesalahan input data dengan menerapkan validasi input pada beberapa fitur dalam program.

## 1.3 Alur Program

Saat program dijalankan, pengguna akan masuk ke menu utama yang berisi pilihan untuk mengelola data hewan dan data penitipan. Pengguna dapat terlebih dahulu menambahkan data hewan dengan memasukkan ID hewan, nama hewan, nama pemilik, jenis hewan, dan ras. Jenis hewan yang tersedia adalah kucing dan anjing, yang menggunakan konsep inheritance dari class Hewan. Setelah data hewan ditambahkan, pengguna dapat melihat, mencari, mengubah, atau menghapus data hewan yang sudah tersimpan.

Selanjutnya, pengguna dapat menambahkan data penitipan dengan memasukkan ID penitipan, ID hewan, tanggal masuk, lama penitipan, dan status. Data penitipan yang sudah tersimpan dapat ditampilkan, diubah, atau dihapus sesuai kebutuhan. Pada beberapa proses input, program juga melakukan validasi untuk memastikan data yang dimasukkan sesuai, seperti input angka, ID yang tidak boleh sama, dan data yang tidak boleh kosong. Setelah selesai menggunakan program, pengguna dapat memilih menu keluar untuk mengakhiri program.


## Hierarki Class

Program Sistem Manajemen Penitipan Hewan memiliki beberapa class yang saling berhubungan. Class Hewan berperan sebagai superclass, sedangkan Kucing dan Anjing berperan sebagai subclass yang mewarisi sifat dan perilaku dari class Hewan.

Selain itu, terdapat class Penitipan yang digunakan untuk menyimpan data penitipan hewan dan class Service yang digunakan untuk mengelola data hewan dan data penitipan. Class PenitipanHewan merupakan class utama yang digunakan untuk menjalankan program dan menampilkan menu kepada pengguna.

Hierarki inheritance dalam program ini adalah:

Hewan → Kucing

Hewan → Anjing

Dengan demikian, Kucing dan Anjing memiliki atribut dan method yang berasal dari class Hewan, serta memiliki atribut tambahan sesuai dengan jenis hewannya.

## Inheritance

Pada program ini, konsep inheritance diterapkan pada class Kucing dan Anjing yang merupakan turunan dari class Hewan. Class Hewan berfungsi sebagai superclass yang menyimpan atribut umum seperti idHewan, namaHewan, dan namaPemilik.

Penerapan inheritance ditunjukkan melalui penggunaan kata kunci extends pada class Kucing dan Anjing.


<img width="590" height="172" alt="image" src="https://github.com/user-attachments/assets/854c3a17-8f5d-46b0-a7b8-23058c1f3751" />


<img width="670" height="167" alt="image" src="https://github.com/user-attachments/assets/ec5d1264-7c69-40fe-aa05-fd4a654eb557" />


Selain itu, constructor pada subclass menggunakan super() untuk memanggil constructor dari superclass sehingga atribut yang dimiliki class Hewan dapat diwariskan ke class Kucing dan Anjing.

<img width="872" height="82" alt="image" src="https://github.com/user-attachments/assets/a9dca2dd-b7c9-4bae-a39a-346c98c4a288" />


<img width="876" height="91" alt="image" src="https://github.com/user-attachments/assets/e2878e73-639a-4abf-8e42-4300f77668d4" />


Dengan adanya inheritance, atribut dan method yang sama tidak perlu ditulis ulang pada setiap class, sehingga kode menjadi lebih terstruktur dan mudah dikembangkan.


## Screenshot Program 

### Menu Utama

<img width="447" height="337" alt="image" src="https://github.com/user-attachments/assets/dff517ec-877f-4218-bdec-d2daacd15f9a" />


Gambar di atas menampilkan menu utama dari program Sistem Manajemen Penitipan Hewan Peliharaan. Pada menu ini terdapat 10 pilihan, yaitu menu tambah data hewan, tambah data penitipan, tampilkan data hewan, tampilkan data penitipan, ubah data hewan, ubah data penitipan, hapus data hewan, hapus data penitipan, cari data hewan, dan keluar dari program. Pengguna dapat memilih menu dengan menginput angka yang tersedia.

### Menu Tambah Data 


<img width="402" height="290" alt="image" src="https://github.com/user-attachments/assets/dcc09485-c6de-40f8-a5e9-91bce6e2b8ab" />

Gambar di atas menunjukkan proses penambahan data hewan ke dalam sistem. Pada menu Tambah Data Hewan, pengguna diminta memasukkan ID hewan, nama hewan, nama pemilik, jenis hewan, dan ras hewan. Sistem akan melakukan validasi terhadap data yang dimasukkan untuk memastikan data yang disimpan sesuai.

Validasi yang diterapkan antara lain ID hewan tidak boleh bernilai nol atau negatif, ID hewan tidak boleh sama dengan data yang sudah ada, serta nama hewan dan nama pemilik tidak boleh kosong. Jika seluruh data yang dimasukkan valid, maka data hewan akan berhasil disimpan ke dalam sistem dan dapat ditampilkan kembali melalui menu yang tersedia.


<img width="405" height="127" alt="image" src="https://github.com/user-attachments/assets/66bebee6-9c70-4197-af3e-f02617e6afd8" />



<img width="331" height="130" alt="image" src="https://github.com/user-attachments/assets/9c766965-cdf3-4a4d-ab95-cc9a9568b2bf" />



<img width="346" height="142" alt="image" src="https://github.com/user-attachments/assets/8d193238-d902-4b97-b08c-dd4ee4a2e422" />


Gambar di atas menunjukkan proses validasi pada menu Tambah Data Hewan. Ketika pengguna memasukkan data yang tidak sesuai, seperti ID hewan bernilai nol atau negatif, ID hewan yang sudah digunakan, atau nama hewan dan nama pemilik yang kosong, sistem akan menampilkan pesan kesalahan. Data yang tidak valid tidak akan disimpan ke dalam sistem sampai pengguna memasukkan data yang benar sesuai ketentuan.


<img width="362" height="197" alt="image" src="https://github.com/user-attachments/assets/03f914a5-9dce-4b40-833e-4cddc99a25c8" />


Gambar di atas menunjukkan proses penambahan data penitipan ke dalam sistem. Pada menu Tambah Data Penitipan, pengguna diminta memasukkan ID penitipan, ID hewan, tanggal masuk, lama penitipan, dan status penitipan. Sistem akan melakukan pengecekan untuk memastikan data yang dimasukkan sesuai dan dapat diproses.

Setelah seluruh data berhasil dimasukkan, informasi penitipan akan disimpan ke dalam sistem. Jika proses penyimpanan berhasil, sistem akan menampilkan pesan bahwa data penitipan berhasil ditambahkan sehingga data tersebut dapat dikelola kembali melalui menu yang tersedia.

<img width="387" height="136" alt="image" src="https://github.com/user-attachments/assets/5d812bfb-bb2c-4739-aef3-edf3b70950fd" />

Pada gambar diatas sistem juga melakukan pengecekan untuk memastikan ID penitipan belum pernah digunakan dan ID hewan yang dimasukkan sudah terdaftar di dalam sistem. Jika data tidak sesuai, sistem akan menampilkan pesan kesalahan dan data tidak akan disimpan.

### Menu Tampilkan Data 

menu tampilkan data hewan 

<img width="355" height="431" alt="image" src="https://github.com/user-attachments/assets/6343ca22-1398-4d0e-bae8-20d91a8f674a" />

menu tampilkan data penitipan

<img width="352" height="417" alt="image" src="https://github.com/user-attachments/assets/b01b131e-9f5c-4263-9233-e047c55dfcd6" />


Gambar di atas menampilkan data yang telah berhasil ditambahkan dan tersimpan di dalam sistem. Pada menu Tampilkan Data Hewan, informasi yang ditampilkan meliputi ID hewan, nama hewan, nama pemilik, jenis hewan, serta ras hewan. Menu ini digunakan untuk melihat seluruh data hewan yang telah terdaftar dalam sistem.

Sedangkan pada menu Tampilkan Data Penitipan, informasi yang ditampilkan meliputi ID penitipan, ID hewan, tanggal masuk, lama penitipan, dan status penitipan. Menu ini digunakan untuk melihat kembali data penitipan yang telah tersimpan sehingga pengguna dapat memantau informasi penitipan hewan dengan lebih mudah.


### Menu Update Data

Fitur update data hewan digunakan ketika terdapat perubahan atau kesalahan pada data yang telah tersimpan di dalam sistem. Misalnya, pengguna ingin memperbaiki nama hewan, nama pemilik, atau ras hewan yang sebelumnya telah diinput. Dengan fitur ini, data dapat diperbarui tanpa perlu menghapus dan menambahkan data baru.

<img width="390" height="186" alt="image" src="https://github.com/user-attachments/assets/cd74c081-2626-4cbc-a833-3322234a51ba" />


### Menu Hapus Data

<img width="336" height="131" alt="image" src="https://github.com/user-attachments/assets/dbd4ac4b-775d-4678-b00d-4310c6b63f1f" />


<img width="392" height="422" alt="image" src="https://github.com/user-attachments/assets/8fd527ae-02fa-40fb-b8e3-3a5bffa192ec" />

Gambar di atas menampilkan proses penghapusan data hewan yang telah tersimpan di dalam sistem. Pada menu Hapus Data Hewan, pengguna diminta memasukkan ID hewan yang ingin dihapus. Sistem kemudian akan mencari data berdasarkan ID yang dimasukkan.

Jika ID hewan ditemukan, data hewan akan dihapus dari sistem dan sistem akan menampilkan pesan bahwa data berhasil dihapus. Namun, jika ID hewan tidak ditemukan, sistem akan menampilkan pesan kesalahan dan proses penghapusan tidak dapat dilakukan.

<img width="361" height="127" alt="image" src="https://github.com/user-attachments/assets/5cb09155-67d9-4c1c-a222-667356655479" />

Fitur hapus data hewan digunakan ketika data hewan sudah tidak diperlukan lagi atau terdapat data yang salah dan ingin dihilangkan dari sistem. Dengan fitur ini, pengguna dapat menghapus data yang tidak digunakan sehingga data yang tersimpan tetap rapi dan sesuai dengan kondisi yang sebenarnya.


### Menu Cari Data

<img width="276" height="265" alt="image" src="https://github.com/user-attachments/assets/aff0e9a3-bbba-4eac-96df-5eb3031e71f3" />


<img width="355" height="137" alt="image" src="https://github.com/user-attachments/assets/c216c611-b1fe-4aed-aab5-0f58798be771" />


Gambar di atas menampilkan proses pencarian data hewan yang tersimpan di dalam sistem. Pada menu Cari Data Hewan, pengguna diminta memasukkan ID hewan yang ingin dicari. Sistem kemudian akan melakukan pencarian berdasarkan ID yang dimasukkan.

Jika data ditemukan, sistem akan menampilkan informasi hewan yang sesuai, seperti ID hewan, nama hewan, nama pemilik, jenis hewan, dan ras hewan. Namun, jika ID hewan tidak ditemukan, sistem akan menampilkan pesan bahwa data tidak tersedia di dalam sistem.

Fitur cari data hewan digunakan ketika pengguna ingin menemukan informasi hewan tertentu dengan lebih cepat tanpa harus melihat seluruh data yang tersimpan. Dengan memasukkan ID hewan, pengguna dapat langsung memperoleh informasi yang dibutuhkan secara lebih efisien.

### Menu Keluar

<img width="615" height="225" alt="image" src="https://github.com/user-attachments/assets/fa689743-fdef-4e17-810a-884c7aec13d2" />

Gambar di atas menampilkan menu keluar dari program. Pada menu ini, pengguna dapat memilih pilihan Keluar untuk mengakhiri program. Setelah pilihan tersebut dipilih, sistem akan menampilkan pesan terima kasih dan program akan berhenti dijalankan.

