import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter the "+size+" number:");
        for(int i=0; i<size; i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the array is:");
        for(int i=0; i<size; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
