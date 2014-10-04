package kochpack;

public class Main
{
	private static int xPush = 30;
	private static int yPush = 20;
	
	public static void main(String[] args)
	{
		Line[] lines = new Line[]
			{
				new Line(0+xPush,250+yPush,250+xPush,500+yPush),
				new Line(250+xPush,0+yPush,0+xPush,250+yPush),
				new Line(500+xPush,250+yPush,250+xPush,0+yPush),
				new Line(250+xPush,500+yPush,500+xPush,250+yPush)
			};
		View.Instance().DrawLines(lines, false);
		
	}
}