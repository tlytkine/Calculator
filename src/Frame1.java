import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 520, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(6, 6, 208, 51);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(226, 6, 218, 51);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int ans;
				
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans));
					
					
				  }catch(Exception e1){
					  
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
		});
		btnNewButton.setBounds(97, 115, 117, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Multiply");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int ans;
				
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1*num2;
					textFieldAns.setText(Integer.toString(ans));
					
					
				  }catch(Exception e2){
					  
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
			
		});
		btnNewButton_1.setBounds(97, 143, 117, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Subtract");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int ans;
				
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
					
					
				  }catch(Exception e3){
					  
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			}
			
		});
		btnNewButton_2.setBounds(210, 115, 117, 29);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Divide ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1;
				int num2;
				int ans;
				
				try {
					num1=Integer.parseInt(textFieldNum1.getText());
					num2=Integer.parseInt(textFieldNum2.getText());
					ans=num1/num2;
					textFieldAns.setText(Integer.toString(ans));
					
					
				  }catch(Exception e4){
					  
					JOptionPane.showMessageDialog(null, "Please enter a valid number.");
				}
			
			}
		});
		btnNewButton_3.setBounds(210, 143, 117, 29);
		frame.getContentPane().add(btnNewButton_3);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(146, 205, 130, 26);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
	}

}
