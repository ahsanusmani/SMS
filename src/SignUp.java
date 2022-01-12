import java.awt.Color;
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class SignUp {

JFrame frame;
JTextField Name;
JLabel error1, error2, error3, error4, error5, error6, error7;

SignUp() {

frame = new JFrame("Welcome to the Supermarket Management System Software"); // SignUp page Tital
frame.setSize(1000, 580); // frame size
frame.setLayout(null); // Frame layout
frame.getContentPane().setBackground(new Color(242, 242, 247)); // Frame Background color new Color
// (242,242,247)

Image icon = Toolkit.getDefaultToolkit()
.getImage("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\su1.png");
frame.setIconImage(icon);

Border PanelBorder = BorderFactory.createLineBorder(new Color(199, 199, 214)); // Make a border for panel
// initialize on the top because
// of use many other panel

// Starting test Label
JLabel Text = new JLabel("To start using software you need to setup company first."); // Create a label object
// for show a text top
// on the frame
Text.setFont(new Font("LucidaGrande", Font.PLAIN, 15)); // set text font
Text.setBounds(15, 10, 450, 18); // set text x, y, width ,height
frame.add(Text); // add into the frame

// Company Details Text
JLabel ComText = new JLabel("Company Details"); // Create a label object ComText for a panel title
ComText.setFont(new Font("LucidaGrande", Font.BOLD, 14)); // ComText font
ComText.setBackground(Color.green); // ComText background color
ComText.setBounds(26, 41, 150, 18); // Comtext x,y,width ,height
frame.add(ComText); // add ComText into the frame

JPanel ComTextP = new JPanel(); // Create a small panel object because background of title Company Details
ComTextP.setBounds(26, 41, 120, 18); // Same x,y,width ,height because for make a design for Company details
ComTextP.setBackground(new Color(242, 242, 247)); // set background color
frame.add(ComTextP); // add into the frma

// Label for Business Name
JLabel BusNam = new JLabel("Business Name");
BusNam.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
BusNam.setBounds(30, 70, 200, 30);
frame.add(BusNam);

// Label for *
JLabel fix1 = new JLabel("*");
fix1.setBounds(160, 70, 20, 30);
fix1.setFont(new Font("LucidaGrande", Font.BOLD, 18));
fix1.setForeground(Color.red);
frame.add(fix1);
// TextField for Business Name
JTextField BusName = new JTextField();
BusName.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
BusName.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
BusName.setBounds(218, 70, 300, 30);
frame.add(BusName);
BusName.setToolTipText("Only alphabets");

// Label for show Address
JLabel Add = new JLabel("Address");
Add.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
Add.setBounds(30, 115, 200, 30);
frame.add(Add);

// Label for *
JLabel fix2 = new JLabel("*");
fix2.setBounds(100, 115, 20, 30);
fix2.setFont(new Font("LucidaGrande", Font.BOLD, 18));
fix2.setForeground(Color.red);
frame.add(fix2);
// TextField for make in front of Address
JTextField Address = new JTextField();
Address.setFont(new Font("LucidaGrande", Font.PLAIN, 15));
Address.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
Address.setBounds(218, 115, 300, 55);
frame.add(Address);

// Label for username
JLabel userN = new JLabel("Username");
userN.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
userN.setBounds(30, 185, 200, 30);
frame.add(userN);

// Label for *
JLabel fix3 = new JLabel("*");
fix3.setBounds(118, 185, 20, 30);
fix3.setFont(new Font("LucidaGrande", Font.BOLD, 18));
fix3.setForeground(Color.red);
frame.add(fix3);
// TextField for UserName
JTextField username = new JTextField();
username.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
username.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
username.setBounds(218, 185, 300, 30);
frame.add(username);
username.setToolTipText("Only alphabets & numbers");

// Label for Password
JLabel passwordL = new JLabel("Password");
passwordL.setFont(new Font("Lucidardrande", Font.PLAIN, 18));
passwordL.setBounds(30, 230, 200, 30);
frame.add(passwordL);

// Label for *
JLabel fix4 = new JLabel("*");
fix4.setBounds(115, 230, 20, 30);
fix4.setFont(new Font("LucidaGrande", Font.BOLD, 18));
fix4.setForeground(Color.red);
frame.add(fix4);

// TextFied for JPassword
JPasswordField password = new JPasswordField();
password.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
password.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
password.setBounds(218, 230, 300, 30);
password.setEchoChar('*');
frame.add(password);
password.setToolTipText("Use alphabets, numbers & special symbols.");

// Label for confirm password
JLabel ConPass = new JLabel("Confirm Password");
ConPass.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
ConPass.setBounds(30, 275, 200, 30);
frame.add(ConPass);

// Label for *
JLabel fix5 = new JLabel("*");
fix5.setBounds(180, 275, 20, 30);
fix5.setFont(new Font("LucidaGrande", Font.BOLD, 18));
fix5.setForeground(Color.red);
frame.add(fix5);
// JPassword field for confim password
JPasswordField ConfirmPassword = new JPasswordField();
ConfirmPassword.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
ConfirmPassword.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
ConfirmPassword.setBounds(218, 275, 300, 30);
ConfirmPassword.setEchoChar('*');
frame.add(ConfirmPassword);
ConfirmPassword.setToolTipText("Cofirm password must be same as password");

// Check box for show password of both of field
JCheckBox showPas = new JCheckBox("Show Password");
showPas.setBackground(new Color(242, 242, 247));
showPas.setFont(new Font("LucidaGrande", Font.PLAIN, 15));
showPas.setBounds(220, 310, 140, 15);
frame.add(showPas);

showPas.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (showPas.isSelected()) {
password.setEchoChar((char) 0);
ConfirmPassword.setEchoChar((char) 0);
} else {
password.setEchoChar('*');
ConfirmPassword.setEchoChar('*');
}

}
});
// Label for Security Question
JLabel SQ = new JLabel("Security Question");
SQ.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
SQ.setBounds(30, 340, 200, 30);
frame.add(SQ);

