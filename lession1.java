import java.util.Scanner;

public class lession1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        double num1 = scanner.nextDouble();
        System.out.print("Nhập số thứ hai: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double remainder = num1 % num2;

        System.out.println("Tổng của " + num1 + " và " + num2 + " là " + sum);
        System.out.println("Hiệu của " + num1 + " và " + num2 + " là " + difference);
        System.out.println("Tích của " + num1 + " và " + num2 + " là " + product);
        System.out.println("Thương của " + num1 + " và " + num2 + " là " + quotient);
        System.out.println("Chia lấy dư của " + num1 + " và " + num2 + " là " + remainder);

        if (num1 > num2) {
            System.out.println(num1 + " lớn hơn " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " nhỏ hơn " + num2);
        } else {
            System.out.println(num1 + " bằng " + num2);
        }

        if (num1 >= num2) {
            System.out.println(num1 + " lớn hơn hoặc bằng " + num2);
        } else if (num1 <= num2) {
            System.out.println(num1 + " nhỏ hơn hoặc bằng " + num2);
        }

        if (num1 == num2) {
            System.out.println(num1 + " bằng " + num2);
        } else {
            System.out.println(num1 + " khác " + num2);
        }
    }
}
