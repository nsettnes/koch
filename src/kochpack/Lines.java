package kochpack;

import javax.swing.JFrame;

public class Lines extends JFrame 
{
    public Lines() 
    {
        initUI();
    }
    
    private void initUI() 
    {
        setTitle("Lines");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(new Surface());
        
        setSize(350, 250);
        setLocationRelativeTo(null); 
    }
}