package sP;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import lOGIN.LOGIN;
import rEGISTERFORM.REGISTERFORM;
import java.awt.Label;
import java.awt.Color;

public class SP {

	private JFrame frame;
	private JTextField txtAlreadyHaveAn;
	private JTextField txtNewUser;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SP window = new SP();
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
	public SP() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN info = new LOGIN();
					LOGIN.main(null);
					
			}
		});
		
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 30));
		btnNewButton.setBounds(566, 311, 210, 69);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("REGISTER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 REGISTERFORM info = new REGISTERFORM();
					REGISTERFORM.main(null);
					frame.dispose();
			}
		});
		
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 30));
		btnNewButton_1.setBounds(0, 320, 210, 69);
		frame.getContentPane().add(btnNewButton_1);
		
		txtAlreadyHaveAn = new JTextField();
		txtAlreadyHaveAn.setBackground(Color.LIGHT_GRAY);
		txtAlreadyHaveAn.setText("EXISTING ACCOUNT?");
		txtAlreadyHaveAn.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtAlreadyHaveAn.setBounds(576, 280, 184, 19);
		frame.getContentPane().add(txtAlreadyHaveAn);
		txtAlreadyHaveAn.setColumns(10);
		
		txtNewUser = new JTextField();
		txtNewUser.setBackground(Color.LIGHT_GRAY);
		txtNewUser.setSelectedTextColor(Color.LIGHT_GRAY);
		txtNewUser.setText("NEW USER ?");
		txtNewUser.setFont(new Font("Arial Black", Font.PLAIN, 14));
		txtNewUser.setBounds(51, 295, 108, 19);
		frame.getContentPane().add(txtNewUser);
		txtNewUser.setColumns(10);
		JLabel bg;
		ImageIcon im=new ImageIcon("C:\\Users\\91955\\Pictures\\ps.jpeg");
		bg=new JLabel("",new ImageIcon("C:\\Users\\91955\\Pictures\\ps.jpeg"),JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(0, 10,786,454);
		frame.getContentPane().add(bg);
	}
}