// Label for *
JLabel fix6 = new JLabel("*");
fix6.setBounds(177, 340, 20, 30);
fix6.setFont(new Font("LucidaGrande", Font.BOLD, 18));
fix6.setForeground(Color.red);
frame.add(fix6);
// Make a ComboBox and initialize Question on in
String SecQ[] = { "Select Question", "In what city were you born?", "What is the name of your favorite pet?",
"What is your mother's maiden name?", "What high school did you attend?", "What is the name of your first school?",
"What was the make of your first car?", "What was your favorite food as a child?", "Where did you meet your spouse?" };
@SuppressWarnings({ "rawtypes", "unchecked" })
JComboBox SSQ = new JComboBox(SecQ);
SSQ.setFont(new Font("LucidaGrande", Font.PLAIN, 15));
SSQ.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
SSQ.setBackground(Color.white);
SSQ.setBounds(218, 340, 300, 30);
frame.add(SSQ);

// Label for answer the Question
JLabel Ans = new JLabel("Answer");
Ans.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
Ans.setBounds(30, 385, 200, 30);
frame.add(Ans);

// Label for *
JLabel fix7 = new JLabel("*");
fix7.setBounds(95, 385, 20, 30);
fix7.setFont(new Font("LucidaGrande", Font.BOLD, 18));
fix7.setForeground(Color.red);
frame.add(fix7);
// TextField for Answer
JTextField answer = new JTextField();
answer.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
answer.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
answer.setBounds(218, 385, 300, 30);
frame.add(answer);

// Email Id Label
JLabel Email = new JLabel("Email ID ");
Email.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
Email.setBounds(30, 430, 200, 30);
frame.add(Email);
// TextField for EmailId
JTextField email = new JTextField();
email.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
email.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
email.setBounds(218, 430, 300, 30);
frame.add(email);

