import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        for(int i = 1 ; i <= 10 ;i++) {
            number  = number + result;
            result += number ;
            System.out.print(number + " , " );
            System.out.print(result + " , ");
        }   sc.close();
    }
}

