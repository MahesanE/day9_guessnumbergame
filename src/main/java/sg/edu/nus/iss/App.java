package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Random random = new Random();
        Integer guessNumber = random.nextInt (100);
        Scanner scanner = new Scanner(System.in);

        Integer myGuess = 0;



        while(myGuess != guessNumber){

            System.out.println("Guess a number from 1-100");
            myGuess = scanner.nextInt();
            if(myGuess > guessNumber){
                System.out.println("Your guess is too high");
            } else if(myGuess < guessNumber){
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Well done!!");
                scanner.close();
                System.exit(0);

            }

            
        }
    }
}
