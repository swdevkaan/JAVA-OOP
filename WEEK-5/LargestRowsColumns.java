package deneme;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsColumns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Matris boyutunu al
        System.out.print("Enter the array size n: ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        // 2. Matrisi rastgele 0 ve 1 ile doldur ve ekrana yazdir
        System.out.println("The random array is");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        // 3. En cok 1 olan satir(lar)i bul
        ArrayList<Integer> maxRows = new ArrayList<>();
        int maxRowOnes = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxRowOnes) {
                maxRowOnes = count;
                maxRows.clear(); // Yeni bir maksimum bulundugu icin eski indeksleri temizle
                maxRows.add(i);
            } else if (count == maxRowOnes) {
                maxRows.add(i); // Ayni maksimuma sahip baska satir varsa ekle
            }
        }

        // 4. En cok 1 olan sutun(lar)i bul
        ArrayList<Integer> maxCols = new ArrayList<>();
        int maxColOnes = -1;

        for (int j = 0; j < n; j++) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }

            if (count > maxColOnes) {
                maxColOnes = count;
                maxCols.clear(); // Yeni maksimum bulundugunda listeyi sifirla
                maxCols.add(j);
            } else if (count == maxColOnes) {
                maxCols.add(j); // Ayni maksimuma sahip sutun ekle
            }
        }

        // 5. Sonuclari yazdir
        System.out.print("The largest row index: ");
        printList(maxRows);

        System.out.print("The largest column index: ");
        printList(maxCols);

        input.close();
    }

    // Liste elemanlarini virgulle ayirarak yazdiran yardimci metot
    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : ", "));
        }
        System.out.println();
    }
}