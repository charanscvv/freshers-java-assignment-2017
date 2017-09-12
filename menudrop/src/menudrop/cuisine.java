package menudrop;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.*;
//import java.util.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.Font;
import java.util.Enumeration;



public class cuisine implements ActionListener {
	double d;
	JPanel p1=new JPanel();   
    JPanel p2=new JPanel();  
    JPanel p3=new JPanel();
	    JCheckBox cb1=new JCheckBox("Aloo Kebab 100/-");
		JCheckBox cb2=new JCheckBox("Lamb Roast 150/-");
	    JCheckBox cb3=new JCheckBox("Kashmir pulav 150/-");
	    JCheckBox cb4=new JCheckBox("C-Biryani 200/-");
	    JCheckBox cb5=new JCheckBox("Rainbow Del8 120/-");
	    JCheckBox cb6=new JCheckBox("Straw shake 70/-");
	    
	    JCheckBox cb7=new JCheckBox("PaneerKebab 120/-");
	    JCheckBox cb8=new JCheckBox("Chicken leg 80/-");
	    JCheckBox cb9=new JCheckBox("Jeera Biryani 110/-");
	    JCheckBox cb10=new JCheckBox("M-Biryani 220/-");
	    JCheckBox cb11=new JCheckBox("Matka kulfi 70/-");
	    JCheckBox cb12=new JCheckBox("Aurora 150/-");
	    
	    JCheckBox cb13=new JCheckBox("Fun-Guy 120/-");
	    JCheckBox cb14=new JCheckBox("Chicken Pop 110/-");
	    JCheckBox cb15=new JCheckBox("Veg Pulav 100/-");
	    JCheckBox cb16=new JCheckBox("Egg Biryani 120/-");
	    JCheckBox cb17=new JCheckBox("Simple Pine 50/-");
	    JCheckBox cb18=new JCheckBox("Perfect End 120/-");
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
	    
	    Color ash=new Color(225,225,225);
	    Color non=new Color(255,55,55);
	    Color veg=new Color(70,220,70);
	    Color yel=new Color(255,210,110);
	    Color blu=new Color(150,205,255);


	    JTabbedPane tp=new JTabbedPane(); 
	    
	    JPanel Hi=new JPanel();
	    JTextField custname=new JTextField();
	    JTextField custno=new JTextField("+91-");
	    JTextField tableno=new JTextField();
	    JLabel table=new JLabel("TABLE NUMBER :");
	    JCheckBox takeaway = new JCheckBox("TAKEAWAY");
	    JButton dine  = new JButton("MAKE ORDER");
	    JLabel takeawaymsg=new JLabel("WE PACK IT THE BEST WAY");
	    
	    JPanel offer=new JPanel();
	    JTextArea welcome=new JTextArea("Welcome to XYZ resto");
	    JLabel coup=new JLabel("Coupon (try:1ZERO)");
	    JTextField code=new JTextField();
	    JLabel buffet=new JLabel();
	    JCheckBox buff=new JCheckBox("Buffet Dining");
	    
	    
	    
	    
	    JPanel info=new JPanel();
	    JLabel order=new JLabel("YOUR ORDER");
	    JTextArea orderlist = new JTextArea();
	    Font myFont = new Font("SansSerif Plain",Font.BOLD,13);
	    Font splFont = new Font("Comic Sans MS",Font.BOLD,16);
	    Font wish = new Font("SansSerif Plain",Font.PLAIN,18);
	    
	    JPanel bill=new JPanel();
	    JLabel billhead=new JLabel("AMOUNT PAYABLE");
	    JLabel food=new JLabel("FOOD");
	    JLabel gst=new JLabel("GST (18%)");
	    JLabel wait=new JLabel("COUPON");
	    JLabel last=new JLabel("TOTAL");
	    JTextField bil=new JTextField();
	    JTextField tax=new JTextField();
	    JTextField disc=new JTextField();
	    JTextField total=new JTextField();
	   
	    		
		   
        
	    
