import java.util.Scanner;

public class practice3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		//next�U�����F�F
		String game = scanner.nextLine();
		
		
		boolean bool = false;
		
		if(game.equals("scissors"))
		{
			System.out.println("stone");
		}
		else if(game.equals("paper"))
		{	
			System.out.println("scissors");
		}
		else 
		{
			System.out.println("paper");
		}
	}

}