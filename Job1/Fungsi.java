import java.util.Scanner;

public class Fungsi {

    private static final int[][] STOCK_BUNGA = {
        {10, 5, 15, 7},
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
    };

    private static final String[] NAMA_CABANG = {
        "RoyalGarden 1",
        "RoyalGarden 2",
        "RoyalGarden 3",
        "RoyalGarden 4"
    };

    private static final int[] HARGA_BUNGA = {
        75000,
        50000,
        60000,
        10000
    };

    private static final String[] JENIS_BUNGA = {
        "Aglonema",
        "Keladi",
        "Alocasia",
        "Mawar"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pendapatan setiap cabang jika semua bunga terjual:");
        for (int i = 0; i < STOCK_BUNGA.length; i++) {
            int totalPendapatanCabang = 0;
            for (int j = 0; j < STOCK_BUNGA[i].length; j++) {
                totalPendapatanCabang += STOCK_BUNGA[i][j] * HARGA_BUNGA[j];
            }
            System.out.printf("%s: Rp%d\n", NAMA_CABANG[i], totalPendapatanCabang);
        }

        System.out.println("\nJumlah stock bunga di RoyalGarden 4 setelah pengurangan:");
        int[] penguranganStock = new int[JENIS_BUNGA.length];
        for (int i = 0; i < JENIS_BUNGA.length; i++) {
            System.out.print(JENIS_BUNGA[i] + ": ");
            penguranganStock[i] = scanner.nextInt();
        }

        for (int i = 0; i < JENIS_BUNGA.length; i++) {
            int stockAkhir = STOCK_BUNGA[3][i] - penguranganStock[i];
            System.out.printf("%s: %d\n", JENIS_BUNGA[i], stockAkhir);
        }
    }
}
