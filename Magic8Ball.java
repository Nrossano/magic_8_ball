import java.util.Scanner;

public class Magic8Ball
{
	public static void main(String[] args) {
		String question;
		int randomNum;
		String[] response = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes - definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."};
		final String QUIT = "QUIT";
		Scanner keyboard = new Scanner(System.in);

		System.out.print("The Magic 8-ball knows all! Please enter a yes-or-no question! Or type " + QUIT + " to return to your ordinary life.");
		question = keyboard.nextLine();

		while(!question.equalsIgnoreCase(QUIT))
		{
			randomNum = (int)((1 * Math.random() * response.length) - 1);
			System.out.println("The magic 8 ball says: " + response[randomNum]);
			System.out.print("Would you like to ask another question? \nEnter your yes or no question. Or type " + QUIT + " to end the program");
			question = keyboard.nextLine();
		}
	}
}