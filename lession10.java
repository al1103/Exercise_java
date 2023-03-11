import java.util.Scanner;

public class lession10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String str = scanner.nextLine();
        System.out.print("Nhập ký tự: ");
        char c = scanner.next().charAt(0);
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                sum+=1;
            }
        }
        System.out.printf("so lan xuat hine %d",sum);

    }
}
