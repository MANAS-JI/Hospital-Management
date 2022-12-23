package pROFILE;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextPane;

import aFTERLOGIN.AFTERLOGIN;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class PROFILE {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PROFILE window = new PROFILE();
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
	public PROFILE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 754, 571);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("PROFILE");
		label.setFont(new Font("Arial Black", Font.PLAIN, 40));
		label.setBounds(265, 10, 248, 54);
		frame.getContentPane().add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 70, 314, 294);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AFTERLOGIN info = new AFTERLOGIN ();
				AFTERLOGIN .main(null);
				frame.dispose();
			}
		});
		
		
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 24));
		btnNewButton.setBounds(621, 0, 119, 64);
		frame.getContentPane().add(btnNewButton);
		JLabel bg;
		ImageIcon im=new ImageIcon("C:\\Users\\91955\\Desktop\\OK.jpg");
		bg=new JLabel("",im,JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(0, -34,781,687);
		frame.getContentPane().add(bg);
	}
}
