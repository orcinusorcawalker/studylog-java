package assssone;
import static java.lang.System.out;
import java.util.Scanner;
public class assthird3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		determineseason();
}
		static void determineseason()
		{
			int month;
			try(Scanner input = new Scanner(System.in))
			{
				out.print("Enter a month(1~12), get what season is that : ");//get user input
				month = input.nextInt();//place for input
			}
			switch(month)
			{
				case 12:
				case 1:
				case 2:
					out.println("Summer");
					break;
				case 3:
				case 4:
				case 5:
					out.println("Autumn");
				    break;
				case 6:
				case 7:
				case 8:
					out.println("Winter");
					break;
				case 9:
				case 10:
				case 11:
					out.println("Spring");
					break;
				default:
					out.print("Enter a exist month in 12 months.");
					break;
			}

		}

	}

