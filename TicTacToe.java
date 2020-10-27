import java.util.Scanner;

public class TicTacToe
{
	public static void main (String args[])
	{
		//Initializing and declaring variables
		Scanner scan = new Scanner(System.in);
		String usrPos = "NULL";
		char usrIn = '*';
		char pos0 = '*';
		char pos1 = '*';
		char pos2 = '*';
		char pos3 = '*';
		char pos4 = '*';
		char pos5 = '*';
		char pos6 = '*';
		char pos7 = '*';
		char pos8 = '*';
		
		//Initial grid row 1
		System.out.print(pos0 + " |");
		System.out.print(pos1 + " |");
		System.out.println(" " + pos2 + " ");
		
		//Initial grid row 2
		System.out.print(pos3 + " |");
		System.out.print(pos4 + " |");
		System.out.println(" " + pos5 + " ");
		
		//Initial grid row 3
		System.out.print(pos6 + " |");
		System.out.print(pos7 + " |");
		System.out.println(" " + pos8 + " ");
		
		
		//First row
		//Getting position 0
		System.out.println("Please enter which to put at position 0:");
		usrPos = scan.next();
		usrIn = usrPos.charAt(0);
		pos0 = usrIn;
		
		if((pos0 == 'O') || (pos0 == 'o') || (pos0 == 'X') || (pos0 == 'x'))
		{
			System.out.print(pos0 + " |");
			System.out.print(pos1 + " |");
			System.out.println(" " + pos2 + " ");
			
			System.out.print(pos3 + " |");
			System.out.print(pos4 + " |");
			System.out.println(" " + pos5 + " ");
			
			System.out.print(pos6 + " |");
			System.out.print(pos7 + " |");
			System.out.println(" " + pos8 + " ");
		}
		
		else
		{
			System.out.println("Invalid input!");
			System.exit(0);
		}
		
		//Getting position 1
		System.out.println("Please enter which to put at position 1:");
		usrPos = scan.next();
		usrIn = usrPos.charAt(0);
		pos1 = usrIn;
		
		if((pos1 == 'O') || (pos1 == 'o') || (pos1 == 'X') || (pos1 == 'x'))
		{
			System.out.print(pos0 + " |");
			System.out.print(pos1 + " |");
			System.out.println(" " + pos2 + " ");
			
			System.out.print(pos3 + " |");
			System.out.print(pos4 + " |");
			System.out.println(" " + pos5 + " ");
			
			System.out.print(pos6 + " |");
			System.out.print(pos7 + " |");
			System.out.println(" " + pos8 + " ");
		}
		
		else
		{
			System.out.println("Invalid input!");
			System.exit(0);
		}
		
		//Getting position 2
		System.out.println("Please enter which to put at position 2:");
		usrPos = scan.next();
		usrIn = usrPos.charAt(0);
		pos2 = usrIn;
		
		if((pos2 == 'O') || (pos2 == 'o') || (pos2 == 'X') || (pos2 == 'x'))
		{
			System.out.print(pos0 + " |");
			System.out.print(pos1 + " |");
			System.out.println(" " + pos2 + " ");
			
			System.out.print(pos3 + " |");
			System.out.print(pos4 + " |");
			System.out.println(" " + pos5 + " ");
			
			System.out.print(pos6 + " |");
			System.out.print(pos7 + " |");
			System.out.println(" " + pos8 + " ");
		}
		
		else
		{
			System.out.println("Invalid input!");
			System.exit(0);
		}
		
		//Win check
		if(((pos0 == 'x') || (pos0 == 'X')) && ((pos1 == 'x') || (pos1 == 'X')) && ((pos2 == 'x') || (pos2 == 'X')))
		{
			System.out.println("X - You win!");
		}
		
		else if(((pos0 == 'o') || (pos0 == 'O')) && ((pos1 == 'o') || (pos1 == 'O')) && ((pos2 == 'o') || (pos2 == 'O')))
		{
			System.out.println("O - You win!");
		}
		
		else
		{
			//Second row
			//Getting position 3
			System.out.println("Please enter which to put at position 3:");
			usrPos = scan.next();
			usrIn = usrPos.charAt(0);
			pos3 = usrIn;
			
			if((pos3 == 'O') || (pos3 == 'o') || (pos3 == 'X') || (pos3 == 'x'))
			{
				System.out.print(pos0 + " |");
				System.out.print(pos1 + " |");
				System.out.println(" " + pos2 + " ");
				
				System.out.print(pos3 + " |");
				System.out.print(pos4 + " |");
				System.out.println(" " + pos5 + " ");
				
				System.out.print(pos6 + " |");
				System.out.print(pos7 + " |");
				System.out.println(" " + pos8 + " ");
			}
			
			else
			{
				System.out.println("Invalid input!");
				System.exit(0);
			}
			
			//Getting position 4
			System.out.println("Please enter which to put at position 4:");
			usrPos = scan.next();
			usrIn = usrPos.charAt(0);
			pos4 = usrIn;
			
			if((pos4 == 'O') || (pos4 == 'o') || (pos4 == 'X') || (pos4 == 'x'))
			{
				System.out.print(pos0 + " |");
				System.out.print(pos1 + " |");
				System.out.println(" " + pos2 + " ");
				
				System.out.print(pos3 + " |");
				System.out.print(pos4 + " |");
				System.out.println(" " + pos5 + " ");
				
				System.out.print(pos6 + " |");
				System.out.print(pos7 + " |");
				System.out.println(" " + pos8 + " ");
			}
			
			else
			{
				System.out.println("Invalid input!");
				System.exit(0);
			}
			
			//Getting position 5
			System.out.println("Please enter which to put at position 5:");
			usrPos = scan.next();
			usrIn = usrPos.charAt(0);
			pos5 = usrIn;
			
			if((pos5 == 'O') || (pos5 == 'o') || (pos5 == 'X') || (pos5 == 'x'))
			{
				System.out.print(pos0 + " |");
				System.out.print(pos1 + " |");
				System.out.println(" " + pos2 + " ");
				
				System.out.print(pos3 + " |");
				System.out.print(pos4 + " |");
				System.out.println(" " + pos5 + " ");
				
				System.out.print(pos6 + " |");
				System.out.print(pos7 + " |");
				System.out.println(" " + pos8 + " ");
			}
			
			else
			{
				System.out.println("Invalid input!");
				System.exit(0);
			}
			
			//Win check
			if(((pos3 == 'x') || (pos3 == 'X')) && ((pos4 == 'x') || (pos4 == 'X')) && ((pos5 == 'x') || (pos5 == 'X')))
			{
				System.out.println("X - You win!");
			}
			
			else if(((pos3 == 'o') || (pos3 == 'O')) && ((pos4 == 'o') || (pos4 == 'O')) && ((pos5 == 'o') || (pos5 == 'O')))
			{
				System.out.println("O - You win!");
			}
			
			else
			{
				//Third row
				//Getting position 6
				System.out.println("Please enter which to put at position 6:");
				usrPos = scan.next();
				usrIn = usrPos.charAt(0);
				pos6 = usrIn;
				
				if((pos6 == 'O') || (pos6 == 'o') || (pos6 == 'X') || (pos6 == 'x'))
				{
					System.out.print(pos0 + " |");
					System.out.print(pos1 + " |");
					System.out.println(" " + pos2 + " ");
					
					System.out.print(pos3 + " |");
					System.out.print(pos4 + " |");
					System.out.println(" " + pos5 + " ");
					
					System.out.print(pos6 + " |");
					System.out.print(pos7 + " |");
					System.out.println(" " + pos8 + " ");
				}
				
				else
				{
					System.out.println("Invalid input!");
					System.exit(0);
				}
				
				//Getting position 7
				System.out.println("Please enter which to put at position 7:");
				usrPos = scan.next();
				usrIn = usrPos.charAt(0);
				pos7 = usrIn;
				
				if((pos7 == 'O') || (pos7 == 'o') || (pos7 == 'X') || (pos7 == 'x'))
				{
					System.out.print(pos0 + " |");
					System.out.print(pos1 + " |");
					System.out.println(" " + pos2 + " ");
					
					System.out.print(pos3 + " |");
					System.out.print(pos4 + " |");
					System.out.println(" " + pos5 + " ");
					
					System.out.print(pos6 + " |");
					System.out.print(pos7 + " |");
					System.out.println(" " + pos8 + " ");
				}
				
				else
				{
					System.out.println("Invalid input!");
					System.exit(0);
				}
				
				//Getting position 8
				System.out.println("Please enter which to put at position 8:");
				usrPos = scan.next();
				usrIn = usrPos.charAt(0);
				pos8 = usrIn;
				
				if((pos8 == 'O') || (pos8 == 'o') || (pos8 == 'X') || (pos8 == 'x'))
				{
					System.out.print(pos0 + " |");
					System.out.print(pos1 + " |");
					System.out.println(" " + pos2 + " ");
					
					System.out.print(pos3 + " |");
					System.out.print(pos4 + " |");
					System.out.println(" " + pos5 + " ");
					
					System.out.print(pos6 + " |");
					System.out.print(pos7 + " |");
					System.out.println(" " + pos8 + " ");
				}
				
				else
				{
					System.out.println("Invalid input!");
					System.exit(0);
				}
				
				//Win check
				if(((pos6 == 'x') || (pos6 == 'X')) && ((pos7 == 'x') || (pos7 == 'X')) && ((pos8 == 'x') || (pos8 == 'X')))
				{
					System.out.println("X - You win!");
				}
				
				else if(((pos6 == 'o') || (pos6 == 'O')) && ((pos7 == 'o') || (pos7 == 'O')) && ((pos8 == 'o') || (pos8 == 'O')))
				{
					System.out.println("O - You win!");
				}
				
				else if(((pos0 == 'x') || (pos0 == 'X')) && ((pos3 == 'x') || (pos3 == 'X')) && ((pos6 == 'x') || (pos6 == 'X')))
				{
					System.out.println("X - You win!");
				}
				
				else if(((pos0 == 'o') || (pos0 == 'O')) && ((pos3 == 'o') || (pos3 == 'O')) && ((pos6 == 'o') || (pos6 == 'O')))
				{
					System.out.println("O - You win!");
				}
				
				else if(((pos1 == 'x') || (pos1 == 'X')) && ((pos4 == 'x') || (pos4 == 'X')) && ((pos7 == 'x') || (pos7 == 'X')))
				{
					System.out.println("X - You win!");
				}
				
				else if(((pos1 == 'o') || (pos1 == 'O')) && ((pos4 == 'o') || (pos4 == 'O')) && ((pos7 == 'o') || (pos7 == 'O')))
				{
					System.out.println("O - You win!");
				}
				
				else if(((pos2 == 'x') || (pos2 == 'X')) && ((pos5 == 'x') || (pos5 == 'X')) && ((pos8 == 'x') || (pos8 == 'X')))
				{
					System.out.println("X - You win!");
				}
				
				else if(((pos2 == 'o') || (pos2 == 'O')) && ((pos5 == 'o') || (pos5 == 'O')) && ((pos8 == 'o') || (pos8 == 'O')))
				{
					System.out.println("O - You win!");
				}
				
				else if(((pos2 == 'x') || (pos2 == 'X')) && ((pos4 == 'x') || (pos4 == 'X')) && ((pos6 == 'x') || (pos6 == 'X')))
				{
					System.out.println("X - You win!");
				}
				
				else if(((pos2 == 'o') || (pos2 == 'O')) && ((pos4 == 'o') || (pos4 == 'O')) && ((pos6 == 'o') || (pos6 == 'O')))
				{
					System.out.println("O - You win!");
				}
				
				else if(((pos0 == 'x') || (pos0 == 'X')) && ((pos4 == 'x') || (pos4 == 'X')) && ((pos8 == 'x') || (pos8 == 'X')))
				{
					System.out.println("X - You win!");
				}
				
				else if(((pos0 == 'o') || (pos0 == 'O')) && ((pos4 == 'o') || (pos4 == 'O')) && ((pos8 == 'o') || (pos8 == 'O')))
				{
					System.out.println("O - You win!");
				}
				
				else
				{
					System.out.println("It's a draw!");
				}
			}
		}
	}
}