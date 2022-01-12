import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class WelcomePage {
	JPanel mainPanel;
	static JProgressBar PB;
	JFrame frame = new JFrame("Welcome to Super Market Management System ");
	@SuppressWarnings("static-access")
	WelcomePage() {

		frame.setSize(1100, 720);

		JButton cont = new JButton("Continue");
		cont.setBounds(495, 600, 100, 30);
		cont.setFont(new Font("LucidaGrande", Font.BOLD, 16));
		cont.setBorder(
				BorderFactory.createDashedBorder(new Color(0, 128, 255)));
		cont.setBackground(new Color(0, 128, 255));
		cont.setForeground(Color.white);
		cont.setEnabled(true);
		frame.add(cont);
		cont.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				MainPage obj = new MainPage();
				frame.hide();
			}
		});

		JLabel Heading1 = new JLabel("WELCOME TO");
		Heading1.setFont(new Font("LucidaGrande", Font.BOLD, 45));
		Heading1.setBounds(380, 50, 350, 50);
		Heading1.setForeground(Color.white);
		frame.add(Heading1);

		JLabel Heading2 = new JLabel("SUPER MARKET MANAGEMENT SYSTEM");
		Heading2.setFont(new Font("LucidaGrande", Font.BOLD, 45));
		Heading2.setBounds(95, 100, 900, 50);
		Heading2.setForeground(Color.white);
		frame.add(Heading2);

		JTextArea text = new JTextArea(
				"\n    Supermarket management system is the system where all the aspects related to the proper management of "
						+ "\n    supermarket is done. These aspects involve managing information about the various products, staff, managers,"
						+ "\n    customers, billing etc. This system provides an efficient way of managing the supermarket information. Also "
						+ "\n    allows the customer to purchase and pay for the items purchased. This study is based on the sales transaction "
						+ "\n    and billing of items in a supermarket.  Any modifications to be done in the item’s name and the rate can be done "
						+ "\n    only by admin.This study is to produce software which manages the sales activity done in a supermarket, maintain "
						+ "\n    -ing the stock details, maintaining the records of the sales done for a particular month/year. The users will  "
						+ "\n    consume less time in calculation and the sales activity will be completed within a fraction of seconds whereas "
						+ "\n    manual system will make the user to write it down which is a long procedure and so paper work will be reduced and "
						+ "\n    the usercan spend more time monitoring the supermarket. The program will be user friendly and easy to use.The  "
						+ "\n    system will display all the items whose name start with the letter selected by the user. He can select out of those"
						+ "\n    displayed. Finally a separate bill will be generated for each customer. This will be saved in the database. Any "
						+ "\n    periodic records can be viewed at anytime. If the stock is not available, the supermarket orders and buys from a  "
						+ "\n    prescribed vendor. The amount will be paid by deducting the total amount acquired in the sales activity."
						+ "\n    Admin provides a unique username and password for each employee through which he can login.");
		text.setBounds(60, 150, 970, 500);
		text.setFont(new Font("Calibri (Body)", Font.PLAIN, 18));
		text.setEditable(false);
		text.setForeground(Color.white);
		text.setBackground(new Color(0, 0, 0, 10));
		frame.add(text);

		mainPanel = new JPanel();

		mainPanel.setBounds(60, 42, 970, 600);
		mainPanel.setBackground(new Color(0, 0, 0, 140));
		frame.add(mainPanel);

		ImageIcon adImg = new ImageIcon(
				"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\WPBack.jpg");
		JLabel adminImage = new JLabel(adImg, JLabel.CENTER);
		adminImage.setBounds(0, 0, 1200, 850);
		frame.add(adminImage);

		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.addWindowListener(new WindowAdapter() {
			@SuppressWarnings("unused")
			public void addWindowClosed(WindowEvent e) {
				frame.dispose();
			}

		});
		// frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		WelcomePage obj = new WelcomePage();

	}
}
