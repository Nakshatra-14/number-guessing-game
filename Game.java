import java.util.*;

public class Game {

    public static int randGen(int lb, int ub) {
        return lb + (int)((ub - lb + 1) * Math.random());
    }
    public static void main(String[] args) {
        int lb = 1, ub = 100;
        Scanner inp = new Scanner(System.in);
        System.out.println("\n\n=== Welcome to the Number Guessing Game! ===\n\n" + "I'm thinking of a number between " + lb + " and " + ub);
        System.out.println("\nPlease select the difficulty level:\n" + "1. Easy (10 chances)\n" + "2. Medium (5 chances)\n" + "3. Hard (3 chances)\n");
        System.out.print("Enter your choice: ");
        int d = inp.nextInt();
        if(d != 1 || d != 2 || d != 3)
            while(true) {
                System.out.println("Invalid Input");
                System.out.print("Enter your choice: ");
                d = inp.nextInt();
                if(d == 1 || d == 2 || d == 3)
                    break;
            }
        int n = 0;
        if(d == 1) {
            n = 10;
            System.out.println("\nGreat! You have selected the Easy difficulty level.");
        }
        else if(d == 2){
            n = 5;
            System.out.println("\nGreat! You have selected the Medium difficulty level.");
        }
        else if(d == 3) {
            n = 3;
            System.out.println("\nGreat! You have selected the Hard difficulty level.");
        }
    
        System.out.println("\n== Let's start the game! ==");
        int num = randGen(lb, ub);
        int i, f = 0;
        
        for(i = 1 ; i <= n ; i++) {
            System.out.print("\nEnter your guess: ");
            int guess = inp.nextInt();
            if(guess > num)
                System.out.println("Incorrect! The number is less than " + guess);
            else if(guess < num)
                System.out.println("Incorrect! The number is greater than " + guess); 
            else {
                System.out.println("\n== Congratulations! You guessed the correct number in " + i +" attempts ==");
                f = 1;    
                break;
            }   
        }

        if(f == 0)
            System.out.println("== You lose! Out of chance ==");

    }
}
