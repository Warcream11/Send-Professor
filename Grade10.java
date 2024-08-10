import java.util.Scanner;

public class Grade10 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score:");
        int YourScore = scanner.nextInt();
        String Grade;

        if (YourScore > 100) {
            Grade = "Bug";
        } else if (YourScore < 50) {
            Grade = "F";
        } else if (YourScore <= 54) {
            Grade = "D";
        } else if (YourScore <= 59) {
            Grade = "D+";
        } else if (YourScore <= 64) {
            Grade = "C";
        } else if (YourScore <= 69) {
            Grade = "C+";
        } else if (YourScore <= 74) {
            Grade = "B";
        } else if (YourScore <= 79) {
            Grade = "B+";
        } else {
            Grade = "A";
        }

        System.out.println("Your Grade Is " + Grade);
}
    
}
