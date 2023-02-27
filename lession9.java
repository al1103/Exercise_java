import java.util.Scanner;

public class lession9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi bất kỳ: ");
        String str = scanner.nextLine();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char n = str.charAt(i);
            if (Character.isUpperCase(n)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(n)) {
                lowerCaseCount++;
            } else if (Character.isDigit(n)) {
                digitCount++;
            }
        }

        System.out.println("Số ký tự in hoa trong chuỗi là: " + upperCaseCount);
        System.out.println("Số ký tự in thường trong chuỗi là: " + lowerCaseCount);
        System.out.println("Số chữ số trong chuỗi là: " + digitCount);
    }
}
