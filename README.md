# Module 21: Membuat Web UI automation framework dengan Selenium Assignment
Tujuan tugas ini adalah membuat sebuah projek testing yang mengimplementasikan Cucumber dan Selenium

## Persiapan Projek
Set dependencies yang dibutuhkan pada projek ini seperti selenium, webdriver, junit, dan cucumber
Setelah itu buat task cucumber untuk menjalankan test case
!(https://github.com/aufarr16/selenium_x_cucumber/blob/master/readme-img/dependencies%20and%20task.png)


## Persiapan Test
Setelah itu buat Gherkin file pada folder test/resources bernama login.feature, disini buat test case yang akan dijalankan. Pada projek ini akan ada 3 test cases:
!(https://github.com/aufarr16/selenium_x_cucumber/blob/master/readme-img/test%20cases.png)

## Test
Generate Step Definition dari file Gherkin yang telah dibuat
Setelah itu buat Page Object Model sesuai dengan jumlah page yang akan digunakan, pada projek ini akan menggunakan Login dan Home Page
Jika sudah, implementasikan Page Object Model ke dalam Step Definition yang sudah dibuat
Untuk setup web driver yang akan digunakan selama pengujian, pada projek ini dibuat satu folder baru bernama "prep" untuk menyimpan persiapan yang bersifat general
Setup driver dilakukan pada class TestPrep yang nantinya akan diextend oleh Step Definition karena satu driver akan digunakan pada Step Definition Login Page dan Home Page
Setelah semuanya sudah selesai, maka buat class CucumberHooks yang akan memanage Before dan After pada tiap case
Untuk menjalankan seluruh test case, disini dibuat file CucumberPrep yang menginisiasi CucumberOptions dan menjadi tempat untuk menjalankan seluruh test case
Jika semuanya sudah selesai, maka projeknya akan menjadi seperti berikut:
(https://github.com/aufarr16/selenium_x_cucumber/blob/master/readme-img/all%20files.png)

## Run Test
Jalankan test dengan menjalankan CucumberPrep, jika semuanya sudah sesuai maka hasilnya akan seperti berikut:
(https://github.com/aufarr16/selenium_x_cucumber/blob/master/readme-img/result.png)
