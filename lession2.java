import java.util.Scanner;
public class lession2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 ;
        System.out.println("nhap so nguyen: ");
        num1 =scanner.nextInt();
        if(num1 % 2==0){
            System.out.println("so chan");
        }else {
            System.out.println("so le");

        }
    }
}
