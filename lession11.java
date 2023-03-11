import  java.util.Scanner;
public class lession11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so phan tu:");
        int n = scanner.nextInt();
        int []array =new int[n];
        for(int i= 0 ;i<n;i++){
            System.out.printf("nhap phan tu thu %d :",i+1);
            array[i]=scanner.nextInt();
        }
        System.out.println("mang khi chua sap xep: ");
        for (int i= 0; i<n;i++){
            System.out.printf("%d ",array[i]);
        }
        System.out.println("\n mang khi sap xep: ");

        for (int i= 0; i<n;i++){
            for (int j = i + 1 ; j <n;j++ ){
                if(array[i]> array[j]){
                    int temp =array[j];
                    array[j]= array[i];
                    array[i]=temp;
                }

            }
            System.out.printf("%d ",array[i]);
        }


    }

}
