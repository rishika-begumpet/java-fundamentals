
    import java.util.Scanner;

    public class marks {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int totalMarks = 0;
            for(int i = 1; i <= 5 ; i++) {
                int subject = scanner.nextInt();
                if (subject >= 0 && subject <= 100) {
                    totalMarks += subject;
                } else {
                    System.out.println("Invalid Input");
                }
            }
                System.out.println(totalMarks);
                if(totalMarks >= 450){
                    System.out.println("Grade A");
                }else if (totalMarks >= 400){
                    System.out.println("Grade B");
                }else if(totalMarks >= 350){
                    System.out.println("Grade C");
                }else if(totalMarks >= 300){
                    System.out.println("Grade D");
                }else {
                    System.out.println("Grade F");
                }
             scanner.close();

        }
    }