	cuisine(){
		
		Frame f=new Frame("SELECT YOUR FOOD");
		GridLayout g=new GridLayout(0,2);
		
		
		
		
		 Hi.setLayout(null); 
		 Hi.setBounds(50,100,300,175);
		 Hi.setBackground(yel);
		 
		 JLabel cust=new JLabel("CUSTOMER NAME :");
		 cust.setHorizontalAlignment(JLabel.LEFT);
		 cust.setBounds(15,15,150,25);
		 JLabel phone=new JLabel("PHONE :");
		 phone.setHorizontalAlignment(JLabel.LEFT);
		 phone.setBounds(15,45,150,25);
		 custname.setBounds(150,15,125,25); 
		 custno.setBounds(150,45,125,25);
		 
		 dine.setBounds(14,135,200,25);
		 dine.setOpaque(false);
		 dine.addActionListener(this);
		 takeaway.setBounds(15,75,200,25);
		 takeaway.setOpaque(false);
		 
		 table.setHorizontalAlignment(JLabel.LEFT);
		 table.setBounds(15,105,150,25);
		 tableno.setBounds(150,105,125,25);
		 takeawaymsg.setBounds(20,80,250,75);
		 takeawaymsg.setFont(splFont);
		 Hi.add(dine);
		 Hi.add(custno);
		 Hi.add(custname);
		 Hi.add(tableno);
		 Hi.add(takeaway);
		 Hi.add(cust);
		 Hi.add(phone);
		 Hi.add(table);
		 
		 
		 offer.setLayout(null);
		 offer.setBounds(400,100,300,175);
		 offer.setBackground(yel);
		 welcome.setBounds(5,15,270,70);
		 welcome.setEditable(false);
		 welcome.setOpaque(false);
		 welcome.setFont(wish);
		 coup.setBounds(15,75,150,25);
		 coup.setOpaque(false);
		 buff.setBounds(10,110,150,25);
		 buff.setOpaque(false);
		 code.setBounds(150,75,100,25);
		 buffet.setBounds(25,140,290,25);
		 buffet.setOpaque(false);
		 offer.add(buffet);
		 buff.addActionListener(this);
		 offer.add(code);
		 offer.add(buff);
		 offer.add(coup);
		 offer.add(welcome);
		 f.add(offer);
		 
		 info.setLayout(null); 
		 info.setBounds(400,280,300,195);
		 info.setBackground(yel);
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
		 JButton b=new JButton("VIEW ORDER");
		 b.setBounds(15,165,125,25);
		 info.add(b);
		 b.addActionListener(this); 
		 
		 JButton gen=new JButton("CHECK OUT");
		 gen.setBounds(150,165,125,25);
		 info.add(gen);
		 gen.addActionListener(this); 
		
		 
		 
		 bill.setLayout(null);
		 bill.setBounds(50, 480, 300, 200);   
		 bill.setBackground(yel);
		 billhead.setBounds(100,10,150,25);
		 bill.add(billhead);
		 food.setBounds(25,35,150,25);
		 bill.add(food);
		 gst.setBounds(25,60,150,25);
		 bill.add(gst);
		 wait.setBounds(25,85,150,25);
		 bill.add(wait);
		 last.setBounds(25,120,150,25);
		 bill.add(last);
		 bil.setBounds(170,35,100,25);
 		bill.add(bil);bil.setEditable(false);
 		tax.setBounds(170,60,100,25);
 		bill.add(tax);tax.setEditable(false);
 		disc.setBounds(170,85,100,25);
 		bill.add(disc);disc.setEditable(false);
 		total.setBounds(180,120,100,25);
 		bill.add(total);total.setEditable(false);
		
 		
 		
		 tp.setBounds(50,275,300,200);
	     tp.setBackground(yel);

		    tp.add("Starters",p1);
		    tp.add("Main course",p2);  
		    tp.add("Deserts",p3); 
		    
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
		   
		    cb1.setBackground(veg);
		    cb2.setBackground(non);
		    cb3.setBackground(veg);
		    cb4.setBackground(non);
		    cb7.setBackground(veg);
		    cb8.setBackground(non);
		    cb9.setBackground(veg);
		    cb10.setBackground(non);
		    cb14.setBackground(non);
		    cb15.setBackground(veg);
		    
		    
		    p1.add(cb1);p1.add(sp1);p1.add(cb7);p1.add(sp7);p1.add(cb13);p1.add(sp13);p1.add(cb8);p1.add(sp8);p1.add(cb2);p1.add(sp2);p1.add(cb14);p1.add(sp14);
		    p2.add(cb3);p2.add(sp3);p2.add(cb9);p2.add(sp9);p2.add(cb15);p2.add(sp15);p2.add(cb4);p2.add(sp4);p2.add(cb10);p2.add(sp10);p2.add(cb16);p2.add(sp16);		    		    		    
		    p3.add(cb5);p3.add(sp5);p3.add(cb6);p3.add(sp6);p3.add(cb11);p3.add(sp11);p3.add(cb12);p3.add(sp12);p3.add(cb17);p3.add(sp17);p3.add(cb18);p3.add(sp18);
	        
		    f.add(tp);
		    f.add(Hi);
		    f.add(info);
		    f.add(bill);
		    
		    Enumeration test = UIManager.getDefaults().keys();

	        while ( test.hasMoreElements() ) {  

	            Object key = test.nextElement();  
	            Object value = UIManager.get( key );  
	            if ( value instanceof Font ) {  
	                UIManager.put( key, myFont );  
	            }  
	        }
	        SwingUtilities.updateComponentTreeUI(f);

		    f.setSize(750,700);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		    f.setBackground(blu);
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
	        	//Hi.remove(Mineral);
	        	Hi.add(takeawaymsg);
	        	Hi.revalidate();
	        	Hi.repaint();
	        	offer.remove(buff);
	        	offer.revalidate();
	        	offer.repaint(); 	
	        }
	       else{
       
	        	Hi.add(table);
	        	Hi.add(tableno);
	        	Hi.remove(takeawaymsg);
	        	offer.add(buff);
	        	offer.revalidate();
	        	offer.repaint(); 
	        	Hi.revalidate();
	        	Hi.repaint();
	        	
	        }
	        if(buff.isSelected())
	        {msg="Buffer : 700/-\n-------------\nTotal :";amount=700;
	        buffet.setText("You are AWESOME!!!");
	        }
	        else 
	        {buffet.setText("We Serve AWESOME!!!");
	        if(cb1.isSelected()){  
	        	if((Integer)sp1.getValue()<1){sp1.setValue(1);}
	            amount+=100*(Integer)sp1.getValue();  
	            msg+="Aloo Kebab (V) - 100*"+(Integer)sp1.getValue()+" = "+100*(Integer)sp1.getValue()+"\n";  
	        }else {sp1.setValue(0);}
	        if(cb2.isSelected()){  
	        	if((Integer)sp2.getValue()<1){sp2.setValue(1);}
                amount+=150*(Integer)sp2.getValue(); 
	            msg+="Lamb Roast (N) - 150*"+(Integer)sp2.getValue()+" = "+150*(Integer)sp2.getValue()+"\n";  
	        }  else {sp2.setValue(0);}
	        
	        if(cb3.isSelected()){  
	        	if((Integer)sp3.getValue()<1){sp3.setValue(1);}
	            amount+=150*(Integer)sp3.getValue();;  
	            msg+="Kashmiri Biryani (V) - 150*"+(Integer)sp3.getValue()+" = "+150*(Integer)sp3.getValue()+"\n";  
	        }  else {sp3.setValue(0);}
	        if(cb4.isSelected()){ 
	        	if((Integer)sp4.getValue()<1){sp4.setValue(1);}
	        
	            amount+=200*(Integer)sp4.getValue();  
	            msg+="Chicken Biryani (N) - 200*"+(Integer)sp4.getValue()+" = "+200*(Integer)sp4.getValue()+"\n";  
	        }  else {sp4.setValue(0);}
	        if(cb5.isSelected()){ 
	        	if((Integer)sp5.getValue()<1){sp5.setValue(1);}
	            amount+=120*(Integer)sp5.getValue();;  
	            msg+="Rainbow Delight - 120*"+(Integer)sp5.getValue()+" = "+120*(Integer)sp5.getValue()+"\n"; 
	        }  else {sp5.setValue(0);}
	        if(cb6.isSelected()){  
	        	if((Integer)sp6.getValue()<1){sp6.setValue(1);}
	            amount+=70*(Integer)sp6.getValue();;  
	            msg+="Straw Thick shake - 70*"+(Integer)sp6.getValue()+" = "+70*(Integer)sp6.getValue()+"\n";  
	        } else {sp6.setValue(0);}
	        if(cb7.isSelected()){  
	        	if((Integer)sp7.getValue()<1){sp7.setValue(1);}
	            amount+=120*(Integer)sp7.getValue();  
	            msg+="paneer Kebab (V) - 120*"+(Integer)sp7.getValue()+" = "+120*(Integer)sp7.getValue()+"\n";  
	        }  else {sp7.setValue(0);}
	        if(cb8.isSelected()){  
	        	if((Integer)sp8.getValue()<1){sp8.setValue(1);}
	            amount+=80*(Integer)sp8.getValue();;  
	            msg+="chicken leg Roast (N) - 80*"+(Integer)sp8.getValue()+" = "+80*(Integer)sp8.getValue()+"\n";  
	        } else {sp8.setValue(0);} 
	        if(cb9.isSelected()){ 
	        	if((Integer)sp9.getValue()<1){sp9.setValue(1);}
	            amount+=110*(Integer)sp9.getValue();;  
	            msg+="Jeera Biryani (V) - 110*"+(Integer)sp9.getValue()+" = "+110*(Integer)sp9.getValue()+"\n";
	        } else {sp9.setValue(0);}
	        if(cb10.isSelected()){  
	        	if((Integer)sp10.getValue()<1){sp10.setValue(1);}
	            amount+=220*(Integer)sp10.getValue();  
	            msg+="Mutton Biryani (N) - 220*"+(Integer)sp10.getValue()+" = "+220*(Integer)sp10.getValue()+"\n";
	        }  else {sp10.setValue(0);}
	        if(cb11.isSelected()){  
	        	if((Integer)sp11.getValue()<1){sp11.setValue(1);}
	            amount+=70*(Integer)sp11.getValue();;  
	            msg+="Matka kulfi - 70*"+(Integer)sp11.getValue()+" = "+70*(Integer)sp11.getValue()+"\n";
	        }  else {sp12.setValue(0);}
	        if(cb12.isSelected()){ 
	        	if((Integer)sp12.getValue()<1){sp12.setValue(1);}
	            amount+=150*(Integer)sp12.getValue();;  
	            msg+="aurora australis 150*"+(Integer)sp12.getValue()+" = "+150*(Integer)sp12.getValue()+"\n";
	        }  else {sp12.setValue(0);}
	        if(cb13.isSelected()){  
	        	if((Integer)sp13.getValue()<1){sp13.setValue(1);}
	            amount+=120*(Integer)sp13.getValue();  
	            msg+="umbrella (mushroom) (N) -120*"+(Integer)sp13.getValue()+" = "+120*(Integer)sp13.getValue()+"\n"; 
	        }  else {sp13.setValue(0);}
	        if(cb14.isSelected()){ 
	        	if((Integer)sp14.getValue()<1){sp14.setValue(1);}
	            amount+=110*(Integer)sp14.getValue();;  
	            msg+="Chicken popcorn (N) -110*"+(Integer)sp14.getValue()+" = "+110*(Integer)sp14.getValue()+"\n";
	        }  else {sp14.setValue(0);}
	        if(cb15.isSelected()){  
	        	if((Integer)sp15.getValue()<1){sp15.setValue(1);}
	            amount+=100*(Integer)sp15.getValue();;  
	            msg+=" Pulav (V) - 100*"+(Integer)sp15.getValue()+" = "+100*(Integer)sp15.getValue()+"\n";
	        }  else {sp15.setValue(0);}
	        if(cb16.isSelected()){  
	        	if((Integer)sp16.getValue()<1){sp16.setValue(1);}
	            amount+=120*(Integer)sp16.getValue();  
	            msg+="Egg Biryani (N) - 120*"+(Integer)sp16.getValue()+" = "+120*(Integer)sp16.getValue()+"\n";
	        }  else {sp16.setValue(0);}
	        if(cb17.isSelected()){  
	        	if((Integer)sp17.getValue()<1){sp17.setValue(1);}
	            amount+=50*(Integer)sp17.getValue();;  
	            msg+="Simple Pineapple - 50*"+(Integer)sp17.getValue()+" = "+50*(Integer)sp17.getValue()+"\n";
	        }  else {sp17.setValue(0);}
	        if(cb18.isSelected()){  
	        	if((Integer)sp18.getValue()<1){sp18.setValue(1);}
	            amount+=120*(Integer)sp18.getValue();;  
	            msg+="Perfect End - 120*"+(Integer)sp18.getValue()+" = "+120*(Integer)sp18.getValue()+"\n";
	        }  else {sp18.setValue(0);}
	        
	        msg+="-----------------\nTOTAL:";  
	        }
	        if (e.getActionCommand().equals("VIEW ORDER")) {
	            
	            orderlist.setText(msg+amount);
	          }
	        if(code.getText().equals("1ZERO"))
	        {
	        	d=0.1;
	        }
	        if (e.getActionCommand().equals("CHECK OUT")) {
	            bil.setText(""+amount);
	            tax.setText(""+(int)(0.18*amount));
	            double x=(1.18)*amount;
	            disc.setText("-"+(int)(x*d));
	            int y=(int)(x*(1-d));
	            total.setText(y+"/-");
	            
	          }
	        if (e.getActionCommand().equals("MAKE ORDER")) {
	        	String hie= "Hi "+custname.getText()+",Welcome\nDo you have a coupon code";
	        	welcome.setText(hie);
	          }
	    } 
	public static void main(String[] args) {
		new cuisine();

	}

}
