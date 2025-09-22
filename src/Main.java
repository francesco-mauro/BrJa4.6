import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        // Declare Variable

        Scanner scanner = new Scanner(System.in);
        String[] choices = {"rock" , "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain;

// Get choice from the user
        System.out.println("Benvenuto! scegli: CARTA SASSO o FORBICE");
        playerChoice = scanner.nextLine().toLowerCase().trim();

        if (!playerChoice.equals("sasso") &&
                !playerChoice.equals("carta") &&
                !playerChoice.equals("forbice")){

            System.out.println("Devi inserire una scelta valida");
        }


        // Get random choice for the computer
        Random random = new Random();
        // Check WIn conditions
        // Ask to play again
        // Goodbye Message


        scanner.close();
    }
}
