package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Daftar buku
        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        Buku buku2 = new Fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();

        System.out.println();

        // Daftar anggota
        Anggota a1 = new Anggota("Adit", "B075");
        Anggota a2 = new Anggota("Denis", "A047");

        a1.display();
        a2.display();

        System.out.println();

        // Pinjam buku
        a1.pinjamBuku("Malin Kundang");
        a2.pinjamBuku("Si Kancil", 7);

        System.out.println();

        // Kembalikan buku
        a1.kembalikanBuku("Malin Kundang");
        a2.kembalikanBuku("Si Kancil");
    }
}
