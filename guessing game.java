
import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number=(int)(Math.random()*100);
        int usernumber=0;
        do {
            System.out.println("Guess my number:");
            usernumber = sc.nextInt();

            if
                (usernumber == number){
                System.out.println("you guessed the right number");
                break;
            }
            else if
                (usernumber> number){
                System.out.println("your number is large");
            }
            else{
                System.out.println("your number is small");

            }
        }while(usernumber>=0);
        System.out.print("My number was:");
        System.out.println(number);


    }
}
