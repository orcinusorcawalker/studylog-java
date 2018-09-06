package assssssssssssssssssss;
import static java.lang.System.out;
import java.util.Scanner;
public class secondassss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                arithmeticTable();
	}
	static void arithmeticTable()
	{
		double height,width;
		try(Scanner input = new Scanner(System.in))
		{
			out.print("Enter a height: ");
			height = input.nextDouble();
			out.print("Enter a width: ");
			width = input.nextDouble();
		}
		double perimeter = (height + width) * 2;
		double area = height * width ;
		String a1 = "Height", a2 = "Width";
		String a3 = "Area", a4 = "Perimeter";
		String fmt = "%-20s%-20s%-20s%-20s\n";


	}

}
