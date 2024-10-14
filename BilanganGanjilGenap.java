package tugas.pbo.pkg6;

public class BilanganGanjilGenap {

    public static void main(String[] args) {
        ganjilDanGenap();
    }

    // Fungsi untuk menghitung deret bilangan ganjil dan genap
    public static void ganjilDanGenap() {
        System.out.println("Deret bilangan genap dari 0 - 20:");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\nDeret bilangan ganjil dari 0 - 20:");
        for (int i = 1; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}

