import java.util.Scanner;
public class array {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("nhap so phan tu mang nguyen");
            n =sc.nextInt();
        }while (n <= 0);
        int []array =new int[n];
        for (int i=0;i<n;i++){
            System.out.printf("nhap phan tu thu %d : ",i+1);
            array[i]=sc.nextInt();
        }
        int max= array[0];

        for (int i=0;i<n;i++){
          if (array[i] > max){
              max = array[i];
          }

        }
        System.out.printf("phan tu lon nhat trong mang : %d \n",max);
        for (int i:array){
            System.out.println(i);
        }
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
