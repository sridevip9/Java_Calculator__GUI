package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculator implements ActionListener{

	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextArea textarea = new JTextArea(2,10);
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		JButton button5 = new JButton("5");
		JButton button6 = new JButton("6");
		JButton button7 = new JButton("7");
		JButton button8 = new JButton("8");
		JButton button9 = new JButton("9");
		JButton button0 = new JButton("0");
		JButton buttondot = new JButton(".");
		JButton buttonsub = new JButton("-");
		JButton buttonmul = new JButton("*");
		JButton buttondiv = new JButton("/");
		JButton buttonadd = new JButton("+");
		JButton buttonequal = new JButton("=");
		JButton buttonclear = new JButton("clear");
		
		double number1;
		double number2;
		double result;
		
		int addition = 0;
		int multi = 0;
		int division = 0;
		int subt = 0;
		
		
		public Calculator() {
			
			frame.setSize(350, 450);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			frame.setTitle(" Basic Calculator");
			
			frame.add(panel);
			panel.setBackground(Color.CYAN);
			Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
			panel.setBorder(border);
			
		    panel.add(textarea);	
			textarea.setBackground(Color.BLACK);
			Border areaborder = BorderFactory.createLineBorder(Color.RED, 3);
			textarea.setBorder(areaborder);
			Font font = new Font("arial",Font.BOLD,36);
			textarea.setFont(font);
			textarea.setForeground(Color.white);
			textarea.setPreferredSize(new Dimension(2,10));
			textarea.setLineWrap(true);
			
			button1.setPreferredSize(new Dimension(100, 45));
			button1.setIcon(new ImageIcon("//1.jpg"));
			
			button2.setPreferredSize(new Dimension(100, 45));
			button2.setIcon(new ImageIcon("//2.png"));
			
			button3.setPreferredSize(new Dimension(100, 45));
			button3.setIcon(new ImageIcon("//3.jpg"));
			
			button4.setPreferredSize(new Dimension(100, 45));
			button4.setIcon(new ImageIcon("//4.jpg"));
			
			button5.setPreferredSize(new Dimension(100, 45));
	//		button5.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/5.png"));
			
			button6.setPreferredSize(new Dimension(100, 45));
	//		button6.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/6.png"));
			
			button7.setPreferredSize(new Dimension(100, 45));
	//		button7.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/7.png"));
			
			button8.setPreferredSize(new Dimension(100, 45));
	//		button8.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/8.png"));
			
			button9.setPreferredSize(new Dimension(100, 45));
	//		button9.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/9.jpg"));
			
			button0.setPreferredSize(new Dimension(100, 45));
	//		button0.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/0.png"));
			
     	    buttonsub.setPreferredSize(new Dimension(100, 45));
	//		buttonsub.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/11.png"));
			
			buttonmul.setPreferredSize(new Dimension(100, 45));
	//		buttonmul.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/mul.jpg"));
			
			buttondiv.setPreferredSize(new Dimension(100, 45));
	//		buttondiv.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/div.jpg"));
			
			buttondot.setPreferredSize(new Dimension(100, 45));
	 //    	buttondot.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/dot.png"));
			
			buttonadd.setPreferredSize(new Dimension(100, 45));
	//		buttonadd.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/add.png"));
			
			buttonequal.setPreferredSize(new Dimension(205, 45));
	//		buttonequal.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/equal.jpg"));
			
			buttonclear.setPreferredSize(new Dimension(100, 45));
	//		buttonclear.setIcon(new ImageIcon("///Users/Devi/eclipse-workspace/BasicCalculaorgui/src/images/clear.jpg"));
		
		
	
		
			 panel.add(button1);
			 panel.add(button2);
			 panel.add(button3);
			 panel.add(button4);
			 panel.add(button5);
			 
			 panel.add(button6);
			 panel.add(button7);
			 panel.add(button8);
			 panel.add(button9);
			 panel.add(button0);
			 
			 
			 panel.add(buttonsub);
			 panel.add(buttonmul);
			 panel.add(buttondiv);
			 panel.add(buttondot);
			 panel.add(buttonadd);
			 panel.add(buttonequal);
			 panel.add(buttonclear);
			 
			 button1.addActionListener(this);
			 button2.addActionListener(this);
			 button3.addActionListener(this);
			 button4.addActionListener(this);
			 button5.addActionListener(this);
			 button6.addActionListener(this);
			 button7.addActionListener(this);
			 button8.addActionListener(this);
			 button9.addActionListener(this);
			 button0.addActionListener(this);
			 buttonsub.addActionListener(this);
			 buttonmul.addActionListener(this);
			 buttondiv.addActionListener(this);
			 buttondot.addActionListener(this);
			 buttonadd.addActionListener(this);
			 buttonequal.addActionListener(this);
			 buttonclear.addActionListener(this);
			
		}

        


		
		public void actionPerformed(ActionEvent e) {
			// create an object 
			Object source = e.getSource();
			
			if(source== buttonclear){
	               number1 = 0.0;
	               number2 = 0.0;
	               textarea.setText("");
	             
					 }   
			
			if(source == button1) {
				textarea.append("1");
			}

			if(source == button2) {
				textarea.append("2");
			}
			

			if(source == button3) {
				textarea.append("3");
			}

			if(source == button4) {
				textarea.append("4");
			}

			if(source == button5) {
				textarea.append("5");
			}

			if(source == button6) {
				textarea.append("6");
			}

			if(source == button7) {
				textarea.append("7");
			}

			if(source == button8) {
				textarea.append("8");
			}

			if(source == button9) {
				textarea.append("9");
			}

			if(source == button0) {
				textarea.append("0");
			}

			if(source == buttondot) {
				textarea.append(".");
			  }
			
			if(source == buttonadd) {
				number1 = number_reader();
				textarea.setText(""); // textarea must be empty
				addition = 1;
				multi = 0 ;
				division =0;
				subt = 0;
			  }
			if(source == buttonmul) {
				number1 = number_reader();
				textarea.setText(""); // textarea must be empty
				addition = 0;
				multi = 1 ;
				division =0;
				subt = 0;
			  }
			if(source == buttondiv) {
				number1 = number_reader();
				textarea.setText(""); // textarea must be empty
				addition = 0;
				multi = 0 ;
				division =1;
				subt = 0;
			  }
			if(source == buttonsub) {
				number1 = number_reader();
				textarea.setText(""); // textarea must be empty
				addition = 0;
				multi = 0 ;
				division =0;
				subt = 1;
			  }
			
			if(source == buttonequal) {
				number2 = number_reader();
				
				if(addition > 0) {
					result = number1 + number2;
					textarea.setText(Double.toString(result));
					
				}
				
				if(multi > 0) {
					result = number1 * number2;
					textarea.setText(Double.toString(result));
					
				}
				if(division > 0) {
					result = number1 / number2;
					textarea.setText(Double.toString(result));
					
				}
				if(subt > 0) {
					result = number1 - number2;
					textarea.setText(Double.toString(result));
					
				}
			}
	}	
		
		public double number_reader() {
			double num1;
			String s;
			s = textarea.getText();
			return num1 = Double.valueOf(s);
		}
			
		
		

}


