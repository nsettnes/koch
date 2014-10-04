package kochpack;

public class Main
{
	public static void main(String[] args)
	{
		View v = new View();
		Line[] lines = new Line[]
			{
				new Line(0,250,500,250)
			};
		v.DrawLines(lines, false);
	}
}