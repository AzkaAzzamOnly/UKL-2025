# UKL-2025
# Latihan Soal UKL

**Nama: Azka 'Azzam Mubarok**
**Kelas: X RPL 8**
**Absen: 3**


## Soal  1 - Mudah

### No. 1

**Pertama, siswa diminta untuk memasukkan data berupa:**

- Panjang
- Lebar
- Tinggi
- Berat Barang
- Jarak Tempuh

**Lalu terdapat kondisi dimana jika jarak tempuh lebih dari 10km, maka harga jarak tersebut menjadi:** Rp.6.000/km.

**Dan juga terdapat kondisi yang sama, yang dimana jika volume barang tersebut (P x L x T) melebihi 100cm^3, maka dikenakan biaya tambahan sebesar:** Rp.50.000
 
**Maka dari itu kondisi tersebut menggunakan if-else seperti di dalam kode tersebut:**

 
```java
#contoh pengukuran jarak menggunakan if-else 
if (jarak <= 10) {
    hargajarak = berat * 4250;
        } else {
            hargajarak = berat * 6000;
        }


#contoh menentukan jika volume melebihi dari 100cm3 menggunakan if-else 
if (volume >= 100) {
            System.out.println("Mendapatkan Rp.50.000 karena Volume melebihi 100 cm3");
            pajakvolume = 50000;
        }else{
            pajakvolume = 0;
        }
```

### Output:
<img width="1461" height="412" alt="Soal 1 1" src="https://github.com/user-attachments/assets/62f07fcc-03e7-478f-8792-fd77aecab055" />



### No. 2

**Siswa diminta untuk memasukkan angka, yang meghasilkan output Ganjil/Genap.**

**Setelah siswa memasukkan angka, angka yang telah di input oleh siswa akan di bagi habis (%) dengan angka 2, menggunakan rumus if-else karena angka 2 menjadi patokan apakah nilai tersebut Ganjil/Genap.**

**Contoh kode dalam penghitungan angka Ganjil/Genap:**

```java
if (angka % 2 == 0) {
    System.out.println(" Genap "); //Karena habis dibagi oleh angka 2
        }else {
            System.out.println(" Ganjil "); //Karena terdapat sisa dari pembagian angka 2
        }
```
### Output:
<img width="1453" height="393" alt="Screenshot 2025-11-04 062800" src="https://github.com/user-attachments/assets/68aa9ea6-60c9-4dd8-8b4b-d8b03f20bd7f" />


## Soal 2 - Sedang

### No.1

**Siswa diminta untuk menginput angka faktorial, lalu program dijalankan untuk menghitung total angka faktorial tersebut.**

```
Masukkan Bilangan Faktorial anda: 4
```
**Setelah itu program mengidentifikasi angka yang telah di input, program melakukan looping sesuai dengan angka yang telah di input oleh user, lalu menghasilkan output yang berupa hasil faktorial dari nilai user.**


**Kode tersebut menggunakan looping jenis `for`, yang dimana hitungan dimulai dari 1, lalu berhenti pada nilai yang telah ditetapkan oleh user.** 

**Contoh kode sebagai berikut:**

```java
for (int i = 1; i <= angkaFaktorial; i++) {
    hasil *= i;
        }
```

### Output:
<img width="1458" height="259" alt="Screenshot 2025-11-04 063017" src="https://github.com/user-attachments/assets/2a8ae772-51b1-41a4-ac0b-c2c0518dc9c7" />


### No.2

**Terdapat program penghitungan volume tabung dan luas permukaan yang dimana user diminta untuk memasukkan:**

- Jari-jari
- Tinggi

**Setelah siswa input, program menghitung dengan menggunakan rumus kode:**

``` java
double Volume = phi * r * t;
```

> [!NOTE]
> Phi dapat ditemukan di class java dengan menambahkan:
> ```java
> double phi = Math.PI;
> ```

**Diawali dengan membuat jenis variabel `double` yang bernama `Volume`, berfungsi untuk menghitung total `Volume` menggunakan variabel `Phi`, `Rusuk`, dan `tinggi`.**

### Output:
<img src=ScreenShoot\Soal2_2.png width="70%"> 

## Soal 3 - Sulit

### No.1

**Siswa diminta untuk memasukkan jumlah siswa yang ada di dalam kelas, lalu User memasukkan nilai masing-masing siswa yang ada di dalam kelas**

**Menggunakan Kondisi `While` yang dimana itu sangat cocok untuk kondisi siswa yang dapat memasukkan nilai yang sesuai dengan input `JumlahSiswa` dari user**.

**contoh kode `While` sebagai berikut:**

```java
while (awal <= JumlahSis) {
    System.out.println("Nilai Siswa " + awal);
        nilai = input.nextInt();
        temp += nilai;
        awal++;
    }
```

**Variabel `temp` mencakup total nilai yang telah di input oleh user, oleh karena itu, hasil `temp` akan dibagi dengan `JumlahSiswa`**

```java
 double rata = temp/JumlahSis;
```

### Output:
<img width="1464" height="516" alt="Soal 3 1" src="https://github.com/user-attachments/assets/fa2dfd44-093a-4635-baa2-e728205d2afa" />


### No.2
**Siswa dapat menambah jumlah `kolom` dan `baris` sesuai dengan kemauan siswa, kemudian siswa dapat menambahkan masing-masing nilai dalam setiap `matriks`.**

**Pertama, program akan membuat `Matriks` sesuai inputan `kolom` dan `baris` dari user, dan teradpat `MatriksA` dan `MatriksB` untuk dijumlahkan kedua matriks  tersebut, yang dimana seitap buah matriks mencakup nilai yang telah user tambahkan masing-masing.**

```java
for (int i = 0; i < brs; i++) {
    for (int j = 0; j < klm; j++) {
        System.out.print("Matriks[" + i + "] " + "[" + j+ "] : ");
        matriks1[i][j] = input.nextInt()
    }
}
```

**Menggunakan jenis looping `For` di dalam `For` yang menglooping bagian matriks paling dalam `[j]`, lalu disusul dengan looping luar `[i]`** 
**yang menghasilkan input kode ke user sebagai berikut:**

```
---- Matriks A ----
Matriks[0] [0] :
Matriks[0] [1] : 
Matriks[1] [0] : 
Matriks[1] [1] : 
```

**Sama halnya dengan Matriks B, yang menghasilkan input kode ke user sebagai berikut:**
```
---- Matriks B ----
Matriks[0] [0] : 
Matriks[0] [1] : 
Matriks[1] [0] : 
Matriks[1] [1] : 
```

**Setelah siswa input masing-masing matriks yang telah di program, program akan menghitung jumlah kedua dari masing-masing `matriksA` dan `matriksB`. yang menghasilkan jumlah total angka dari kedua matriks A + B tersebut.**

```java
System.out.println("Hasil Matriks A + B ");
            for (int i1 = 0;  i1 < baris; i1++) {
                for (int j = 0; j < kolom; j++) {
                    System.out.printf("%5d", matriksHasil[i1][j]);
                }
                System.out.println();
            }
```

**yang menghasilkan output:**

```
Hasil Matriks A + B 
    2    2
    2    2
```

### Output
<img width="1463" height="772" alt="Soal 3 2" src="https://github.com/user-attachments/assets/5547c69d-d9cf-4ee8-a17b-b424a82f6f1d" />
