import java.util.Scanner;

public class rockpapperscissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String keepPlaying = "y";

        // main loop for playing multiple rounds
        while (keepPlaying.equalsIgnoreCase("y")) {

            // get move for player A
            System.out.print("Player A - Enter R, P, or S: ");
            String playerA = scanner.nextLine();

            while (!playerA.equalsIgnoreCase("R") && !playerA.equalsIgnoreCase("P") && !playerA.equalsIgnoreCase("S")) {
                System.out.println("Invalid input! Try again.");
                System.out.print("Player A - Enter R, P, or S: ");
                playerA = scanner.nextLine();
            }

            // get move for player B
            System.out.print("Player B - Enter R, P, or S: ");
            String playerB = scanner.nextLine();

            while (!playerB.equalsIgnoreCase("R") && !playerB.equalsIgnoreCase("P") && !playerB.equalsIgnoreCase("S")) {
                System.out.println("Invalid input! Try again.");
                System.out.print("Player B - Enter R, P, or S: ");
                playerB = scanner.nextLine();
            }

            // figure out the winner and print the right phrase
            if (playerA.equalsIgnoreCase(playerB)) {
                System.out.println(playerA.toUpperCase() + " vs " + playerB.toUpperCase() + " it's a Tie!");
            }
            // Player A wins conditions
            else if (playerA.equalsIgnoreCase("R") && playerB.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("P") && playerB.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player A wins!");
            }
            else if (playerA.equalsIgnoreCase("S") && playerB.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player A wins!");
            }
            // Player B wins conditions
            else if (playerB.equalsIgnoreCase("R") && playerA.equalsIgnoreCase("S")) {
                System.out.println("Rock breaks Scissors");
                System.out.println("Player B wins!");
            }
            else if (playerB.equalsIgnoreCase("P") && playerA.equalsIgnoreCase("R")) {
                System.out.println("Paper covers Rock");
                System.out.println("Player B wins!");
            }
            else if (playerB.equalsIgnoreCase("S") && playerA.equalsIgnoreCase("P")) {
                System.out.println("Scissors cuts Paper");
                System.out.println("Player B wins!");
            }

            // ask if they want to go again
            System.out.print("Would you like to play again? [Y/N]: ");
            keepPlaying = scanner.nextLine();
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}