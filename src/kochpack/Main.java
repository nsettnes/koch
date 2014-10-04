package kochpack;

public class Main
{
	public static void main(String[] args)
	{
		Line[] lines = new Line[]
			{
				new Line(500,250,0,250)
			};
		View.Instance().DrawLines(lines, false);
	}
}