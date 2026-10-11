public class main {
    public static void main(String[] args) {
       BankAccount acc1 = new BankAccount("REK-001" , "Bowo", 16000000);
    System.out.println("Akun 1 berhasil dibuat: " + acc1.getownerName() + " | Saldo: " + acc1.getbalance());
     BankAccount acc2 = new BankAccount("REK-002", "Siti Aminah"); // Menggunakan overloaded constructor (saldo awal = 0.0)

        System.out.println("=== DATA AKUN BERHASIL DIBUAT ===");
        System.out.println("Akun 1: " + acc1.getaccountNumber() + " | " + acc1.getownerName() + " | Saldo: " + acc1.getbalance());
        System.out.println("Akun 2: " + acc2.getaccountNumber() + " | " + acc2.getownerName() + " | Saldo: " + acc2.getbalance());

        // Catatan: Mencoba akses langsung atribut privat seperti `acc1.balance = -1000;` 
        // akan menyebabkan compile-time error karena atribut sudah bersifat private.

        System.out.println("\n=== TES PENARIKAN SALDO (WITHDRAW) ===");
        
        // Penarikan valid
        try {
            acc1.withdraw(100000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Penarikan gagal: " + e.getMessage());
        }

        // Penarikan melebihi batas saldo
        try {
            System.out.print("Mencoba tarik 1.000.000 dari acc1: ");
            acc1.withdraw(1000000.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Sistem menolak (Tertangkap Exception): " + e.getMessage());
        }

        System.out.println("\n=== TES VALIDASI PEMBUATAN OBJEK TIDAK VALID ===");

        // Tes saldo negatif
        try {
            System.out.print("Membuat akun saldo negatif: ");
            BankAccount acc3 = new BankAccount("REK-003", "Andi", -50000);
        } catch (IllegalArgumentException e) {
            System.out.println("Sistem menolak (Tertangkap Exception): " + e.getMessage());
        }

        // Tes nama owner null
        try {
            System.out.print("Membuat akun nama null: ");
            BankAccount acc4 = new BankAccount("REK-004", null, 100000);
        } catch (IllegalArgumentException e) {
            System.out.println("Sistem menolak (Tertangkap Exception): " + e.getMessage());
        }
}
}
