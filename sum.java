import java.util.Scanner;
class sum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.println("enter "+n+" elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double average=(double)sum/n;
        System.out.println("sum of array elements:" +sum);
        System.out.println("average of array elements:" +average);
        sc.close();
    }
}
