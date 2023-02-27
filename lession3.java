import java.util.Scanner;
public class lession3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào tên của bạn: ");
        String ten = scanner.nextLine();
        System.out.print("Nhập vào tuổi của bạn: ");
        int tuoi = scanner.nextInt();
        if (tuoi < 16) {
            System.out.println("Bạn " + ten + " ở độ tuổi vị thành niên.");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Bạn " + ten + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + ten + " đã già.");
        }
    }

}
