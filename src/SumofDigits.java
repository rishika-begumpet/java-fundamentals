import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n;i++) {
            int digit = n % 10;
            sum += digit;
            n = n / 10;
        }System.out.println(sum);
    }
}
