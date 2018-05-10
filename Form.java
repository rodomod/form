import javax.swing.*;   
import java.awt.*;   
import java.awt.event.*;
/**
 * @author rodomod
 */
public class Form extends JFrame{
   
JTextArea display=new JTextArea();  
JPanel buttonPanel=new JPanel(new GridLayout(4,20)); 
JButton button0=new JButton("0");
JButton button1=new JButton("1");
JButton button2=new JButton("2");
JButton button3=new JButton("3");  
JButton button4=new JButton("4");
JButton button5=new JButton("5");
JButton button6=new JButton("6");
JButton button7=new JButton("7");
JButton button8=new JButton("8");
JButton button9=new JButton("9");
JButton buttonOps=new JButton("+/-");
JButton buttonPoint=new JButton(".");
JButton buttonCent=new JButton("str^str");
JButton buttonBack=new JButton("C");
JButton buttonSE=new JButton("SE");
JButton buttonSum=new JButton("+");
JButton buttonMul=new JButton("*");
JButton buttonDivide=new JButton("/");
JButton buttonSub=new JButton("-");	
JButton buttonStart=new JButton("=");
JButton buttonDiv=new JButton("sqrt");	                    
String operation = "+,-,*,/";
double firstnum;
double secondnum;
Form(){  
   super("form");
button0.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (0));   
		           }   
		         });
button1.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (1));   
		           }   
		         });
button2.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (2));   
		           }   
		         });
button3.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (3));   
		           }   
		         });  
button4.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (4));   
		           }   
		         });   
button5.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (5));   
		           }   
		         });	   
button6.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (6));   
		           }   
		         });
button7.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (7));   
		           }   
		         });
button8.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (8));   
		           }   
		         });
button9.addActionListener(    
		     new ActionListener(){ 
		    	@Override 
		         public void actionPerformed(ActionEvent e){   
		             display.setText(display.getText() + (9));   
   }   
});   
buttonOps.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
		double ops = Double.parseDouble(String.valueOf(display.getText()));
		ops*=-1;
		display.setText(String.valueOf(ops));
		}
});
buttonDiv.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	double firstnum=Double.parseDouble(display.getText());
	double secondnum=Double.parseDouble(display.getText());
	String sq=display.getText();
	if(sq.indexOf("")==0)display.setText(Math.sqrt(firstnum*secondnum/secondnum)+"");
	 }
});
buttonPoint.addActionListener(
  new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	             String Pnt=display.getText();
	        if(Pnt.indexOf(".")<0)display.setText(display.getText()+ ".");
   }
});	 
buttonBack.addActionListener(new ActionListener(){
        	@Override
        	public void actionPerformed(ActionEvent e){
        		String temp=display.getText();
        		display.setText(temp.substring(0,temp.length()-1));
   }
});
buttonPanel.add(buttonCent);
	   buttonCent.addActionListener(new ActionListener(){
	           	@Override
	           	public void actionPerformed(ActionEvent e){
	           		double firstnum=Double.parseDouble(display.getText());
	           		double secondnum=Double.parseDouble(display.getText());
	           		String Pow=display.getText();
                if(Pow.indexOf("")==0)display.setText(Math.pow(firstnum,secondnum)+"");	
   }
});
   buttonPanel.add(buttonSE);
	   buttonSE.addActionListener(new ActionListener(){
	           	@Override
	           	public void actionPerformed(ActionEvent e){
	           		display.setText(""); 
   }
});
buttonSum.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	firstnum=Double.parseDouble(display.getText());
		display.setText("");
		operation="+";
	}
});
buttonMul.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	firstnum=Double.parseDouble(display.getText());
		display.setText("");
		operation="*";
	}
});
buttonDivide.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	firstnum=Double.parseDouble(display.getText());
		display.setText("");
		operation="/";
	}
});
buttonSub.addActionListener(new ActionListener(){
	@Override
	public void actionPerformed(ActionEvent e){
	
	firstnum=Double.parseDouble(display.getText());
		display.setText("");
		operation="-";
	}
});
buttonStart.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
 
double   secondnum=Double.parseDouble(display.getText());
   if(operation=="+"){
       display.setText((firstnum+secondnum)+"");
   }
  else if(operation=="-"){
       display.setText((firstnum-secondnum)+"");
   }
  else if(operation=="*"){
       display.setText((firstnum*secondnum)+"");
   }
   else if(operation=="/"){
       display.setText((firstnum/secondnum)+"");
   }
         
}
});
setBounds(400,250,400,250);
setLayout(new BorderLayout());
add(display ,BorderLayout.NORTH);  
add(buttonPanel,BorderLayout.CENTER);
add(buttonStart,BorderLayout.SOUTH); 
buttonPanel.add(button0);
buttonPanel.add(button1);
buttonPanel.add(button2);
buttonPanel.add(button3);
buttonPanel.add(button4);
buttonPanel.add(button5);
buttonPanel.add(button6);
buttonPanel.add(button7);
buttonPanel.add(button8);
buttonPanel.add(button9);
buttonPanel.add(buttonPoint);
buttonPanel.add(buttonCent); 
buttonPanel.add(buttonSum);
buttonPanel.add(buttonSub);
buttonPanel.add(buttonMul);
buttonPanel.add(buttonDivide);
buttonPanel.add(buttonDiv);
buttonPanel.add(buttonOps);
buttonPanel.add(buttonBack);
buttonPanel.add(buttonSE);
setVisible(true); 
        }
public static void main(String[]args){
	new Form();
         } 
}
