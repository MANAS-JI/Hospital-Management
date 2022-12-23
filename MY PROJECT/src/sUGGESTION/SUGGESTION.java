package sUGGESTION;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextPane;

import TEMP1.tEMP1;
import aFTERLOGIN.AFTERLOGIN;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class SUGGESTION {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SUGGESTION window = new SUGGESTION();
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
	public SUGGESTION() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("SUGGESTION\r\n");
		label.setFont(new Font("Arial Black", Font.PLAIN, 40));
		label.setBounds(135, 0, 359, 73);
		frame.getContentPane().add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(0, 79, 202, 344);
		frame.getContentPane().add(textPane);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AFTERLOGIN info = new 	AFTERLOGIN ();
			AFTERLOGIN .main(null);
			frame.dispose();
			}
		});
		
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(511, 0, 107, 60);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("feedback");
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			tEMP1 info = new tEMP1 ();
			try {
				tEMP1 .main(null);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.dispose();
			}
		});
		
		btnNewButton_1.setBounds(0, 0, 107, 49);
		frame.getContentPane().add(btnNewButton_1);
		JLabel bg;
		ImageIcon im=new ImageIcon("C:\\Users\\91955\\Desktop\\KLH.jpg");
		bg=new JLabel("",im,JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(0, -34,781,687);
		frame.getContentPane().add(bg);
	}
}
