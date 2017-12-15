/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject1forgit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author jaspal
 */
public class MyProject1ForGit {

    JFrame f;
    JButton b;
    JLabel l;
    int i=0;
    MyProject1ForGit()
    {
        f=new JFrame("JAVA APP ONE FOR GIT");
        b=new JButton("Click on me");
        l=new JLabel("");
        f.add(b);
        f.add(l);
        
        b.setBounds(50, 50, 200, 50);
        l.setBounds(50,200,200,50);
        
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
            if(i==0)
            {
                l.setText("Clicked");
                i=1;
            }
            else
            {
                l.setText("");
                i=0;
            }
            }
            
        });
    }
    
    public static void main(String[] args)
    {
        // TODO code application logic here
        new MyProject1ForGit();
    }
    
}
