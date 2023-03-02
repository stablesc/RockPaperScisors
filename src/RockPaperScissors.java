import java.util.Scanner;
public class RockPaperScissors
{
    public static void main(String[] args)
    {
        //Declarations
        Scanner in = new Scanner(System.in);
        String playerA; // [R,P,S,r,p,s}
        String playerB; // [R,P,S,r,p,s}

        System.out.println("Player A, what is your move? [R,P,S] : ");
        playerA = in.next();

        System.out.println();
        System.out.println("Player B, what is your move? [R,P,S]: ");
        playerB = in.next();

        System.out.println();

        if (playerA.equalsIgnoreCase("R"))
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("It's a tie.");
            }
            else if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("P covers R, Player B wins!");
                } else // PlayerB = S
                {
                  System.out.println("R breaks S, Player A wins!");  
                }

            } 
        else if (playerA.equalsIgnoreCase("P")) 
        {
            if (playerB.equalsIgnoreCase("R")) {
                System.out.println("P covers R, Player A wins!.");
            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.println("It's a tie.");
            } else // PlayerB = S
            {
                System.out.println("S cuts P, Player B wins!");
            }
        }
        else // PlayerA = S
        {
            if (playerB.equalsIgnoreCase("R")) {
                System.out.println("R breaks S, Player B wins!.");
            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.println("S cuts P, Player A wins!");
            } else // PlayerB = S
            {
                System.out.println("It's a tie.");
            }
        }

    }
}
