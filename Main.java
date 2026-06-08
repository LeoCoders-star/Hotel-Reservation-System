import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== BIASAKAN YANG BETUL, BETULKAN YANG BIASA ===");
        System.out.println("--- Sistem Reservasi Hotel Mu ---");
        System.out.print("Masukkan nama anda untuk tempahan: ");
        String namaInput = input.nextLine();

        // Di sini kita akan panggil Class yang kawan anda buat nanti
        Customer pelanggan = new Customer(namaInput);
        
        System.out.println("\n--- Status Tempahan Berjaya! ---");
        // Memanggil fungsi paparan dari class kawan anda
        pelanggan.paparInfo(); 
        
        input.close();
    }
}