package bOOKAPPOINTMENT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import aFTERLOGIN.AFTERLOGIN;
import pROFILE.PROFILE;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Choice;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.Toolkit;
import java.awt.Color;
import com.toedter.components.JLocaleChooser;
import com.toedter.calendar.JDateChooser;

public class BOOKAPPOINTMENT {

	private JFrame frame;
	private JTextField txtAppointement;
	private JTextField txtDoctorSpecialization;
	private JTextField txtExpectedDates;
	private JTextField txtExpectedTime;
	private JTextField txtExpectedLocation;
	private JTextField textField_2;
	private JTextField txtExpectedMode;
	private JButton btnNewButton_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BOOKAPPOINTMENT window = new BOOKAPPOINTMENT();
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
	public BOOKAPPOINTMENT() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\91955\\Desktop\\WhatsApp Image 2022-04-23 at 9.24.57 AM.jpeg"));
		frame.setBounds(100, 100, 845, 545);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtAppointement = new JTextField();
		txtAppointement.setText("APPOINTEMENT");
		txtAppointement.setFont(new Font("Arial Black", Font.PLAIN, 36));
		txtAppointement.setBounds(234, 0, 341, 64);
		frame.getContentPane().add(txtAppointement);
		txtAppointement.setColumns(10);
		
		txtDoctorSpecialization = new JTextField();
		txtDoctorSpecialization.setFont(new Font("Algerian", Font.PLAIN, 24));
		txtDoctorSpecialization.setText("DOCTOR SPECIALIZATION :");
		txtDoctorSpecialization.setBounds(10, 108, 311, 45);
		frame.getContentPane().add(txtDoctorSpecialization);
		txtDoctorSpecialization.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Allergists/Immunologists", "Anesthesiologists", "Cardiologists", "Colon and Rectal Surgeons", "Critical Care Medicine Specialists", "Dermatologists", "Endocrinologists", "Emergency Medicine Specialists", "Family Physicians", "Gastroenterologists", "Geriatric Medicine Specialists", "Hematologists", "Hospice and Palliative Medicine Specialists", "Infectious Disease Specialists", "Internists", "Medical Geneticists", "Nephrologists", "Neurologists", "Obstetricians and Gynecologists", "Oncologists", "Ophthalmologists", "Osteopaths", "Otolaryngologists", "Pathologists", "Pediatricians", "Physiatrists", "Plastic Surgeons", "Podiatrists", "Psychiatrists", "General"}));
		comboBox.setFont(new Font("Algerian", Font.PLAIN, 24));
		comboBox.setBounds(331, 108, 490, 45);
		frame.getContentPane().add(comboBox);
		
		txtExpectedDates = new JTextField();
		txtExpectedDates.setText("EXPECTED DATES :");
		txtExpectedDates.setFont(new Font("Algerian", Font.PLAIN, 24));
		txtExpectedDates.setBounds(10, 175, 257, 37);
		frame.getContentPane().add(txtExpectedDates);
		txtExpectedDates.setColumns(10);
		
		txtExpectedTime = new JTextField();
		txtExpectedTime.setText("EXPECTED TIME :");
		txtExpectedTime.setFont(new Font("Algerian", Font.PLAIN, 24));
		txtExpectedTime.setBounds(10, 221, 257, 37);
		frame.getContentPane().add(txtExpectedTime);
		txtExpectedTime.setColumns(10);
		
		txtExpectedLocation = new JTextField();
		txtExpectedLocation.setFont(new Font("Algerian", Font.PLAIN, 24));
		txtExpectedLocation.setText("EXPECTED LOCATION :");
		txtExpectedLocation.setBounds(10, 278, 257, 37);
		frame.getContentPane().add(txtExpectedLocation);
		txtExpectedLocation.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(277, 278, 229, 37);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"CONGRATULATION!!!!\nYour expected appointment data is accepted.\n You will recieve a call shortly about confirmation and further process.",null,0,null);
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Algerian", Font.PLAIN, 40));
		btnNewButton.setBounds(245, 424, 229, 74);
		frame.getContentPane().add(btnNewButton);
		
		txtExpectedMode = new JTextField();
		txtExpectedMode.setText("EXPECTED MODE :");
		txtExpectedMode.setFont(new Font("Algerian", Font.PLAIN, 24));
		txtExpectedMode.setBounds(10, 328, 257, 37);
		frame.getContentPane().add(txtExpectedMode);
		txtExpectedMode.setColumns(10);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ONLINE ");
		rdbtnNewRadioButton.setFont(new Font("Algerian", Font.PLAIN, 24));
		rdbtnNewRadioButton.setBounds(287, 328, 129, 37);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFFLINE");
		rdbtnNewRadioButton_1.setFont(new Font("Algerian", Font.PLAIN, 24));
		rdbtnNewRadioButton_1.setBounds(432, 328, 144, 37);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		ButtonGroup b=new ButtonGroup();
		b.add(rdbtnNewRadioButton);
		b.add(rdbtnNewRadioButton_1);
		
		btnNewButton_1 = new JButton("HOME");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AFTERLOGIN info = new 	AFTERLOGIN ();
			AFTERLOGIN .main(null);
			frame.dispose();
			}
		});
		
		
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		btnNewButton_1.setBounds(0, 0, 129, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JLocaleChooser localeChooser = new JLocaleChooser();
		localeChooser.setBounds(515, 278, 258, 37);
		frame.getContentPane().add(localeChooser);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(277, 175, 229, 37);
		frame.getContentPane().add(dateChooser);
		
		textField = new JTextField();
		textField.setBounds(277, 221, 229, 37);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		JLabel bg;
		ImageIcon im=new ImageIcon("C:\\Users\\91955\\Desktop\\JMK.jpg");
		bg=new JLabel("",new ImageIcon("C:\\Users\\91955\\Downloads\\io.jpeg"),JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(0, -19,821,545);
		frame.getContentPane().add(bg);
		
	
	}
}
