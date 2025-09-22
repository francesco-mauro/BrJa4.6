import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declare Variable

        Scanner scanner = new Scanner(System.in);
        String[] choices = {"sasso", "carta", "forbice"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        do {

            // Get choice from the user
            System.out.println("Benvenuto! scegli: CARTA SASSO o FORBICE");
            playerChoice = scanner.nextLine().toLowerCase().trim();

            if (!playerChoice.equals("sasso") &&
                    !playerChoice.equals("carta") &&
                    !playerChoice.equals("forbice")) {

                System.out.println("Devi inserire una scelta valida");
                continue;
            }

            // Get random choice for the computer

            Random random = new Random();
            computerChoice = choices[random.nextInt(3)].toLowerCase().trim();
            System.out.println("Computer choice: " + computerChoice);

            // Check WIn conditions

            if (playerChoice.equals(computerChoice)) {
                System.out.println("PAREGGIO");
            } else if (
                    (playerChoice.equals("sasso") && computerChoice.equals("forbice")) ||
                            (playerChoice.equals("forbice") && computerChoice.equals("carta")) ||
                            (playerChoice.equals("carta") && computerChoice.equals("sasso"))
            ) {

                System.out.println("HAI VINTO");
            } else{
                System.out.println("HAI PERSO");
            }

            System.out.println("Gioca ancora? (si/no): ");
            playAgain = scanner.nextLine().toLowerCase().trim();

        }while (playAgain.equals("si"));

        System.out.println("Grazie di aver giocato!");


        // Ask to play again
        // Goodbye Message


        scanner.close();
    }
}
