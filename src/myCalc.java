import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class myCalc {

	private JFrame frame;
	private JTextField txtDisplay;
	
	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myCalc window = new myCalc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 483, 36);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+b1.getText());
			
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b1.setBounds(10, 58, 79, 31);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(txtDisplay.getText()+b2.getText());
			}
		});
		b2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b2.setBounds(116, 58, 79, 31);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+b3.getText());
			}
		});
		b3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b3.setBounds(10, 100, 79, 31);
		frame.getContentPane().add(b3);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDisplay.setText(txtDisplay.getText()+b5.getText());
			}
		});
		b5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b5.setBounds(10, 148, 79, 31);
		frame.getContentPane().add(b5);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+b4.getText());
			}
		});
		b4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b4.setBounds(116, 100, 79, 31);
		frame.getContentPane().add(b4);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+b6.getText());
			}
		});
		b6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b6.setBounds(116, 148, 79, 31);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+b7.getText());
			}
		});
		b7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b7.setBounds(10, 190, 79, 31);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+b8.getText());
			}
		});
		b8.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b8.setBounds(116, 190, 79, 31);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+b9.getText());
			}
		});
		b9.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b9.setBounds(10, 232, 79, 31);
		frame.getContentPane().add(b9);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+b0.getText());
			}
			
		});
		b0.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b0.setBounds(116, 232, 79, 31);
		frame.getContentPane().add(b0);
		
		JButton b_plus = new JButton("+");
		b_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		b_plus.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b_plus.setBounds(351, 58, 79, 31);
		frame.getContentPane().add(b_plus);
		
		JButton b_sub = new JButton("-");
		b_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		b_sub.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b_sub.setBounds(243, 106, 79, 31);
		frame.getContentPane().add(b_sub);
		
		JButton b_mul = new JButton("*");
		b_mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		b_mul.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b_mul.setBounds(351, 100, 79, 31);
		frame.getContentPane().add(b_mul);
		
		JButton b_div = new JButton("/");
		b_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		b_div.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b_div.setBounds(243, 148, 79, 31);
		frame.getContentPane().add(b_div);
		
		JButton b_mod = new JButton("%");
		b_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		b_mod.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b_mod.setBounds(351, 148, 79, 31);
		frame.getContentPane().add(b_mod);
		
		JButton b_equal = new JButton("=");
		b_equal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations =="+")
				{
					result = (float)(firstnum + secondnum);
					
					txtDisplay.setText(String.valueOf(result));
				}
				else if(operations =="-")
				{
					
					result = (float)(firstnum-secondnum);
					txtDisplay.setText(String.valueOf(result));
					
					
				}
				else if(operations == "*")
				{
					result =(float)(firstnum*secondnum);
					txtDisplay.setText(String.valueOf(result));
					
					
				}
				else if(operations=="/")
				{
					result = (float)(firstnum/secondnum);
					txtDisplay.setText(String.valueOf(result));
				}
				else if(operations=="^")
				{
					result = (float)(Math.pow(firstnum, secondnum));
					txtDisplay.setText(String.valueOf(result));
				}
				else if(operations =="%")
				{
					result=(float)(firstnum%secondnum);
					txtDisplay.setText(String.valueOf(result));
					
				}
				
				
				
			}
		});
		b_equal.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b_equal.setBounds(268, 274, 142, 31);
		frame.getContentPane().add(b_equal);
		
		JButton b_dec = new JButton(".");
		b_dec.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(txtDisplay.getText()+".");
			}
		});
		b_dec.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b_dec.setBounds(33, 274, 151, 31);
		frame.getContentPane().add(b_dec);
		
		JButton b_pow = new JButton("^");
		b_pow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "^";
			}
		});
		b_pow.setFont(new Font("Times New Roman", Font.BOLD, 18));
		b_pow.setBounds(243, 196, 79, 31);
		frame.getContentPane().add(b_pow);
		
		JButton Clr = new JButton("C");
		Clr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
			}
		});
		Clr.setFont(new Font("Times New Roman", Font.BOLD, 18));
		Clr.setBounds(243, 58, 79, 31);
		frame.getContentPane().add(Clr);
		
		JButton inv = new JButton("tan");
		inv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		      firstnum=Double.parseDouble(txtDisplay.getText());
		      result=Math.tan(firstnum);
		      txtDisplay.setText(String.valueOf(result));
			    
			}
		});
		inv.setFont(new Font("Times New Roman", Font.BOLD, 18));
		inv.setBounds(351, 238, 79, 31);
		frame.getContentPane().add(inv);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				result=Math.cos(firstnum);
				txtDisplay.setText(String.valueOf(result));
			}
		});
		btnCos.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnCos.setBounds(243, 238, 79, 31);
		frame.getContentPane().add(btnCos);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum=Double.parseDouble(txtDisplay.getText());
				result=Math.sin(firstnum);
				txtDisplay.setText(String.valueOf(result));
				
			}
		});
		btnSin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnSin.setBounds(351, 196, 79, 31);
		frame.getContentPane().add(btnSin);
	}
}
