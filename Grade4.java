import java.util.Scanner;

public class Grade4 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score:");
        int YourScore = scanner.nextInt();
        if (YourScore >= 80 ){
            System.out.println("Your Grade is A"  );
        }else if(YourScore >= 75){
            System.out.println("Your Grade is B+"  );
        }else if(YourScore >= 70){
            System.out.println("Your Grade is B"  );
        }else if(YourScore >= 65){
            System.out.println("Your Grade is C+"  );
        }else if(YourScore >= 60){
            System.out.println("Your Grade is C"  );
        }else if(YourScore >= 55){
            System.out.println("Your Grade is D+"  );
        }else if(YourScore >= 50){
            System.out.println("Your Grade is D"  );
        }else if(YourScore > 100){
            System.out.println("Your Grade is ERROR"  );
        }else{
            System.out.println("Your Grade is F"  );
        }
}
    
}
