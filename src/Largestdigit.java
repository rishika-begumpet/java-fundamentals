import java.util.Scanner;
public class Largestdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int largest = 0;
            int digit = n % 10;
            largest = digit;
            n = n/10;
            System.out.println(largest);
        }
    }

