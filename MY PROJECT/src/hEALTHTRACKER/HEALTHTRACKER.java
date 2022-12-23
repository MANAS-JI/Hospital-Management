package hEALTHTRACKER;
import java.util.*;
import java.lang.*;
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

public class HEALTHTRACKER {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HEALTHTRACKER window = new HEALTHTRACKER();
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
	public HEALTHTRACKER() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 840, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("HEALTH TRACKER ");
		label.setFont(new Font("Arial Black", Font.PLAIN, 40));
		label.setBounds(170, 10, 456, 81);
		frame.getContentPane().add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(308, 97, 518, 298);
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
		btnNewButton.setBounds(701, 0, 125, 47);
		frame.getContentPane().add(btnNewButton);
		JLabel bg;
		ImageIcon im=new ImageIcon("C:\\Users\\91955\\Desktop\\OI.jpg");
		bg=new JLabel("",im,JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(0, -67,841,542);
		frame.getContentPane().add(bg);
	}
}
