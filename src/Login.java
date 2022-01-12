import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	JFrame frame;
	JPanel panel;

	@SuppressWarnings("static-access")
	Login() {

		frame = new JFrame(); // Main Frame Object

		Image icon = Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\su1.png");
		frame.setIconImage(icon);

		// For gettting Screen Width and Height
		Toolkit tk = Toolkit.getDefaultToolkit();
		int width = (int) tk.getScreenSize().getWidth();
		int height = (int) tk.getScreenSize().getHeight();

		// Add a picture on Panel
		ImageIcon adImg = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\man1.png"); // Background
																													// image
																													// path
		JLabel adminImage = new JLabel(adImg, JLabel.CENTER); // Admin image object : aadminImage
		adminImage.setBounds(910, 293, 100, 100); // adminImage x, y, width , height
		frame.add(adminImage);

		// Administrator Login Label
		JLabel adlabel = new JLabel("ADMINISTRATOR LOGIN"); // Administrator login text object: adlabel
		Font font = new Font("LucidaGrande", Font.PLAIN + Font.BOLD, 24); // Administrator Login text font
		adlabel.setFont(font);
		adlabel.setBounds(820, 395, 350, 35); // Administrator Login text x, y, width , height
		frame.add(adlabel);
		adlabel.requestFocus();

		// TextField for Login
		JTextField username = new JTextField(); // Login TextField Object : username
		username.setText("Username");
		Font fontTF = new Font("LucidaGrande", Font.PLAIN, 17); // TextField font
		username.setFont(fontTF); // set font into Login TextField
		username.setBorder(BorderFactory.createLineBorder(new Color(224, 224, 224))); // Change TextField Border color
		username.setForeground(Color.gray); // Login TextField Foreground color
		username.setBounds(770, 455, 380, 50); // Login TextField x, y, width , height

		username.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (username.getText().equals("Username"))
					username.setText("");
			}

		});

		username.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				username.setText("");
			}
		});

		username.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {

			}

			@Override
			public void focusLost(FocusEvent e) {
				if (username.getText().length() == 0) {
					username.setText("Username");
				}

			}

		});
		frame.add(username);

		// TextField for Password
		JPasswordField password = new JPasswordField(); // Password Fields object
		password.setFont(fontTF); // Password Fields font
		password.setBorder(BorderFactory.createDashedBorder(new Color(224, 224, 224))); // Password Filed border
		password.setText("Password"); // Password Field text
		password.setForeground(Color.gray); // Password Field foreground color
		password.setBounds(770, 520, 380, 50); // Password Field x, y, width , height
		password.setEchoChar((char) 0);

		password.addKeyListener(new KeyAdapter() {
			@SuppressWarnings("deprecation")
			@Override
			public void keyTyped(KeyEvent e) {

				if (password.getText().equals("Password")) {
					password.setText("");
					password.setEchoChar('*');
				}

			}

		});

		password.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
			}

			@SuppressWarnings("deprecation")
			@Override
			public void focusLost(FocusEvent e) {
				if (password.getText().length() == 0) {
					password.setEchoChar((char) 0);
					password.setText("Password");
				}

			}

		});

		frame.add(password);

		// CheckBox for show password
		JCheckBox shwPas = new JCheckBox("Show Password"); // CheckBox object with text
		shwPas.setForeground(Color.black); // CheckBox foreground color
		shwPas.setBackground(new Color(245, 245, 250)); // CheckBox Background panel color
		shwPas.setFont(new Font("LucidaGrande", Font.BOLD, 13)); // CheckBox font
		shwPas.setBounds(775, 575, 145, 20); // CheckBox x, y, width , height
		frame.add(shwPas);

		shwPas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (shwPas.isSelected()) {
					password.setEchoChar((char) 0);

				} else {
					password.setEchoChar('*');
				}
			}
		});

		JButton LoginB = new JButton("Login"); // Login Button Object
		LoginB.setForeground(Color.white); // change Login button foreground color
		LoginB.setFont(new Font("LucidaGrande", Font.BOLD, 20)); // change forget Button font
		LoginB.setBorder(BorderFactory.createDashedBorder(new Color(0, 128, 255)));
		LoginB.setBounds(810, 620, 300, 50); // Login Button x, y, width , height
		LoginB.setBackground(new Color(0, 128, 255)); // Login Background color
		frame.add(LoginB);

		LoginB.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == LoginB) {
					if ((username.getText().equals("") || username.getText().equals("Username"))
							&& (password.getText().equals("") || password.getText().equals("Password"))) {
						ImageIcon ig1 = new ImageIcon(
								"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
						JOptionPane.showMessageDialog(null, "Please enter username / password", "Warrning",
								JOptionPane.WARNING_MESSAGE, ig1);

					}

					else if (username.getText().equals("") || username.getText().equals("Username")) {

						ImageIcon ig1 = new ImageIcon(
								"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
						JOptionPane.showMessageDialog(null, "Please enter a username", "Warrning",
								JOptionPane.WARNING_MESSAGE, ig1);
					}

					else if (password.getText().equals("") || password.getText().equals("Password")) {
						ImageIcon ig1 = new ImageIcon(
								"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
						JOptionPane.showMessageDialog(null, "Please enter a password", "Warrning",
								JOptionPane.WARNING_MESSAGE, ig1);
					}

					else {
						try {
							Connection con = DriverManager.getConnection(
									"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
							Statement st = con.createStatement();
							ResultSet rst = st.executeQuery("Select * from userTable");
							if (rst.next()) {

								if (username.getText().equals(rst.getString(1))
										&& password.getText().equals(rst.getString(2))) {
									@SuppressWarnings("unused")
									WelcomePage obj = new WelcomePage();

								}

								else {
									ImageIcon ig1 = new ImageIcon(
											"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
									JOptionPane.showMessageDialog(null, "Wrong Username or password", "Warrning",
											JOptionPane.WARNING_MESSAGE, ig1);
								}
							}

						}

						catch (Exception evt) {
							System.out.println(evt);
						}

					}
				}

			}
		});

		// Forget Password Button
		JButton Forget = new JButton("Forget Password?"); // Forget Password object
		Forget.setForeground(new Color(0, 125, 255)); // change Forget button foreground color
		Forget.setBackground(new Color(245, 245, 250)); // change Forget button background panel color
		Forget.setFont(new Font("LucidaGrande", Font.BOLD, 13)); // change forget Button font
		Forget.setBorder(BorderFactory.createDashedBorder(new Color(245, 245, 250))); // change Forget button border
		Forget.setBounds(770, 685, 120, 17); // set Forget button location
		frame.add(Forget); // Attached button with frame

		Forget.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Forget) {
					@SuppressWarnings("unused")
					Forget obj = new Forget();
				}
			}
		});

		JButton EmployeeLogin = new JButton("Employee Login"); // Forget Password object
		EmployeeLogin.setForeground(new Color(0, 125, 255)); // change Forget button foreground color
		EmployeeLogin.setBackground(new Color(245, 245, 250)); // change Forget button background panel color
		EmployeeLogin.setFont(new Font("LucidaGrande", Font.BOLD, 13)); // change forget Button font
		EmployeeLogin.setBorder(BorderFactory.createDashedBorder(new Color(245, 245, 250))); // change Forget button
																								// border
		EmployeeLogin.setBounds(770, 710, 105, 17); // set Forget button location
		frame.add(EmployeeLogin);

		EmployeeLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				EmployeeLogin obj = new EmployeeLogin();
				frame.dispose();
			}
		});

		// Change Password Button
		JButton ChangePas = new JButton("Change Password"); // Password changed Button object with text
		ChangePas.setForeground(new Color(0, 128, 255)); // Password changed Button foreground color
		ChangePas.setBackground(new Color(245, 245, 250)); // Password changed Button Background panel color
		ChangePas.setFont(new Font("LucidaGrande", Font.BOLD, 13)); // Password changed Button font
		ChangePas.setBorder(BorderFactory.createDashedBorder(new Color(245, 245, 250))); // Password changed Button
																							// border
		ChangePas.setBounds(1022, 685, 120, 17); // Password changed Button x, y, width , height
		frame.add(ChangePas);

		ChangePas.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == ChangePas) {
					@SuppressWarnings("unused")
					ChangePassword obj = new ChangePassword();
				}

			}
		});

		// Security Question Button
		JButton SecQue = new JButton("Change Security Question"); // Change Security Question Button object with text
		SecQue.setForeground(new Color(0, 128, 255)); // Change Security Question Button foreground color
		SecQue.setBackground(new Color(245, 245, 250)); // Change Security Question Button background panel color
		SecQue.setFont(new Font("LucidaGrande", Font.BOLD, 13)); // Change Security Question Button font
		SecQue.setBorder(BorderFactory.createDashedBorder(new Color(245, 245, 250))); // Change Security Question Button
																						// Border panel color
		SecQue.setBounds(990, 710, 170, 17); // Change Security Question Button x, y, width , height
		frame.add(SecQue);

		SecQue.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == SecQue) {
					@SuppressWarnings("unused")
					ChangeSecurityQuestion obj = new ChangeSecurityQuestion();

				}

			}
		});

		ImageIcon fb = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\facebook.png");
		JButton facebook = new JButton(fb);
		facebook.setBorder(BorderFactory.createDashedBorder(new Color(245, 245, 250)));
		facebook.setBounds(890, 756, 28, 28);
		frame.add(facebook);

		ImageIcon gm = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\Gmail.png");
		JButton gmail = new JButton(gm);
		gmail.setBorder(BorderFactory.createDashedBorder(new Color(245, 245, 250)));
		gmail.setBounds(940, 756, 28, 27);
		frame.add(gmail);

		ImageIcon inst = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\instagram.png");
		JButton instagram = new JButton(inst);
		instagram.setBorder(BorderFactory.createDashedBorder(new Color(245, 245, 250)));
		instagram.setBounds(990, 756, 28, 28);
		frame.add(instagram);

		JButton CreatAcc = new JButton("Create an account"); // Create account Button object
		CreatAcc.setForeground(new Color(0, 128, 255)); // Create account Button foreground color
		CreatAcc.setBackground(new Color(238, 238, 238)); // Create account Button Background
		CreatAcc.setFont(new Font("LocidaGrande", Font.BOLD, 19)); // Create account Button Font
		CreatAcc.setBorder(BorderFactory.createDashedBorder(new Color(238, 238, 238))); // Create account Button Border
		CreatAcc.setBounds(868, 819, 175, 17); // Create account Button x,y,width, height

		// ActionListener for Create an account Button
		CreatAcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == CreatAcc) {
					@SuppressWarnings("unused")
					SignUp obj = new SignUp();
					// frame.hide();
				}
			}
		});
		frame.add(CreatAcc);

		// Implements Panel in the JFrame work
		panel = new JPanel(); // Main Login Panel object : panel
		int P_width = 420, P_height = 510;
		panel.setBounds(width / 2 - P_width / 2, height / 2 - P_height / 2, P_width, P_height); // width/2 -P_width/2
																								// height/2 - P_height/2
		panel.setBackground(new Color(245, 245, 250)); // suppose the Width & height of any Screen is 1920 & 1080.
														// 1920/2 - 420/2 1080/2 - 550/2
		frame.add(panel);
		panel.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (username.getText().equals("")) {
					username.setText("    Username");
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub

			}

		});

		// Background1
		ImageIcon background_image = new ImageIcon(
				"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\background.jpg");
		Image img = background_image.getImage();
		Image temp_img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		background_image = new ImageIcon(temp_img);
		JLabel background = new JLabel("", background_image, JLabel.LEFT);
		background.setLayout(new FlowLayout());
		background.setBounds(0, 0, width, height);
		frame.add(background);

		// Frame
		frame.setSize(width, height); // Frame size
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Login L1 = new Login();
	}

}
