
//this is a project made for hacktoberfest
import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String [] args) {
        int randomnumber;
        boolean guessed;
        guessed=false;
        randomnumber = (int)(Math.random()*100 + 1);
        System.out.print("Guess the number:");
        Scanner scanner = new Scanner(System.in);
        for (int i = 10;i>0;i--){
            int guessednnumber;
            System.out.println("You have "+i+" chances left ");
            System.out.print("Guess the number:");
            guessednnumber = scanner.nextInt();
            if (guessednnumber==randomnumber) {
                System.out.print("You have guessed it right");
                guessed=true;
                break;
            } else if (guessednnumber >= randomnumber) {
                System.out.println("The number is smaller than "+ guessednnumber);

            } else if (guessednnumber <= randomnumber) {
                System.out.println("The number is greater than " + guessednnumber);

            }
        }
        if(guessed==false)
        {
            System.out.println("The number is " + randomnumber);
        }

    }

}