// TextField for Phone Number
JLabel numbero = new JLabel("Contact No. ");
numbero.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
numbero.setBounds(30, 475, 200, 30);
frame.add(numbero);
// TextFiedl for Phone Number
JTextField number = new JTextField();
number.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
number.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
number.setBounds(218, 475, 300, 30);
frame.add(number);

// Label Other Details
JLabel OD = new JLabel("Other Details");
OD.setFont(new Font("LucidaGrande", Font.BOLD, 14));
OD.setBounds(565, 34, 150, 30);
frame.add(OD);

JPanel ODPP = new JPanel();
ODPP.setBounds(565, 38, 90, 25);
ODPP.setBackground(new Color(242, 242, 247));
ODPP.setBorder(BorderFactory.createDashedBorder(new Color(242, 242, 247)));
frame.add(ODPP);

// Text field for name
JTextField FirstName = new JTextField("   First Name");
FirstName.setFont(new Font("LucidaGrande", Font.PLAIN, 14));
FirstName.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
FirstName.setBounds(570, 70, 170, 30);
frame.add(FirstName);
FirstName.addKeyListener(new KeyAdapter() {
@Override
public void keyPressed(KeyEvent e) {
if (FirstName.getText().equals("   First Name")) {
FirstName.setText("");
}
}
});

FirstName.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
}

@Override
public void focusLost(FocusEvent e) {
if (FirstName.getText().length() == 0) {
FirstName.setText("   First Name");
}
}
});

// Text field for Last Name
JTextField LastName = new JTextField("   Last Name");
LastName.setFont(new Font("LucidaGrande", Font.PLAIN, 14));
LastName.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
LastName.setBounds(760, 70, 170, 30);
frame.add(LastName);
LastName.addKeyListener(new KeyAdapter() {
@Override
public void keyPressed(KeyEvent e) {
if (LastName.getText().equals("   Last Name")) {
LastName.setText("");
}
}
});
LastName.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
}

@Override
public void focusLost(FocusEvent e) {
if (LastName.getText().length() == 0) {
LastName.setText("   Last Name");
}
}
});

// Text field City
JTextField City = new JTextField("  Enter City");
City.setFont(new Font("LucidaGrande", Font.PLAIN, 14));
City.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
City.setBounds(570, 120, 170, 30);
frame.add(City);
City.addKeyListener(new KeyAdapter() {
@Override
public void keyPressed(KeyEvent e) {
if (City.getText().equals("  Enter City")) {
City.setText("");
}
}
});
City.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
}

@Override
public void focusLost(FocusEvent e) {
if (City.getText().length() == 0) {
City.setText("  Enter City");
}
}
});

// Text field for Pin Code
JTextField PinCode = new JTextField("   Pin Code");
PinCode.setFont(new Font("LucidaGrande", Font.PLAIN, 14));
PinCode.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
PinCode.setBounds(760, 120, 170, 30);
frame.add(PinCode);
PinCode.addKeyListener(new KeyAdapter() {
@Override
public void keyPressed(KeyEvent e) {
if (PinCode.getText().equals("   Pin Code")) {
PinCode.setText("");
}
}
});
PinCode.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
}

@Override
public void focusLost(FocusEvent e) {
if (PinCode.getText().length() == 0) {
PinCode.setText("   Pin Code");
}
}
});

// Text field for State
JTextField State = new JTextField("   Enter State");
State.setFont(new Font("LucidaGrande", Font.PLAIN, 14));
State.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
State.setBounds(570, 170, 170, 30);
frame.add(State);
State.addKeyListener(new KeyAdapter() {
@Override
public void keyPressed(KeyEvent e) {
if (State.getText().equals("   Enter State")) {
State.setText("");
}
}
});
State.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
}

@Override
public void focusLost(FocusEvent e) {
if (State.getText().length() == 0) {
State.setText("   Enter State");
}
}
});

// TextField for Country
JTextField Country = new JTextField("  Country");
Country.setFont(new Font("LucidaGrande", Font.PLAIN, 14));
Country.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
Country.setBounds(760, 170, 170, 30);
frame.add(Country);

