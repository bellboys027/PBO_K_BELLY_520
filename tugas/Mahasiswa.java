public class Mahasiswa {
    private String nama = "Budi";
    private String nim = "12345678";

    public boolean login(String nama, String nim) {
        return this.nama.equals(nama) && this.nim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("\nLogin berhasil!");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
    }
}
