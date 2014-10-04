package kochpack;

public class Logic
{
	private static Logic skibbelebab;
	
	public static Logic Instance()
	{
		if(skibbelebab==null)
		{
			skibbelebab = new Logic();
		}
		return skibbelebab;
	}
	
	private Logic()
	{
		System.out.println("NOW I IS ONLY OBJECT EVAR OF THIS CLASS... \nFOREVAAAAAAAR!!");
	}
	
	public void doLogicStuff(Line[] lines)
	{
		System.out.println("\nI am one of your methods and i concur.");
	}
}
