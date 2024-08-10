import java.util.Scanner;

public class Grade7 {public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Your Score:");
    int YourScore = scanner.nextInt();
    if (YourScore >= 80 && YourScore <= 100) {
        System.out.println("Your Grade Is A");
    } else if (YourScore >= 75 && YourScore <= 79) {
        System.out.println("Your Grade Is B+");
    } else if (YourScore >= 70 && YourScore <= 74) {
        System.out.println("Your Grade Is B");
    } else if (YourScore >= 65 && YourScore <= 69) {
        System.out.println("Your Grade Is C+");
    } else if (YourScore >= 60 && YourScore <= 64) {
        System.out.println("Your Grade Is C");
    } else if (YourScore >= 55 && YourScore <= 59) {
        System.out.println("Your Grade Is D+");
    } else if (YourScore >= 50 && YourScore <= 54) {
        System.out.println("Your Grade Is D");
    } else if (YourScore < 50) {
        System.out.println("Your Grade Is F");
    } else {
        System.out.println("Your Grade Is BUG");
    }
 }
}
    

