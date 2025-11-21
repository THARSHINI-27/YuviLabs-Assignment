import java.util.Random;
import java.util.Scanner;

public class GridHighlighter {

    
    static Random rand = new Random(12345);  

    
    private static int randomEven() {
        int x = rand.nextInt(10) + 1; 
        return x * 2; 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Enter array size (for NxN array): ");
            String input = sc.nextLine();

            try {
                n = Integer.parseInt(input);
                if (n > 0)
                    break;
                else
                    System.out.println("Please enter a positive number.");
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = randomEven();
            }
        }

        System.out.println("\nGenerated 2D array:");
        printGrid(grid, -1); 
        int highlight = 0;

        while (true) {
            System.out.print("\nEnter a number to highlight (even number 2-20): ");
            String x = sc.nextLine();

            try {
                highlight = Integer.parseInt(x);
                if (highlight >= 2 && highlight <= 20 && highlight % 2 == 0)
                    break;
                else
                    System.out.println("Enter a valid even number between 2 and 20.");
            } catch (Exception e) {
                System.out.println("Invalid. Enter a numeric value.");
            }
        }

        System.out.println("\nArray with " + highlight + " highlighted:");
        int count = printGrid(grid, highlight);

        System.out.println("\nNumber " + highlight + " appeared " + count + " time(s)");

        sc.close();
    }

    private static int printGrid(int[][] arr, int highlight) {

        int n = arr.length;
        int count = 0;
        System.out.print("   ");
        for (int c = 0; c < n; c++) {
            System.out.printf("%02d ", c);
        }
        System.out.println();

        
        StringBuilder line = new StringBuilder();
        line.append("   ");
        for (int i = 0; i < n; i++) {
            line.append("+----");
        }
        line.append("+");
        System.out.println(line);
        for (int i = 0; i < n; i++) {
            System.out.printf("%02d ", i);

            for (int j = 0; j < n; j++) {
                int val = arr[i][j];

                if (val == highlight) {
                    System.out.printf("|[%2d]", val);
                    count++;
                } else {
                    System.out.printf("| %2d ", val);
                }
            }

            System.out.println("|");
            System.out.println(line);
        }

        return count;
    }
}
