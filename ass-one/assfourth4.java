package assssone;
import java.util.*;
import static java.lang.System.out;
public class assfourth4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 seasonnamevalidation();
	}
	public static void seasonnamevalidation()
	{
		String season;
		try(Scanner input = new Scanner(System.in))
		{
			boolean result = false;
			while (result == false)
			{
				out.print("Enter the name of a season: ");
				season = input.nextLine();
				switch (season.toLowerCase())
				{
				case "summer":
					out.println("Summer is an oil painting.");
					result = true;
					break;
				case "spring":
					out.println("Spring is a water colour.");
					result = true;
					break;
				case "winter":
					out.println("Winter is an etching.");
					result = true;
					break;
				case "autumn":
					out.println("Autumn is a mosaic of them all.");
					result = true;
					break;
				default:
					out.println("That is a invalid season. Please check your spelling.");
					break;
				}
			}
		}
	}
}
