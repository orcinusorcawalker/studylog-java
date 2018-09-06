package assssssssssssssssssss;
import static java.lang.System.out;
public class firstassss1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		charactersTable();
	}
	static void charactersTable()
	{
		String a = "Special characters", b = "Desciption";
		String fmt = "%-30s%-30s\n";
		out.printf(fmt, a, b);

		String spaceLine = String.format("%-20s","");
		String dashLine = spaceLine.replace(" ", "-");
		out.print(dashLine);
		String blankLine = String.format("%-10s","");
		out.print(blankLine);
		out.println(dashLine);

		out.printf(fmt,"\\","A single backslash");
		out.printf(fmt,"\\\\","A double backslash");
	    out.printf(fmt,"\' \'","A pair of single quote");
	    out.printf(fmt,"\" \"","A pair of double quote");
	}

}
