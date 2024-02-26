package BE_week_6;

public class Application {
	
	public static void main(String[] args) {	
		
		Player player1 = new Player ("Lina");
		Player player2 = new Player ("Zack");
		
		Deck gameDeck = new Deck();
		gameDeck.shuffle();
		gameDeck.shuffle();
		gameDeck.deal(player1, player2);
		
		System.out.println ("****************** Let's Play War! ******************");
		System.out.println();

		for (int i = 0; i < 26 ; i++)
		{
			int turn = i + 1;
			System.out.println ("****************** Turn " + turn + " ******************");
			Card player1TurnCard = player1.playACard();
			System.out.print(player1.getName() + " plays ");
			System.out.print(player1TurnCard.toString());
			System.out.println();
			
			Card player2TurnCard = player2.playACard();
			System.out.print(player2.getName() + " plays ");
			System.out.print(player2TurnCard.toString());
			System.out.println();
			
			if(player1TurnCard.getValue() > player2TurnCard.getValue())
			{
				System.out.println();
				System.out.println(player1.getName() + " wins the turn!");
				player1.setScore(player1.getScore()+ 1);
				System.out.println();
			}
			else if (player2TurnCard.getValue() > player1TurnCard.getValue())
			{
				System.out.println();
				System.out.println(player2.getName() + " wins the turn!");
				player2.setScore(player2.getScore()+ 1);
				System.out.println();
			}
			else //final case is war
			{
				System.out.println();
				System.out.println("It's a tie! Next turn!");
				System.out.println();
				
			}
			System.out.println ("Current score: " + player1.getName() + " " + player1.getScore() + " point(s) / "
					+ player2.getName() + " " + player2.getScore() + " point(s)"
					);
			System.out.println();
		}
		System.out.println("****************** Who is our winner? ******************");
		if (player1.getScore() > player2.getScore())
		{
			System.out.println();
			System.out.println(player1.getName() + " wins with " + player1.getScore() + " points!");
		}
		else if (player2.getScore() > player1.getScore())
		{
			System.out.println();
			System.out.println(player2.getName() + " wins with " + player2.getScore() + " points!");
		}
		else
		{
			System.out.println();
			System.out.println("It's a tie! Time for a tie breaker!");
		}


		

	}

}
