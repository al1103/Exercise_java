import java.util.Scanner;

public class lession5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
         while (sum <= 100){
             System.out.print("Nhập số nguyên: ");
             num = scanner.nextInt();
             sum += num;
         }
        System.out.println("Tổng các số đã nhập là: " + sum);
    }
}
