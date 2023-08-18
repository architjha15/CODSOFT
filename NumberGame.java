import java.util.Scanner;

class Game{
    public int answer;
    public void msg(){
        System.out.println("Think of a number between 1 and 100.\nYou have 5 chance to guess.");
        answer = (int)(Math.random()*100)+1;
        for (int i = 1; i <= 5; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Attempt "+ i + "\nEnter your guess number: ");
            int guess = input.nextInt();
            if (guess == answer) {
                System.out.println("Guess is correct.");
                input.close();
                return;
            }
            else if (guess>answer) {
                System.out.println("Guess is too high.");
            }
            else {
                System.out.println("Guess is too low.");
            }
        }
        System.out.println("Failed!! The number is "+answer);
    }
}

public class NumberGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.msg();
        Scanner num = new Scanner(System.in);
        System.out.println("Do you want to play the game again?\nPress 1 for Yes\nPress 2 for No.");
        int in = num.nextInt();
        if (in == 1) {
            game.msg();
        } else {
            System.out.println("Thanks for playing the game!!");
        }
    }
}
