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
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Forget {
JFrame frame;
JPanel panel;
JDialog SQD;
JButton nextB;
JLabel error1, error2, error3;
JTextField username;

Forget() {
frame = new JFrame("Forgot Password");
frame.setSize(410, 440);
frame.setLayout(null);

Image icon = Toolkit.getDefaultToolkit()
.getImage("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\su1.png");
frame.setIconImage(icon);

ImageIcon img = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\Lock.png");
JLabel lock = new JLabel(img);
lock.setBounds(100, 10, 200, 200);
frame.add(lock);

JLabel forgotT = new JLabel("Forgot Password?");
forgotT.setFont(new Font("Times New Roman", Font.PLAIN, 37));
forgotT.setBounds(70, 193, 350, 40);
frame.add(forgotT);

JLabel text = new JLabel("You can see your password here");
text.setFont(new Font("Times New Roman", Font.PLAIN, 18));
text.setForeground(Color.gray);
text.setBounds(80, 240, 300, 25);
frame.add(text);

// Username textField
username = new JTextField("Username");
username.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
username.setFont(new Font("Times New Roman", Font.PLAIN, 16));
username.setBounds(90, 283, 250, 27);
username.setForeground(Color.gray);

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

// Label for username
ImageIcon img1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\mail1.jpg");
JLabel mail = new JLabel(img1);
mail.setBackground(Color.black);
mail.setForeground(Color.black);
mail.setBounds(90, 283, 30, 25);
frame.add(mail);

// error1= not enter the username
JLabel error1 = new JLabel("  \u274C Enter the Username");// Error label for not enter the username
error1.setForeground(Color.red);
error1.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
error1.setBounds(90, 305, 250, 25);
error1.setVisible(false);
frame.add(error1);

// error2= not enter the current password
error2 = new JLabel("  \u274C Enter the current password");// Error label for not enter the current password
error2.setForeground(Color.red);
error2.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
error2.setBounds(247, 200, 250, 25);
error2.setVisible(false);
frame.add(error2);

// error3 = not enter the New password
error3 = new JLabel("  \u274C Enter the New password");// Error label for not enter the New password
error3.setForeground(Color.red);
error3.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
error3.setBounds(247, 242, 250, 25);
error3.setVisible(false);
frame.add(error3);

// Button for next
nextB = new JButton("Next");
nextB.setFont(new Font("LucidaGrande", Font.BOLD, 19));
nextB.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255)));
nextB.setBackground(new Color(0, 128, 255));
nextB.setForeground(Color.white);
nextB.setBounds(67, 328, 270, 30);
frame.add(nextB);
nextB.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (username.getText().equals("Username")) {

username.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error1.setVisible(true);

username.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
username.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error1.setVisible(false);
}
});
} else {
try {
Connection con = DriverManager
.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("Select * from userTable");
if (rs.next()) {
if (username.getText().equals(rs.getString(1))) {
dialog();
} else {
ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
JOptionPane.showMessageDialog(null, "Please enter a valid username", "Warrning", JOptionPane.WARNING_MESSAGE, ig1);
}

}
} catch (Exception evt) {
System.out.println(evt);
}

}
}
});

// Main Panel
panel = new JPanel();
panel.setBackground(new Color(245, 245, 250)); // new Color(242,242,247)
panel.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
panel.setBounds(22, 20, 350, 362);
frame.add(panel);

frame.setVisible(true);
frame.setLocationRelativeTo(null);
frame.getContentPane().setBackground(new Color(245, 245, 250));// new Color(242,242,247)
frame.setResizable(false);
// frame.dispose();
frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
frame.dispose();
}
});
// frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void dialog() {

SQD = new JDialog(frame, "Security Question", true);
SQD.setLocationRelativeTo(null);
SQD.setLayout(null);

JLabel SecQue = new JLabel("Select Security Question : ");
SecQue.setFont(new Font("Times New Roman", Font.PLAIN, 18));
SecQue.setBounds(20, 8, 250, 30);
SQD.add(SecQue);

