package menudrop;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;



public class cuisine implements ActionListener {
	 JCheckBox cb1=new JCheckBox("Aloo Kebab (V) \n - 100/-");
	    JCheckBox cb2=new JCheckBox("Lamb Roast (N) - 150/-");
	    JCheckBox cb3=new JCheckBox("Kashmiri Biryani (V) - 150/-");
	    JCheckBox cb4=new JCheckBox("Chicken Biryani (N) - 200/- ");
	    JCheckBox cb5=new JCheckBox("Rainbow Delight - 120/-");
	    JCheckBox cb6=new JCheckBox("Straw Thick shake - 70/-");
	    
	    JCheckBox cb7=new JCheckBox("paneer Kebab (V) - 120/-");
	    JCheckBox cb8=new JCheckBox("chicken leg Roast (N) - 80/-");
	    JCheckBox cb9=new JCheckBox("Jeera Biryani (V) - 110/-");
	    JCheckBox cb10=new JCheckBox("Mutton Biryani (N) - 220/-");
	    JCheckBox cb11=new JCheckBox("Matka kulfi - 70/-");
	    JCheckBox cb12=new JCheckBox("aurora australis 150/-");
	    
	    JCheckBox cb13=new JCheckBox("umbrella (mushroom) (N) -120/-");
	    JCheckBox cb14=new JCheckBox("Chicken popcorn (N) -110/-");
	    JCheckBox cb15=new JCheckBox(" Pulav (V) - 100/-");
	    JCheckBox cb16=new JCheckBox("Egg Biryani (N) - 120/-");
	    JCheckBox cb17=new JCheckBox("Simple Pineapple - 50/-");
	    JCheckBox cb18=new JCheckBox("Perfect End - 120/-");
	    JSpinner sp1 = new JSpinner();
	    JSpinner sp2 = new JSpinner();
	    JSpinner sp3 = new JSpinner();
	    JSpinner sp4 = new JSpinner();
	    JSpinner sp5 = new JSpinner();
	    JSpinner sp6 = new JSpinner();
	    JSpinner sp7 = new JSpinner();
	    JSpinner sp8 = new JSpinner();
	    JSpinner sp9 = new JSpinner();
	    JSpinner sp10 = new JSpinner();
	    JSpinner sp11 = new JSpinner();
	    JSpinner sp12 = new JSpinner();
	    JSpinner sp13 = new JSpinner();
	    JSpinner sp14 = new JSpinner();
	    JSpinner sp15 = new JSpinner();
	    JSpinner sp16 = new JSpinner();
	    JSpinner sp17 = new JSpinner();
	    JSpinner sp18 = new JSpinner();
	    
	    JPanel Hi=new JPanel();
	    JTextField custname=new JTextField();
	    JTextField custtime=new JTextField();
	    JTextField tableno=new JTextField();
	    JLabel table=new JLabel("Table number :");
	    JToggleButton takeaway = new JToggleButton("Takeaway");
	    JToggleButton Mineral  = new JToggleButton("Serve Mineral water");
	    JLabel takeawaymsg=new JLabel("WE PACK IT THE BEST WAY");
	    
	    
	    JPanel info=new JPanel();
	    JLabel order=new JLabel("YOUR ORDER");
	    JTextArea orderlist = new JTextArea();
	    
