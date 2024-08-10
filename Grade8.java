import java.util.Scanner;

public class Grade8 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Score:");
        int YourScore = scanner.nextInt();
        if ((YourScore <50 )){
            System.out.println("Your Grade Is F ");
        }else if(YourScore <= 54){
            System.out.println("Your Grade Is D");
        }else if(YourScore <= 59){
            System.out.println("Your Grade Is D+ ");
        }else if(YourScore <= 64){
            System.out.println("Your Grade Is C ");
        }else if(YourScore <= 69){
            System.out.println("Your Grade Is C+");
        }else if(YourScore <= 74){
            System.out.println("Your Grade Is B");
        }else if(YourScore <= 79){
            System.out.println("Your Grade Is B+");
        }else if(YourScore <= 100){
            System.out.println("Your Grade Is A");
        }else if(YourScore > 100){
            System.out.println("Your Grade Is Bug");
        }
}
    
}
