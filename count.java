import java.util.Scanner;

class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // Take array elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int count = 0;

        // Count numbers greater than 50
        for (int num : numbers) {
            if (num > 50) {
                count++;
            }
        }

        System.out.println("Numbers greater than 50: " + count);

        sc.close();
    }
}