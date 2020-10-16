import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.util.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JEditorPane;

import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;

public class Main {
   Deque<String> q;
   public StringBuffer s=new StringBuffer();
   public StringBuffer ans=new StringBuffer();
   public double num=0;
   public long u=1,y=0;
   public int o=0,dd=0;
   public int a=0;
   public int check=0;
   Operation aa;
	private JFrame frmAnilCalculator;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public StringBuffer sb=new StringBuffer();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmAnilCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		Font font2=new Font("Tempus Sans ITC",Font.BOLD,13);
		
		frmAnilCalculator = new JFrame();
		frmAnilCalculator.setTitle("ANIL CALCULATOR");
		frmAnilCalculator.setBounds(100, 100, 391, 491);
		frmAnilCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAnilCalculator.getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 31, 356, 68);
		textPane.setEditable(false) ; 
		frmAnilCalculator.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFocusPainted(false);
		btnNewButton.setBorderPainted(false);
		
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					textField_2.setFont(font2);
					o=0;
				}
				s.append("1");
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
		});
		btnNewButton.setBounds(10, 143, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("2");
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
				
			}
		});
		btnNewButton_1.setBounds(105, 143, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("3");
				
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
		});
		btnNewButton_2.setBounds(200, 143, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setBorderPainted(false);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("4");
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
		});
		btnNewButton_3.setBounds(10, 198, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setBorderPainted(false);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("5");
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
		});
		btnNewButton_4.setBounds(105, 198, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setBorderPainted(false);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("6");
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
			
		});
		btnNewButton_5.setBounds(200, 198, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.setFocusPainted(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("7");
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
			
		});
		btnNewButton_6.setBounds(10, 254, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_7.setFocusPainted(false);
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("8");
				
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
		});
		btnNewButton_7.setBounds(105, 254, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_8.setBackground(Color.LIGHT_GRAY);
		btnNewButton_8.setFocusPainted(false);
		btnNewButton_8.setBorderPainted(false);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("9");
				
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
		});
		btnNewButton_8.setBounds(200, 253, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("0");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_9.setFocusPainted(false);
		btnNewButton_9.setBorderPainted(false);
		btnNewButton_9.setBackground(Color.LIGHT_GRAY);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append("0");
				textPane.setText(s.toString());
				textField_2.setText(stringtonumber(s.toString()));
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			}
		});
		btnNewButton_9.setBounds(105, 314, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_10.setBackground(new Color(240, 255, 240));
		btnNewButton_10.setFocusPainted(false);
		btnNewButton_10.setBorderPainted(false);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(o==9) {
					s.delete(0, s.length());
					textField_2.setText(s.toString());
					textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
					o=0;
					textField_2.setFont(font2);
				}
					
			     s.append("+");
					textPane.setText(s.toString());
			}
		});
		btnNewButton_10.setBounds(296, 147, 70, 36);
		frmAnilCalculator.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_11.setBackground(new Color(240, 255, 240));
		btnNewButton_11.setFocusPainted(false);
		btnNewButton_11.setBorderPainted(false);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				if(o==9) {
					s.delete(0, s.length());
					textField_2.setText(s.toString());
					textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
					o=0;
					textField_2.setFont(font2);
				}
			     s.append("-");
					textPane.setText(s.toString());
			}
		});
		btnNewButton_11.setBounds(296, 202, 70, 36);
		frmAnilCalculator.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_12.setBackground(new Color(240, 255, 240));
		btnNewButton_12.setFocusPainted(false);
		btnNewButton_12.setBorderPainted(false);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(o==9) {
					s.delete(0, s.length());
					textField_2.setText(s.toString());
					textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
					o=0;
					textField_2.setFont(font2);
				}
			     s.append("*");
					textPane.setText(s.toString());
			}
		});
		btnNewButton_12.setBounds(296, 258, 70, 36);
		frmAnilCalculator.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_13.setBackground(new Color(240, 255, 240));
		btnNewButton_13.setFocusPainted(false);
		btnNewButton_13.setBorderPainted(false);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(o==9) {
					s.delete(0, s.length());
					textField_2.setText(s.toString());
					textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
					o=0;
					textField_2.setFont(font2);
				}
			     s.append("/");
					textPane.setText(s.toString());
			}
		});
		btnNewButton_13.setBounds(296, 318, 70, 36);
		frmAnilCalculator.getContentPane().add(btnNewButton_13);
		Font font1=new Font("SansSerif",Font.BOLD,20);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_14.setBackground(new Color(255, 255, 51));
		btnNewButton_14.setFocusPainted(false);
		btnNewButton_14.setBorderPainted(false);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textPane.setText(s.toString());
				if(s.length()!=0)
				sb.append(stringtonumber(s.toString()));
				
				textField_2.setText(sb.toString());
				textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
				textField_2.setFont(font1);
				ans.append(sb);
				sb.delete(0, sb.length());
				s.delete(0, s.length());
				dd=1;
				o=9;
				a=0;
				
			}
		});
		btnNewButton_14.setBounds(265, 391, 85, 36);
		frmAnilCalculator.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("C");
		btnNewButton_15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_15.setForeground(new Color(0, 0, 0));
		btnNewButton_15.setFocusPainted(false);
		btnNewButton_15.setBorderPainted(false);
		btnNewButton_15.setBackground(Color.RED);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				s.delete(0, s.length());
				textPane.setText(s.toString());
				textField_2.setText(s.toString());
				textField_2.setFont(font2);
				y=0;
				u=1;
			}
			
		});
		btnNewButton_15.setBounds(22, 391, 85, 36);
		frmAnilCalculator.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("DEL");
		btnNewButton_16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_16.setBackground(Color.GRAY);
		btnNewButton_16.setFocusPainted(false);
		btnNewButton_16.setBorderPainted(false);
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					if(o!=9)
					{
					
			       if(s.length()!=0)
					s.deleteCharAt(s.length()-1);
					if(s.length()!=0) {
						
					textField_2.setText(stringtonumber(s.toString()));
					textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
					textPane.setText(s.toString());}
					else {
						textPane.setText(null);
						textField_2.setText(null);
					}
					
					}
				}
				
				
			
		});
		btnNewButton_16.setBounds(146, 391, 85, 36);
		frmAnilCalculator.getContentPane().add(btnNewButton_16);
		
		
		
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		textField_2.setForeground(Color.MAGENTA);
		textField_2.setBackground(Color.WHITE);
		textField_2.setEditable(false) ;
		textField_2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
		textField_2.setBounds(10, 80, 356, 19);
		frmAnilCalculator.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_17 = new JButton(".");
		btnNewButton_17.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_17.setBackground(new Color(169, 169, 169));
		btnNewButton_17.setFocusPainted(false);
		btnNewButton_17.setBorderPainted(false);
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(o==9)
				{
					num=0;
					textField_2.setText(null);
					o=0;
					textField_2.setFont(font2);
				}
				s.append(".");
				textPane.setText(s.toString());
				
			}
		});
		btnNewButton_17.setBounds(10, 314, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("ANS");
		btnNewButton_18.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnNewButton_18.setBackground(new Color(153, 204, 204));
		btnNewButton_18.setFocusPainted(false);
		btnNewButton_18.setBorderPainted(false);
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(o==9 && dd==1)
				{   textField_2.setText(null);
					s.append(ans.toString());
					ans.delete(0,ans.length());
					sb.delete(0,sb.length());
					textPane.setText(s.toString());
					textField_2.setText(s.toString());
					textField_2.setFont(font2);
					o=0;
					dd=0;
				}
			}
		});
		btnNewButton_18.setBounds(200, 314, 60, 45);
		frmAnilCalculator.getContentPane().add(btnNewButton_18);
		
		
	}
	public String stringtonumber(String s)
	{
		int yy=0;
		q=new LinkedList<String>();
		u=0;
		y=0;
		num=0;
		int i=0;
		for( i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='.')
			{
				u=1;
				y=1;
			}
			else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
			{
				q.add(Double.toString(num));
				q.add(Character.toString(s.charAt(i)));
				
				num=0;
				y=0;
			}
			else if(y!=1)
			{
				num=num*10+Integer.parseInt(Character.toString(s.charAt(i)));
				
			}
			else if(y==1){
				u=u*10;
				num=num+(double)Integer.parseInt(Character.toString(s.charAt(i)))/u;
				
			}
		}
		if(s.charAt(i-1)!='+'&&s.charAt(i-1)!='-'&&s.charAt(i-1)!='*'&&s.charAt(i-1)!='/') {
		q.add(Double.toString(num));
		yy=1;
		}
		if(q.size()==1)
		{
			String fr=q.poll();
			double a=Double.parseDouble(fr);
			aa=new Operation(a);
			return fr;
		}else if(q.size()==2&&yy==0)
		  {          
			String fr=q.poll();
			q.poll();
			double a=Double.parseDouble(fr);
			aa=new Operation(a);
			return fr;
                   }
		else {
		String str=calculate(q);
		
		
		return str ;
		}
		
	}
	public String calculate(Deque<String> q){
		double previous=0;
		
		while(!q.isEmpty()) {
			String ff=q.poll();
		double a=Double.parseDouble(ff);
		
		
		
		aa=new Operation(a);
		int che=1;
		int p=1;
		double b=0;
		double prev=a;
		while(p>0)
		{
			
			
			
			String c=q.poll();
			
			switch(c)
			{
			case "+":
				if(q.isEmpty())
				{
				break;
				}else {
				String fe=q.poll();
				
				b=Double.parseDouble(fe);
				previous=aa.addition(b);
				prev=b;
				che=1;
				
				break;}
			
			case "-":
				if(q.isEmpty())
				{
				break;
				}
				else {
				String fe1=q.poll();
				
			     b=Double.parseDouble(fe1);
			    previous=aa.subtraction(b);
			   che=0;
			    prev=b;
			    break;}
		   case "*":
				if(q.isEmpty())
				{
				break;
				}else {
			      String fe2=q.poll();
			     b=Double.parseDouble(fe2);
			     previous=aa.multiplication(prev,b,che);
			     prev=prev*b;
			   
			     break;}
			case "/":
				if(q.isEmpty())
				{
				break;
				}else {
				String fe3=q.poll();
				
			     b=Double.parseDouble(fe3);
			     previous=aa.division(prev,b,che);
			     prev=prev/b;
			    
			     break;}
			case "%":
				if(q.isEmpty())
				{
				break;
				}else {
			      b=Double.parseDouble(q.poll());
			     previous=aa.modulus(b);
			     prev=b;
			    
			     break;}
			    
				
			}
			if(q.isEmpty())
			{
			break;
			}
		}
		
		}
		DecimalFormat df=new DecimalFormat("#.#####");
		df.setRoundingMode(RoundingMode.CEILING);
		
		String result=df.format((double)previous);
		
		return result;
		
	

}
}

class Operation{
	static double sum=0;
	static double sum1=0;
	public  Operation(double a) {
		sum=(double)a;
	}
	public double addition(double b) {
		
		sum=sum+b;
		return sum;
	}
public double  subtraction(double b) {
    sum=sum-b;
    return sum;
		
	}
public double multiplication(double a,double b,int prevop) {
    double mul=a*b;
    
    if(prevop==1)
    {
        sum=sum-a;
        sum=sum+mul;
    }
    else if(prevop==0)
    {
        sum=sum+a;
        sum=sum-mul;
    }
    else{
        sum=sum*b;
    }
    return sum;
	
}
public double division(double a,double b,int prevop) {
     double div=a/b;
    if(prevop==1)
    {
        sum=sum-a;
        sum=sum+div;
    }
    else if(prevop==0)
    {
        sum=sum+a;
        sum=sum-div;
    }
    else{
        sum=sum/b;
    }
    return sum;
	
}
public double modulus(double b) {
	sum=sum%b;
	return sum;

}
}
	