import java.util.Scanner;

public class Grade9 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Your Score:");
    int YourScore = scanner.nextInt();
    String Grade;
    if (YourScore >= 80 && YourScore <= 100) {
        Grade = "A";
    } else if (YourScore >= 75 && YourScore <= 79) {
        Grade = "B+";
    } else if (YourScore >= 70 && YourScore <= 74) {
        Grade = "B";
    } else if (YourScore >= 65 && YourScore <= 69) {
        Grade = "C+";
    } else if (YourScore >= 60 && YourScore <= 64) {
        Grade = "C";
    } else if (YourScore >= 55 && YourScore <= 59) {
        Grade = "D+";
    } else if (YourScore >= 50 && YourScore <= 54) {
        Grade = "D";
    } else if (YourScore < 50) {
        Grade = "F";
    } else {
        Grade = "Bug";
    }
    System.out.println("Your Grade is " + Grade);
}
    
}
