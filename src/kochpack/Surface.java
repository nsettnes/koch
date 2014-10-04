package kochpack;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

class Surface extends JPanel 
{   	
	public ArrayList<Line> currentLines = new ArrayList<Line>();
	
	public void DrawLines(Line[] lines)
	{
		for(Line l : lines)
			currentLines.add(l);
	}
	
	public void Clear()
	{
		Graphics graph = super.getGraphics();
		graph.clearRect(0, 0, super.WIDTH, super.HEIGHT);
	}

	@Override
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
		for(Line line : currentLines)
		{
			g.drawLine(line.x1, line.y1, line.x2, line.y2);
		}
    }    
}