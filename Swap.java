import java.util.*;

public class Swap {
    static int[][] matrix;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matrix length: ");
        int length = scanner.nextInt();
        matrix = new int[length][length];

        fillMatrix();
        System.out.print(matrixToString());

        System.out.print("\nWhich rows are going to be swapped?\nI: ");
        int i = scanner.nextInt() - 1;
        System.out.print("J: ");
        int j = scanner.nextInt() - 1;
        swap(i, j);
        System.out.print(matrixToString());

        scanner.close();
    }

    static void swap(int i, int j) {
        int[] aux = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = aux;
    }

    static void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    static String matrixToString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matrix.length; i++)
            sb.append(i + 1).append(". ").append(Arrays.toString(matrix[i])).append('\n');
        return sb.toString();
    }

    static void fillMatrix() {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = new Random().nextInt(10);
    }
}
