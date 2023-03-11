import java.util.Scanner;

public class lession6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int n = scanner.nextInt();
        long factorial = 1;
        do {
            factorial *= n;
            n--;
        }while (n!=1);
        System.out.println(n + "! = " + factorial);
    }
}
