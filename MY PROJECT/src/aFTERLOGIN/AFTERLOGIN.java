package aFTERLOGIN;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import bOOKAPPOINTMENT.BOOKAPPOINTMENT;
import hEALTHTRACKER.HEALTHTRACKER;
import lOGIN.LOGIN;
import pROFILE.PROFILE;
import rECORDS.RECORDS;
import sUGGESTION.SUGGESTION;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AFTERLOGIN {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AFTERLOGIN window = new AFTERLOGIN();
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
	public AFTERLOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("AFTER LOGIN");
		label.setFont(new Font("Arial Black", Font.PLAIN, 50));
		label.setBounds(48, 0, 432, 66);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("HEALTH TRACKER");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HEALTHTRACKER info = new HEALTHTRACKER();
				HEALTHTRACKER.main(null);
			}
		});
		
		
		
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 28));
		btnNewButton.setBounds(10, 103, 380, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RECORDS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RECORDS info = new RECORDS();
				RECORDS.main(null);
			}
		});
		
		
		
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 28));
		btnNewButton_1.setBounds(10, 182, 380, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("BOOK APPOINTMENT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BOOKAPPOINTMENT info = new BOOKAPPOINTMENT();
				BOOKAPPOINTMENT.main(null);
			}
		});
		
		
		btnNewButton_2.setFont(new Font("Arial Black", Font.PLAIN, 28));
		btnNewButton_2.setBounds(10, 259, 380, 41);
		frame.getContentPane().add(btnNewButton_2);
		
		
		JButton btnNewButton_3 = new JButton("SUGGESTION");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SUGGESTION info = new 	SUGGESTION  ();
				SUGGESTION .main(null);
			}
		});
		
		btnNewButton_3.setFont(new Font("Arial Black", Font.PLAIN, 28));
		btnNewButton_3.setBounds(10, 335, 380, 41);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("PROFILE");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			PROFILE info = new 	PROFILE ();
				PROFILE .main(null);
			}
		});
		
		
		
		btnNewButton_4.setFont(new Font("Arial Black", Font.PLAIN, 28));
		btnNewButton_4.setBounds(10, 419, 380, 41);
		frame.getContentPane().add(btnNewButton_4);
		JLabel bg;
		ImageIcon im=new ImageIcon("C:\\Users\\91955\\Downloads\\2.jpg");
		bg=new JLabel("",new ImageIcon("C:\\Users\\91955\\Downloads\\2.jpg"),JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(10, 0,540,485);
		frame.getContentPane().add(bg);
	}

}