	cuisine(){
		
		Frame f=new Frame("SELECT YOUR FOOD");
		GridLayout g=new GridLayout(0,2);
		 
		
		

		 
		 Hi.setLayout(null); 
		 Hi.setBounds(50,50,300,200);
		 Hi.setBackground(Color.CYAN);
		 
		 JLabel cust=new JLabel("Customer name    :");
		 cust.setHorizontalAlignment(JLabel.LEFT);
		 cust.setBounds(15,15,150,25);
		 JLabel time=new JLabel("Customer arrival :");
		 time.setHorizontalAlignment(JLabel.LEFT);
		 time.setBounds(15,45,150,25);
		 custname.setBounds(150,15,125,25); 
		 custtime.setBounds(150,45,125,25);
		 
		 Mineral.setBounds(14,135,200,25);
		 Mineral.setBackground(Color.CYAN);
		 takeaway.setBounds(15,75,100,25);
		 takeaway.setBackground(Color.CYAN);
		 
		 table.setHorizontalAlignment(JLabel.LEFT);
		 table.setBounds(15,105,150,25);
		 tableno.setBounds(150,105,125,25);
		 takeawaymsg.setBounds(20,110,200,75);
		 
		 Hi.add(Mineral);
		 Hi.add(custtime);
		 Hi.add(custname);
		 Hi.add(tableno);
		 Hi.add(takeaway);
		 Hi.add(cust);
		 Hi.add(time);
		 Hi.add(table);
		 
		 
		 info.setLayout(null); 
		 info.setBounds(50,270,300,200);
		 info.setBackground(Color.CYAN);
		 
		 order.setBounds(100,5,100,25);
		 info.add(order);
		 
		 orderlist.setBounds(10,30,280,130);
		 info.add(orderlist);
		 
		 orderlist.setEditable(false);
		 
		 orderlist.setLineWrap(true);
		 
		 JScrollPane scrollPane = new JScrollPane(orderlist);
		 
		 scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);      
		 
		 scrollPane.setBounds(10,30,280,130);
		 
		 
		 info.add(scrollPane);
		 
		 JButton b=new JButton("Generate bill");
		 b.setBounds(15,165,125,25);
		 info.add(b);
		 b.addActionListener(this); 
		    
		    JTabbedPane tp=new JTabbedPane(); 
		    tp.setBounds(400,50,300,200);
		    
		    JPanel p1=new JPanel();   
		    JPanel p2=new JPanel();  
		    JPanel p3=new JPanel();
		    
		    tp.add("starters",p1);
		    tp.add("main course",p2);  
		    tp.add("deserts",p3); 
		    
		    takeaway.addActionListener(this);
		    cb1.addActionListener(this); 
		    cb2.addActionListener(this);
		    cb3.addActionListener(this);
		    cb4.addActionListener(this);
		    cb5.addActionListener(this);
		    cb6.addActionListener(this);
		    cb7.addActionListener(this); 
		    cb8.addActionListener(this);
		    cb9.addActionListener(this);
		    cb10.addActionListener(this);
		    cb11.addActionListener(this);
		    cb12.addActionListener(this);
		    cb13.addActionListener(this); 
		    cb14.addActionListener(this);
		    cb15.addActionListener(this);
		    cb16.addActionListener(this);
		    cb17.addActionListener(this);
		    cb18.addActionListener(this);
		   
		   
		    p1.setLayout(g);
		    p2.setLayout(g);
		    p3.setLayout(g);
		   
		    cb1.setBackground(Color.GREEN);
		    cb2.setBackground(Color.RED);
		    cb3.setBackground(Color.GREEN);
		    cb4.setBackground(Color.RED);
		    cb7.setBackground(Color.GREEN);
		    cb8.setBackground(Color.RED);
		    cb9.setBackground(Color.GREEN);
		    cb10.setBackground(Color.RED);
		    cb14.setBackground(Color.RED);
		    cb15.setBackground(Color.GREEN);
		    
		    p1.add(cb1);p1.add(sp1);p1.add(cb7);p1.add(sp7);p1.add(cb13);p1.add(sp13);p1.add(cb8);p1.add(sp8);p1.add(cb2);p1.add(sp2);p1.add(cb14);p1.add(sp14);
		    p2.add(cb3);p2.add(sp3);p2.add(cb9);p2.add(sp9);p2.add(cb15);p2.add(sp15);p2.add(cb4);p2.add(sp4);p2.add(cb10);p2.add(sp10);p2.add(cb16);p2.add(sp16);		    		    		    
		    p3.add(cb5);p3.add(sp5);p3.add(cb6);p3.add(sp6);p3.add(cb11);p3.add(sp11);p3.add(cb12);p3.add(sp12);p3.add(cb17);p3.add(sp17);p3.add(cb18);p3.add(sp18);
		    
