import java.util.*;
class number {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a = sc.nextInt();
    if(a % 2 == 0) {
            System.out.println("even is:" +a);
        } else {
            System.out.println("odd is:" +a);
        }
        sc.close();
    }
}