// Make a ComboBox and initialize Question on in
String SecQ[] = { "Select Question", "In what city were you born?", "What is the name of your favorite pet?",
"What is your mother's maiden name?", "What high school did you attend?", "What is the name of your first school?",
"What was the make of your first car?", "What was your favorite food as a child?", "Where did you meet your spouse?" };
@SuppressWarnings({ "rawtypes", "unchecked" })
JComboBox SSQ = new JComboBox(SecQ);
SSQ.setFont(new Font("Times New Roman", Font.PLAIN, 18));
SSQ.setBorder(BorderFactory.createDashedBorder(new Color(199, 199, 214)));
SSQ.setBackground(Color.white);
SSQ.setBounds(20, 40, 320, 30);
SQD.add(SSQ);

JTextField answer = new JTextField("Answer");
answer.setFont(new Font("Times New Roman", Font.PLAIN, 18));
answer.setBounds(20, 90, 320, 30);
SQD.add(answer);

answer.addKeyListener(new KeyAdapter() {
@Override
public void keyTyped(KeyEvent e) {
if (answer.getText().equals("Answer"))
answer.setText("");
}

});

answer.addFocusListener(new FocusListener() {

@Override
public void focusGained(FocusEvent e) {

}

@Override
public void focusLost(FocusEvent e) {
if (answer.getText().length() == 0) {
answer.setText("Answer");
}

}

});

error2 = new JLabel("  \u274C Select the Security Question");// Error label for not enter the current password
error2.setForeground(Color.red);
error2.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
error2.setBounds(20, 65, 320, 30);
error2.setVisible(false);
SQD.add(error2);

// error3 = not enter the New password
error3 = new JLabel("  \u274C Enter the Answer");// Error label for not enter the New password
error3.setForeground(Color.red);
error3.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
error3.setBounds(20, 113, 320, 30);
error3.setVisible(false);
SQD.add(error3);

JTextField showPass = new JTextField();
showPass.setFont(new Font("Times New Roman", Font.PLAIN, 19));
showPass.setBackground(Color.white);
showPass.setEditable(false);
showPass.setBounds(115, 140, 226, 30);
SQD.add(showPass);

JButton show = new JButton("Show");
show.setFont(new Font("Times New Roman", Font.PLAIN, 20));
show.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255)));
show.setBackground(new Color(0, 128, 255));
show.setForeground(Color.white);
show.setBounds(20, 140, 80, 27);
SQD.add(show);

show.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (SSQ.getItemAt(SSQ.getSelectedIndex()) == SSQ.getItemAt(0)) {
SSQ.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error2.setVisible(true);
SSQ.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
SSQ.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error2.setVisible(false);
}
});
} else if (answer.getText().equals("Answer")) {

answer.setBorder(BorderFactory.createLineBorder(Color.red, 1));

error3.setVisible(true);
answer.addMouseListener(new MouseAdapter() {
@Override
public void mouseClicked(MouseEvent e) {
answer.setBorder(BorderFactory.createLineBorder(new Color(199, 199, 214)));
error3.setVisible(false);
}
});

} else {
try {
Connection con = DriverManager
.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("Select * from userTable");
if (rs.next()) {
if (SSQ.getSelectedItem().toString().equals(rs.getString(5))) {
if (answer.getText().equals(rs.getString(6))) {
showPass.setText(rs.getString(2));
} else {
ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
JOptionPane.showMessageDialog(null, "You enter wrong answer", "Warrning", JOptionPane.WARNING_MESSAGE, ig1);
}
}

else {
ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
JOptionPane.showMessageDialog(null, "Please select the right question", "Warrning", JOptionPane.WARNING_MESSAGE, ig1);
}

}

}

catch (Exception evt) {
System.out.println(evt);
}
}
}
});

SQD.setSize(380, 218);
SQD.setVisible(true);

}

public static void main(String[] args) {
@SuppressWarnings("unused")
Forget obj = new Forget();
}
}
