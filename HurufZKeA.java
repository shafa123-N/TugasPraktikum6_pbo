package tugas.pbo.pkg6;

public class HurufZKeA {

    public static void main(String[] args) {
        hurufZtoA();
    }

    // Fungsi untuk menampilkan deret huruf dari Z ke A
    public static void hurufZtoA() {
        System.out.println("Deret huruf Z - A:");
        char letter = 'Z';
        do {
            System.out.print(letter + " ");
            letter--;
        } while (letter >= 'A');
        System.out.println("\n");
    }
}

