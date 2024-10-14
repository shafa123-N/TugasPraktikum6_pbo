package tugas.pbo.pkg6;

public class LaguAnakAyam {

    public static void main(String[] args) {
        anakAyamTurun(10); // Contoh N = 10
    }

    // Fungsi untuk menampilkan lagu "Anak Ayam Turun N"
    public static void anakAyamTurun(int n) {
        System.out.println("Lagu Anak Ayam Turun " + n + ":");
        while (n > 1) {
            System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1));
            n--;
        }
        System.out.println("Anak ayam turun 1, mati satu tinggal induknya.\n");
    }
}

