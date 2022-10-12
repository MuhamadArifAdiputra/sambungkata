# Permainan Sambung Kata

 Hi rekan DevCamp Academy 2022!
 
 Sebelumnya isi bagian ini dahulu ya:
 
 Nama Lengkap: Mario Rufisanto

 
 Juga silakan buat branch sendiri ya yaitu branch dengan nama `devcamp_<namalengkap>` ya. Kalian boleh membuat branch tambahan sendiri dengan format `devcamp_<namalengkap>_<tambahaninfo>` ya.


Langsung to the point saja. Inti dari repo ini adalah permainan sambung kata. Kalau permainan yang semisal dengan ini adalah shiritori di jepang namun dalam sambung kata ini supaya memudahkan teman-teman ada beberapa aturan:

- sambung kata dalam hal ini adalah hurun konsonan paling akhir yang sebelumnya ada huruf vokal. Misal:
  
  - toko, berarti kata sambungnya adalah ko (misal komodo)
  
  - jangan, maka kata sambungnya adalah gan (misal gantungan)
  
  Kami mengerti ini bukan penggalan kata yang tepat, namun jika menggunakan penggalan kata yang tepat akan cukup menyulitkan pembuatan algoritmanya. Dipersilakan jika ingin mencoba bagi peserta devcamp untuk membuat pemenggalan kata yang benar nya juga jika ingin ya.



Jika kalian baru pertama kali menggunakan eclipse, disarankan agar clone repositori ini ke lokal kalian dan run program nya terlebih dahulu sebelum lanjut mencoba membuat program ini.



Disini kita bagi menjadi beberapa "level" supaya memudahkan:

level 1 adalah membuat permainannya saja tanpa mementingkan hal-hal lainnya. cukup cek kata pertama inputnya apa, lalu cek kata kedua yang di inputkan sudah sambung dengan kata sebelumnya atau tidak

- jika sambung maka lanjut terima kata selanjutnya

- jika tidak maka berhenti

level 1 ini pula ada beberapa level:

- level 1.1 dimana kalian menampilkan potongan kata tersebut

- level 1.2 dimana kalian buat permainannya dapat dijalankan ulang kalau sudah berhenti (tanya pengguna mau bermain lagi atau tidak dengan input pengguna)

level 2 ditambahkan beberapa tambahan:

- level 2.0 dimana kalian spesifikasikan dengan teks output di terminal pemain 1 dan pemain 2

- level 2.1 dimana kalian membuat scoring (bebas, bisa menggunakan kata yang di input, karakter, kesulitan kata, dsb.) dan tampilkan scoring di bagian akhir.

- level 2.2 dimana kalian tentukan pemenang dari skor yang ada di akhir.



---

Kami hanya akan memberikan sampai level 2.2 saja. Namun jika kalian ada waktu luang atau sudah cukup mahir disarankan silakan lanjut eksplorasi dengan:

- memperbaiki kode referensi ini yang ada (sengaja kode yang dibagikan memiliki beberapa kekurangan -bahkan bug- di kodenya, silakan jika ingin mencoba diperbaiki sesuai dengan standar atau yang sudah di share di presentasi ini ya)

- Menambahkan checker dengan kamus bahasa indonesia untuk kata-katanya (cek katanya valid atau tidak sesuai KBBI)

- tambahkan bot untuk pemain 2 supaya dapat bermain sendiri

- tambahkan kesukaran bot pemain 2

- tambahkan timeout untuk pemain agar dilewati jika dia sudah terlalu lama berpikir supaya skornya bisa lebih besar untuk pemain yang gesit



2 orang dengan eksplorasi paling dalam/unik/bagus dalam permainan sambungkata ini akan mendapatkan hadiah di akhir sesi ini jadi silakan bereksplorasi.



---

Beberapa requirements:

- program harus bisa berjalan dengan baik melalui Main.java saja

- program harus di push ke branch di repositori ini

- silakan eksplorasi sebisa mungkin di sesi ini!
