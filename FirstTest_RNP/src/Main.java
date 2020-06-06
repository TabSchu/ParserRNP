import java.io.InputStream;

import parser.ParseException;
import parser.SimpleExpressions;
public class Main {
	public static void main( String[] args)
	{
		try
		{
			SimpleExpressions lParser = new SimpleExpressions( System.in);
			//Integer eingabe = 4;
			
			System.out.println( lParser.Expression().evaluate());
			//System.out.println("2"+eingabe);
			System.out.println("Success");
			
		}
		catch (Exception e) //(ParseException e)
		{
			System.err.println(e);
		}
	}

}
