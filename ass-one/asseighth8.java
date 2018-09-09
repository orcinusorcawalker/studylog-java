package assssone;
import static java.lang.System.out;
import java.util.*;
public class asseighth8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayoperations();
	}
	public static void arrayoperations()
	{
		String line;
		Scanner input = new Scanner(System.in);
		out.print("Enter a line of comma-separated temperatures: ");
		line = input.nextLine();
		input.close();
		
		String[] number = line.split(","); // num as a string
		double[] nums = new double [number.length];
		for (int i =0; i < nums.length; i++)
		{
			nums[i] = Double.valueOf(number[i]);
		}
		
		double total = 0, count = 0;
		for (int j = 0; j < nums.length; j++ )
		{
			count = j + 1;
			total += nums[j];
		}
		double minimum = nums[0];
		for (int r = 0; r < nums.length; r++)
		{
			if (minimum > nums[r])
			{
				minimum = nums[r];
			}
		}
		int count2 = 0;
		for (int k = 0; k < nums.length; k++)
		{
			if (nums[k] < 0 || nums[k] > 5)
			{
				count2++;
			}
		}
		out.printf("Average temperature: %.2f \n", total / count);
		out.printf("Minimum temperature: %.2f \n", minimum);
		out.println("Count of temperatures: " + count2);
	}
}
