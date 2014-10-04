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
		int midtX = ((lines[0].x1 + lines[0].x2)/2);
		int midtY = ((lines[0].y1 + lines[0].y2)/2);
		
		Line lines2 = new Line(midtX,midtY,lines[0].x1,lines[0].y1);
	}
}
