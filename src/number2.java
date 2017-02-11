import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class number2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int j=sc.nextInt();
        Random r=new Random();
        int arr[]=new int[9];

        for(int g=0;g<j;g++){
            for(int h=0;h<arr.length;h++){
                arr[h]=r.nextInt();
                System.out.print(arr[h]+" ");
            }
            System.out.println();
            Arrays.sort(arr);
            for(int u=0;u<arr.length;u++){
                System.out.print(arr[u]+" ");
            }


            System.out.println();
            System.out.println();
        }
    }
}
