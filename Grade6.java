import java.util.Scanner;

public class Grade6 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score:");
        int X = scanner.nextInt();
        if((X <= 54) && (X >= 50)){
            System.out.println("Your Grade is D");
        }else if((X <= 59) && (X >= 55)){
            System.out.println("Your Grade is D+");
        }else if((X <= 64) && (X >= 60)){
            System.out.println("Your Grade is C");
        }else if((X <= 69) && (X >= 65)){
            System.out.println("Your Grade is C+");
        }else if((X <= 74) && (X >= 70)){
            System.out.println("Your Grade is B");
        }else if((X <= 79) && (X >= 75)){
            System.out.println("Your Grade is B+");
        }else if((X <= 100) && (X >= 80)){
            System.out.println("Your Grade is A" );
        }else if(X > 100 ){
            System.out.println("Your Grade is Bug" );
        }else{
            System.out.println("Your Grade is F" );
        }
}
}
