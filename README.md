# PawoonTechnicalTest
---------------------------------------README--------------------------------------------


EMAIL DATA : wonpawww@mailinator.com 




Note : 
-Email yang saya gunakan adalah email dummy dari situs mailinator.com yang bersifat sementara.

-EMAIL DATA yang saya gunakan bisa diubah/diganti email lain, akan tetapi pada object 'input email' di tc E2E Registration dan object 'search' di 
tc verifikasi otp link harus disesuaikan dengan email data yang telah diubah/diganti agar testnya berhasil. 

-Email yang ada di testcase yang saya gunakan dan EMAIL DATA diatas berbeda, karena untuk tiap test case harus menggunakan email yang belum terdaftar sebelumnya.

-Karena untuk tiap test harus menggunakan email yang belum terdaftar sebelumnya, maka E2E Registration test yang saya buat hanya sampai di setelah meng-klik 
tombol daftar. kemudian akan ada email otp yang masuk ke email kita. 

-Untuk verifikasi otp link saya membuat test case terpisah dari test case E2E Registration karena untuk test verifikasi otp harus 
membuat object secara manual dan harus menunggu email masuk terlebih dahulu dari support team pawoon.

-Pada test case verifikasi otp link, untuk input object 'search' harus disesuaikan/diedit manual dengan kata sebelum '@' di EMAIL DATA kita (eg :'wonpawww'). Kemudian 
harus membuat object secara manual karena email yang masuk di situs mailinator.com hanya bersifat sementara (akan hilang setelah beberapa jam) sehingga object 
yang saya buat tidak bisa digunakan lagi setelah beberapa jam.

-Untuk object yang ada di test case saya buat menggunakan fitur 'Spy Web' di Katalon Studio





