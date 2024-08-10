import java.util.Scanner;

public class Grade5 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score:");
        int X = scanner.nextInt();
        String D;
        if((X <= 54) && (X >= 50)){
            D = "D";
        }else if((X <= 59) &&(X >= 55)){
            D = "D+";
        }else if((X <= 64) && (X >= 60)){
            D = "C";
        }else if((X <= 69) && (X >= 65)){
            D = "C+";
        }else if((X <= 74) && (X >= 70)){
            D = "B";
        }else if((X <= 79) && (X >= 75)){
            D = "B+";
        }else if((X <= 100) && (X >= 80)){
            D = "A";
        }else if(X > 100){
            D = "Bug";
        }else{
            D = "F";
        }
        System.out.println("Your Grade is " + D);

    }
}
    

