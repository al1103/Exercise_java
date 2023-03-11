import java.util.Scanner;

public class lession12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Nhập vào các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxElement = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận là: " + maxElement);
    }
}
