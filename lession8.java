import java.util.Scanner;

public class lession8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int sum = 0;
        int num;
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap phan tu thu %d: ",i + 1);
            num = sc.nextInt();
            sum+=num;
        }
        double avg = (double) sum / n;
        System.out.println("Average of numbers = " + avg);

    }
}
