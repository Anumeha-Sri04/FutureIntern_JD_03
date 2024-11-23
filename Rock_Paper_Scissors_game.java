import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String args[])
    {

        String[] moves={"rock","paper","scissors"};
        String Computermove= moves[new Random().nextInt(moves.length)];

        Scanner sc=new Scanner(System.in);

        String playermove;
        while(true)
        {
            System.out.println("Please enter a move (rock,paper,or scissors)");
            playermove= sc.nextLine();
            if(playermove.equals("rock")||playermove.equals("paper")||playermove.equals("scissors"))
            {
                break;
            }
            System.out.println(playermove + " is not a valid move");
        }

        System.out.println("The computer played "+ Computermove);
        if(Computermove.equals(playermove))
        {
            System.out.println("The game is a tie!");
        }
        else if(playermove.equals("rock"))
        {
            if(Computermove.equals("paper"))
            {
                System.out.println("You lose!");
            }
            else  if(Computermove.equals("scissors"))
            {
                System.out.println("You win!");
            }
        }

        else if(playermove.equals("paper"))
        {
            if(Computermove.equals("rock"))
            {
                System.out.println("You win!");
            }
            else  if(Computermove.equals("scissors"))
            {
                System.out.println("You lose!");
            }
        }

        else if(playermove.equals("scissors"))
        {
            if(Computermove.equals("paper"))
            {
                System.out.println("You win!");
            }
            else  if(Computermove.equals("rock"))
            {
                System.out.println("You lose!");
            }
        }
    }
}
