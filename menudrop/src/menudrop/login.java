package menudrop;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class login implements ActionListener {
	static  JTextField name=new JTextField();
	static JFrame first=new JFrame("ENTER MANAGER NAME");
  login(){
	
	JButton logi=new JButton("TAKE ORDER");
	JLabel manager=new JLabel("MANAGER NAME >>");
	JLabel title=new JLabel("GOURMAND RESTRO - Eat till you trip");
	Font tt = new Font("SansSerif Plain",Font.PLAIN,20);
	Font headfont = new Font("Comic Sans MS",Font.PLAIN,30);
    
	first.setLayout(null);
	first.setVisible(true);
	first.getContentPane().setBackground(Color.BLACK);
    first.setSize(750,300);
    first.add(logi);
    first.add(manager);
    first.add(name);
    first.add(title);
    title.setFont(headfont);
    title.setForeground(Color.WHITE);
    title.setBounds(50,30,650,40);
    
    name.setFont(tt);
    name.setBounds(250,130,200,40);
    
    manager.setFont(tt);
    manager.setForeground(Color.LIGHT_GRAY);
    manager.setBounds(50,130,200,40);
    logi.setBounds(500,130, 150, 60);
    logi.addActionListener(this);
}
public void actionPerformed(ActionEvent j){  
	 if (j.getActionCommand().equals("TAKE ORDER")) {
	  new cuisine();
		
     }
}
public static void main(String[] args)
{
	new login();
	}
}
 