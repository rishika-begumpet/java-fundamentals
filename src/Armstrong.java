import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original = number;
        int result = 0;
        while(number > 0) {
            int digit = number % 10;
            int cube = digit * digit * digit;
            result += cube;
            number = number / 10;
        }
        System.out.println(result);
        if (original == result) {
            System.out.println(original + " is a Armstrong");
        } else {
            System.out.println(original + " is not a Armstrong");
        }
        sc.close();
    }
}
