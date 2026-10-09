<div align="center">

# 📱 Tugas 3 - Composable Layout 2
**Pengembangan Antarmuka Android Berbasis Jetpack Compose**

![Kotlin](https://img.shields.io/badge/Kotlin-100%25-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Android Studio](https://img.shields.io/badge/Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)

---

</div>

## 📌 Deskripsi Proyek

Proyek ini dibuat untuk memenuhi tugas praktikum **Pemrograman Aplikasi Bergerak**. Implementasi berfokus pada pembuatan antarmuka pengguna (UI) yang dinamis, modular, dan terstruktur menggunakan **Jetpack Compose**. 

Seluruh komponen dirancang dengan prinsip *clean code*, memisahkan *resource* nilai teks dan warna ke dalam XML (`strings.xml` dan `colors.xml`), serta menerapkan komponen UI yang redefinisi (*reusable component*).

---

## ✨ Fitur Utama & Arsitektur Code

- 🧩 **Reusable Component (`DetailCard`)**: Komponen kartu kustom berbasis `Card`, `Row`, `Column`, dan `Image` yang menerima parameter dinamis (nama, alamat, nomor HP, latar belakang warna, dan kustomisasi font).
- ⚙️ **Resource Management**: 100% bebas dari *hardcoded text* dan *colors*. Semua nilai terpusat di `res/values/strings.xml` dan `res/values/colors.xml`.
- 🔀 **Conditional Rendering**: Penanganan tampilan opsional pada informasi nomor telepon (`noHp`) secara kondisional di dalam `DetailCard`.
- 🎨 **Flexibility & Styling**: Mendukung variasi palet warna dan tipe font (seperti `FontFamily.Cursive`).

---

## 🛠️ Teknologi & Stack

- **Language**: [Kotlin](https://kotlinlang.org/)
- **UI Framework**: [Jetpack Compose](https://developer.android.com/jetpack/compose)
- **IDE**: Android Studio
- **Minimum SDK**: API Level 24 (Android 7.0 Nougat) atau disesuaikan dengan konfigurasi proyek.

---

## 🗂️ Struktur Proyek Utama

```text
app/src/main/java/com/.../
│
├── MainActivity.kt        # Entry point aplikasi
├── DetailCard.kt          # Komponen UI Reusable
└── ActivitasPertama.kt    # Layout Screen Utama & Header/Footer


## 👨‍💻 Identitas Mahasiswa
Nama : Faiz Sulthon Daud Muhammad
NIM : 20240140258
