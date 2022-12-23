package lOGIN;

import java.awt.EventQueue;

import javax.swing.*;

import java.awt.Label;
/*import java.awt.TextField;*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import aFTERLOGIN.AFTERLOGIN;
import sP.SP;
import java.awt.Color;

public class LOGIN {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 835, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 28));
		textField.setBounds(582, 201, 190, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setBackground(new Color(204, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Password =textField_1.getText();
				String Username=textField .getText();
				if(Password.contains("100")&& Username.contains("123")){
			textField_1.setText(null);
			textField.setText(null);
			
			 AFTERLOGIN info = new AFTERLOGIN ();
			AFTERLOGIN.main(null);
			frame.dispose();
		}
		else {JOptionPane.showMessageDialog(null,"INVALID LOGIN DETAILS","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
		textField_1.setText(null);
		textField.setText(null);
		}
			}
		});
		
		
		
		
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 30));
		btnNewButton.setBounds(582, 392, 143, 32);
		frame.getContentPane().add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 28));
		textField_1.setBounds(582, 257, 190, 50);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SP info = new SP();
					SP.main(null);
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 28));
		btnNewButton_1.setBounds(0, 0, 121, 50);
		frame.getContentPane().add(btnNewButton_1);
		
	
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Administration");
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(506, 322, 121, 26);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Patient\r\n");
		rdbtnNewRadioButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(656, 322, 128, 26);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Doctor");
		rdbtnNewRadioButton_2.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(506, 360, 121, 26);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Pharmacy");
		rdbtnNewRadioButton_3.setFont(new Font("Arial Black", Font.PLAIN, 14));
		rdbtnNewRadioButton_3.setBounds(656, 360, 128, 26);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		ButtonGroup b=new ButtonGroup();
		b.add(rdbtnNewRadioButton);
		b.add(rdbtnNewRadioButton_1);
		b.add(rdbtnNewRadioButton_2);
		b.add(rdbtnNewRadioButton_3);
		
		Label label_4 = new Label("Forget Password ?");
		label_4.setFont(new Font("Arial Black", Font.PLAIN, 12));
		label_4.setBounds(668, 442, 143, 21);
		frame.getContentPane().add(label_4);
		JLabel bg;
	//	ImageIcon im=new ImageIcon("C:\\Users\\91955\\Desktop\\ALL THINGS");//
		bg=new JLabel("",new ImageIcon("C:\\Users\\91955\\Pictures\\lol.jpeg"),JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(0, 0,817,479);
		frame.getContentPane().add(bg);
		
	}
}
