package oTP;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextField;

import aFTERLOGIN.AFTERLOGIN;
import lOGIN.LOGIN;
import rEGISTERFORM.REGISTERFORM;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class OTP {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OTP window = new OTP();
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
	public OTP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 973, 646);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("ONE TIME PASSWORD");
		label.setBackground(new Color(135, 206, 250));
		label.setFont(new Font("Arial Black", Font.PLAIN, 25));
		label.setBounds(493, 26, 367, 96);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("ENTER YOUR OTP :");
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		label_1.setBounds(533, 178, 286, 37);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 28));
		textField.setBounds(525, 256, 312, 78);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AFTERLOGIN info = new AFTERLOGIN ();
				AFTERLOGIN .main(null);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 40));
		btnNewButton.setBounds(493, 461, 367, 96);
		frame.getContentPane().add(btnNewButton);
		JLabel bg;
	//	ImageIcon im=new ImageIcon("C:\\Users\\91955\\Desktop\\lopp.png");//
		bg=new JLabel("",new ImageIcon("C:\\Users\\91955\\Pictures\\lopp.png"),JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(10, 0,939,599);
		frame.getContentPane().add(bg);
		
	}
}
