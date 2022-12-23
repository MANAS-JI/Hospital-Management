package rEGISTERFORM;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Font;
import javax.swing.JTextField;

import hEALTHTRACKER.HEALTHTRACKER;
import lOGIN.LOGIN;
import oTP.OTP;
import sP.SP;

import javax.swing.JRadioButton;
import javax.swing.JEditorPane;
import java.awt.Button;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class REGISTERFORM {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtNoteOtp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					REGISTERFORM window = new REGISTERFORM();
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
	public REGISTERFORM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Arial", Font.PLAIN, 10));
		frame.setBounds(100, 100, 932, 782);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("REGISTRATION");
		label.setFont(new Font("Arial Black", Font.PLAIN, 36));
		label.setBounds(267, 0, 352, 56);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("NAME :");
		label_1.setFont(new Font("Arial Black", Font.PLAIN, 24));
		label_1.setBounds(21, 97, 150, 56);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial Black", Font.PLAIN, 28));
		textField.setBounds(198, 97, 529, 56);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		Label label_2 = new Label("AGE :");
		label_2.setFont(new Font("Arial Black", Font.PLAIN, 24));
		label_2.setBounds(21, 170, 150, 56);
		frame.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial Black", Font.PLAIN, 28));
		textField_1.setBounds(198, 170, 244, 56);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		Label label_3 = new Label("GENDER :");
		label_3.setFont(new Font("Arial Black", Font.PLAIN, 24));
		label_3.setBounds(21, 238, 150, 56);
		frame.getContentPane().add(label_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MALE ");
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.PLAIN, 28));
		rdbtnNewRadioButton.setBounds(198, 238, 148, 56);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("FEMALE");
		rdbtnNewRadioButton_1.setFont(new Font("Arial Black", Font.PLAIN, 28));
		rdbtnNewRadioButton_1.setBounds(376, 238, 194, 56);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		ButtonGroup b=new ButtonGroup();
		b.add(rdbtnNewRadioButton);
		b.add(rdbtnNewRadioButton_1);
		
		
		Label label_4 = new Label("ADDRESS :");
		label_4.setFont(new Font("Arial Black", Font.PLAIN, 24));
		label_4.setBounds(21, 308, 156, 69);
		frame.getContentPane().add(label_4);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Arial Black", Font.PLAIN, 20));
		editorPane.setBounds(198, 308, 252, 69);
		frame.getContentPane().add(editorPane);
		
		Label label_5 = new Label("DATE OF BIRTH :");
		label_5.setFont(new Font("Algerian", Font.PLAIN, 24));
		label_5.setBounds(21, 403, 252, 62);
		frame.getContentPane().add(label_5);
		
		Label label_6 = new Label("EMAIL :");
		label_6.setFont(new Font("Arial Black", Font.PLAIN, 24));
		label_6.setBounds(21, 488, 135, 56);
		frame.getContentPane().add(label_6);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial Black", Font.PLAIN, 28));
		textField_3.setBounds(181, 488, 521, 56);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		Label label_7 = new Label("CONTACT NUMBER");
		label_7.setFont(new Font("Arial Black", Font.PLAIN, 24));
		label_7.setBounds(21, 566, 309, 45);
		frame.getContentPane().add(label_7);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Arial Black", Font.PLAIN, 28));
		textField_4.setBounds(362, 554, 309, 37);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		Label label_8 = new Label("CREATE USERNAME :");
		label_8.setFont(new Font("Arial Black", Font.PLAIN, 24));
		label_8.setBounds(21, 638, 325, 45);
		frame.getContentPane().add(label_8);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Arial Black", Font.PLAIN, 28));
		textField_5.setBounds(362, 638, 309, 45);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("PROCEED");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Name=textField.getText();
				String Age=textField_1.getText();
				JOptionPane.showMessageDialog(null,"THANK U FOR REGISTRATION\n BEST REAGARDS FROM MANAS GUPTA",null,0,null);
			/*	System.exit(0);*/
				/*HEALTHTRACKER info = new HEALTHTRACKER();
				HEALTHTRACKER.main(null);*/
				OTP OTP = new OTP();
				OTP.main(null);
				frame.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 36));
		btnNewButton.setBounds(342, 693, 228, 45);
		frame.getContentPane().add(btnNewButton);
		
		txtNoteOtp = new JTextField();
		txtNoteOtp.setText("NOTE : OTP WILL SEND TO THIS NUMBER");
		txtNoteOtp.setFont(new Font("Arial", Font.PLAIN, 14));
		txtNoteOtp.setBounds(362, 593, 309, 35);
		frame.getContentPane().add(txtNoteOtp);
		txtNoteOtp.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SP info = new SP();
					SP.main(null);
					frame.dispose();
			}
		});
		
		btnNewButton_1.setFont(new Font("Arial Black", Font.PLAIN, 28));
		btnNewButton_1.setBounds(0, 0, 126, 37);
		frame.getContentPane().add(btnNewButton_1);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().setFont(new Font("Algerian", Font.PLAIN, 24));
		dateChooser.setDateFormatString("dd MMMM yyyy");
		dateChooser.setBounds(296, 403, 274, 62);
		frame.getContentPane().add(dateChooser);
		
		JLocaleChooser localeChooser = new JLocaleChooser();
		localeChooser.setModel(new DefaultComboBoxModel(new String[] {"", "","India", "Thai (Thai, Thailand)", "Turkmen (Latin, Turkmenistan)", "Tigrinya (Ethiopia)", "Tamil (Singapore)", "Chinese (Simplified, Singapore)", "Fulah (Adlam, Liberia)", "English (Jamaica)", "Northern Sami (Latin, Norway)", "Spanish (Bolivia)", "Dzongkha (Bhutan)", "Bosnian (Bosnia & Herzegovina)", "Lower Sorbian (Germany)", "Luxembourgish (Latin, Luxembourg)", "English (Liberia)", "Arabic (Chad)", "Nuer (Latin, South Sudan)", "Fulah (Latin, Mauritania)", "Swahili (Uganda)", "Turkmen (Turkmenistan)", "Serbian (Cyrillic, Montenegro)", "Arabic (Egypt)", "Ossetic (Cyrillic, Georgia)", "Yoruba (Nigeria)", "Northern Sami (Norway)", "English (Palau)", "Polish (Poland)", "Serbian (Serbia and Montenegro)", "Nepali (India)", "Aghem (Latin, Cameroon)", "Arabic (Western Sahara)", "Bosnian (Latin, Bosnia & Herzegovina)", "Low German (Germany)", "Norwegian Bokm\u00E5l (Svalbard & Jan Mayen)", "Spanish (United States)", "English (United States, Computer)", "Portuguese (Macao SAR China)", "Luxembourgish (Luxembourg)", "Lower Sorbian (Latin, Germany)", "Icelandic (Latin, Iceland)", "Somali (Kenya)", "Zarma (Niger)", "Armenian (Armenian, Armenia)", "Fulah (Latin, Ghana)", "French (St. Pierre & Miquelon)", "Arabic (Comoros)", "Norwegian (Norway, Nynorsk)", "Polish (Latin, Poland)", "Aghem (Cameroon)", "Gujarati (Gujarati, India)", "Turkish (Turkey)", "Kalaallisut (Latin, Greenland)", "Arabic (Mauritania)", "Spanish (Dominican Republic)", "Kalaallisut (Greenland)", "English (Nauru)", "Low German (Latin, Germany)", "Kinyarwanda (Latin, Rwanda)", "English (Australia)", "English (Cyprus)", "Turkish (Latin, Turkey)", "Tigrinya (Eritrea)", "Nuer (South Sudan)", "English (Rwanda)", "Croatian (Latin, Croatia)", "Lingala (Congo - Kinshasa)", "Ngiemboon (Cameroon)", "Zarma (Latin, Niger)", "Arabic (Israel)", "Odia (India)", "Pashto (Arabic, Afghanistan)", "Arabic (Syria)", "Luo (Latin, Kenya)", "Bafia (Cameroon)", "Tatar (Russia)", "Oromo (Kenya)", "English (American Samoa)", "French (Vanuatu)", "Chinese (Taiwan)", "Sindhi (India)", "Ngiemboon (Latin, Cameroon)", "Portuguese (Mozambique)", "French (Niger)", "Friulian (Latin, Italy)", "Asturian (Latin, Spain)", "Bena (Latin, Tanzania)", "Shambala (Tanzania)", "Burmese (Myanmar, Myanmar (Burma))", "English (Jersey)", "Lingala (Central African Republic)", "Uzbek (Afghanistan)", "Danish (Latin, Denmark)", "English (Christmas Island)", "Akan (Latin, Ghana)", "English (Austria)", "Cantonese (Simplified, China)", "Kannada (India)", "English (Tanzania)", "English (Puerto Rico)", "French (New Caledonia)", "Scottish Gaelic (United Kingdom)", "French (Cameroon)", "Walser (Latin, Switzerland)", "Punjabi (Gurmukhi, India)", "Urdu (Arabic, Pakistan)", "Nigerian Pidgin (Latin, Nigeria)", "Teso (Uganda)", "Norwegian (Latin, Norway)", "Bengali (Bengali, Bangladesh)", "Inari Sami (Latin, Finland)", "English (Netherlands)", "Lingala (Congo - Brazzaville)", "Nepali (Devanagari, Nepal)", "Azerbaijani (Azerbaijan)", "Marathi (India)", "Greek (Cyprus)", "Kurdish (Turkey)", "Gusii (Latin, Kenya)", "Northern Luri (Iran)", "Swiss German (France)", "Spanish (Honduras)", "Hungarian (Hungary)", "Fulah (Senegal)", "Albanian (North Macedonia)", "Serbian (Cyrillic, Bosnia & Herzegovina)", "Bulgarian (Cyrillic, Bulgaria)", "Somali (Latin, Somalia)", "Estonian (Estonia)", "Arabic (Oman)", "Western Frisian (Netherlands)", "Turkish (Cyprus)", "Latvian (Latin, Latvia)", "Uzbek (Latin, Uzbekistan)", "Northern Luri (Iraq)", "Duala (Cameroon)", "German (Italy)", "Portuguese (Latin, Brazil)", "French (Tunisia)", "Serbian (Serbia)", "German (Switzerland)", "Swahili (Latin, Tanzania)", "French (French Polynesia)", "Portuguese (Equatorial Guinea)", "Vunjo (Tanzania)", "Machame (Tanzania)", "Malagasy (Latin, Madagascar)", "English (Tuvalu)", "English (Pitcairn Islands)", "Luba-Katanga (Latin, Congo - Kinshasa)", "Chinese (Simplified, Hong Kong SAR China)", "Dutch (Netherlands)", "English (Guyana)", "Jola-Fonyi (Senegal)", "Dutch (Cura\u00E7ao)", "Arabic (Algeria)", "Portuguese (Switzerland)", "French (Equatorial Guinea)", "English (Nigeria)", "French (C\u00F4te d\u2019Ivoire)", "Kikuyu (Kenya)", "Interlingua (world)", "English (Pakistan)", "Chinese (China)", "English (St. Lucia)", "Bodo (India)", "Fulah (Adlam, Burkina Faso)", "Manx (Isle of Man)", "Cornish (Latin, United Kingdom)", "Bambara (Latin, Mali)", "Yangben (Latin, Cameroon)", "Macedonian (North Macedonia)", "English (Trinidad & Tobago)", "Slovenian (Slovenia)", "Sango (Latin, Central African Republic)", "Finnish (Latin, Finland)", "Xhosa (South Africa)", "French (Belgium)", "Ngomba (Cameroon)", "Fulah (Adlam, Niger)", "Spanish (Venezuela)", "Meru (Kenya)", "English (Bermuda)", "Norwegian Bokm\u00E5l (Norway)", "Kabuverdianu (Cape Verde)", "Vietnamese (Vietnam)", "English (United States)", "Morisyen (Mauritius)", "French (Burkina Faso)", "Italian (San Marino)", "Persian (Arabic, Iran)", "Sanskrit (Devanagari, India)", "French (Mayotte)", "Gujarati (India)", "Fulah (Latin, Cameroon)", "Maltese (Latin, Malta)", "Finnish (Finland)", "Catalan (France)", "Serbian (Latin, Bosnia & Herzegovina)", "Chakma (Chakma, Bangladesh)", "Ukrainian (Cyrillic, Ukraine)", "French (Djibouti)", "Fulah (Adlam, Guinea-Bissau)", "Hausa (Ghana)", "Yiddish (Hebrew, world)", "Afrikaans (Latin, South Africa)", "Tigrinya (Ethiopic, Ethiopia)", "Tongan (Latin, Tonga)", "German (Belgium)", "Amharic (Ethiopic, Ethiopia)", "Fulah (Latin, Guinea-Bissau)", "Chinese (Macao SAR China)", "Mundang (Latin, Cameroon)", "Nyankole (Uganda)", "Rundi (Latin, Burundi)", "Malay (Malaysia)", "Tamil (Sri Lanka)", "German (Latin, Germany)", "Cebuano (Philippines)", "Tajik (Tajikistan)", "Vunjo (Latin, Tanzania)", "Quechua (Peru)", "Spanish (Ecuador)", "Macedonian (Cyrillic, North Macedonia)", "Fulah (Adlam, Cameroon)", "Ganda (Uganda)", "Fulah (Latin, Niger)", "Zulu (South Africa)", "French (Latin, France)", "Sundanese (Latin, Indonesia)", "Chiga (Uganda)", "Colognian (Germany)", "Russian (Russia)", "Nigerian Pidgin (Nigeria)", "English (Dominica)", "Hebrew (Hebrew, Israel)", "English (Burundi)", "Irish (Ireland)", "Cantonese (China)", "Romansh (Latin, Switzerland)", "English (Samoa)", "French (Luxembourg)", "Maori (New Zealand)", "Arabic (Eritrea)", "Shona (Zimbabwe)", "Spanish (Ceuta & Melilla)", "Irish (United Kingdom)", "Thai (Thailand, TH, Thai Digits)", "French (Seychelles)", "English (Sierra Leone)", "Fulah (Latin, Nigeria)", "Norwegian (Norway)", "Fulah (Adlam, Nigeria)", "Chinese (Traditional, Macao SAR China)", "English (St. Helena)", "Sindhi (Arabic, Pakistan)", "German (Luxembourg)", "German (Germany)", "Norwegian Nynorsk (Latin, Norway)", "English (Denmark)", "Somali (Djibouti)", "Lithuanian (Lithuania)", "Esperanto (world)", "Pashto (Pakistan)", "English (US Outlying Islands)", "English (Slovenia)", "Vai (Vai, Liberia)", "Lao (Laos)", "Rombo (Latin, Tanzania)", "Arabic (Lebanon)", "Northern Luri (Arabic, Iran)", "Afrikaans (South Africa)", "Fulah (Guinea)", "Colognian (Latin, Germany)", "Spanish (Belize)", "Arabic (United Arab Emirates)", "Esperanto (Latin, world)", "Croatian (Croatia)", "Rombo (Tanzania)", "Kashmiri (India)", "Burmese (Myanmar (Burma))", "Mongolian (Mongolia)", "Urdu (Pakistan)", "Danish (Denmark)", "English (Micronesia)", "English (Belgium)", "French (Wallis & Futuna)", "Mazanderani (Iran)", "English (Singapore)", "Kalenjin (Kenya)", "Fulah (Latin, Gambia)", "Tatar (Cyrillic, Russia)", "Teso (Latin, Uganda)", "Asu (Latin, Tanzania)", "Bena (Tanzania)", "Fulah (Latin, Guinea)", "Slovenian (Latin, Slovenia)", "English (Sudan)", "Maithili (Devanagari, India)", "Japanese (Japan, JP, Japanese Calendar)", "Spanish (El Salvador)", "Portuguese (Brazil)", "Manipuri (Bengali, India)", "Malayalam (India)", "Irish (Latin, Ireland)", "English (Falkland Islands)", "Icelandic (Iceland)", "Basaa (Latin, Cameroon)", "English (Diego Garcia)", "Portuguese (S\u00E3o Tom\u00E9 & Pr\u00EDncipe)", "Akan (Ghana)", "Uzbek (Arabic, Afghanistan)", "English (Sweden)", "Chinese (Simplified, China)", "Spanish (Latin America)", "Lingala (Latin, Congo - Kinshasa)", "Kako (Latin, Cameroon)", "Gusii (Kenya)", "Swiss German (Liechtenstein)", "Chakma (Bangladesh)", "Spanish (Canary Islands)", "Arabic (Tunisia)", "Bambara (Mali)", "Cornish (United Kingdom)", "Punjabi (Pakistan)", "Uyghur (China)", "Machame (Latin, Tanzania)", "Kikuyu (Latin, Kenya)", "Spanish (Brazil)", "Koyra Chiini (Mali)", "English (Solomon Islands)", "Tibetan (Tibetan, China)", "Cherokee (United States)", "Kinyarwanda (Rwanda)", "Tachelhit (Tifinagh, Morocco)", "Arabic (Iraq)", "English (Germany)", "Romanian (Moldova)", "English (Finland)", "Uzbek (Uzbekistan)", "Taita (Kenya)", "Interlingua (Latin, world)", "Yakut (Cyrillic, Russia)", "English (Seychelles)", "English (Uganda)", "English (New Zealand)", "Spanish (Uruguay)", "Masai (Kenya)", "Manipuri (India)", "Russian (Ukraine)", "Sango (Central African Republic)", "English (Fiji)", "German (Liechtenstein)", "English (Barbados)", "Inari Sami (Finland)", "Croatian (Bosnia & Herzegovina)", "Yoruba (Latin, Nigeria)", "German (Austria)", "Luba-Katanga (Congo - Kinshasa)", "Arabic (world)", "Somali (Somalia)", "Latvian (Latvia)", "Arabic (Kuwait)", "Serbian (Cyrillic, Serbia)", "English (Lesotho)", "English (Hong Kong SAR China)", "Bodo (Devanagari, India)", "Meru (Latin, Kenya)", "Chechen (Russia)", "Georgian (Georgia)", "Swahili (Tanzania)", "French (Rwanda)", "Malagasy (Madagascar)", "English (Latin, United States)", "Ossetic (Russia)", "Serbian (Latin, Serbia)", "Kyrgyz (Kyrgyzstan)", "Central Atlas Tamazight (Latin, Morocco)", "Dutch (Latin, Netherlands)", "Kurdish (Latin, Turkey)", "Morisyen (Latin, Mauritius)", "Arabic (Jordan)", "Galician (Latin, Spain)", "Kyrgyz (Cyrillic, Kyrgyzstan)", "Amharic (Ethiopia)", "French (Algeria)", "Tibetan (China)", "Quechua (Ecuador)", "Georgian (Georgian, Georgia)", "English (Montserrat)", "Konkani (Devanagari, India)", "English (Guernsey)", "Makonde (Latin, Tanzania)", "Santali (India)", "Swedish (Sweden)", "Serbian (Montenegro)", "English (Zambia)", "French (Mali)", "Hausa (Nigeria)", "Arabic (Saudi Arabia)", "Persian (Afghanistan)", "Filipino (Latin, Philippines)", "Oromo (Latin, Ethiopia)", "Ossetic (Georgia)", "Central Kurdish (Arabic, Iraq)", "Yiddish (world)", "English (Malta)", "English (Ghana)", "English (Israel)", "Kannada (Kannada, India)", "Central Atlas Tamazight (Morocco)", "Greek (Greek, Greece)", "Koyraboro Senni (Mali)", "Rwa (Latin, Tanzania)", "Lakota (United States)", "Vai (Latin, Liberia)", "Swahili (Congo - Kinshasa)", "Fulah (Adlam, Mauritania)", "Filipino (Philippines)", "Italian (Vatican City)", "Spanish (Philippines)", "Spanish (Spain)", "Spanish (Colombia)", "Bulgarian (Bulgaria)", "English (St. Vincent & Grenadines)", "Koyraboro Senni (Latin, Mali)", "Upper Sorbian (Germany)", "Basque (Latin, Spain)", "English (Europe)", "Swedish (Latin, Sweden)", "Arabic (Sudan)", "Hausa (Niger)", "English (St. Kitts & Nevis)", "Romanian (Romania)", "Serbian (Latin, Montenegro)", "Spanish (Guatemala)", "Fulah (Latin, Liberia)", "Basaa (Cameroon)", "North Ndebele (Latin, Zimbabwe)", "French (Madagascar)", "Spanish (Chile)", "Kamba (Kenya)", "Persian (Iran)", "English (Macao SAR China)", "Japanese (Japanese, Japan)", "English (Belize)", "Lakota (Latin, United States)", "Albanian (Albania)", "Romanian (Latin, Romania)", "Tasawaq (Niger)", "Kwasio (Cameroon)", "Tamil (Tamil, India)", "Kabyle (Latin, Algeria)", "English (Northern Mariana Islands)", "English (Grenada)", "Sangu (Latin, Tanzania)", "English (Botswana)", "Kabyle (Algeria)", "Makonde (Tanzania)", "Hebrew (Israel)", "Tamil (Malaysia)", "Swedish (Finland)", "North Ndebele (Zimbabwe)", "Luyia (Latin, Kenya)", "Sinhala (Sinhala, Sri Lanka)", "English (Ireland)", "Chinese (Singapore)", "English (Kiribati)", "Tasawaq (Latin, Niger)", "Oromo (Ethiopia)", "Lao (Lao, Laos)", "Albanian (Latin, Albania)", "Japanese (Japan)", "Kamba (Latin, Kenya)", "Fulah (Adlam, Ghana)", "Korean (Korean, South Korea)", "French (St. Martin)", "Malay (Indonesia)", "Sanskrit (India)", "Cantonese (Hong Kong SAR China)", "English (Eswatini)", "Faroese (Latin, Faroe Islands)", "Rwa (Tanzania)", "Spanish (Peru)", "Makhuwa-Meetto (Mozambique)", "English (United Kingdom)", "Chinese (Traditional, Hong Kong SAR China)", "Santali (Ol Chiki, India)", "Kazakh (Kazakhstan)", "Spanish (Panama)", "Arabic (Palestinian Territories)", "French (Monaco)", "Urdu (India)", "Chechen (Cyrillic, Russia)", "Swiss German (Switzerland)", "Luyia (Kenya)", "Kako (Cameroon)", "Spanish (Equatorial Guinea)", "Makhuwa-Meetto (Latin, Mozambique)", "Arabic (Yemen)", "English (Sint Maarten)", "Russian (Kazakhstan)", "Korean (North Korea)", "Dutch (Suriname)", "English (Bahamas)", "Bemba (Latin, Zambia)", "Kalenjin (Latin, Kenya)", "Chiga (Latin, Uganda)", "Dutch (Caribbean Netherlands)", "Ewe (Latin, Ghana)", "Fulah (Adlam, Guinea)", "Uzbek (Cyrillic, Uzbekistan)", "Hindi (Devanagari, India)", "English (Kenya)", "Asu (Tanzania)", "French (Senegal)", "French (Morocco)", "Portuguese (Luxembourg)", "Fulah (Adlam, Gambia)", "French (St. Barth\u00E9lemy)", "Meta\u02BC (Cameroon)", "Kwasio (Latin, Cameroon)", "Maithili (India)", "Korean (South Korea)", "Tajik (Cyrillic, Tajikistan)", "Spanish (Mexico)", "Zulu (Latin, South Africa)", "Dogri (India)", "English (South Sudan)", "Tibetan (India)", "Tachelhit (Morocco)", "English (Madagascar)", "French (Burundi)", "Upper Sorbian (Latin, Germany)", "Nama (Latin, Namibia)", "Breton (Latin, France)", "Bengali (Bangladesh)", "Spanish (Latin, Spain)", "English (South Africa)", "Welsh (Latin, United Kingdom)", "French (France)", "Punjabi (India)", "English (Marshall Islands)", "French (Benin)", "Vai (Liberia)", "Javanese (Latin, Indonesia)", "Yakut (Russia)", "Pashto (Afghanistan)", "Bosnian (Cyrillic, Bosnia & Herzegovina)", "Xhosa (Latin, South Africa)", "Taita (Latin, Kenya)", "Slovak (Slovakia)", "Koyra Chiini (Latin, Mali)", "Mazanderani (Arabic, Iran)", "Mongolian (Cyrillic, Mongolia)", "Wolof (Senegal)", "Hausa (Latin, Nigeria)", "French (Haiti)", "Russian (Cyrillic, Russia)", "Telugu (India)", "Masai (Latin, Kenya)", "Dutch (Sint Maarten)", "French (Congo - Brazzaville)", "Manx (Latin, Isle of Man)", "Maltese (Malta)", "Malay (Latin, Malaysia)", "Malayalam (Malayalam, India)", "Low German (Netherlands)", "Standard Moroccan Tamazight (Tifinagh, Morocco)", "Nyankole (Latin, Uganda)", "English (Vanuatu)", "Tongan (Tonga)", "Fulah (Latin, Sierra Leone)", "Sena (Mozambique)", "Soga (Latin, Uganda)", "Fulah (Adlam, Senegal)", "Vietnamese (Latin, Vietnam)", "Sundanese (Indonesia)", "Ngomba (Latin, Cameroon)", "Sichuan Yi (China)", "Punjabi (Arabic, Pakistan)", "French (R\u00E9union)", "Bengali (India)", "French (Guadeloupe)", "Standard Moroccan Tamazight (Morocco)", "Ukrainian (Ukraine)", "Ganda (Latin, Uganda)", "Cebuano (Latin, Philippines)", "English (Norfolk Island)", "French (Switzerland)", "Serbian (Cyrillic, Kosovo)", "Norwegian Bokm\u00E5l (Latin, Norway)", "Arabic (South Sudan)", "English (Guam)", "Dutch (Aruba)", "English (Anguilla)", "Western Frisian (Latin, Netherlands)", "Soga (Uganda)", "English (Cameroon)", "Czech (Czechia)", "Catalan (Spain)", "Hungarian (Latin, Hungary)", "Romansh (Switzerland)", "Russian (Moldova)", "Fulah (Latin, Senegal)", "English (Tonga)", "Fulah (Adlam, Sierra Leone)", "English (Papua New Guinea)", "Estonian (Latin, Estonia)", "French (Central African Republic)", "Portuguese (Timor-Leste)", "English (Eritrea)", "Serbian (Bosnia & Herzegovina)", "Spanish (Paraguay)", "Konkani (India)", "Belarusian (Cyrillic, Belarus)", "French (Togo)", "Dzongkha (Tibetan, Bhutan)", "Serbian (Latin, Kosovo)", "English (Philippines)", "Igbo (Nigeria)", "French (Guinea)", "Scottish Gaelic (Latin, United Kingdom)", "Chinese (Simplified, Macao SAR China)", "Northern Sami (Finland)", "English (Cook Islands)", "Arabic (Morocco)", "Hawaiian (Latin, United States)", "English (Antigua & Barbuda)", "French (Chad)", "Embu (Kenya)", "Lithuanian (Latin, Lithuania)", "Bemba (Zambia)", "Ewondo (Latin, Cameroon)", "Ewondo (Cameroon)", "French (Congo - Kinshasa)", "Rundi (Burundi)", "English (Namibia)", "Meta\u02BC (Latin, Cameroon)", "Catalan (Italy)", "Quechua (Latin, Peru)", "Langi (Tanzania)", "Indonesian (Indonesia)", "Teso (Kenya)", "Catalan (Andorra)", "Quechua (Bolivia)", "Hawaiian (United States)", "French (Canada)", "Kabuverdianu (Latin, Cape Verde)", "Albanian (Kosovo)", "Maori (Latin, New Zealand)", "English (Cayman Islands)", "Italian (Switzerland)", "Sinhala (Sri Lanka)", "Luo (Kenya)", "English (United Arab Emirates)", "Italian (Italy)", "Arabic (Somalia)", "English (Zimbabwe)", "Norwegian Nynorsk (Norway)", "French (Mauritius)", "Northern Sami (Sweden)", "English (Tokelau)", "Mundang (Cameroon)", "Samburu (Kenya)", "Portuguese (Guinea-Bissau)", "Shona (Latin, Zimbabwe)", "Malay (Singapore)", "Ewe (Togo)", "Lingala (Angola)", "Belarusian (Belarus)", "Khmer (Khmer, Cambodia)", "Italian (Latin, Italy)", "Portuguese (Cape Verde)", "Spanish (Puerto Rico)", "Walser (Switzerland)", "Russian (Belarus)", "Faroese (Denmark)", "Ewe (Ghana)", "Arabic (Bahrain)", "Kazakh (Cyrillic, Kazakhstan)", "Uyghur (Arabic, China)", "Hindi (India)", "English (Switzerland)", "Samburu (Latin, Kenya)", "Faroese (Faroe Islands)", "Yoruba (Benin)", "Asturian (Spain)", "French (Comoros)", "French (Martinique)", "Spanish (Argentina)", "Dogri (Devanagari, India)", "English (Malaysia)", "Sangu (Tanzania)", "Embu (Latin, Kenya)", "Cantonese (Traditional, Hong Kong SAR China)", "Armenian (Armenia)", "English (Gambia)", "Shambala (Latin, Tanzania)", "Nepali (Nepal)", "Friulian (Italy)", "Tamil (India)", "French (French Guiana)", "Indonesian (Latin, Indonesia)", "Portuguese (Angola)", "Telugu (Telugu, India)", "English (world)", "Duala (Latin, Cameroon)", "Javanese (Indonesia)", "Langi (Latin, Tanzania)", "Russian (Kyrgyzstan)", "French (Mauritania)", "Bafia (Latin, Cameroon)", "Fulah (Latin, Burkina Faso)", "Chinese (Traditional, Taiwan)", "Assamese (India)", "Chinese (Hong Kong SAR China)", "Swahili (Kenya)", "Assamese (Bengali, India)", "Thai (Thailand)", "English (Malawi)", "Nama (Namibia)", "English (British Indian Ocean Territory)", "Arabic (Qatar)", "Arabic (Arabic, Egypt)", "English (Cocos (Keeling) Islands)", "Portuguese (Portugal)", "Slovak (Latin, Slovakia)", "Azerbaijani (Cyrillic, Azerbaijan)", "Central Kurdish (Iraq)", "Tachelhit (Latin, Morocco)", "Spanish (Cuba)", "English (US Virgin Islands)", "Basque (Spain)", "Igbo (Latin, Nigeria)", "Greek (Greece)", "Yangben (Cameroon)", "Danish (Greenland)", "Khmer (Cambodia)", "Central Kurdish (Iran)", "Kashmiri (Arabic, India)", "Catalan (Spain, Valencian)", "Wolof (Latin, Senegal)", "Sindhi (Devanagari, India)", "Marathi (Devanagari, India)", "Spanish (Costa Rica)", "French (Gabon)", "Arabic (Libya)", "English (Mauritius)", "Galician (Spain)", "Azerbaijani (Latin, Azerbaijan)", "English (Isle of Man)", "Swiss German (Latin, Switzerland)", "Sena (Latin, Mozambique)", "English (Gibraltar)", "English (Canada)", "Cherokee (Cherokee, United States)", "French (Syria)", "Odia (Oriya, India)", "Somali (Ethiopia)", "Catalan (Latin, Spain)", "Dutch (Belgium)", "Arabic (Djibouti)", "Jola-Fonyi (Latin, Senegal)", "Welsh (United Kingdom)", "English (British Virgin Islands)", "English (Turks & Caicos Islands)", "Swedish (\u00C5land Islands)", "Czech (Latin, Czechia)", "Afrikaans (Namibia)", "English (India)", "Spanish (Nicaragua)", "Sichuan Yi (Yi, China)", "Sindhi (Pakistan)", "Masai (Tanzania)", "Malay (Brunei)", "Chakma (India)", "Breton (France)"}));
		localeChooser.setFont(new Font("Arial Black", Font.PLAIN, 28));
		localeChooser.setBounds(463, 308, 445, 69);
		frame.getContentPane().add(localeChooser);
		JLabel bg;
		ImageIcon im=new ImageIcon("C:\\Users\\91955\\Pictures\\Saved Pictures\\KLO.jpg");
		bg=new JLabel("",new ImageIcon("C:\\Users\\91955\\Pictures\\Saved Pictures\\KLO.jpg"),JLabel.CENTER);
		bg.setLabelFor(frame);
		bg.setBounds(0, 0,918,735);
		frame.getContentPane().add(bg);
	}
}
