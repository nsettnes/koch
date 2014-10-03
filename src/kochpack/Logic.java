package kochpack;

public class Logic
{
	private static Logic instance;
	
	public static Logic Instance()
	{
		if(instance == null)
			instance = new Logic();
		return instance; 
	}
	
	private Logic()
	{
		
	}
	
	public boolean DoLogicStuff()
	{
		return true;
	}
}
