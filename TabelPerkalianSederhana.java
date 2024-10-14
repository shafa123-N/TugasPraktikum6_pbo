
package tugas.pbo.pkg6;
import java.util.Scanner;


public class TabelPerkalianSederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n (maksimal 10): ");
        int n = input.nextInt();

        if (n <= 10 && n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(i * j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai n tidak valid.");
        }

        input.close();
    }
}