Country.addKeyListener(new KeyAdapter() {
@Override
public void keyPressed(KeyEvent e) {
if (Country.getText().equals("  Country")) {
Country.setText("");
}
}
});
Country.addFocusListener(new FocusListener() {
@Override
public void focusGained(FocusEvent e) {
}

@Override
public void focusLost(FocusEvent e) {
if (Country.getText().length() == 0) {
Country.setText("  Country");
}
}
});

// Text Field for Pan card Number
JLabel Pan = new JLabel("Pan No.");
Pan.setFont(new Font("LucidaGrande", Font.BOLD, 14));
Pan.setBounds(570, 220, 120, 30);
frame.add(Pan);
// TextField for pan card number
JTextField PanNo = new JTextField();
PanNo.setFont(new Font("LucidaGrande", Font.PLAIN, 18));
PanNo.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
PanNo.setBounds(679, 220, 250, 30);
frame.add(PanNo);

// Text Field for Pan card Number
JLabel GSTN = new JLabel("GSTIN No.");
GSTN.setFont(new Font("LucidaGrande", Font.BOLD, 14));
GSTN.setBounds(570, 270, 120, 30);
frame.add(GSTN);
// TextField for GST Number
JTextField GST = new JTextField();
GST.setFont(new Font("LucidaGrande", Font.PLAIN, 15));
GST.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
GST.setBounds(679, 270, 250, 30);
frame.add(GST);

// Other Details main Panel
JPanel ODP = new JPanel();
ODP.setBorder(PanelBorder);
ODP.setBackground(new Color(242, 242, 247));
ODP.setBounds(555, 50, 390, 280);
frame.add(ODP);

// Label for show information title
JLabel infoT = new JLabel("Information");
infoT.setFont(new Font("LucidaGrande", Font.BOLD, 16));
infoT.setBounds(560, 350, 90, 30);
frame.add(infoT);

// Make a paragraph atteched with panel
JPanel infoP = new JPanel();
infoP.setBounds(570, 382, 370, 110);
infoP.setBackground(new Color(242, 242, 247));
frame.add(infoP);

// TextArea for information
JTextArea info = new JTextArea(
"Supermarket Management System aspects involve \n" + "managing information about the various products, staff,\n"
+ "billing etc. This system provides an efficient way of\n" + "managing the supermarket information.");
info.setFont(new Font("LucidaGrande", Font.PLAIN, 14));
info.setBackground(new Color(242, 242, 247));
info.setEditable(false);
infoP.add(info);

// error1= not enter the Business Name
error1 = new JLabel("  \u274C Enter the Business name");// Error label for not enter the Business name
error1.setForeground(Color.red);
error1.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
error1.setBounds(218, 100, 300, 15);
error1.setVisible(false);
frame.add(error1);

// error2= not enter the Address
error2 = new JLabel("  \u274C Enter the Address");// Error label for not enter the address
error2.setForeground(Color.red);
error2.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
error2.setBounds(218, 169, 300, 15);
error2.setVisible(false);
frame.add(error2);

// error3= not enter the username
error3 = new JLabel("  \u274C Enter the username");// Error label for not enter the username
error3.setForeground(Color.red);
error3.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
error3.setBounds(218, 215, 300, 15);
error3.setVisible(false);
frame.add(error3);

// error4= not enter the Password
error4 = new JLabel("  \u274C Enter the Password");// Error label for not enter the Password
error4.setForeground(Color.red);
error4.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
error4.setBounds(218, 260, 300, 15);
error4.setVisible(false);
frame.add(error4);

// error5= not enter the confirm Password
error5 = new JLabel("  \u274C Enter the Password");// Error label for not enter the confirm password
error5.setForeground(Color.red);
error5.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
error5.setBounds(360, 310, 300, 15);
error5.setVisible(false);
frame.add(error5);

