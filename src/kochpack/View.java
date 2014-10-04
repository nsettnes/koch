package kochpack;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class View extends JFrame
{
	private Surface surface;
	private JButton myButton;
	
    public View() 
    {    		
        initUI();
    }
    
    private void initUI() 
    {
    	setTitle("Lines");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setBackground(Color.black);
        
    	myButton = new JButton("Depth + 1");
    	myButton.setSize(100, 50);
    	myButton.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Logic.Instance().doLogicStuff(getLines());
			}
		});
    	add(myButton, BorderLayout.NORTH);
    	
        surface = new Surface();
        add(surface);
        
        setSize(500, 500);
        setLocationRelativeTo(null); 
        setVisible(true);
    }
    
    public Line[] getLines()
    {
    	Line[] lines = new Line[surface.currentLines.size()];
    	for(int i = 0; i < surface.currentLines.size(); i++)
    	{
    		lines[i] = surface.currentLines.get(i);
    	}
    	return lines;
    }
    
    public void DrawLines(Line[] lines, boolean clear)
    {
    	if(clear)
    	{
    		surface.Clear();
    	}
    	surface.DrawLines(lines);
    }
    
}