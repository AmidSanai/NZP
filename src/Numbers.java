import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        System.out.println("Enter your number to tell you its Negative,Zero or Positive.");
        num = scan.nextInt();

        if (num < 0){

            System.out.println("Your number is Negative");

        }else if (num > 0){

            System.out.println("Your number is Positive");

        }else if (num == 0){

            System.out.println("Your number is Zero.");

        }else{

            System.out.println("Your number is not Negative, positive or Zero");

        }

    }

}