		    f.add(tp);
		    f.add(Hi);
		    f.add(info);

		    f.setSize(800,700);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		    f.addWindowListener(new WindowAdapter() {
		         public void windowClosing(WindowEvent windowEvent){
			            System.exit(0);
			         }        
			      });
		    
	}
	 public void actionPerformed(ActionEvent e){  
	        float amount=0;  
	        String msg="";  
	        
	        if(takeaway.isSelected()){
	           
	        	Hi.remove(table);
	        	Hi.remove(tableno);
	        	Hi.remove(Mineral);
	        	Hi.add(takeawaymsg);
	        	Hi.revalidate();
	        	Hi.repaint();
	        	
	        }
	       else{
       
	        	Hi.add(table);
	        	Hi.add(tableno);
	        	Hi.add(Mineral);
	        	Hi.remove(takeawaymsg);
	        	Hi.revalidate();
	        	Hi.repaint();
	        	
	        }
	        
	        if(cb1.isSelected()){  
	        	if((Integer)sp1.getValue()<1){sp1.setValue(1);}
	            amount+=100*(Integer)sp1.getValue();  
	            msg+="Aloo Kebab (V) - 100*"+(Integer)sp1.getValue()+" = "+100*(Integer)sp1.getValue()+"\n";  
	        }  
	        if(cb2.isSelected()){  
	        	if((Integer)sp2.getValue()<1){sp2.setValue(1);}
                amount+=150*(Integer)sp2.getValue(); 
	            msg+="Lamb Roast (N) - 150*"+(Integer)sp2.getValue()+" = "+150*(Integer)sp2.getValue()+"\n";  
	        }  
	        if(cb3.isSelected()){  
	        	if((Integer)sp3.getValue()<1){sp3.setValue(1);}
	            amount+=150*(Integer)sp3.getValue();;  
	            msg+="Kashmiri Biryani (V) - 150*"+(Integer)sp3.getValue()+" = "+150*(Integer)sp3.getValue()+"\n";  
	        }  
	        if(cb4.isSelected()){ 
	        	if((Integer)sp4.getValue()<1){sp4.setValue(1);}
	        
	            amount+=200*(Integer)sp4.getValue();  
	            msg+="Chicken Biryani (N) - 200*"+(Integer)sp4.getValue()+" = "+200*(Integer)sp4.getValue()+"\n";  
	        }  
	        if(cb5.isSelected()){ 
	        	if((Integer)sp5.getValue()<1){sp5.setValue(1);}
	            amount+=120*(Integer)sp5.getValue();;  
	            msg+="Rainbow Delight - 120*"+(Integer)sp5.getValue()+" = "+120*(Integer)sp5.getValue()+"\n"; 
	        }  
	        if(cb6.isSelected()){  
	        	if((Integer)sp6.getValue()<1){sp6.setValue(1);}
	            amount+=70*(Integer)sp6.getValue();;  
	            msg+="Straw Thick shake - 70*"+(Integer)sp6.getValue()+" = "+70*(Integer)sp6.getValue()+"\n";  
	        } 
	        if(cb7.isSelected()){  
	        	if((Integer)sp7.getValue()<1){sp7.setValue(1);}
	            amount+=120*(Integer)sp7.getValue();  
	            msg+="paneer Kebab (V) - 120*"+(Integer)sp7.getValue()+" = "+120*(Integer)sp7.getValue()+"\n";  
	        }  
	        if(cb8.isSelected()){  
	        	if((Integer)sp8.getValue()<1){sp8.setValue(1);}
	            amount+=80*(Integer)sp8.getValue();;  
	            msg+="chicken leg Roast (N) - 80*"+(Integer)sp8.getValue()+" = "+80*(Integer)sp8.getValue()+"\n";  
	        }  
	        if(cb9.isSelected()){ 
	        	if((Integer)sp9.getValue()<1){sp9.setValue(1);}
	            amount+=110*(Integer)sp9.getValue();;  
	            msg+="Jeera Biryani (V) - 110*"+(Integer)sp9.getValue()+" = "+110*(Integer)sp9.getValue()+"\n";
	        } 
	        if(cb10.isSelected()){  
	        	if((Integer)sp10.getValue()<1){sp10.setValue(1);}
	            amount+=220*(Integer)sp10.getValue();  
	            msg+="Mutton Biryani (N) - 220*"+(Integer)sp10.getValue()+" = "+220*(Integer)sp10.getValue()+"\n";
	        }  
	        if(cb11.isSelected()){  
	        	if((Integer)sp11.getValue()<1){sp11.setValue(1);}
	            amount+=70*(Integer)sp11.getValue();;  
	            msg+="Matka kulfi - 70*"+(Integer)sp11.getValue()+" = "+70*(Integer)sp11.getValue()+"\n";
	        }  
	        if(cb12.isSelected()){ 
	        	if((Integer)sp12.getValue()<1){sp12.setValue(1);}
	            amount+=150*(Integer)sp12.getValue();;  
	            msg+="aurora australis 150*"+(Integer)sp12.getValue()+" = "+150*(Integer)sp12.getValue()+"\n";
	        }  
	        if(cb13.isSelected()){  
	        	if((Integer)sp13.getValue()<1){sp13.setValue(1);}
	            amount+=120*(Integer)sp13.getValue();  
	            msg+="umbrella (mushroom) (N) -120*"+(Integer)sp13.getValue()+" = "+120*(Integer)sp13.getValue()+"\n"; 
	        }  
	        if(cb14.isSelected()){ 
	        	if((Integer)sp14.getValue()<1){sp14.setValue(1);}
	            amount+=110*(Integer)sp14.getValue();;  
	            msg+="Chicken popcorn (N) -110*"+(Integer)sp14.getValue()+" = "+110*(Integer)sp14.getValue()+"\n";
	        }  
	        if(cb15.isSelected()){  
	        	if((Integer)sp15.getValue()<1){sp15.setValue(1);}
	            amount+=100*(Integer)sp15.getValue();;  
	            msg+=" Pulav (V) - 100*"+(Integer)sp15.getValue()+" = "+100*(Integer)sp15.getValue()+"\n";
	        }  
	        if(cb16.isSelected()){  
	        	if((Integer)sp16.getValue()<1){sp16.setValue(1);}
	            amount+=120*(Integer)sp16.getValue();  
	            msg+="Egg Biryani (N) - 120*"+(Integer)sp16.getValue()+" = "+120*(Integer)sp16.getValue()+"\n";
	        }  
	        if(cb17.isSelected()){  
	        	if((Integer)sp17.getValue()<1){sp17.setValue(1);}
	            amount+=50*(Integer)sp17.getValue();;  
	            msg+="Simple Pineapple - 50*"+(Integer)sp17.getValue()+" = "+50*(Integer)sp17.getValue()+"\n";
	        }  
	        if(cb18.isSelected()){  
	        	if((Integer)sp18.getValue()<1){sp18.setValue(1);}
	            amount+=120*(Integer)sp18.getValue();;  
	            msg+="Perfect End - 120*"+(Integer)sp18.getValue()+" = "+120*(Integer)sp18.getValue()+"\n";
	        }  
	        
	        msg+="-----------------\nTOTAL:";  
	        if (e.getActionCommand().equals("Generate bill")) {
	            System.out.println(msg+amount);
	            orderlist.setText(msg+amount);
	          }  
	    } 
	public static void main(String[] args) {
		new cuisine();

	}

}
