package kochpack;

public class Main
{
	public static void main(String[] args)
	{
		Line[] lines = new Line[]
			{
				new Line(0,250,500,400)
			};
		View.Instance().DrawLines(lines, false);
		
	}
}