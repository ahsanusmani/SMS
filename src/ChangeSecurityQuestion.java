import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
public class ChangeSecurityQuestion {
	JButton Save;
	JFrame frame;
	JLabel error1, error2, error3, error4;

	ChangeSecurityQuestion() {
		frame = new JFrame();
		frame.setLayout(null);

		Image icon = Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\su1.png");
		frame.setIconImage(icon);

		JLabel key = new JLabel(new ImageIcon(
				"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\img.png"));
		key.setBounds(52, 37, 35, 35);
		frame.add(key);

		JLabel CPLabel = new JLabel("Change Security Question");
		CPLabel.setFont(new Font("LucidaGrande", Font.BOLD, 28));
		CPLabel.setBounds(100, 30, 400, 34);
		frame.add(CPLabel);

		JLabel text = new JLabel("Here you can change your security Question");
		text.setFont(new Font("Times New Roman", Font.BOLD, 15));
		text.setForeground(Color.gray);
		text.setBounds(108, 64, 500, 25);
		frame.add(text);

		JSeparator sep1 = new JSeparator();
		sep1.setBounds(28, 100, 570, 1);
		sep1.setForeground(new Color(199, 199, 214));
		frame.add(sep1);

		JLabel usernameL = new JLabel("Username");
		usernameL.setFont(new Font("LucidaGrande", Font.BOLD, 18));
		usernameL.setForeground(Color.gray);
		usernameL.setBounds(145, 130, 100, 30);
		frame.add(usernameL);

		JTextField username = new JTextField();
		username.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
		username.setBorder(
				BorderFactory.createLineBorder(new Color(199, 199, 214)));
		username.setBounds(247, 133, 250, 25);
		frame.add(username);

		JLabel CurrentL = new JLabel("Password");
		CurrentL.setFont(new Font("LucidaGrande", Font.BOLD, 18));
		CurrentL.setForeground(Color.gray);
		CurrentL.setBounds(145, 175, 250, 30);
		frame.add(CurrentL);

		JPasswordField current = new JPasswordField();
		current.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
		current.setBorder(
				BorderFactory.createLineBorder(new Color(199, 199, 214)));
		current.setBounds(247, 178, 250, 25);

		JLabel NshowIcon = new JLabel(new ImageIcon(
				"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\view.png"));
		NshowIcon.setBounds(502, 178, 30, 30);
		JLabel NhideIcon = new JLabel(new ImageIcon(
				"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\hide.png"));
		NhideIcon.setVisible(false);
		NhideIcon.setBounds(502, 178, 30, 30);

		frame.add(NshowIcon);
		frame.add(NhideIcon);
		NshowIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				NshowIcon.setVisible(false);
				NhideIcon.setVisible(true);
				current.setEchoChar((char) 0);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				NhideIcon.setVisible(false);
				NshowIcon.setVisible(true);
				current.setEchoChar('*');

			}
		});
		frame.add(current);

		JLabel password = new JLabel("Questions");
		password.setFont(new Font("LucidaGrande", Font.BOLD, 18));
		password.setForeground(Color.gray);
		password.setBounds(140, 218, 250, 30);
		frame.add(password);

		String SecQ[] = {"Select Question", "In what city were you born?",
				"What is the name of your favorite pet?",
				"What is your mother's maiden name?",
				"What high school did you attend?",
				"What is the name of your first school?",
				"What was the make of your first car?",
				"What was your favorite food as a child?",
				"Where did you meet your spouse?"};
		@SuppressWarnings({ "rawtypes", "unchecked" })
		JComboBox SSQ = new JComboBox(SecQ);
		SSQ.setFont(new Font("LucidaGrande", Font.PLAIN, 13));
		SSQ.setBorder(
				BorderFactory.createDashedBorder(new Color(199, 199, 214)));
		SSQ.setBackground(Color.white);
		SSQ.setBounds(247, 218, 250, 30);
		frame.add(SSQ);

		JLabel REPass = new JLabel("Answer");
		REPass.setFont(new Font("LucidaGrande", Font.BOLD, 18));
		REPass.setForeground(Color.gray);
		REPass.setBounds(160, 256, 250, 30);
		frame.add(REPass);

		JTextField Answer = new JTextField();
		Answer.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
		Answer.setBorder(
				BorderFactory.createLineBorder(new Color(199, 199, 214)));
		Answer.setBounds(247, 262, 250, 25);
		frame.add(Answer);

		JSeparator sep2 = new JSeparator();
		sep2.setBounds(28, 310, 570, 1);
		sep2.setForeground(new Color(199, 199, 214));
		frame.add(sep2);

		// error1= not enter the username
		error1 = new JLabel("  \u274C Enter the username");// Error label for
															// not enter the
															// username
		error1.setForeground(Color.red);
		error1.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
		error1.setBounds(247, 154, 250, 25);
		error1.setVisible(false);
		frame.add(error1);

		// error2= not enter the current passwor
		error2 = new JLabel("  \u274C Enter the current password");// Error
																	// label for
																	// not enter
																	// the
																	// current
																	// password
		error2.setForeground(Color.red);
		error2.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
		error2.setBounds(247, 198, 250, 25);
		error2.setVisible(false);
		frame.add(error2);

		// error3 = not enter the New password
		error3 = new JLabel("  \u274C Select the question");// Error label for
															// not enter the New
															// password
		error3.setForeground(Color.red);
		error3.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
		error3.setBounds(247, 239, 250, 30);
		error3.setVisible(false);
		frame.add(error3);

		// error4 = not enter the confirm password
		error4 = new JLabel("  \u274C Enter the Confirm password");// Error

		error4.setForeground(Color.red);
		error4.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
		error4.setBounds(247, 284, 250, 25);
		error4.setVisible(false);
		frame.add(error4);

		Save = new JButton("Save Changes");
		Save.setBackground(new Color(0, 128, 255));
		Save.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Save.setBorder(
				BorderFactory.createDashedBorder(new Color(0, 128, 255)));
		Save.setForeground(Color.white);
		Save.setBounds(70, 325, 137, 30);
		Save.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				if ((username.getText().length() == 0)
						&& (current.getText().length() == 0)
						&& (SSQ.getItemAt(SSQ.getSelectedIndex()) == SSQ
								.getItemAt(0))
						&& (Answer.getText().length() == 0)) {
					ImageIcon ig1 = new ImageIcon(
							"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
					JOptionPane.showMessageDialog(null,
							"Enter all the details.", "Warrning",
							JOptionPane.WARNING_MESSAGE, ig1);
				}

				else if (username.getText().length() == 0) {
					username.setBorder(
							BorderFactory.createLineBorder(Color.red, 1));

					error1.setVisible(true);

					username.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							username.setBorder(BorderFactory.createLineBorder(
									new Color(199, 199, 214)));
							error1.setVisible(false);
						}
					});
				}

				else if (current.getText().length() == 0) {
					current.setBorder(
							BorderFactory.createLineBorder(Color.red, 1));

					error2.setVisible(true);

					current.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							current.setBorder(BorderFactory.createLineBorder(
									new Color(199, 199, 214)));
							error2.setVisible(false);
						}
					});
				} else if (SSQ.getItemAt(SSQ.getSelectedIndex()) == SSQ
						.getItemAt(0)) {
					SSQ.setBorder(BorderFactory.createLineBorder(Color.red, 1));

					error3.setVisible(true);

					SSQ.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							SSQ.setBorder(BorderFactory.createLineBorder(
									new Color(199, 199, 214)));
							error3.setVisible(false);
						}
					});

				}

				else if (Answer.getText().length() == 0) {
					Answer.setBorder(
							BorderFactory.createLineBorder(Color.red, 1));

					error4.setVisible(true);

					Answer.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							Answer.setBorder(BorderFactory.createLineBorder(
									new Color(199, 199, 214)));
							error4.setVisible(false);
						}
					});
				} else {
					try {
						Connection con = DriverManager.getConnection(
								"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");

						Statement st = con.createStatement();
						ResultSet rs = st
								.executeQuery("select * from userTable");
						if (rs.next()) {

							if (username.getText().equals(rs.getString(1))) {
								if (current.getText().equals(rs.getString(2))) {

									st.executeUpdate(
											"update userTable set Security_Question='"
													+ SSQ.getSelectedItem()
													+ "',answer='"
													+ Answer.getText()
													+ "' where username='"
													+ username.getText() + "'");

									ImageIcon ig1 = new ImageIcon(
											"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
									JOptionPane.showMessageDialog(null,
											"Security Question Changed.",
											"Warrning",
											JOptionPane.WARNING_MESSAGE, ig1);
									frame.dispose();
								} else {
									ImageIcon ig1 = new ImageIcon(
											"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\cross.png");
									JOptionPane.showMessageDialog(null,
											"You Enter wrong password",
											"Warrning",
											JOptionPane.WARNING_MESSAGE, ig1);
								}

							} else {
								ImageIcon ig1 = new ImageIcon(
										"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\cross.png");
								JOptionPane.showMessageDialog(null,
										"Please Enter a valid username",
										"Warrning", JOptionPane.WARNING_MESSAGE,
										ig1);
							}

						}
					} catch (Exception evt) {
						System.out.println(evt);
					}
				}
			}

		});
		frame.add(Save);

		frame.getContentPane().setBackground(new Color(245, 245, 250));// new
																		// Color(242,242,247)
		frame.setVisible(true);

		frame.setSize(650, 415);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ChangeSecurityQuestion obj = new ChangeSecurityQuestion();
	}
}
