import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int factorial = number * 1 ;
        System.out.print("Factorial of" + number + ":" );
        System.out.print( number + "*" );
        for( int i = number - 1;i >= 1;i--) {
            System.out.print(i + "*");
            factorial *= i;
        } System.out.print("=" + factorial);
        sc.close();
    }
}
