package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator0 implements ActionListener {
	JFrame jf;
	JLabel display;
	JButton sevenButton;
	JButton eighButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton zeroButton;
	JButton clearButton;
	JButton dotButton;
	JButton mulButton,addButton, equalButton,subButton,divButton;
	String oldvalue;
	float result;
	int choose;
	
	boolean isoperationclicked=false;
	
	public Calculator0() {
		jf= new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(200,100);
		
		display = new JLabel();
		display.setBounds(30, 50, 540, 40);
		display.setBackground(Color.gray);
		display.setOpaque(true);
		display.setHorizontalAlignment(SwingConstants.RIGHT);
		display.setForeground(Color.WHITE);
		jf.add(display);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eighButton = new JButton("8");
		eighButton.setBounds(130, 130, 80, 80);
		eighButton.setFont(new Font("Arial", Font.PLAIN, 40));
		eighButton.addActionListener(this);
		jf.add(eighButton);
		
	    nineButton = new JButton("9");
		nineButton.setBounds(230 , 130, 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230 , 230, 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		mulButton = new JButton("X");
		mulButton.setBounds(330 , 230, 80, 80);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 40));
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		
		
		oneButton = new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(230 , 330, 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		
		addButton = new JButton("+");
		addButton.setBounds(330 , 330, 80, 80);
		addButton.setFont(new Font("Arial", Font.PLAIN, 40));
		addButton.addActionListener(this);
		
		jf.add(addButton);
		
		clearButton = new JButton("C");
		clearButton.setBounds(430 , 330, 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 40));
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		
		dotButton = new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
	    equalButton = new JButton("=");
		equalButton.setBounds(230 , 430, 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		subButton = new JButton("-");
		subButton.setBounds(330 , 430, 80, 80);
		subButton.setFont(new Font("Arial", Font.PLAIN, 40));
		subButton.addActionListener(this);
		jf.add(subButton);
		
		
		
	    divButton = new JButton("/");
		divButton.setBounds(330 , 130, 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 40));
		divButton.addActionListener(this);
		jf.add(divButton);
		
		
		
	}
	public static void main(String[] args) {
		Calculator0 c= new Calculator0();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== sevenButton) {
			if(isoperationclicked) {
				display.setText("7");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"7");
			}
			
			
		}else if (e.getSource()== eighButton) {
			if(isoperationclicked) {
				display.setText("8");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"8");
			}
			
			
			
		}else if (e.getSource()== nineButton) {
			
			if(isoperationclicked) {
				display.setText("9");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"9");
			}
		}else if (e.getSource()== fourButton) {
			if(isoperationclicked) {
				display.setText("4");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"4");
			}
			
			
		}else if (e.getSource()== fiveButton) {
			if(isoperationclicked) {
				display.setText("5");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"5");
			}
			
		}else if (e.getSource()== sixButton) {
			if(isoperationclicked) {
				display.setText("6");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"6");
			}
			
		}else if (e.getSource()== oneButton) {
			if(isoperationclicked) {
				display.setText("1");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"1");
			}
			
		}else if (e.getSource()== twoButton) {
			if(isoperationclicked) {
				display.setText("2");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"2");
			}
			
		}else if (e.getSource()== threeButton) {
			if(isoperationclicked) {
				display.setText("3");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"3");
			}
			
		}else if (e.getSource()== zeroButton) {
			if(isoperationclicked) {
				display.setText("0");
				isoperationclicked=false;
			}else {
				display.setText(display.getText()+"0");
			}
			
		}else if(e.getSource()== clearButton) {
			display.setText("");
		}else if(e.getSource()==dotButton) {
			display.setText(display.getText()+".");
		}else if(e.getSource()==addButton) {
			isoperationclicked =true;
			oldvalue=display.getText();
			choose=1;
			
		}else if(e.getSource()==subButton) {
			isoperationclicked =true;
			oldvalue=display.getText();
			choose=2;
			
			
		}else if(e.getSource()==mulButton) {
			isoperationclicked =true;
			oldvalue=display.getText();
			choose=3;
			
		}else if(e.getSource()==divButton) {
			isoperationclicked =true;
			oldvalue=display.getText();
			choose=4;
			
		}else if(e.getSource()==equalButton) {
			 if(choose==2) {
				 
					String newvalue=display.getText();
					float value1= Float.parseFloat(oldvalue);
					float value2=Float.parseFloat(newvalue);
					result=value1-value2;
					display.setText(result+"");
			 }else if(choose==1) {
				    String newvalue=display.getText();
					float value1= Float.parseFloat(oldvalue);
					float value2=Float.parseFloat(newvalue);
					result=value1+value2;
					display.setText(result+"");
				 
				 
			 }else if(choose==3) {
				    String newvalue=display.getText();
					float value1= Float.parseFloat(oldvalue);
					float value2=Float.parseFloat(newvalue);
					result=value1*value2;
					display.setText(result+"");
				 
				 
			 }else if(choose==4) {
				 
				 String newvalue=display.getText();
					float value1= Float.parseFloat(oldvalue);
					float value2=Float.parseFloat(newvalue);
					result=value1/value2;
					display.setText(result+"");
			 }
			
			
			}
		
		
	}
		
		
	

}
