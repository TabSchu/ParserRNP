import parser.SimpleExpressions;
public class Main {
	public static void main( String[] args)
	{
		try
		{
			SimpleExpressions lParser = new SimpleExpressions( System.in);
			
			System.out.println( lParser.Expression().evaluate());
			System.out.println("Success");
			
		}
		catch (Exception e) 
		{
			System.err.println(e);
		}
	}

}
