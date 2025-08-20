import java.util.*;
class positive
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.print("positive");
        }else {
            System.out.print("negative");
        }
        sc.close();
    }
}