package assssone;
import static java.lang.System.out;
import java.util.*;
public class assseventh7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		counttheintersection();
	}
	public static void counttheintersection()
	{
		String linea, lineb;
		Scanner input = new Scanner(System.in);
		out.print("Enter the first line of comma-separated numbers: ");
		linea = input.nextLine();
		out.print("Enter the second line of comma-separated numbers: ");
		lineb = input.nextLine();
		input.close();

		String[] numsAsStrings = linea.split(",");
		double[] nums = new double[numsAsStrings.length];
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = Double.valueOf(numsAsStrings[i]);
		}
		String[] numsAsStrings2 = lineb.split(",");
		double[] nums2 = new double[numsAsStrings2.length];
		for (int j = 0; j < nums2.length; j++)
		{
			nums2[j] = Double.valueOf(numsAsStrings2[j]);
		}

		int count = 0;
		for (double n1 : nums)
		{
			for (double n2 : nums2)
			{
				if (n1 == n2)
				{
					count++;
				}
			}
		}
		out.println("The number of overlapping numbers: " + count);
	}
}
