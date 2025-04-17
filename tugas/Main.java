import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login sebagai Admin");
        System.out.println("2. Login sebagai Mahasiswa");
        System.out.print("Pilih (1/2): ");
        String pilihan = scanner.nextLine();

        switch (pilihan) {
            case "1":
                System.out.print("Masukkan username admin: ");
                String username = scanner.nextLine();
                System.out.print("Masukkan password admin: ");
                String password = scanner.nextLine();
                if (admin.login(username, password)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login Admin gagal! Username atau password salah.");
                }
                break;
            case "2":
                System.out.print("Masukkan nama mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan NIM mahasiswa: ");
                String nim = scanner.nextLine();
                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login Mahasiswa gagal! Nama atau NIM salah.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
