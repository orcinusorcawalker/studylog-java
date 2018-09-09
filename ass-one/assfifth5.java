package assssone;
import static java.lang.System.out;
import java.util.*;
public class assfifth5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculatingstockPrice();
	}
	public static void calculatingstockPrice()
	{
		int stocks;
		double total = 0.0;
		try (Scanner input = new Scanner(System.in))
		{
			out.print("How many stocks to enter price for: ");
			stocks = input.nextInt();
			double[] price = new double[stocks];
			for (int i = 0; i < price.length; i++)
			{
				out.printf("Enter price for stock #" + (i + 1) + ": ");
				price[i] = input.nextDouble();
				total += price[i];
			}
			double minimum = price[0];
			for (int j = 0; j < price.length; j++)
			{
				if (minimum > price[j])
				{
					minimum = price[j];
				}
			}
			int count = 0;
			for (int k = 0; k < price.length; k++)
			{
				if (price[k] >= 1.5 && price[k] <= 35)
				{
					count++;
				}
			}
			out.println();
			out.println("Average price: " + total / stocks + " out of " + stocks + " stocks.");
			out.println("Minimum price: " + minimum);
			out.println("Number of stocks priced between 1.5-35: " + count);
		}

	}

}
