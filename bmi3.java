import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
public class bmi3 implements ActionListener
{  
JLabel l1,l2,l3,l4,l6,l7;
JTextField name,age,weight,height,bmi,bmic;  
JButton b1,b0;
String msg="";
Checkbox male,female;
CheckboxGroup cbg;  
public bmi3()
{  
JFrame f= new JFrame();
cbg = new CheckboxGroup();
male = new Checkbox("MALE",cbg,true);
female = new Checkbox("FEMALE",cbg,false);
l1= new JLabel("NAME"); 
l2= new JLabel("AGE"); 
l3= new JLabel("WEIGHT"); 
l4= new JLabel("HEIGHT");  
l6= new JLabel("YOUR BMI"); 
l7= new JLabel("CATEGORY");
name=new JTextField();  
name.setBounds(50,50,150,20);  
age=new JTextField();  
age.setBounds(50,50,150,20);       
weight=new JTextField("WEIGHT IN kg");  
weight.setBounds(50,50,150,20);  
height=new JTextField("HEIGHT IN cm");  
height.setBounds(50,100,150,20);  
bmi=new JTextField();  
bmi.setBounds(50,150,150,20);  
bmi.setEditable(false);
bmic=new JTextField();  
bmic.setBounds(50,150,150,20);  
bmic.setEditable(false);   
b1=new JButton("CALCULATE");  
b1.setBounds(50,200,50,50);            
b1.addActionListener(this);
b0=new JButton("DIET");  
b0.setBounds(50,200,50,50);            
b0.addActionListener(new print());                    
f.add(male);
f.add(female);
f.add(l1);  
f.add(name);
f.add(l2);
f.add(age);
f.add(l3);        
f.add(weight);
f.add(l4);
f.add(height);
f.add(b1);
f.add(b0);
f.add(l6);
f.add(bmi);  
f.add(l7);
f.add(bmic);
f.setSize(300,300);
f.setTitle("BMI CALCULATOR");
f.setLayout(new GridLayout(0,2));
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
ImageIcon img = new ImageIcon("C:\\Users\\elavarasan\\Desktop\\project\\icon2.jpg");
f.setIconImage(img.getImage());  
f.setVisible(true);  
}     
public void actionPerformed(ActionEvent e)
{  
String s1=weight.getText();  
String s2=height.getText();  
double a=Double.parseDouble(s1);  
double b=Double.parseDouble(s2);
double c=0;  
if(e.getSource()==b1)
{  
c=a/((b/100)*2);
String result1=String.valueOf(c);  
bmi.setText(result1);    
if(c<=18.5)
{
bmic.setText("UNDERWEIGHT!!!");
}
else if((c>18.5)&&(c<24.9))
{
bmic.setText("NORMAL!!!");
}
else if((c>25.0)&&(c<29.9))
{
bmic.setText("OVERWEIGHT!!!");
}
else if(c>30.0)
{
bmic.setText("OBESE!!!");
} 
} 
} 

class printframe extends JFrame
{
public printframe()
{
JLabel imgl,output,a1,a2,a3,a4,b1,b2,b3,b4,b5,b6,b7;
JFrame frame1 = new JFrame();
frame1.setTitle("REPORT");
ImageIcon img = new ImageIcon("C:\\Users\\elavarasan\\Desktop\\project\\icon2.jpg");
frame1.setIconImage(img.getImage());
frame1.setVisible(true);
frame1.setSize(300,300);
frame1.setLayout(new BorderLayout());
frame1.setLocation(200,200);
frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
output =new JLabel("........DIET LIST........");
imgl= new JLabel(new ImageIcon("C:\\Users\\elavarasan\\Desktop\\project\\icon1.jpg"));
a1= new JLabel("Breakfast:"); 
b1= new JLabel("Corn Flakes and Glass of Milk"); 
a2= new JLabel("Lunch:"); 
b2= new JLabel("Medium Meals");  
a3= new JLabel("Snacks:"); 
b3= new JLabel("Green Gram");
a4= new JLabel("Dinner");
b4= new JLabel("Non Cardohydrade foods"); 
b5= new JLabel(""); 
b6= new JLabel("");
b7= new JLabel("TAKE CARE !!!!");
JPanel p1=new JPanel();
p1.setLayout(new GridLayout(0,2));
p1.add(imgl);  
p1.add(output);
p1.add(a1);
p1.add(b1);
p1.add(a2);
p1.add(b2);
p1.add(a3);
p1.add(b3);
p1.add(a4);
p1.add(b4);
p1.add(b5);
p1.add(b6);
p1.add(b7);
frame1.add(p1);
}
}   

class print implements ActionListener
{
public void actionPerformed(ActionEvent e)
{
printframe pf = new printframe();
}
}


public static void main(String[] args) 
{  
new bmi3();  
} 
}  