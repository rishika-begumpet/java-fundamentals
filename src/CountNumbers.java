import java.util.Scanner;
public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int Count = 0;
        int i = 1;
        while(number > 0) {
            int digit = number % 10;
            Count += i;
            number = number / 10;
        }
        System.out.println(Count);
        sc.close();
    }
}
