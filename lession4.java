import java.util.Scanner;

public class lession4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int monthNumber;
        System.out.print("Nhập vào một số nguyên từ 1 đến 12: ");
        monthNumber = input.nextInt();

        switch (monthNumber) {
            case 1:
                System.out.println("Tháng 1");
                break;
            case 2:
                System.out.println("Tháng 2");
                break;
            case 3:
                System.out.println("Tháng 3");
                break;
            case 4:
                System.out.println("Tháng 4");
                break;
            case 5:
                System.out.println("Tháng 5");
                break;
            case 6:
                System.out.println("Tháng 6");
                break;
            case 7:
                System.out.println("Tháng 7");
                break;
            case 8:
                System.out.println("Tháng 8");
                break;
            case 9:
                System.out.println("Tháng 9");
                break;
            case 10:
                System.out.println("Tháng 10");
                break;
            case 11:
                System.out.println("Tháng 11");
                break;
            case 12:
                System.out.println("Tháng 12");
                break;
            default:
                System.out.println("Số bạn vừa nhập không hợp lệ.");
        }
    }
}
