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
			float deltaX = l.x2-l.x1;
			float deltaY = l.y2-l.y1;
			
			float secX = l.x1 + (deltaX/3);
			float secY = l.y1 + (deltaY/3);
			
			double thirX =  ((l.x1 + l.x2)/2) + Math.sqrt(3) * (l.y1 - l.y2)/6; //this here be the magic
			double thirY =  ((l.y1 + l.y2)/2) + Math.sqrt(3) * (l.x2 - l.x1)/6; //this here be the magic
			
			int fourthX = (int) (l.x1 + 2*(deltaX/3));
			int fourthY = (int) (l.y1 + 2*(deltaY/3));

			lubi.add(new Line(l.x1, l.y1, (int)secX, (int)secY));
			lubi.add(new Line((int)secX, (int)secY, (int)thirX, (int)thirY));
			lubi.add(new Line((int)thirX, (int)thirY, fourthX, fourthY));
			lubi.add(new Line(fourthX, fourthY, l.x2, l.y2));
		}
		Line[] hali = new Line[lubi.size()];
		
		for(int i=0;i<lubi.size();i++)
		{
			hali[i] = lubi.get(i);
		}
		View.Instance().DrawLines(hali, true);
	}
}