// error6= not enter the select question
error6 = new JLabel("  \u274C Select the question");// Error label for not enter the select question
error6.setForeground(Color.red);
error6.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
error6.setBounds(218, 370, 300, 15);
error6.setVisible(false);
frame.add(error6);

// error7= not enter the select question
error7 = new JLabel("  \u274C Select the question");// Error label for not enter the select question
error7.setForeground(Color.red);
error7.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
error7.setBounds(218, 415, 300, 15);
error7.setVisible(false);
frame.add(error7);

// JButton for save all information
JButton save = new JButton("Save");
save.setBackground(new Color(0, 128, 255));
save.setForeground(Color.white);
save.setFont(new Font("LucidaGrande", Font.BOLD, 22));
save.setBorder(BorderFactory.createDashedBorder(new Color(0, 128, 255)));
save.setBounds(580, 490, 360, 30);
frame.add(save);

save.addActionListener(new ActionListener() {
@SuppressWarnings("deprecation")
public void actionPerformed(ActionEvent e) {

if (e.getSource() == save) {

if (BusName.getText().length() == 0) {
BusName.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error1.setVisible(true);

BusName.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
BusName.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error1.setVisible(false);
}
});
} else if (!(password.getText().equals(ConfirmPassword.getText()))) {
ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\cross.png");
JOptionPane.showMessageDialog(null, "Password and Confirm password not Match", "Warrning", JOptionPane.WARNING_MESSAGE,
ig1);
}

else if (Address.getText().length() == 0) {
Address.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error2.setVisible(true);

Address.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
Address.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error2.setVisible(false);
}
});
} else if (username.getText().length() == 0) {
username.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error3.setVisible(true);

username.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
username.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error3.setVisible(false);
}
});
}

else if (password.getText().length() == 0) {
password.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error4.setVisible(true);

password.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
password.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error4.setVisible(false);
}
});
}

else if (ConfirmPassword.getText().length() == 0) {
ConfirmPassword.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error5.setVisible(true);

ConfirmPassword.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
ConfirmPassword.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error5.setVisible(false);
}
});
}

else if (SSQ.getItemAt(SSQ.getSelectedIndex()) == SSQ.getItemAt(0)) {
SSQ.setBorder(BorderFactory.createLineBorder(Color.red, 1));
System.out.println(SSQ.getItemAt(0));
error6.setVisible(true);

SSQ.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
SSQ.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error6.setVisible(false);
}
});
} else if (answer.getText().length() == 0) {
answer.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error7.setVisible(true);

answer.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
answer.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error7.setVisible(false);
}
});
}

else {
try {

Connection con = DriverManager
.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
Statement st = con.createStatement();

int i = st.executeUpdate("insert into userTable  values('" + username.getText() + "','" + password.getText() + "','"
+ BusName.getText() + "','" + Address.getText() + "','" + SSQ.getSelectedItem().toString() + "','" + answer.getText()
+ "','" + email.getText() + "','" + number.getText() + "','" + FirstName.getText() + "','" + LastName.getText() + "','"
+ City.getText() + "','" + PinCode.getText() + "','" + State.getText() + "','" + Country.getText() + "','"
+ PanNo.getText() + "','" + GSTN.getText() + "')");
if (i > 0) {
ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
JOptionPane.showMessageDialog(null, "Account create successfully.", "Done", JOptionPane.INFORMATION_MESSAGE, ig1);
frame.dispose();
}
}

catch (Exception evt) {
System.out.println(evt);
}
}

}
}
});

// Company Details Panel
JPanel ComPanel = new JPanel();
ComPanel.setBorder(PanelBorder);
ComPanel.setBackground(new Color(242, 242, 247));
ComPanel.setBounds(15, 50, 520, 465);
frame.add(ComPanel);

frame.setVisible(true);
frame.setResizable(false);
frame.setLocationRelativeTo(null);

frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
frame.dispose();
}
});
}

public static void main(String[] args) {
@SuppressWarnings("unused")
SignUp obj = new SignUp();
}
}
