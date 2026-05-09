import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int original = number1;
        int reverse = 0;
        do {
            int digit = number1 % 10;
            reverse = reverse * 10 + digit;
            number1 = number1 / 10;
            }
        while (number1 > 0);
        System.out.println(reverse);
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
        sc.close();
}
}

