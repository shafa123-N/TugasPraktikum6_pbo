package tugas.pbo.pkg6;

public class BilanganPrima {

    public static void main(String[] args) {
        primaDanBukan();
    }

    // Fungsi untuk menghitung deret bilangan prima dan bukan prima
    public static void primaDanBukan() {
        System.out.println("Deret bilangan prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nDeret bilangan bukan prima dari 0 - 20:");
        for (int i = 0; i <= 20; i++) {
            if (!isPrima(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");
    }

    // Fungsi untuk memeriksa apakah bilangan prima
    public static boolean isPrima(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
