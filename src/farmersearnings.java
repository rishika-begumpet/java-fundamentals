
    import java.util.Scanner;
    public class farmersearnings {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double pricePerKg = scanner.nextDouble();
            int quantitySold = scanner.nextInt();
            if(pricePerKg >= 0.0 && pricePerKg <= 1000.0 && quantitySold >= 0 && quantitySold <= 100){
                double totalEarnings = pricePerKg*quantitySold ;
                System.out.println(totalEarnings);
            }else{
                System.out.println("Invalid Input");
            }



            scanner.close();
        }
    }

