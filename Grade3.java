import java.util.Scanner;

public class Grade3 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Your Score:");
        int X = scanner.nextInt();
        if((X >= 80) && (X <= 100)){
            System.out.println("Your Grade is A"  );
        }else if((X >=75) &&(X <= 79)){
            System.out.println("Your Grade is B+" );
        }else if((X >= 70) && (X <= 74)){
            System.out.println("Your Grade is B" );
        }else if((X >=65) && (X <= 69)){
            System.out.println("Your Grade is C+" );
        }else if((X >=60) && (X <= 64)){
            System.out.println("Your Grade is C");
        }else if((X >= 55) && (X <= 59)){
            System.out.println("Your Grade is D+");
        }else if((X >= 50) && (X <= 54)){
            System.out.println("Your Grade is D");

        }else if((X >= 50) && (X <= 54)){
            System.out.println("Your Grade is Bug");
        }else{
            System.out.println("Your Grade is F") ;
        }

}

}

