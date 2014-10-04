package kochpack;

public class Main
{
	public static void main(String[] args)
	{
		Line[] lines = new Line[]
			{
				new Line(0,250,500,250)
			};
		View.Instance().DrawLines(lines, false);
		
	}
}