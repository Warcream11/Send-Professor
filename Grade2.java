import java.util.Scanner;

/**
 * Grade2
 */
public class Grade2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score:");
        int X = scanner.nextInt();
        String D;
        if((X >= 80) && (X <= 100)){
            D = "A";
        }else if((X >=75) &&(X <= 79)){
            D = "B+";
        }else if((X >= 70) && (X <= 74)){
            D = "B";
        }else if((X >=65) && (X <= 69)){
            D = "C+";
        }else if((X >=60) && (X <= 64)){
            D = "C";
        }else if((X >= 55) && (X <= 59)){
            D = "D+";
        }else if((X >= 50) && (X <= 54)){
            D = "D";
        }else{
            D = "F";
        }
        System.out.println("Your Grade is " + D);

    }
}