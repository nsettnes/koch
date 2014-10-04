package kochpack;

import java.util.ArrayList;

import com.sun.org.apache.xml.internal.utils.IntVector;

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
		ArrayList<Line> lubi = new ArrayList();
		
		for(Line l : lines)
		{
			float deltaX = l.x5-l.x1;
			float deltaY = l.y5-l.y1;
			
			float x2 = l.x1 + (deltaX/3);
			float y2 = l.y1 + (deltaY/3);
			
			double x3 =  ((l.x1 + l.x5)/2) + Math.sqrt(3) * (l.y1 - l.y5)/6; //this here be the magic
			double y3 =  ((l.y1 + l.y5)/2) + Math.sqrt(3) * (l.x5 - l.x1)/6; //this here be the magic
			
			int x4 = (int) (l.x1 + 2*(deltaX/3));
			int y4 = (int) (l.y1 + 2*(deltaY/3));

			lubi.add(new Line(l.x1, l.y1, (int)x2, (int)y2));
			lubi.add(new Line((int)x2, (int)y2, (int)x3, (int)y3));
			lubi.add(new Line((int)x3, (int)y3, x4, y4));
			lubi.add(new Line(x4, y4, l.x5, l.y5));
		}
		Line[] hali = new Line[lubi.size()];
		
		for(int i=0;i<lubi.size();i++)
		{
			hali[i] = lubi.get(i);
		}
		View.Instance().DrawLines(hali, true);
	}
}
