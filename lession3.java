import java.util.Scanner;
import java.lang.Math;
public class lession3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("nhap vao so tu nhien n: ");
             n = scanner.nextInt();

        }while (n<0);
        if(n<2){
            System.out.printf("%d khong phai so nguyen to",n);
        }
        int sum=0;
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                sum++;
            }

        }
        if (sum == 0){
            System.out.printf("%d la so nguyen to",n);
        }else {
            System.out.println("khong phai so nguyen to");
        }


    }

}
