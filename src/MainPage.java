import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class MainPage {
	JPanel dashboardP;
	JTabbedPane TP = new JTabbedPane();
	JPanel upperline, buttomline;
	JFrame frame = new JFrame("SMS System");
	JLabel smsText;
	JLabel error1, error2, error3, error4, error5, error9;
	JTextField costumerName, costumerNum;
	int am=0;
	int Amounttemp=0;
	JDialog printBill;
	@SuppressWarnings({ "rawtypes", "unchecked" })
	MainPage() {
		frame.setLayout(null);

		Image icon = Toolkit.getDefaultToolkit()
				.getImage("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\su1.png");
		frame.setIconImage(icon);
		// *********************************************STARTING INITIALIZATION
		// BLOCK**********************************************************************************************************************************************************************************

		// **********************************************Initialization
		// BEGINNING OF SELLING
		// PANEL*******************************************************************************************************************************************************************************
		JLabel MobileNum = new JLabel();
		JLabel CostumerName = new JLabel();
		JLabel OrderDate = new JLabel();
		JLabel OrderId = new JLabel();

		// **********************************************Initialization ENDING
		// OF SELLING
		// PANEL*******************************************************************************************************************************************************************************
		JLabel OrderId1 = new JLabel();
		JLabel OrderDate1 = new JLabel();
		JLabel costumerName1 = new JLabel();
		JLabel ContactNumber1 = new JLabel();
		JLabel OrderStats = new JLabel();
		JTextField SearchProduct = new JTextField();
		
		JLabel TotalAmount = new JLabel();
		JLabel TotalAmount1 = new JLabel();
		JLabel TotalAmount2 = new JLabel();
		
		String O2col[] = {"ID", "Product Name", "Total units", "Price", "Total Cost", "Action" };
		DefaultTableModel O2rdmodel = new DefaultTableModel();
		JTable O2t = new JTable(O2rdmodel);
		JTableHeader o2th = O2t.getTableHeader();

		
		
		DefaultTableModel Ordmodel = new DefaultTableModel();
		JTable Ot = new JTable(Ordmodel);  // Ot=order table
		JTableHeader oth = Ot.getTableHeader();		//oth= order table header	
		
		
		
		String sta[] = { "Payment method", "Cash", "Borrow", "Credit card", "Debit card", "Online Payment","Other Method" };
		@SuppressWarnings({ })
		JComboBox status = new JComboBox(sta);
		
		
		JLabel TA1 = new JLabel("Total Amount"); // TA1=total amount 1
		JLabel text14 = new JLabel("Total Amount:");
		  // O2t=order second table
		// ***************************************************** BEGNNING
		// INTIALIZATION OF MAIN SELLING
		// PANEL************************************************************************************************************************************************************************

		// *****************************************************ENDING
		// INTIALIZATION OF MAIN SELLING
		// PANEL************************************************************************************************************************************************************************

		// ********************************************ENDING INITIALIZATION
		// BLOCK*****************************************************************************************************************************************************************************************************

		// *************************************************************************************************************************************************************************************************************************************************************************

		JSeparator sp3 = new JSeparator();// Below the main button separator
		sp3.setBounds(270, 181, 1200, 44);
		sp3.setBorder(BorderFactory.createLineBorder(new Color(245, 245, 250), 44));
		frame.add(sp3);

		JSeparator sp4 = new JSeparator();// Right side Separator
		sp4.setBounds(270, 181, 38, 608);
		sp4.setBorder(BorderFactory.createLineBorder(new Color(245, 245, 250), 38));
		sp4.setOrientation(SwingConstants.VERTICAL);
		frame.add(sp4);

		JSeparator sp5 = new JSeparator();// Left side Separator
		sp5.setBounds(1155, 181, 36, 608);
		sp5.setBorder(BorderFactory.createLineBorder(new Color(245, 245, 250), 30));
		sp5.setOrientation(SwingConstants.VERTICAL);
		frame.add(sp5);

		JSeparator sp6 = new JSeparator();// JTabbedPane Buttum line separator
		sp6.setBounds(300, 790, 870, 10);
		sp6.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255), 10));
		frame.add(sp6);

		// *******************************************************************BEGINNING
		// OF DASHBOARD
		// PANEL**********************************************************************************************************************************************************

		// dashboard panel start

		dashboardP = new JPanel();
		dashboardP.setBackground(Color.white);
		dashboardP.setLayout(null);
		TP.add(dashboardP);

		JLabel sidePic = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sPic.png"));
		sidePic.setBounds(530, 2, 320, 537);
		dashboardP.add(sidePic);

		JButton sellbutton = new JButton("Start Selling");
		sellbutton.setBounds(30, 30, 175, 31);
		sellbutton.setBackground(new Color(0, 128, 255));
		sellbutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		sellbutton.setForeground(Color.white);
		sellbutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(sellbutton);
		sellbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setSelectedIndex(1);
			}
		});

		JLabel saleL = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		saleL.setBounds(10, 25, 490, 40);
		dashboardP.add(saleL);

		JButton Employeebutton = new JButton("Add Employee");
		Employeebutton.setBounds(30, 90, 162, 31);
		Employeebutton.setBackground(new Color(0, 128, 255));
		Employeebutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		Employeebutton.setForeground(Color.white);
		Employeebutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(Employeebutton);

		Employeebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setSelectedIndex(4);
			}
		});

		JLabel empL = new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		empL.setBounds(10, 85, 490, 40);
		dashboardP.add(empL);

		JButton orderbutton = new JButton("Order Report");
		orderbutton.setBounds(30, 150, 162, 31);
		orderbutton.setBackground(new Color(0, 128, 255));
		orderbutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		orderbutton.setForeground(Color.white);
		orderbutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(orderbutton);

		orderbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setSelectedIndex(5);
			}
		});

		JLabel orderL = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		orderL.setBounds(10, 145, 490, 40);
		dashboardP.add(orderL);

		JButton productbutton = new JButton("Product Report");
		productbutton.setBounds(30, 210, 188, 31);
		productbutton.setBackground(new Color(0, 128, 255));
		productbutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		productbutton.setForeground(Color.white);
		productbutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(productbutton);

		productbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setSelectedIndex(6);
			}
		});

		JLabel proL = new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		proL.setBounds(10, 205, 490, 40);
		dashboardP.add(proL);

		JButton addproductbutton = new JButton("Add Product");
		addproductbutton.setBounds(30, 270, 149, 31);
		addproductbutton.setBackground(new Color(0, 128, 255));
		addproductbutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		addproductbutton.setForeground(Color.white);
		addproductbutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(addproductbutton);

		addproductbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setSelectedIndex(7);
			}
		});

		JLabel addpL = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		addpL.setBounds(10, 265, 490, 40);
		dashboardP.add(addpL);

		JButton catebutton = new JButton("Category");
		catebutton.setBounds(30, 330, 110, 31);
		catebutton.setBackground(new Color(0, 128, 255));
		catebutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		catebutton.setForeground(Color.white);
		catebutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(catebutton);

		catebutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setSelectedIndex(8);
			}
		});
		JLabel cateL = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		cateL.setBounds(10, 325, 490, 40);
		dashboardP.add(cateL);

		JButton brandbutton = new JButton("Brand");
		brandbutton.setBounds(30, 390, 71, 31);
		brandbutton.setBackground(new Color(0, 128, 255));
		brandbutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		brandbutton.setForeground(Color.white);
		brandbutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(brandbutton);

		brandbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setSelectedIndex(9);
			}
		});

		JLabel brandL = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		brandL.setBounds(10, 385, 490, 40);
		dashboardP.add(brandL);

		JButton borrbutton = new JButton("Borrower");
		borrbutton.setBounds(30, 450, 110, 31);
		borrbutton.setBackground(new Color(0, 128, 255));
		borrbutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		borrbutton.setForeground(Color.white);
		borrbutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(borrbutton);

		borrbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TP.setSelectedIndex(10);
			}
		});

		JLabel borrL = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		borrL.setBounds(10, 445, 490, 40);
		dashboardP.add(borrL);

		JButton Reportbutton = new JButton("Report");
		Reportbutton.setBounds(30, 510, 84, 31);
		Reportbutton.setBackground(new Color(0, 128, 255));
		Reportbutton.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 3));
		Reportbutton.setForeground(Color.white);
		Reportbutton.setFont(new Font("Roboto Mono Regular", Font.PLAIN, 21));
		dashboardP.add(Reportbutton);

		JLabel repL = new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		repL.setBounds(10, 505, 490, 40);
		dashboardP.add(repL);

		
		
		// Dashboard Panel end

		// ****************************************************************END
		// OF DASHBOARD
		// PANEL*************************************************************************************************************************************************************

		// **********************************************BEGINNING OF SELLING
		// PANEL*******************************************************************************************************************************************************************************

		// Beginning start selling panel

		JPanel selling = new JPanel();
		selling = new JPanel();
		selling.setBackground(Color.white);
		selling.setLayout(null);
		TP.add(selling);

		JLabel text1 = new JLabel("ENTER THE COSTUMER NAME AND MOBILE NUMBER TO START SELL");
		text1.setBounds(20, 0, 750, 80);
		text1.setForeground(Color.red);
		text1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		selling.add(text1);

		JSeparator sellSep = new JSeparator();
		sellSep.setBounds(15, 60, 770, 2);
		sellSep.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 2));
		selling.add(sellSep);
		
		
		JLabel Cerror = new JLabel("  \u274C Enter only characters");
		Cerror.setForeground(Color.red);
		Cerror.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
		Cerror.setBounds(20, 118, 250, 25);
		Cerror.setVisible(false);
		selling.add(Cerror);

		JTextField costumerName = new JTextField("  Enter Costumer Name");
		costumerName.setBounds(15, 80, 290, 37);
		costumerName.setBorder(BorderFactory.createLineBorder(new Color(128, 128, 128)));
		costumerName.setForeground(new Color(192, 192, 192));
		costumerName.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		selling.add(costumerName);
		
		costumerName.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()>='a' && e.getKeyChar()<='z' || e.getKeyChar()>= 'A' && e.getKeyChar() <= 'Z' || e.getKeyChar()==8  || e.getKeyChar()==127  || e.getKeyChar()=='\u0020' ) {
					costumerName.setEditable(true);
					Cerror.setVisible(false);
				}
				
				else {
					costumerName.setEditable(false);
					Cerror.setVisible(true);
				}
				
			}
		});

		JLabel error6 = new JLabel("  \u274C Enter the Costumer Name");
		error6.setForeground(Color.red);
		error6.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
		error6.setBounds(20, 118, 250, 25);
		error6.setVisible(false);
		selling.add(error6);
		
		

		costumerName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (costumerName.getText().equals("  Enter Costumer Name")) {
					costumerName.setText("");
				}
			}
		});

		costumerName.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (costumerName.getText().length() == 0) {
					costumerName.setText("  Enter Costumer Name");
				}
			}
		});

		costumerName.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				costumerName.setBorder(BorderFactory.createLineBorder(new Color(128, 128, 128)));
				error6.setVisible(false);
			}
		});
		
		
		JLabel Nerror = new JLabel("  \u274C Enter only numbers (0 - 9)");
		Nerror.setForeground(Color.red);
		Nerror.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
		Nerror.setBounds(325, 118, 250, 25);
		Nerror.setVisible(false);
		selling.add(Nerror);
		

		JTextField costumerNum = new JTextField("  Enter Costumer Number");
		costumerNum.setBounds(320, 80, 290, 37);
		costumerNum.setBorder(BorderFactory.createLineBorder(new Color(128, 128, 128)));
		costumerNum.setForeground(new Color(192, 192, 192));
		costumerNum.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		selling.add(costumerNum);
		
		costumerNum.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyChar()>='0' && e.getKeyChar()<='9' || e.getKeyChar()==8  || e.getKeyChar()==127  || e.getKeyChar()=='\u0020' ) {
					costumerNum.setEditable(true);
					Nerror.setVisible(false);
				}
				
				else {
					costumerNum.setEditable(false);
					Nerror.setVisible(true);
				}
			}
		});

		JLabel error7 = new JLabel("  \u274C Enter contact number");
		error7.setForeground(Color.red);
		error7.setFont(new Font("LucidaGrande", Font.PLAIN, 12));
		error7.setBounds(325, 118, 250, 25);
		error7.setVisible(false);
		selling.add(error7);
		costumerNum.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (costumerNum.getText().equals("  Enter Costumer Number")) {
					costumerNum.setText("");
				}
			}
		});

		costumerNum.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (costumerNum.getText().length() == 0) {
					costumerNum.setText("  Enter Costumer Number");
				}
			}
		});

		costumerNum.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				costumerNum.setBorder(BorderFactory.createLineBorder(new Color(128, 128, 128)));
				error7.setVisible(false);
			}
		});

		JButton startsell = new JButton("Start Sell");
		startsell.setBounds(630, 80, 170, 37);
		startsell.setBackground(new Color(0, 128, 255));
		startsell.setForeground(Color.white);
		startsell.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		selling.add(startsell);

		startsell.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 SearchProduct.setText("");
				 Ordmodel.setRowCount(0);
				if (costumerName.getText().equals("  Enter Costumer Name")) {
					costumerName.setBorder(BorderFactory.createLineBorder(Color.red, 1));
					error6.setVisible(true);
				}

				else if (costumerNum.getText().equals("  Enter Costumer Number")) {
					costumerNum.setBorder(BorderFactory.createLineBorder(Color.red, 1));
					error7.setVisible(true);
				}
				
				else if(!(costumerNum.getText().length()==10)) {
					 JOptionPane.showMessageDialog(null, "Please enter a valid number", "WARNING", JOptionPane.ERROR_MESSAGE);
				}
				
				else
					try {

						Connection con = DriverManager.getConnection(
								"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Statement st = con.createStatement();
						ResultSet res = st.executeQuery("Select max(Order_Id) from Costumers");
						if (res.next()) {
							int id = res.getInt(1);
							++id;

							// for data and time
							Calendar calendar = Calendar.getInstance();
							SimpleDateFormat simpledate = new SimpleDateFormat("E,dd MMM,YY hh:mm aa");
							String date = simpledate.format(calendar.getTime());
							System.out.println("Date & Time is " + date);

						@SuppressWarnings("unused")
						int i = st.executeUpdate("insert into Costumers(Order_Id,Cos_Name,Cos_number,Ord_Date) values('" + id + "', '"	+ costumerName.getText() + "', '" + costumerNum.getText() + "', '" + date+ "')");

							ResultSet rus = st.executeQuery("select * from costumers where Order_Id=(select max(Order_Id) from Costumers)");
							if (rus.next()) {
								OrderId.setText(rus.getString(2));
								CostumerName.setText(rus.getString(3));
								MobileNum.setText(rus.getString(4));
								OrderDate.setText(rus.getString(5));

							}

							TP.setSelectedIndex(2);
							TotalAmount.setText("");
							status.setSelectedIndex(0);
						}

					} catch (Exception evt) {
						System.out.println(evt);
					}

			}
		});

		JSeparator sellSep2 = new JSeparator();
		sellSep2.setBounds(0, 150, 870, 625);
		sellSep2.setBorder(BorderFactory.createLineBorder(new Color(245, 245, 250), 625));
		selling.add(sellSep2);
		TP.add(selling);

		// Ending start selling panel

		//// ***************************************************ENDING OF
		//// SELLING
		//// PANEL**************************************************************************************************************************************************************************

		// *****************************************************BEGING OF MAIN
		// SELLING
		// PANEL************************************************************************************************************************************************************************
		// Beginning of selling main Panel

		JPanel Mainselling = new JPanel();
		Mainselling.setBackground(Color.white);
		Mainselling.setLayout(null);

		TP.add(Mainselling);
		am=0;
		JLabel text2 = new JLabel("Costumer and order Details");
		text2.setBounds(20, 0, 750, 80);
		text2.setForeground(Color.red);
		text2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Mainselling.add(text2);

		JSeparator sellSep3 = new JSeparator();
		sellSep3.setBounds(15, 60, 770, 1);
		sellSep3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		Mainselling.add(sellSep3);

		JLabel OID = new JLabel("Order ID"); // OID=Oder ID
		OID.setBounds(23, 75, 80, 30);
		OID.setForeground(Color.BLACK);
		OID.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Mainselling.add(OID);

		OrderId.setBounds(230, 75, 150, 30);
		OrderId.setForeground(new Color(96, 96, 96));
		OrderId.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Mainselling.add(OrderId);

		JLabel OD = new JLabel("Order Date"); // od=Order Date
		OD.setBounds(465, 75, 110, 30);
		OD.setForeground(Color.BLACK);
		OD.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Mainselling.add(OD);

		OrderDate.setBounds(590, 75, 300, 30);
		OrderDate.setForeground(new Color(96, 96, 96));
		OrderDate.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Mainselling.add(OrderDate);

		JLabel CosName = new JLabel("Costumer Name"); // od=Order Date
		CosName.setBounds(23, 110, 130, 30);
		CosName.setForeground(Color.BLACK);
		CosName.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Mainselling.add(CosName);

		CostumerName.setBounds(230, 110, 150, 30);
		CostumerName.setForeground(new Color(96, 96, 96));
		CostumerName.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Mainselling.add(CostumerName);

		JLabel MN = new JLabel("Costumer Number"); // Mobile Number
		MN.setBounds(465, 110, 150, 30);
		MN.setForeground(Color.BLACK);
		MN.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Mainselling.add(MN);

		MobileNum.setBounds(650, 110, 150, 30);
		MobileNum.setForeground(new Color(96, 96, 96));
		MobileNum.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Mainselling.add(MobileNum);

		JSeparator sellSep6 = new JSeparator();
		sellSep6.setBounds(15, 70, 770, 40);
		sellSep6.setBorder(BorderFactory.createLineBorder(new Color(218, 218, 218), 40));
		Mainselling.add(sellSep6);

		JLabel text3 = new JLabel("Add Items into Cart");
		text3.setBounds(20, 130, 750, 80);
		text3.setForeground(Color.red);
		text3.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Mainselling.add(text3);

		JSeparator sellSep4 = new JSeparator();
		sellSep4.setBounds(15, 190, 770, 1);
		sellSep4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		Mainselling.add(sellSep4);

		JLabel SP = new JLabel("Select Product"); // SP= Select Product
		SP.setBounds(23, 215, 122, 30);
		SP.setForeground(Color.BLACK);
		SP.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Mainselling.add(SP);

		
		SearchProduct.setBounds(180, 215, 200, 30);
		SearchProduct.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		SearchProduct.setForeground(new Color(192, 192, 192));
		SearchProduct.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Mainselling.add(SearchProduct);
		
		try {
			
			Set <String>s;
			s=new TreeSet<String>();
			
			Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st=con.createStatement();
			ResultSet res=st.executeQuery("select * from Product");
			while(res.next()) {
				s.add(res.getString("Product_Name"));
			}
			
		SearchProduct.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				
		 if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE||e.getKeyCode()==KeyEvent.VK_DELETE)	{
			 
		 }
		
		 else {
		 		String check=SearchProduct.getText();
				int String_length=check.length();
				for(String data:s) { 
					String check_from_data="";
					
					 for(int i=0;i<String_length;i++)
					{
						if(String_length<=data.length()) {
							check_from_data=check_from_data+data.charAt(i);
						}
					}
				if(check_from_data.equals(check)) {
					SearchProduct.setText(data);
					SearchProduct.setSelectionStart(String_length);
					SearchProduct.setSelectionEnd(data.length());
					break;
				}
			  }
		   }
				
		}
	});
		
		}
		catch(Exception e) {System.out.println(e); }
		

		JLabel qun = new JLabel("Enter Quntity"); // qun=Quantity
		qun.setBounds(410, 215, 122, 30);
		qun.setForeground(Color.BLACK);
		qun.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Mainselling.add(qun);

		JLabel spinnertempLabel=new JLabel();
		
		SpinnerModel sp = new SpinnerNumberModel(1, 1, 1000000, 1);
		JSpinner spinner = new JSpinner(sp);
		spinner.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		spinner.setBounds(540, 215, 80, 30);
		Mainselling.add(spinner);
		
		spinnertempLabel.setText(spinner.getValue().toString());
		
        spinner.addChangeListener(new ChangeListener() {
        	public void stateChanged(ChangeEvent e) {
        		String tempSp=spinner.getValue().toString();
        		spinnertempLabel.setText(tempSp);
        	
        		
        	
        		        	}
        });
        
        JButton AddItemB = new JButton("Add Item");
		AddItemB.setBounds(650, 215, 100, 30);
		AddItemB.setBackground(Color.red);
		AddItemB.setBorder(BorderFactory.createLineBorder(Color.red));
		AddItemB.setForeground(Color.white);
		AddItemB.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		Mainselling.add(AddItemB);
    	
		
		TotalAmount.setBounds(700, 475, 150, 30);
		TotalAmount.setForeground(new Color(96, 96, 96));
		TotalAmount.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Mainselling.add(TotalAmount);
		
		
		
		
		
		
		
		

		JSeparator sellSep5 = new JSeparator();
		sellSep5.setBounds(15, 205, 770, 70);
		sellSep5.setBorder(BorderFactory.createLineBorder(new Color(218, 218, 218), 70));
		Mainselling.add(sellSep5);

		JLabel text4 = new JLabel("Order Item Details");
		text4.setBounds(20, 260, 400, 80);
		text4.setForeground(Color.red);
		text4.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Mainselling.add(text4);

		JSeparator sellSep7 = new JSeparator();
		sellSep7.setBounds(15, 315, 770, 1);
		sellSep7.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		Mainselling.add(sellSep7);
	
		String Ocol[] = {"ID", "Product Name", "Total units", "Price", "Total Cost", "Action" };

		
		Ordmodel.setColumnIdentifiers(Ocol);
		Ot.setRowHeight(28);
		Ot.setFont(new Font("Times New Roman", Font.PLAIN, 16));
				
		oth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		oth.setForeground(Color.white);
		oth.setBackground(new Color(28, 37, 47));
		oth.getColumnModel().getColumn(0).setMaxWidth(60);
		oth.getColumnModel().getColumn(2).setMaxWidth(100);
		oth.getColumnModel().getColumn(2).setMinWidth(100);
		
		oth.getColumnModel().getColumn(3).setMaxWidth(80);
		oth.getColumnModel().getColumn(3).setMinWidth(80);
		
		oth.getColumnModel().getColumn(4).setMaxWidth(100);
		oth.getColumnModel().getColumn(4).setMinWidth(100);
		
		oth.getColumnModel().getColumn(5).setMaxWidth(110);
		oth.getColumnModel().getColumn(5).setMinWidth(110);
		
		Ot.getTableHeader().setReorderingAllowed(false);
		
		JScrollPane Ordpane = new JScrollPane();
		Ordpane.setViewportView(Ot);
		Ordpane.setBounds(15, 325, 770, 145);
		Mainselling.add(Ordpane);
		
		
		AddItemB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
					 Statement st=con.createStatement();
					 
					 ResultSet res3=st.executeQuery("select Product_Name from Product");
					 	JLabel tempLabel1=new JLabel();
					 	l1: while(res3.next()) {
					 		if(res3.getString("Product_Name").equals(SearchProduct.getText())) {
					 			tempLabel1.setText("false");
					 			break l1;
					 			}
					 		else
					 			tempLabel1.setText("true");
					 	}
					 boolean flag=Boolean.parseBoolean(tempLabel1.getText());
					 
					 
					 JLabel tempLabel2=new JLabel();
					 JLabel tempLabel3=new JLabel();
					 JLabel tempLabel4=new JLabel();
					 ResultSet res4=st.executeQuery("select Total_units from Product where Product_Name= '"+SearchProduct.getText()+"' ");
					 if(res4.next()) {
						 
						 String tempUnit1=res4.getString("Total_units");
						 int EU=Integer.parseInt(spinnertempLabel.getText());
						 int TU=Integer.parseInt(tempUnit1);
						 if(TU==0) {
							 tempLabel2.setText("true");  }
						 else 
							 tempLabel2.setText("false");
						 if(EU>TU) {
							 tempLabel3.setText("true");
							 tempLabel4.setText(String.valueOf(TU));
						 }
						 else 
							 tempLabel3.setText("false");
						 
					 }
					 
					 boolean flag1=Boolean.parseBoolean(tempLabel2.getText());
					 boolean flag2=Boolean.parseBoolean(tempLabel3.getText());
					 
					 
					 
					 if(SearchProduct.getText().equals("")) {
						 ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
						 JOptionPane.showMessageDialog(null, "Select the Product ", "Warrning", JOptionPane.WARNING_MESSAGE,ig1);
					 	}
					 else if(flag) {
						 JOptionPane.showMessageDialog(null, "Product not found", "Error", JOptionPane.ERROR_MESSAGE);   }
					 
					 else if(flag1) {
						 JOptionPane.showMessageDialog(null, SearchProduct.getText()+" is out of stock", "WARNING", JOptionPane.ERROR_MESSAGE); 
					 }
				
					 else if(flag2) {
						 JOptionPane.showMessageDialog(null,"Only "+ tempLabel4.getText()+" units are available", "WARNING", JOptionPane.WARNING_MESSAGE);
					 }
					 
					 
					 else 
					 	{	
					
						 JLabel tempvar2= new JLabel();
					
				 
						 ResultSet res=st.executeQuery("select * from Product where Product_Name ='"+SearchProduct.getText().toLowerCase()+"'");
					 		while(res.next()) {
					 			tempvar2.setText(res.getString("Price_Per_Unit"));  }
					
				
					 		@SuppressWarnings("unused")
							int ordId=Integer.parseInt(OrderId.getText());
					 		String ProName=SearchProduct.getText().toLowerCase();
					 		int unit=Integer.parseInt(spinnertempLabel.getText());
					 		int ProRate=Integer.parseInt(tempvar2.getText());
					 		int oneProductcost=unit*ProRate;
					 		@SuppressWarnings("unused")
							String action = "";
					 		String OrderDet[] = {OrderId.getText(),ProName,spinnertempLabel.getText(),tempvar2.getText(),String.valueOf(oneProductcost)};
					 		Ordmodel.addRow(OrderDet);
					 		for(int i = 0;i<Ot.getModel().getRowCount();i++) {
					 
					 			String Tamount = Ot.getModel().getValueAt(i, 4).toString();
					 			int am=Integer.parseInt(Tamount);
					 			if(i==Ot.getModel().getRowCount()-1) {
					 				Amounttemp= Amounttemp+am;
					 				TotalAmount.setText(String.valueOf(Amounttemp));
					 			}
					 		}
							

							
				 	   }
						}
					catch(Exception ev) {System.out.println(ev);}
				
			}
				
		});
		

		JLabel TA = new JLabel("Total Amount:"); // TA= total amount label
		TA.setBounds(570, 475, 125, 30);
		TA.setForeground(Color.BLACK);
		TA.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Mainselling.add(TA);

		

		
		status.setBounds(460, 510, 150, 30);
		status.setForeground(new Color(0, 0, 0));
		status.setBackground(new Color(255, 255, 255));
		status.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Mainselling.add(status);

		JButton SSD = new JButton("Save Sell Details"); // SSD Save sell Details
		SSD.setBounds(650, 510, 172, 29);
		SSD.setBackground(new Color(0, 150, 255));
		SSD.setForeground(Color.white);
		SSD.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		Mainselling.add(SSD);
		
		@SuppressWarnings("unused")
		JLabel tempLabel1=new JLabel();
		SSD.addActionListener(new ActionListener() {
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent e) {
				
				if (SearchProduct.getText().length() == 0) {
					ImageIcon ig1 = new ImageIcon(
							"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
					JOptionPane.showMessageDialog(null, "Select the Product ", "Warrning", JOptionPane.WARNING_MESSAGE,
							ig1);
				} else if (status.getItemAt(status.getSelectedIndex()) == status.getItemAt(0)) {
					ImageIcon ig1 = new ImageIcon(
							"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
					JOptionPane.showMessageDialog(null, "Please select the payment method", "Warrning",JOptionPane.WARNING_MESSAGE, ig1);
							}
				 else if(Ordmodel.getRowCount()==0) {
					JOptionPane.showMessageDialog(null, "Please add the product", "Warrning",JOptionPane.ERROR_MESSAGE);
				 		}



				else {
					try {
						JLabel tempLabel1=new JLabel();
						JLabel tempLabel2=new JLabel();
						Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Statement st = con.createStatement();
						
						if(status.getSelectedItem().toString().equals("Borrow"))  {
							
						ResultSet res4=st.executeQuery("Select * from Borrower");
						boolean flag=true;
						l1:while(res4.next()) {
							tempLabel1.setText(res4.getString("Bor_Name"));
							tempLabel2.setText(res4.getString("Contact_No"));
							
							if(res4.getString("Bor_Name").equals(costumerName.getText())&& res4.getString("Contact_No").equals(costumerNum.getText())) {
								flag=true;
								break l1;   }
							else 
								flag=false;   }
						if(flag) {
							ImageIcon img=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\br.png");
							int ta=Integer.parseInt(TotalAmount.getText());
							String pa=JOptionPane.showInputDialog(null," Please enter the pay amount ","Borrow",JOptionPane.INFORMATION_MESSAGE);
							int PA=Integer.parseInt(pa);
							int due= ta-PA;
							
							 TA1.setText("Due Amount");
							 text14.setText("Due Amount");
							 ResultSet res5=st.executeQuery("select * from Borrower where Bor_Name= '"+tempLabel1.getText()+"' AND Contact_No='"+tempLabel2.getText()+"' ");
							 
							 if(res5.next())  {
								 int da=Integer.parseInt(res5.getString("DueAmount"));
								 da=da+due;
							 TotalAmount2.setText(String.valueOf(da));
							 TotalAmount1.setText(String.valueOf(da));	
							 int b=st.executeUpdate("update Borrower set DueAmount='"+String.valueOf(da)+"' where Bor_Name= '"+tempLabel1.getText()+"' AND Contact_No='"+tempLabel2.getText()+"' ");
							 
							 } 
							
							
							
							ResultSet res = st.executeQuery("select max(Order_Id) from Costumers");
							if (res.next()) {
								smsText.setText("Order Item of Order ID: " + res.getInt(1));
								int i = st.executeUpdate("update costumers set Payment_Status= '" + status.getSelectedItem().toString()+ "' where Order_Id=(select max(Order_Id) from Costumers)");
	
								ResultSet res1 = st.executeQuery("select * from Costumers where Order_Id=(select max(Order_Id) from Costumers)");
								if (res1.next()) {
									OrderId1.setText(res1.getString(2));
									OrderDate1.setText(res1.getString(5));
									costumerName1.setText(res1.getString(3));
									ContactNumber1.setText(res1.getString(4));
									OrderStats.setText(res1.getString(6));
	
									TP.setSelectedIndex(3);
									
									
									for(int k=0;k<Ordmodel.getRowCount();k++) {
										String Oid=Ordmodel.getValueAt(k, 0).toString();
										String Pname=Ordmodel.getValueAt(k, 1).toString();
										String Ounits=Ordmodel.getValueAt(k, 2).toString();
										String ORate=Ordmodel.getValueAt(k, 3).toString();
										String OrRate=Ordmodel.getValueAt(k, 4).toString();
										String ac="";
										String[] o2rdetails = {Oid,Pname,Ounits,ORate,OrRate,ac};
										O2rdmodel.addRow(o2rdetails);
										int l=st.executeUpdate("insert into Order(Order_ID,Product_Name,Total_units,Price,Total_Cost) values('"+Oid+"', '"+Pname+"', '"+Ounits+"', '"+ORate+"', '"+OrRate+"') ");
										int j=st.executeUpdate("update Costumers set Amount='"+TotalAmount.getText()+"' where Order_Id= '"+OrderId.getText()+"' ");
										
									
									}
								}
							}
							
							//int EN=Integer.parseInt(spinnertempLabel.getText());
							
							for(int a=0;a<Ordmodel.getRowCount();a++) {
								
								int EU=Integer.parseInt(Ordmodel.getValueAt(a, 2).toString());
								ResultSet res3=st.executeQuery("select * from Product where Product_Name='"+Ordmodel.getValueAt(a, 1).toString()+"'");
								if(res3.next()) {
								 int TU=Integer.parseInt(res3.getString("Total_units"));
								 TU=TU-EU;
								  int m=st.executeUpdate("update Product set Total_units='"+String.valueOf(TU)+"' where Product_Name= '"+Ordmodel.getValueAt(a, 1).toString()+"' ");
								   if(m>0) {
								   // System.out.println("value updated");
								   }
								}	
								
							}
							
							
							
							}
						else
							 JOptionPane.showMessageDialog(null, "This costumer in not borrower\nPlease select cash or other payment method.", "Warrning",JOptionPane.WARNING_MESSAGE);
							
						
						
						
						
						 }
						
						else {
							
							ResultSet res = st.executeQuery("select max(Order_Id) from Costumers");
							if (res.next()) {
								smsText.setText("Order Item of Order ID: " + res.getInt(1));
								int i = st.executeUpdate("update costumers set Payment_Status= '" + status.getSelectedItem().toString()+ "' where Order_Id=(select max(Order_Id) from Costumers)");
	
								ResultSet res1 = st.executeQuery("select * from Costumers where Order_Id=(select max(Order_Id) from Costumers)");
								if (res1.next()) {
									OrderId1.setText(res1.getString(2));
									OrderDate1.setText(res1.getString(5));
									costumerName1.setText(res1.getString(3));
									ContactNumber1.setText(res1.getString(4));
									OrderStats.setText(res1.getString(6));
	
									TP.setSelectedIndex(3);
									
									
									for(int k=0;k<Ordmodel.getRowCount();k++) {
										String Oid=Ordmodel.getValueAt(k, 0).toString();
										String Pname=Ordmodel.getValueAt(k, 1).toString();
										String Ounits=Ordmodel.getValueAt(k, 2).toString();
										String ORate=Ordmodel.getValueAt(k, 3).toString();
										String OrRate=Ordmodel.getValueAt(k, 4).toString();
										String ac="";
										String[] o2rdetails = {Oid,Pname,Ounits,ORate,OrRate,ac};
										O2rdmodel.addRow(o2rdetails);
										int l=st.executeUpdate("insert into Order(Order_ID,Product_Name,Total_units,Price,Total_Cost) values('"+Oid+"', '"+Pname+"', '"+Ounits+"', '"+ORate+"', '"+OrRate+"') ");
										int j=st.executeUpdate("update Costumers set Amount='"+TotalAmount.getText()+"' where Order_Id= '"+OrderId.getText()+"' ");
										
									 TotalAmount2.setText(TotalAmount.getText());
									 TotalAmount1.setText(TotalAmount.getText());	
									}
								}
							}
							
							for(int a=0;a<Ordmodel.getRowCount();a++) {
								
								int EU=Integer.parseInt(Ordmodel.getValueAt(a, 2).toString());
								ResultSet res3=st.executeQuery("select * from Product where Product_Name='"+Ordmodel.getValueAt(a, 1).toString()+"'");
								if(res3.next()) {
								 int TU=Integer.parseInt(res3.getString("Total_units"));
								 TU=TU-EU;
								  int m=st.executeUpdate("update Product set Total_units='"+String.valueOf(TU)+"' where Product_Name= '"+Ordmodel.getValueAt(a, 1).toString()+"' ");
								   if(m>0) {
								   // System.out.println("value updated");
								   }
								}	
								
							}
							
							
						}
						
					} catch (Exception evt) {
						System.out.println(evt);
					}
				}

			}

		});

		// Ending of selling main Panel

		// ***********************************************ENDING OF MAIN SELLING
		// PANEL******************************************************************************************************************************************************************************

		// ***********************************************BEGNINNING OF ORDER
		// DETAILS
		// PANEL******************************************************************************************************************************************************************************

		JPanel orderDetails = new JPanel();
		orderDetails.setBackground(Color.white);
		orderDetails.setLayout(null);
		TP.add(orderDetails);

		JLabel text5 = new JLabel("Order Details");
		text5.setBounds(20, 0, 750, 80);
		text5.setForeground(Color.red);
		text5.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		orderDetails.add(text5);

		JSeparator ordSep1 = new JSeparator();
		ordSep1.setBounds(15, 60, 770, 1);
		ordSep1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		orderDetails.add(ordSep1);

		JLabel ORD = new JLabel("Order ID"); // ProaName= Product Name
		ORD.setBounds(25, 75, 122, 30);
		ORD.setForeground(Color.white);
		ORD.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		orderDetails.add(ORD);

		JSeparator ordSep2 = new JSeparator();
		ordSep2.setBounds(15, 70, 170, 40);
		ordSep2.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		orderDetails.add(ordSep2);

		OrderId1.setBounds(225, 75, 150, 30);
		OrderId1.setForeground(new Color(96, 96, 96));
		OrderId1.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		orderDetails.add(OrderId1);

		JLabel OD1 = new JLabel("Order Date"); // OD1= Order Date
		OD1.setBounds(425, 75, 122, 30);
		OD1.setForeground(Color.white);
		OD1.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		orderDetails.add(OD1);

		JSeparator ordSep3 = new JSeparator();
		ordSep3.setBounds(410, 70, 170, 40);
		ordSep3.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		orderDetails.add(ordSep3);

		OrderDate1.setBounds(592, 75, 300, 30);
		OrderDate1.setForeground(new Color(96, 96, 96));
		OrderDate1.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		orderDetails.add(OrderDate1);

		JSeparator ordSep4 = new JSeparator();
		ordSep4.setBounds(15, 110, 770, 1);
		ordSep4.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179), 1));
		orderDetails.add(ordSep4);

		JLabel CN1 = new JLabel("Costumer Name"); // CN1= costumer name 1
		CN1.setBounds(25, 116, 150, 30);
		CN1.setForeground(Color.white);
		CN1.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		orderDetails.add(CN1);

		JSeparator ordSep5 = new JSeparator();
		ordSep5.setBounds(15, 111, 170, 40);
		ordSep5.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		orderDetails.add(ordSep5);

		costumerName1.setBounds(225, 116, 150, 30);
		costumerName1.setForeground(new Color(96, 96, 96));
		costumerName1.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		orderDetails.add(costumerName1);

		JLabel CN2 = new JLabel("Contact Number"); // CN2 =contach Number
		CN2.setBounds(425, 116, 150, 30);
		CN2.setForeground(Color.white);
		CN2.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		orderDetails.add(CN2);

		JSeparator ordSep6 = new JSeparator();
		ordSep6.setBounds(410, 110, 170, 40);
		ordSep6.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		orderDetails.add(ordSep6);

		ContactNumber1.setBounds(650, 116, 150, 30);
		ContactNumber1.setForeground(new Color(96, 96, 96));
		ContactNumber1.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		orderDetails.add(ContactNumber1);

		JSeparator ordSep7 = new JSeparator();
		ordSep7.setBounds(15, 150, 770, 1);
		ordSep7.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179), 1));
		orderDetails.add(ordSep7);

		JLabel ORS = new JLabel("Order Status"); // ORS= Order status
		ORS.setBounds(25, 157, 122, 30);
		ORS.setForeground(Color.white);
		ORS.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		orderDetails.add(ORS);

		JSeparator ordSep8 = new JSeparator();
		ordSep8.setBounds(15, 152, 170, 40);
		ordSep8.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		orderDetails.add(ordSep8);

		OrderStats.setBounds(225, 157, 150, 30);
		OrderStats.setForeground(new Color(96, 96, 96));
		OrderStats.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		orderDetails.add(OrderStats);

		
		TA1.setBounds(425, 157, 150, 30);
		TA1.setForeground(Color.white);
		TA1.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		orderDetails.add(TA1);

		JSeparator ordSep10 = new JSeparator();
		ordSep10.setBounds(410, 152, 170, 40);
		ordSep10.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		orderDetails.add(ordSep10);

		TotalAmount1.setBounds(650, 157, 150, 30);
		TotalAmount1.setForeground(new Color(96, 96, 96));
		TotalAmount1.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		orderDetails.add(TotalAmount1);

		JSeparator ordSep11 = new JSeparator();
		ordSep11.setBounds(15, 192, 770, 1);
		ordSep11.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179), 1));
		orderDetails.add(ordSep11);

		JLabel text6 = new JLabel("Order Items");
		text6.setBounds(20, 180, 750, 80);
		text6.setForeground(Color.red);
		text6.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		orderDetails.add(text6);

		JSeparator ordSep12 = new JSeparator();
		ordSep12.setBounds(15, 240, 770, 1);
		ordSep12.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		orderDetails.add(ordSep12);


		text14.setBounds(560, 450, 150, 80);
		text14.setForeground(Color.red);
		text14.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		orderDetails.add(text14);
		
		
		
		O2rdmodel.setColumnIdentifiers(O2col);
		O2t.setRowHeight(28);
		O2t.setFont(new Font("Times New Roman", Font.PLAIN, 16));
						//o2th= order second table header
		o2th.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		o2th.setForeground(Color.white);
		o2th.setBackground(new Color(28, 37, 47));
		
		o2th.getColumnModel().getColumn(0).setMaxWidth(60);
		o2th.getColumnModel().getColumn(2).setMaxWidth(100);
		o2th.getColumnModel().getColumn(2).setMinWidth(100);
		
		o2th.getColumnModel().getColumn(3).setMaxWidth(80);
		o2th.getColumnModel().getColumn(3).setMinWidth(80);
		
		o2th.getColumnModel().getColumn(4).setMaxWidth(100);
		o2th.getColumnModel().getColumn(4).setMinWidth(100);
		
		o2th.getColumnModel().getColumn(5).setMaxWidth(110);
		o2th.getColumnModel().getColumn(5).setMinWidth(110);
		
		O2t.getTableHeader().setReorderingAllowed(false);
		JScrollPane O2rdpane = new JScrollPane();
		O2rdpane.setViewportView(O2t);
		O2rdpane.setBounds(15, 250, 770, 223);
		orderDetails.add(O2rdpane);
		
		
			
		TotalAmount2.setBounds(710, 450, 750, 80);
		TotalAmount2.setForeground(new Color(28, 37, 47));
		TotalAmount2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		orderDetails.add(TotalAmount2);
			
		
		JButton recipt = new JButton("SHOW RECIPT");
		recipt.setBounds(300, 520, 150, 30);
		recipt.setBackground(Color.red);
		recipt.setBorder(BorderFactory.createLineBorder(Color.red));
		recipt.setForeground(Color.white);
		recipt.setFont(new Font("LucidaGrande", Font.PLAIN, 15));
		orderDetails.add(recipt);
		
		
		printBill=new JDialog(frame," RECIPT ",true);
		JTextArea area=new JTextArea();
	    area.setFont(new Font("LucidaGrande", Font.PLAIN, 15));
	    area.setBounds(10,30,380,295);
	     printBill.add(area);
		
		recipt.addActionListener(new ActionListener( ){
			@SuppressWarnings("unused")
			public void actionPerformed(ActionEvent ev) {
				
				try {
					
					
					String userN="ahsan";
					Connection con= DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select * from userTable where username='"+userN+"'");
					if(rs.next())  {
					
					JLabel t1=new JLabel();
					t1.setFont(new Font("Lucida Handwriting",Font.PLAIN,22));
					t1.setText("CASH RECEIPT");
					t1.setBounds(105,0,330,30);
					printBill.add(t1);
					
					String PName="Dal";
					String Qty="5";
					String rate="10";
					String amount="50";
					 area.setText("-----------------------------------------------------------------------\n");	
					 area.setText(area.getText()+"No.: "+OrderId1.getText()+"\t                    "+OrderDate1.getText()+"\n");
					 area.setText(area.getText()+"-----------------------------------------------------------------------\n");
					 area.setText(area.getText()+"DESCRIPTION\t              QTY        RATE        AMOUNT\n");
					 area.setText(area.getText()+"-----------------------------------------------------------------------\n");
					 for(int k=0;k<Ordmodel.getRowCount();k++) {
							String Oid=Ordmodel.getValueAt(k, 0).toString();
							String Pname=Ordmodel.getValueAt(k, 1).toString();
							String Ounits=Ordmodel.getValueAt(k, 2).toString();
							String ORate=Ordmodel.getValueAt(k, 3).toString();
							String OrRate=Ordmodel.getValueAt(k, 4).toString();
							 area.setText(area.getText()+Pname+"\t                 "+Ounits+"             "+ORate+"               "+OrRate+"\n");
					 }
					 
					 
					 
					
					 
					  
					 
					JLabel t3=new JLabel();
  					t3.setFont(new Font("LucidaGrande",Font.PLAIN,15));
  					t3.setText("-----------------------------------------------------------------------");
  					t3.setBounds(7,320,400,30);
  					printBill.add(t3);
					 
					JLabel t2=new JLabel();
 					t2.setFont(new Font("Roboto Mono",Font.BOLD,19));
 					t2.setText("TOTAL AMOUNT  ");
 					t2.setBounds(20,340,300,30);
 					printBill.add(t2);
 					
 					JLabel Tamount=new JLabel();
 					Tamount.setFont(new Font("Roboto Mono",Font.BOLD,19));
 					Tamount.setText( TotalAmount2.getText());
 					Tamount.setBounds(270,340,120,30);
 					printBill.add(Tamount);
 					
 					
 					JLabel t4=new JLabel();
 					t4.setFont(new Font("Roboto Mono",Font.BOLD,27));
 					t4.setText("THANK YOU");
 					t4.setBounds(125,385,300,30);
 					printBill.add(t4);
  					
 					ImageIcon im=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\BC.gif");
  					JLabel qr=new JLabel(im);
  					qr.setBounds(35,420,300,60);
  					printBill.add(qr);
  					
					
					}
					
					
					
					JButton printB=new JButton("Print");
					printB.setBounds(152,498,80,27);
					printB.setBackground(Color.red);
					printB.setBorder(BorderFactory.createLineBorder(Color.red));
					printB.setForeground(Color.white);
					printB.setFont(new Font("LucidaGrande", Font.PLAIN, 21));
					printBill.add(printB);
					printB.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent ev) {
							try {
									area.print();
								}catch(Exception e) {}
							}
						});
				 
					}
				
				
				catch(Exception ex) {
					System.out.println(ex);
				}
				 
				 
				 
				 
				 
				
				printBill.getContentPane().setBackground(Color.WHITE);
				printBill.setSize(400,580);
				printBill.setLocationRelativeTo(null);
				printBill.setLayout(null);
				printBill.setVisible(true);
				
			
			}
		});
		
		
		

		// ***********************************************ENDING OF ORDER
		// DETAILS
		// PANEL******************************************************************************************************************************************************************************

		// ***********************************************BEGNINNING OF EMPLOYEE
		// DETAILS
		// PANEL******************************************************************************************************************************************************************************

		JPanel Employee = new JPanel();
		Employee.setBackground(Color.white);
		Employee.setLayout(null);
		TP.add(Employee);

		JLabel Emptext1 = new JLabel("Employee Entry Form");
		Emptext1.setBounds(20, 0, 750, 80);
		Emptext1.setForeground(Color.red);
		Emptext1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Employee.add(Emptext1);

		JSeparator EmpSeP1 = new JSeparator();
		EmpSeP1.setBounds(15, 60, 770, 1);
		ordSep1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		Employee.add(EmpSeP1);

		JLabel EORD = new JLabel("Username"); // EORD= Employee order ID Label
		EORD.setBounds(25, 75, 122, 30);
		EORD.setForeground(Color.white);
		EORD.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Employee.add(EORD);

		JSeparator EmpSeP2 = new JSeparator();
		EmpSeP2.setBounds(15, 70, 175, 40);
		EmpSeP2.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		Employee.add(EmpSeP2);

		JTextField EmpUsername = new JTextField();
		EmpUsername.setBounds(200, 75, 180, 25);
		EmpUsername.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		EmpUsername.setForeground(new Color(192, 192, 192));
		EmpUsername.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Employee.add(EmpUsername);

		JSeparator EmpSeP3 = new JSeparator();
		EmpSeP3.setBounds(198, 107, 175, 2);
		EmpSeP3.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
		Employee.add(EmpSeP3);

		EmpUsername.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EmpSeP3.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
			}
		});

		JLabel EPD = new JLabel("Password"); // EPD= Employee Password Label
		EPD.setBounds(410, 75, 122, 30);
		EPD.setForeground(Color.white);
		EPD.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Employee.add(EPD);

		JSeparator EmpSeP4 = new JSeparator();
		EmpSeP4.setBounds(400, 70, 175, 40);
		EmpSeP4.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		Employee.add(EmpSeP4);

		JPasswordField EmpPassword = new JPasswordField();
		EmpPassword.setBounds(585, 75, 180, 25);
		EmpPassword.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		EmpPassword.setForeground(new Color(192, 192, 192));
		EmpPassword.setEchoChar('*');
		EmpPassword.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Employee.add(EmpPassword);

		JSeparator EmpSeP5 = new JSeparator();
		EmpSeP5.setBounds(582, 107, 180, 2);
		EmpSeP5.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
		Employee.add(EmpSeP5);

		EmpPassword.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EmpSeP5.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
			}
		});

		JLabel RshowIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\view.png"));
		RshowIcon.setBounds(762, 75, 30, 30);
		JLabel RhideIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\hide.png"));
		RhideIcon.setVisible(false);
		RhideIcon.setBounds(762, 75, 30, 30);
		Employee.add(RshowIcon);
		Employee.add(RhideIcon);

		RshowIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				RshowIcon.setVisible(false);
				RhideIcon.setVisible(true);
				EmpPassword.setEchoChar((char) 0);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				RhideIcon.setVisible(false);
				RshowIcon.setVisible(true);
				EmpPassword.setEchoChar('*');
			}
		});

		String SecQ[] = { "Select Question", "In what city were you born?", "What is the name of your favorite pet?",
				"What is your mother's maiden name?", "What high school did you attend?",
				"What is the name of your first school?", "What was the make of your first car?",
				"What was your favorite food as a child?", "Where did you meet your spouse?" };

		@SuppressWarnings({ })
		JComboBox EmpSecQuestion = new JComboBox(SecQ);
		EmpSecQuestion.setBounds(15, 127, 175, 40);
		EmpSecQuestion.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47)));
		EmpSecQuestion.setForeground(new Color(255, 255, 255));
		EmpSecQuestion.setBackground(new Color(28, 37, 47));
		EmpSecQuestion.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		Employee.add(EmpSecQuestion);

		JTextField EmpAnswer = new JTextField("Answer");
		EmpAnswer.setBounds(205, 135, 180, 25);
		EmpAnswer.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		EmpAnswer.setForeground(new Color(192, 192, 192));
		EmpAnswer.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Employee.add(EmpAnswer);

		JSeparator EmpSeP6 = new JSeparator();
		EmpSeP6.setBounds(200, 165, 175, 2);
		EmpSeP6.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
		Employee.add(EmpSeP6);

		EmpAnswer.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EmpSeP6.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
			}
		});

		EmpAnswer.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (EmpAnswer.getText().equals("Answer")) {
					EmpAnswer.setText("");
				}
			}
		});

		EmpAnswer.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (EmpAnswer.getText().length() == 0) {
					EmpAnswer.setText("Answer");
				}
			}
		});

		JLabel ECPD = new JLabel("Confirm Password"); // ECPD= Employee Confirm
														// Password Label
		ECPD.setBounds(408, 135, 160, 30);
		ECPD.setForeground(Color.white);
		ECPD.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Employee.add(ECPD);

		JSeparator EmpSeP8 = new JSeparator();
		EmpSeP8.setBounds(400, 130, 175, 40);
		EmpSeP8.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		Employee.add(EmpSeP8);

		JPasswordField EmpConfirmPassword = new JPasswordField();
		EmpConfirmPassword.setBounds(585, 135, 180, 25);
		EmpConfirmPassword.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		EmpConfirmPassword.setForeground(new Color(192, 192, 192));
		EmpConfirmPassword.setEchoChar('*');
		EmpConfirmPassword.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Employee.add(EmpConfirmPassword);

		JSeparator EmpSeP9 = new JSeparator();
		EmpSeP9.setBounds(582, 161, 180, 2);
		EmpSeP9.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
		Employee.add(EmpSeP9);

		EmpConfirmPassword.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EmpSeP9.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
			}
		});

		JLabel RshowIcon1 = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\view.png"));
		RshowIcon1.setBounds(762, 127, 30, 30);
		JLabel RhideIcon1 = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\hide.png"));
		RhideIcon1.setVisible(false);
		RhideIcon1.setBounds(762, 127, 30, 30);
		Employee.add(RshowIcon1);
		Employee.add(RhideIcon1);

		RshowIcon1.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				RshowIcon1.setVisible(false);
				RhideIcon1.setVisible(true);
				EmpConfirmPassword.setEchoChar((char) 0);
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				RhideIcon1.setVisible(false);
				RshowIcon1.setVisible(true);
				EmpConfirmPassword.setEchoChar('*');
			}
		});

		JLabel EPHN = new JLabel("Contact Number"); // EPHN= Employee Phone
													// NUmber
		EPHN.setBounds(25, 188, 140, 30);
		EPHN.setForeground(Color.white);
		EPHN.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Employee.add(EPHN);

		JSeparator EmpSeP10 = new JSeparator();
		EmpSeP10.setBounds(15, 183, 175, 40);
		EmpSeP10.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		Employee.add(EmpSeP10);

		JTextField EmpPhoneNo = new JTextField();
		EmpPhoneNo.setBounds(200, 190, 180, 25);
		EmpPhoneNo.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		EmpPhoneNo.setForeground(new Color(192, 192, 192));
		EmpPhoneNo.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Employee.add(EmpPhoneNo);

		JSeparator EmpSeP11 = new JSeparator();
		EmpSeP11.setBounds(198, 218, 175, 2);
		EmpSeP11.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
		Employee.add(EmpSeP11);

		EmpPhoneNo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EmpSeP11.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
			}
		});

		JLabel EACN = new JLabel("Aadhaar Card No."); // ECN= Employee
														// Aadharcard Numer
														// Label
		EACN.setBounds(410, 185, 150, 30);
		EACN.setForeground(Color.white);
		EACN.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		Employee.add(EACN);

		JSeparator EmpSeP12 = new JSeparator();
		EmpSeP12.setBounds(400, 183, 175, 40);
		EmpSeP12.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 40));
		Employee.add(EmpSeP12);

		JTextField EmpAadhaarNo = new JTextField();
		EmpAadhaarNo.setBounds(585, 192, 180, 25);
		EmpAadhaarNo.setBorder(BorderFactory.createLineBorder(new Color(255, 255, 255)));
		EmpAadhaarNo.setForeground(new Color(192, 192, 192));
		EmpAadhaarNo.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		Employee.add(EmpAadhaarNo);

		JSeparator EmpSeP13 = new JSeparator();
		EmpSeP13.setBounds(582, 218, 180, 2);
		EmpSeP13.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
		Employee.add(EmpSeP13);

		EmpAadhaarNo.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EmpSeP13.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 2));
			}
		});

		JLabel Emptext2 = new JLabel("Employee Details");
		Emptext2.setBounds(20, 230, 750, 80);
		Emptext2.setForeground(Color.red);
		Emptext2.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		Employee.add(Emptext2);

		JSeparator EmpSeP14 = new JSeparator();
		EmpSeP14.setBounds(15, 290, 770, 1);
		EmpSeP14.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		Employee.add(EmpSeP14);



		String col[] = {"Username", "Password", "Security Question", "Answer", "Contact No.", "Aadhaar No." };

		DefaultTableModel model = new DefaultTableModel();
		JTable et = new JTable(model);
		model.setColumnIdentifiers(col);
		JScrollPane emppane = new JScrollPane();
		et.setRowHeight(28);
		et.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		JTableHeader eth = et.getTableHeader();
		eth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		eth.setForeground(Color.white);
		eth.setBackground(new Color(28, 37, 47));
		eth.getColumnModel().getColumn(2).setPreferredWidth(40);
		eth.getColumnModel().getColumn(4).setPreferredWidth(40);
		eth.getColumnModel().getColumn(1).setPreferredWidth(50);
		
		et.getTableHeader().setReorderingAllowed(false);

		emppane.setViewportView(et);
		emppane.setBounds(15, 300, 780, 200);
		Employee.add(emppane);
		try {
			Connection con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1 = con.createStatement();
			ResultSet res = st1.executeQuery("Select * from Employee");
			while (res.next()) {
				String Eusername = res.getString("username");
				String EPassword = res.getString("password");
				String ESQ = res.getString("security_question");
				String Eans = res.getString("answer");
				String EConNo = res.getString("Contact_number");
				String EIDProf = res.getString("Aadhaar_NO");

				String Edetails[] = { Eusername, EPassword, ESQ, Eans, EConNo, EIDProf };

				model.addRow(Edetails);

			}

		} catch (Exception evt) {
			System.out.println(evt);
		}
		// Employee JTable end
		
		
					
					
		JButton EmpSave = new JButton("Save");
		EmpSave.setBounds(180, 520, 150, 37);
		EmpSave.setBackground(new Color(0, 128, 255));
		EmpSave.setForeground(Color.white);
		EmpSave.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		Employee.add(EmpSave);
		EmpSave.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if (EmpUsername.getText().length() == 0) {
					EmpSeP3.setBorder(BorderFactory.createLineBorder(Color.red, 1));
				} else if (EmpPassword.getText().length() == 0) {
					EmpSeP5.setBorder(BorderFactory.createLineBorder(Color.red, 1));
				} else if (EmpConfirmPassword.getText().length() == 0) {
					EmpSeP9.setBorder(BorderFactory.createLineBorder(Color.red, 1));
				} else if (!(EmpPassword.getText().equals(EmpConfirmPassword.getText()))) {
					ImageIcon ig1 = new ImageIcon(
							"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
					JOptionPane.showMessageDialog(null,"Your password and confirm password\ndidn't match please try again!", "Warrning",JOptionPane.WARNING_MESSAGE, ig1);
				}

				else if (EmpSecQuestion.getItemAt(EmpSecQuestion.getSelectedIndex()) == EmpSecQuestion.getItemAt(0)) {
					ImageIcon ig1 = new ImageIcon(
							"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
					JOptionPane.showMessageDialog(null, "Please select security question", "Warrning",
							JOptionPane.WARNING_MESSAGE, ig1);
				} else if (EmpAnswer.getText().equals("Answer")) {
					EmpSeP6.setBorder(BorderFactory.createLineBorder(Color.red, 1));
				} else if (EmpPhoneNo.getText().length() == 0) {
					EmpSeP11.setBorder(BorderFactory.createLineBorder(Color.red, 1));
				} else if (EmpAadhaarNo.getText().length() == 0) {
					EmpSeP13.setBorder(BorderFactory.createLineBorder(Color.red, 1));
				}

				else {
					try {
						Connection con = DriverManager.getConnection(
								"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Statement st = con.createStatement();
						int i = st.executeUpdate(
								"insert into Employee(username,password,security_question,answer,Contact_number,Aadhaar_NO) values( '"
										+ EmpUsername.getText() + "', '" + EmpPassword.getText() + "', '"
										+ EmpSecQuestion.getSelectedItem().toString() + "','" + EmpAnswer.getText()
										+ "', '" + EmpPhoneNo.getText() + "', '" + EmpAadhaarNo.getText() + "')");
						if (i > 0) {
							ImageIcon ig1 = new ImageIcon(
									"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
							JOptionPane.showMessageDialog(null, "Employee account successfully created.", "Done",
									JOptionPane.INFORMATION_MESSAGE, ig1);
							model.addRow(new Object[] {EmpUsername.getText(), EmpPassword.getText(),  EmpSecQuestion.getSelectedItem().toString(), EmpAnswer.getText(),EmpPhoneNo.getText(), EmpAadhaarNo.getText()  });
							
							EmpUsername.setText("");
							EmpPassword.setText("");
							EmpConfirmPassword.setText("");
							EmpSecQuestion.setSelectedIndex(0);
							EmpAnswer.setText("");
							EmpPhoneNo.setText("");
							EmpAadhaarNo.setText("");
							
							
						 
						}
					} catch (Exception evt) {
						System.out.println(evt);
					}



				}

			}
		});
		
	

		

		JButton EmpUpdate = new JButton("Update");
		EmpUpdate.setBounds(360, 520, 150, 37);
		EmpUpdate.setBackground(new Color(0, 128, 255));
		EmpUpdate.setForeground(Color.white);
		EmpUpdate.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		Employee.add(EmpUpdate);

		EmpUpdate.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				try {
				Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
				Statement st1 = con.createStatement();
				
				int i=st1.executeUpdate("update Employee set username='"+EmpUsername.getText()+"', password='"+EmpPassword.getText()+"', answer='"+EmpAnswer.getText()+"',Contact_number='"+EmpPhoneNo.getText()+"', Aadhaar_NO='"+EmpAadhaarNo.getText()+"' where Aadhaar_NO='"+EmpAadhaarNo.getText()+"' ");
				if (i>0) {
					ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
					JOptionPane.showMessageDialog(null, "Employee details update successfully.", "Done",JOptionPane.INFORMATION_MESSAGE, ig1);
					
					int j=et.getSelectedRow();
					if(j>=0) {
						model.setValueAt(EmpUsername.getText(), j, 0);
						model.setValueAt(EmpPassword.getText(),j,1);
						model.setValueAt(EmpSecQuestion.getSelectedItem().toString(), j, 2);
						model.setValueAt(EmpAnswer.getText(), j, 3);
						model.setValueAt(EmpPhoneNo.getText(), j, 4);
						model.setValueAt(EmpAadhaarNo.getText(), j, 5);
					}
					
					EmpUsername.setText("");
					EmpPassword.setText("");
					EmpConfirmPassword.setText("");
					EmpSecQuestion.setSelectedIndex(0);
					EmpAnswer.setText("");
					EmpPhoneNo.setText("");
					EmpAadhaarNo.setText("");
					
					//model.setRowCount(0); //Clear all table data
					EmpSave.setEnabled(true);
					
					
				}
				}catch(Exception evt) { System.out.println(evt); }
				

			}
		});
		
		JButton EmpDelete = new JButton("Delete");
		EmpDelete.setBounds(540, 520, 150, 37);
		EmpDelete.setBackground(new Color(0, 128, 255));
		EmpDelete.setForeground(Color.white);
		EmpDelete.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		//EmpDelete.setEnabled(false);
		Employee.add(EmpDelete);
		
		
					EmpDelete.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							if(et.getSelectedRowCount()==1) {
								try {
								Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
								Statement st=con.createStatement();
								int i=st.executeUpdate("Delete from Employee where username='"+EmpUsername.getText()+"'");
								if(i>0)  {
								model.removeRow(et.getSelectedRow());
								JOptionPane.showMessageDialog(null,"Row Deleted", "Warrning",JOptionPane.INFORMATION_MESSAGE);
								}
								}
								catch(Exception e) {System.out.println(e);}
								
							}
							else
							{
								if(et.getRowCount()==0)
									JOptionPane.showMessageDialog(null,"Empty row", "Warrning",JOptionPane.WARNING_MESSAGE);
								else{
									JOptionPane.showMessageDialog(null,"Please select the row", "Warrning",JOptionPane.WARNING_MESSAGE);
								}
							}
						}
					});
		
		et.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String EmUsername = model.getValueAt(et.getSelectedRow(), 0).toString();
				String e_password = model.getValueAt(et.getSelectedRow(), 1).toString();
				@SuppressWarnings("unused")
				String EsecQue = model.getValueAt(et.getSelectedRow(), 2).toString();
				String EAns = model.getValueAt(et.getSelectedRow(), 3).toString();
				String ECon = model.getValueAt(et.getSelectedRow(), 4).toString();
				String E_Id = model.getValueAt(et.getSelectedRow(), 5).toString();

				EmpUsername.setText(EmUsername);
				EmpPassword.setText(e_password);
				EmpConfirmPassword.setText("");
				EmpAnswer.setText(EAns);
				EmpPhoneNo.setText(ECon);
				EmpAadhaarNo.setText(E_Id);
				EmpDelete.setEnabled(true);
				EmpSave.setEnabled(false);
				
			}
		});

		// ***********************************************ENDING OF EMPLOYEE
		// DETAILS
		// PANEL******************************************************************************************************************************************************************************

		// ***********************************************BEGNNING OF ORDER
		// REPORT
		// PANEL******************************************************************************************************************************************************************************

		JPanel OrderReport = new JPanel();
		OrderReport.setBackground(Color.white);
		OrderReport.setLayout(null);
		TP.add(OrderReport);

		String Rcol[] = {"ID", "Costumer Name","Contact Number", "Amount", "Date", "Payment Method" };

		DefaultTableModel Rmodel = new DefaultTableModel();
		JTable Rt = new JTable(Rmodel);  // Ot=order table
		Rmodel.setColumnIdentifiers(Rcol);
		Rt.setRowHeight(28);
		Rt.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		JTableHeader rth = Rt.getTableHeader();					//oth= order table header
		rth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rth.setForeground(Color.white);
		rth.setBackground(new Color(28, 37, 47));
		rth.getColumnModel().getColumn(0).setMaxWidth(80);
		rth.getColumnModel().getColumn(0).setMaxWidth(80);
		
		rth.getColumnModel().getColumn(1).setMaxWidth(150);
		rth.getColumnModel().getColumn(1).setMaxWidth(150);
		
		rth.getColumnModel().getColumn(2).setMaxWidth(150);
		rth.getColumnModel().getColumn(2).setMinWidth(150);
		
		rth.getColumnModel().getColumn(3).setMaxWidth(90);
		rth.getColumnModel().getColumn(3).setMinWidth(90);
		
		rth.getColumnModel().getColumn(4).setMaxWidth(215);
		rth.getColumnModel().getColumn(4).setMinWidth(215);
		
		rth.getColumnModel().getColumn(5).setMaxWidth(150);
		rth.getColumnModel().getColumn(5).setMinWidth(150);
		
		Rt.getTableHeader().setReorderingAllowed(false);
		
		JScrollPane Rpane = new JScrollPane();
		Rpane.setViewportView(Rt);
		Rpane.setBounds(10, 5, 830, 550);
		OrderReport.add(Rpane);
		
		try {
			
			Connection con=DriverManager.getConnection(	"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1=con.createStatement();
			ResultSet res=st1.executeQuery("select * from Costumers");
			while(res.next()) {
			String Rdetails[] = {res.getString("Order_Id"), res.getString("Cos_Name"), res.getString("Cos_number"), res.getString("Amount"), res.getString("Ord_Date"),res.getString("Payment_Status") };
			Rmodel.addRow(Rdetails);
		}
			
		}catch(Exception e) {System.out.println(e);}

		
		// ***********************************************ENDING OF ORDER REPORT
		// PANEL******************************************************************************************************************************************************************************

		// ***********************************************BEGINNING OF PRODUCT
		// REPORT
		// PANEL******************************************************************************************************************************************************************************

		JPanel ProductReport = new JPanel();
		ProductReport.setBackground(Color.white);
		ProductReport.setLayout(null);
		TP.add(ProductReport);

		

		String Pcol[] = { "ID", "Product Code", "Product Name", "Brand", "Category", "Total Units", "Price" };

		DefaultTableModel Pmodel = new DefaultTableModel();
		JTable Pt = new JTable(Pmodel);

		Pmodel.setColumnIdentifiers(Pcol);
		JScrollPane Propane = new JScrollPane();
		Pt.setRowHeight(28);
		Pt.setFont(new Font("LucidaGrande", Font.PLAIN, 16));
		JTableHeader Pth = Pt.getTableHeader();
		Pth.getColumnModel().getColumn(0).setPreferredWidth(10);
		Pt.getColumnModel().getColumn(0).setPreferredWidth(10);
		Pth.setFont(new Font("LucidaGrande", Font.BOLD, 18));
		Pth.setForeground(Color.white);
		// Pt.setShowVerticalLines(false);
		Pth.setBackground(new Color(28, 37, 47));
		Pt.getTableHeader().setReorderingAllowed(false);
		Propane.setViewportView(Pt);
		Propane.setBounds(10, 5, 830, 600);
		ProductReport.add(Propane);

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1 = con.createStatement();
			ResultSet res = st1.executeQuery("Select * from Product");
			while (res.next()) {
				String ProID = res.getString("Pro_ID");
				String Pro_Code = res.getString("Product_Code");
				String Pro_Name = res.getString("Product_Name");
				String Pro_Brand = res.getString("Product_Brand");
				String Pro_category = res.getString("Product_Category");
				String Units = res.getString("Total_units");
				String Price = res.getString("Price_Per_Unit");

				String Pdetails[] = { ProID, Pro_Code, Pro_Name, Pro_Brand, Pro_category, Units, Price };

				Pmodel.addRow(Pdetails);

			}

		} catch (Exception evt) {
			System.out.println(evt);
		}

		// ***********************************************ENDING OF PRODUCT
		// REPORT
		// PANEL******************************************************************************************************************************************************************************

		// ***********************************************BEGNNING OF ADD
		// PRODUCT
		// PANEL******************************************************************************************************************************************************************************

		JPanel AddProduct = new JPanel();
		AddProduct.setBackground(Color.white);
		AddProduct.setLayout(null);
		TP.add(AddProduct);

		JLabel PAL = new JLabel("Product ID"); // PAL=Product Add Label
		PAL.setBounds(25, 10, 122, 30);
		PAL.setForeground(new Color(96, 96, 96));
		PAL.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(PAL);

		JTextField ProID = new JTextField();
		ProID.setBounds(20, 40, 200, 40);
		ProID.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		ProID.setForeground(new Color(192, 192, 192));
		ProID.setBackground(Color.white);
		ProID.setEditable(false);
		ProID.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(ProID);

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1 = con.createStatement();
			ResultSet res = st1.executeQuery("Select max(Pro_ID) from Product");
			if (res.next()) {
				int id = res.getInt(1);
				++id;
				ProID.setText(String.valueOf(id));
			}

		} catch (Exception evt) {
			System.out.println(evt);
		}

		JLabel PC = new JLabel("Product Code"); // PC=Product code
		PC.setBounds(265, 10, 122, 30);
		PC.setForeground(new Color(96, 96, 96));
		PC.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(PC);

		JTextField ProductCode = new JTextField();
		ProductCode.setBounds(260, 40, 250, 40);
		ProductCode.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		ProductCode.setForeground(new Color(192, 192, 192));
		ProductCode.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(ProductCode);

		error1 = new JLabel("  \u274C Enter the Produt Code");// Error label for
																// not enter the
																// Business name
		error1.setForeground(Color.red);
		error1.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		error1.setBounds(263, 83, 300, 15);
		error1.setVisible(false);
		AddProduct.add(error1);

		ProductCode.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ProductCode.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				error1.setVisible(false);
			}
		});

		JLabel PN = new JLabel("Product Name"); // PC=Product code
		PN.setBounds(555, 10, 122, 30);
		PN.setForeground(new Color(96, 96, 96));
		PN.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(PN);

		JTextField ProductName = new JTextField();
		ProductName.setBounds(550, 40, 250, 40);
		ProductName.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		ProductName.setForeground(new Color(192, 192, 192));
		ProductName.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(ProductName);

		error2 = new JLabel("  \u274C Enter the product name");
		error2.setForeground(Color.red);
		error2.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		error2.setBounds(553, 83, 300, 15);
		error2.setVisible(false);
		AddProduct.add(error2);

		ProductName.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ProductName.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				error2.setVisible(false);
			}
		});

		JLabel BL = new JLabel("Brand"); // BL=Brand Label
		BL.setBounds(33, 100, 122, 30);
		BL.setForeground(new Color(96, 96, 96));
		BL.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(BL);

		JComboBox Brand = new JComboBox();
		Brand.setBounds(20, 130, 250, 40);
		Brand.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		Brand.setForeground(new Color(96, 96, 96));
		Brand.setBackground(Color.white);
		Brand.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(Brand);

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1 = con.createStatement();
			ResultSet res = st1.executeQuery("select Brand_Title from Brand");
			while (res.next()) {
				Brand.addItem(res.getString(1));
			}
		} catch (Exception evt) {
			System.out.println(evt);
		}

		error3 = new JLabel("  \u274C Select the Brand");
		error3.setForeground(Color.red);
		error3.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		error3.setBounds(23, 173, 300, 15);
		error3.setVisible(false);
		AddProduct.add(error3);

		Brand.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Brand.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				error3.setVisible(false);
			}
		});

		JLabel CL = new JLabel("Category"); // CL=Category Label
		CL.setBounds(318, 100, 122, 30);
		CL.setForeground(new Color(96, 96, 96));
		CL.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(CL);

		// String category;

		JComboBox Category = new JComboBox();
		Category.setBounds(310, 130, 250, 40);
		Category.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		Category.setForeground(new Color(96, 96, 96));
		Category.setBackground(Color.white);
		Category.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(Category);

		try {
			Connection con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1 = con.createStatement();
			ResultSet res = st1.executeQuery("select Cat_Title from Category");
			while (res.next()) {
				Category.addItem(res.getString(1));
			}
		} catch (Exception evt) {
			System.out.println(evt);
		}

		error4 = new JLabel("  \u274C Select the Category");// Error label for
															// not enter the
															// Password
		error4.setForeground(Color.red);
		error4.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		error4.setBounds(313, 173, 300, 15);
		error4.setVisible(false);
		AddProduct.add(error4);

		Category.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Category.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				error4.setVisible(false);
			}
		});

		JLabel PTU = new JLabel("Total Units"); // PTU=Product total units
		PTU.setBounds(595, 100, 122, 30);
		PTU.setForeground(new Color(96, 96, 96));
		PTU.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(PTU);

		JTextField ProductUnits = new JTextField();
		ProductUnits.setBounds(590, 130, 210, 40);
		ProductUnits.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		ProductUnits.setForeground(new Color(192, 192, 192));
		ProductUnits.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(ProductUnits);

		error5 = new JLabel("  \u274C Enter the Units");// Error label for not
														// enter the confirm
														// password
		error5.setForeground(Color.red);
		error5.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		error5.setBounds(593, 173, 300, 15);
		error5.setVisible(false);
		AddProduct.add(error5);

		ProductUnits.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ProductUnits.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				error5.setVisible(false);
			}
		});

		JLabel PMnu = new JLabel("Manufacture Date"); // PMnu=Product
														// Manufacture

		PMnu.setBounds(28, 200, 170, 30);
		PMnu.setForeground(new Color(96, 96, 96));
		PMnu.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(PMnu);

		JTextField Manufacture = new JTextField();
		Manufacture.setBounds(20, 230, 250, 40);
		Manufacture.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		Manufacture.setForeground(new Color(192, 192, 192));
		Manufacture.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(Manufacture);

		JLabel PExp = new JLabel("Expire Date"); // PExp=Product Expire
		PExp.setBounds(318, 200, 170, 30);
		PExp.setForeground(new Color(96, 96, 96));
		PExp.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(PExp);

		JTextField Expire = new JTextField();
		Expire.setBounds(310, 230, 250, 40);
		Expire.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		Expire.setForeground(new Color(192, 192, 192));
		Expire.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(Expire);

		JLabel PP = new JLabel("Price Per Unit"); // PP=Product Price
		PP.setBounds(595, 200, 122, 30);
		PP.setForeground(new Color(96, 96, 96));
		PP.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(PP);

		JTextField Price = new JTextField();
		Price.setBounds(590, 230, 210, 40);
		Price.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		Price.setForeground(new Color(192, 192, 192));
		Price.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		AddProduct.add(Price);

		error9 = new JLabel("  \u274C Enter the Price");// Error label for not
														// enter the select
														// question
		error9.setForeground(Color.red);
		error9.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		error9.setBounds(593, 273, 300, 15);
		error9.setVisible(false);
		AddProduct.add(error9);

		Price.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Price.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				error9.setVisible(false);
			}
		});

		JLabel PD = new JLabel("Description"); // PD=Product Description
		PD.setBounds(25, 285, 122, 30);
		PD.setForeground(new Color(96, 96, 96));
		PD.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		AddProduct.add(PD);

		JTextArea ProductDescription = new JTextArea();
		ProductDescription.setFont(new Font("LucidaGrande", Font.PLAIN, 22));
		ProductDescription.setBounds(20, 320, 780, 200);
		ProductDescription.setForeground(new Color(192, 192, 192));
		ProductDescription.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		AddProduct.add(ProductDescription);

		JButton ProSave = new JButton("Save");
		ProSave.setBounds(330, 528, 150, 33);
		ProSave.setBackground(new Color(0, 128, 255));
		ProSave.setForeground(Color.white);
		ProSave.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		AddProduct.add(ProSave);

		ProSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (ProductCode.getText().length() == 0) {
					ProductCode.setBorder(BorderFactory.createLineBorder(Color.red));
					error1.setVisible(true);
				}

				 if(Manufacture.getText().length()==0||Expire.getText().length()==0)
				  {Manufacture.setText("N/A"); Expire.setText("N/A"); }

				else if (ProductName.getText().length() == 0) {
					ProductName.setBorder(BorderFactory.createLineBorder(Color.red));
					error2.setVisible(true);
				} else if (Brand.getItemAt(Brand.getSelectedIndex()) == Brand.getItemAt(0)) {
					Brand.setBorder(BorderFactory.createLineBorder(Color.red));
					error3.setVisible(true);
				} else if (Category.getItemAt(Category.getSelectedIndex()) == Category.getItemAt(0)) {
					Category.setBorder(BorderFactory.createLineBorder(Color.red));
					error4.setVisible(true);
				} else if (ProductUnits.getText().length() == 0) {
					ProductUnits.setBorder(BorderFactory.createLineBorder(Color.red));
					error5.setVisible(true);
				} else if (Price.getText().length() == 0) {
					Price.setBorder(BorderFactory.createLineBorder(Color.red));
					error9.setVisible(true);
				}

				else {
					try {
						Connection con = DriverManager.getConnection(
								"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Statement st1 = con.createStatement();
						int i = st1.executeUpdate(
								"insert into Product(Pro_ID, Product_Code, Product_Name, Product_Brand, Product_Category, Total_Units, Manufacture_Date, Expire_Date, Price_Per_Unit) values('"
										+ ProID.getText() + "', '" + ProductCode.getText() + "', '"
										+ ProductName.getText() + "', '" + Brand.getSelectedItem().toString() + "', '"
										+ Category.getSelectedItem().toString() + "', '" + ProductUnits.getText()
										+ "', '" + Manufacture.getText() + "', '" + Expire.getText() + "', '"
										+ Price.getText() + "') ");
						if (i > 0) {

							ImageIcon ig1 = new ImageIcon(
									"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
							JOptionPane.showMessageDialog(null, "Product add successfully.", "Done",
									JOptionPane.INFORMATION_MESSAGE, ig1);
							ResultSet res = st1.executeQuery("Select max(Pro_ID) from Product");
							if (res.next()) {
								int id = res.getInt(1);
								++id;
								ProID.setText(String.valueOf(id));
							}
							ProductCode.setText("");
							ProductName.setText("");
							ProductUnits.setText("");
							Price.setText("");
							Manufacture.setText("");
							Expire.setText("");
							Brand.setSelectedIndex(0);
							Category.setSelectedIndex(0);

						}

					} catch (Exception evt) {
						System.out.print(evt);
					}
				}
			}
		});

		// ***********************************************ENDING OF ADD PRODUCT
		// PANEL******************************************************************************************************************************************************************************

		// ***********************************************BEGNNING OF CATEGORY
		// PANEL******************************************************************************************************************************************************************************

		JPanel CATEGORYPanel = new JPanel();
		CATEGORYPanel.setBackground(Color.white);
		CATEGORYPanel.setLayout(null);
		TP.add(CATEGORYPanel);

		JLabel CateText1 = new JLabel("Add Category");
		CateText1.setBounds(20, 0, 750, 80);
		CateText1.setForeground(Color.red);
		CateText1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		CATEGORYPanel.add(CateText1);

		JSeparator CateSeP1 = new JSeparator();
		CateSeP1.setBounds(15, 60, 770, 1);
		CateSeP1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		CATEGORYPanel.add(CateSeP1);

		JLabel CateCode = new JLabel("Category ID"); // ProCode=Product Code
		CateCode.setBounds(30, 70, 150, 30);
		CateCode.setForeground(new Color(96, 96, 96));
		CateCode.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		CATEGORYPanel.add(CateCode);

		JTextField CategoryID = new JTextField();
		CategoryID.setFont(new Font("LucidaGrande", Font.PLAIN, 22));
		CategoryID.setBounds(20, 100, 150, 35);
		CategoryID.setEditable(false);
		CategoryID.setBackground(new Color(255, 255, 255));
		CategoryID.setForeground(new Color(192, 192, 192));
		CategoryID.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		CATEGORYPanel.add(CategoryID);

		try {

			Connection con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1 = con.createStatement();
			ResultSet res1 = st1.executeQuery("select max(Cat_ID) from Category");
			if (res1.next()) {
				int catID = res1.getInt(1);
				++catID;
				CategoryID.setText(String.valueOf(catID));

			}
		} catch (Exception evt) {
			System.out.println(evt);
		}

		JLabel CateT = new JLabel("Category Title"); // CateT= Category title
		CateT.setBounds(210, 70, 150, 30);
		CateT.setForeground(new Color(96, 96, 96));
		CateT.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		CATEGORYPanel.add(CateT);

		JTextField CategoryTitle = new JTextField();
		CategoryTitle.setFont(new Font("LucidaGrande", Font.PLAIN, 22));
		CategoryTitle.setBounds(200, 100, 200, 35);
		CategoryTitle.setForeground(new Color(192, 192, 192));
		CategoryTitle.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		CATEGORYPanel.add(CategoryTitle);

		JLabel Cerror1 = new JLabel("  \u274C Enter the Brand Name");// Error
																		// label
																		// for
																		// not
																		// enter
																		// the
																		// Business
																		// name
		Cerror1.setForeground(Color.red);
		Cerror1.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		Cerror1.setBounds(203, 138, 300, 15);
		Cerror1.setVisible(false);
		CATEGORYPanel.add(Cerror1);

		CategoryTitle.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				CategoryTitle.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				Cerror1.setVisible(false);
			}
		});

		JLabel CateDes = new JLabel("Description"); // CateDes= Category
													// Description
		CateDes.setBounds(30, 150, 150, 30);
		CateDes.setForeground(new Color(96, 96, 96));
		CateDes.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		CATEGORYPanel.add(CateDes);

		JTextArea CategoryDescription = new JTextArea();
		CategoryDescription.setFont(new Font("LucidaGrande", Font.PLAIN, 22));
		CategoryDescription.setBounds(20, 185, 380, 250);
		CategoryDescription.setForeground(new Color(192, 192, 192));
		CategoryDescription.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		CATEGORYPanel.add(CategoryDescription);

		JSeparator CateSeP2 = new JSeparator(JSeparator.VERTICAL);
		CateSeP2.setBounds(415, 60, 1, 560);
		CateSeP2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		CATEGORYPanel.add(CateSeP2);

		JLabel CateRep = new JLabel("Category Report"); // CateRep= Category
														// Report
		CateRep.setBounds(430, 70, 150, 30);
		CateRep.setForeground(new Color(96, 96, 96));
		CateRep.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		CATEGORYPanel.add(CateRep);
		
		
		// starting of Category table
		
		
		DefaultTableModel Catmodel = new DefaultTableModel();  // catmodel =category table
		String Catcol[] = {"ID","Name","Description" };
		JTable ct = new JTable(Catmodel);  // ct = Category Table
		ct.setRowHeight(30);
		Catmodel.setColumnIdentifiers(Catcol);
		JTableHeader cth = ct.getTableHeader();    // cth = category table header
		cth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cth.setForeground(Color.white);
		cth.setBackground(new Color(28, 37, 47));
		cth.getColumnModel().getColumn(0).setMaxWidth(70);
		cth.getColumnModel().getColumn(1).setMaxWidth(200);
		cth.getColumnModel().getColumn(1).setMinWidth(200);
		
		ct.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		ct.getTableHeader().setReorderingAllowed(false);
		JScrollPane Catpane = new JScrollPane();
		Catpane.setViewportView(ct);
		Catpane.setBounds(430,105,400,500);
		CATEGORYPanel.add(Catpane);
		
		
		try {
			Connection con= DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1=con.createStatement();
			ResultSet res= st1.executeQuery("Select * from Category"); {
				while(res.next()) {
					String CatID=res.getString("Cat_ID");
					String CatName=res.getString("Cat_Title");
					String CatDes=res.getString("Cat_Description");
					
					String CatDetails[]= {CatID, CatName,CatDes};
					Catmodel.addRow(CatDetails);
				}
			}
			
			
		}catch(Exception e) {System.out.println(e);}
		
		// Ending of Category table
		
		

		JButton CateSave = new JButton("Save");
		CateSave.setBounds(40, 455, 150, 33);
		CateSave.setBackground(new Color(0, 128, 255));
		CateSave.setForeground(Color.white);
		CateSave.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		CATEGORYPanel.add(CateSave);

		CateSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (CategoryTitle.getText().length() == 0) {
					CategoryTitle.setBorder(BorderFactory.createLineBorder(Color.red));
					Cerror1.setVisible(true);
				} else {
					try {

						Connection con = DriverManager.getConnection(
								"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Statement st = con.createStatement();
						int i = st.executeUpdate("insert into Category(Cat_ID,Cat_Title) values('"
								+ CategoryID.getText() + "','" + CategoryTitle.getText() + "')");
						if (i > 0) {
							ImageIcon ig1 = new ImageIcon(
									"C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
							JOptionPane.showMessageDialog(null, "Category add successfully.", "Done",JOptionPane.INFORMATION_MESSAGE, ig1);
							Catmodel.addRow(new Object[] {CategoryID.getText(),CategoryTitle.getText()});
							
							ResultSet res1 = st.executeQuery("select max(Cat_ID) from Category");
							if (res1.next()) {
								int catID = res1.getInt(1);
								++catID;
								CategoryID.setText(String.valueOf(catID));
								CategoryTitle.setText("");

							}

						}

					} catch (Exception evt) {
						System.out.println(evt);
					}

				}
			}
		});

		JButton CateEdit = new JButton("Edit");
		CateEdit.setBounds(220, 455, 150, 33);
		CateEdit.setBackground(new Color(0, 128, 255));
		CateEdit.setForeground(Color.white);
		CateEdit.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		CATEGORYPanel.add(CateEdit);
		CateEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(ct.getSelectedRowCount()==1) {
					Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
					Statement st=con.createStatement();
					int i=st.executeUpdate("update Category set Cat_Title='"+CategoryTitle.getText()+"' where Cat_ID='"+CategoryID.getText()+"' ");
					if(i>0) {
						
						
						int j=ct.getSelectedRow();
						if(j>=0) {
							Catmodel.setValueAt(CategoryTitle.getText(), j, 1);
					        JOptionPane.showMessageDialog(null, "Category Edit successfully.", "Done",JOptionPane.INFORMATION_MESSAGE);
					        
					        CategoryTitle.setText(null);
					        ResultSet res1 = st.executeQuery("select max(Cat_ID) from Category");
							if (res1.next()) {
								int catID = res1.getInt(1);
								++catID;
								CategoryID.setText(String.valueOf(catID));
								CateSave.setEnabled(true);
											}
										}
					  				}				
						
					}
					else
					{
							if(ct.getRowCount()==0)
								JOptionPane.showMessageDialog(null,"Empty row", "Warrning",JOptionPane.WARNING_MESSAGE);
							else	
							    JOptionPane.showMessageDialog(null,"Please select the row", "Warrning",JOptionPane.WARNING_MESSAGE);
				
					}
					
					
					
				}catch(Exception ev) {System.out.println(ev); }
				
			}
		});
			

		JButton CateDelete = new JButton("Delete");
		CateDelete.setBounds(130, 510, 150, 33);
		CateDelete.setBackground(Color.red);
		CateDelete.setForeground(Color.white);
		CateDelete.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		CATEGORYPanel.add(CateDelete);
		CateDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ct.getSelectedRowCount()==1) {
					try {
							Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
							Statement st=con.createStatement();
							int i=st.executeUpdate("Delete from Category where Cat_ID='"+CategoryID.getText()+"'");
							if(i>0)  {
								Catmodel.removeRow(ct.getSelectedRow());
								JOptionPane.showMessageDialog(null,"Category Deleted", "Warrning",JOptionPane.INFORMATION_MESSAGE);
								 CategoryTitle.setText(null);
							        ResultSet res1 = st.executeQuery("select max(Cat_ID) from Category");
									if (res1.next()) {
										int catID = res1.getInt(1);
										++catID;
										CategoryID.setText(String.valueOf(catID));
										CateSave.setEnabled(true);
							    	}
								}
						}
						catch(Exception ev) {System.out.println(ev);}
					
					}
					else
						{
								if(ct.getRowCount()==0)
									JOptionPane.showMessageDialog(null,"Empty row", "Warrning",JOptionPane.WARNING_MESSAGE);
								else	
								    JOptionPane.showMessageDialog(null,"Please select the row", "Warrning",JOptionPane.WARNING_MESSAGE);
					
				}
			}
		});
		
		ct.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String empid = Catmodel.getValueAt(ct.getSelectedRow(), 0).toString();
				String CateName=Catmodel.getValueAt(ct.getSelectedRow(), 1).toString();
				CategoryID.setText(empid);
				CategoryTitle.setText(CateName);
				CateSave.setEnabled(false);
				
			}
		});

		// ***********************************************ENDING OF CATEGORY
		// PANEL******************************************************************************************************************************************************************************

		// ***********************************************BEGNNING OF BRAND
		// PANEL******************************************************************************************************************************************************************************

		JPanel BrandPanel = new JPanel();
		BrandPanel.setBackground(Color.white);
		BrandPanel.setLayout(null);
		TP.add(BrandPanel);

		JLabel BrandText1 = new JLabel("Add Brand");
		BrandText1.setBounds(20, 0, 750, 80);
		BrandText1.setForeground(Color.red);
		BrandText1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		BrandPanel.add(BrandText1);

		JSeparator BrandSeP1 = new JSeparator();
		BrandSeP1.setBounds(15, 60, 770, 1);
		BrandSeP1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		BrandPanel.add(BrandSeP1);

		JLabel BrandCode = new JLabel("Brand ID"); // ProCode=Product Code
		BrandCode.setBounds(30, 70, 150, 30);
		BrandCode.setForeground(new Color(96, 96, 96));
		BrandCode.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BrandPanel.add(BrandCode);

		JTextField BrandID = new JTextField();
		BrandID.setFont(new Font("LucidaGrande", Font.PLAIN, 22));
		BrandID.setBounds(20, 100, 150, 35);
		BrandID.setEditable(false);
		BrandID.setBackground(new Color(255, 255, 255));
		BrandID.setForeground(new Color(192, 192, 192));
		BrandID.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		BrandPanel.add(BrandID);

		try {

			Connection con = DriverManager.getConnection(
					"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1 = con.createStatement();
			ResultSet res1 = st1.executeQuery("select max(Brand_ID) from Brand");
			if (res1.next()) {
				int BID = res1.getInt(1);
				++BID;
				BrandID.setText(String.valueOf(BID));

			}
		} catch (Exception evt) {
			System.out.println(evt);
		}

		JLabel BrandT = new JLabel("Brand Title"); // CateT= Category title
		BrandT.setBounds(210, 70, 150, 30);
		BrandT.setForeground(new Color(96, 96, 96));
		BrandT.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BrandPanel.add(BrandT);

		JTextField BrandTitle = new JTextField();
		BrandTitle.setFont(new Font("LucidaGrande", Font.PLAIN, 22));
		BrandTitle.setBounds(200, 100, 200, 35);
		BrandTitle.setForeground(new Color(192, 192, 192));
		BrandTitle.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		BrandPanel.add(BrandTitle);

		JLabel Berror1 = new JLabel("  \u274C Enter the Brand Name");
		Berror1.setForeground(Color.red);
		Berror1.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		Berror1.setBounds(203, 138, 300, 15);
		Berror1.setVisible(false);
		BrandPanel.add(Berror1);

		BrandTitle.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				BrandTitle.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				Berror1.setVisible(false);
			}
		});

		JLabel BrandDes = new JLabel("Description"); // CateDes= Category
														// Description
		BrandDes.setBounds(30, 150, 150, 30);
		BrandDes.setForeground(new Color(96, 96, 96));
		BrandDes.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BrandPanel.add(BrandDes);

		JTextArea BrandDescription = new JTextArea();
		BrandDescription.setFont(new Font("LucidaGrande", Font.PLAIN, 22));
		BrandDescription.setBounds(20, 185, 380, 250);
		BrandDescription.setForeground(new Color(192, 192, 192));
		BrandDescription.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		BrandPanel.add(BrandDescription);

		JSeparator BrandSeP2 = new JSeparator(JSeparator.VERTICAL);
		BrandSeP2.setBounds(415, 60, 1, 560);
		BrandSeP2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		BrandPanel.add(BrandSeP2);

		JLabel BrandRep = new JLabel("Brand Report"); // CateRep= Category
														// Report
		BrandRep.setBounds(430, 70, 150, 30);
		BrandRep.setForeground(new Color(96, 96, 96));
		BrandRep.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BrandPanel.add(BrandRep);
		
		
		//BrandTable starting 
		
		DefaultTableModel Brandmodel = new DefaultTableModel();  // catmodel =category table
		String Bcol[] = {"ID","Name","Description" };
		JTable Bt = new JTable(Brandmodel);  // Bt = Brand Table
		Bt.setRowHeight(30);
		Brandmodel.setColumnIdentifiers(Bcol);
		JTableHeader bth = Bt.getTableHeader();    // bth = Brand table header
		bth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		bth.setForeground(Color.white);
		bth.setBackground(new Color(28, 37, 47));
		bth.getColumnModel().getColumn(0).setMaxWidth(70);
		bth.getColumnModel().getColumn(1).setMaxWidth(200);
		bth.getColumnModel().getColumn(1).setMinWidth(200);
		
		Bt.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		Bt.getTableHeader().setReorderingAllowed(false);
		JScrollPane Brandpane = new JScrollPane();
		Brandpane.setViewportView(Bt);
		Brandpane.setBounds(430,105,400,500);
		BrandPanel.add(Brandpane);
		
		
		try {
			Connection con= DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1=con.createStatement();
			ResultSet res= st1.executeQuery("Select * from Brand"); {
				while(res.next()) {
					String BID=res.getString("Brand_ID");
					String BName=res.getString("Brand_Title");
					String BDes=res.getString("Brand_Description");
					
					String BDetails[]= {BID, BName,BDes};
					Brandmodel.addRow(BDetails);
				}
			}
			
			
		}catch(Exception e) {System.out.println(e);}
		
		//BrandTable Ending

		JButton BrandSave = new JButton("Save");
		BrandSave.setBounds(40, 455, 150, 33);
		BrandSave.setBackground(new Color(0, 128, 255));
		BrandSave.setForeground(Color.white);
		BrandSave.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		BrandPanel.add(BrandSave);

		BrandSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (BrandTitle.getText().length() == 0) {
					BrandTitle.setBorder(BorderFactory.createLineBorder(Color.red));
					Berror1.setVisible(true);
				} else {
					try {

						Connection con = DriverManager.getConnection(
								"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Statement st = con.createStatement();
						int i = st.executeUpdate("insert into Brand(Brand_ID,Brand_Title) values('" + BrandID.getText()
								+ "','" + BrandTitle.getText() + "')");
						if (i > 0) {
							ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
							JOptionPane.showMessageDialog(null, "Brand add successfully.", "Done",JOptionPane.INFORMATION_MESSAGE, ig1);
							ResultSet res1 = st.executeQuery("select max(Brand_ID) from Brand");
							if (res1.next()) {
								Brandmodel.addRow(new Object[] {BrandID.getText(),BrandTitle.getText()});
								int BID = res1.getInt(1);
								++BID;
								BrandID.setText(String.valueOf(BID));
								BrandTitle.setText("");

							}

						}

					} catch (Exception evt) {
						System.out.println(evt);
					}

				}

			}
		});

		JButton BrandEdit = new JButton("Edit");
		BrandEdit.setBounds(220, 455, 150, 33);
		BrandEdit.setBackground(new Color(0, 128, 255));
		BrandEdit.setForeground(Color.white);
		BrandEdit.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		BrandPanel.add(BrandEdit);
		BrandEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(Bt.getSelectedRowCount()==1) {
					Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
					Statement st=con.createStatement();
					int i=st.executeUpdate("update Brand set Brand_Title='"+BrandTitle.getText()+"' where Brand_ID='"+BrandID.getText()+"' ");
					if(i>0) {
						
						
						int j=Bt.getSelectedRow();
						if(j>=0) {
							Brandmodel.setValueAt(BrandTitle.getText(), j, 1);
					        JOptionPane.showMessageDialog(null, "Brand add successfully.", "Done",JOptionPane.INFORMATION_MESSAGE);
					        
					        BrandTitle.setText(null);
					        ResultSet res1 = st.executeQuery("select max(Brand_ID) from Brand");
							if (res1.next()) {
								int BID = res1.getInt(1);
								++BID;
								BrandID.setText(String.valueOf(BID));
								BrandSave.setEnabled(true);
											}
						}
						else
						{
							if(et.getRowCount()==0)
								JOptionPane.showMessageDialog(null,"Empty row", "Warrning",JOptionPane.WARNING_MESSAGE);
							else{
								JOptionPane.showMessageDialog(null,"Please select the row", "Warrning",JOptionPane.WARNING_MESSAGE);
							}
						}
					}
				}
					{
						if(et.getRowCount()==0)
							JOptionPane.showMessageDialog(null,"Empty row", "Warrning",JOptionPane.WARNING_MESSAGE);
						else{
							JOptionPane.showMessageDialog(null,"Please select the row", "Warrning",JOptionPane.WARNING_MESSAGE);
						}
					}
				
			 }
				catch(Exception ev) {System.out.println(ev); }
				
			
				
				
			}
		});
		JButton BrandDelete = new JButton("Delete");
		BrandDelete.setBounds(130, 510, 150, 33);
		BrandDelete.setBackground(Color.red);
		BrandDelete.setForeground(Color.white);
		BrandDelete.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		BrandPanel.add(BrandDelete);
		BrandDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				if(Bt.getSelectedRowCount()==1) {
					try {
					Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
					Statement st=con.createStatement();
					int i=st.executeUpdate("Delete from Brand where Brand_ID='"+BrandID.getText()+"'");
					if(i>0)  {
					Brandmodel.removeRow(Bt.getSelectedRow());
					JOptionPane.showMessageDialog(null,"Row Deleted", "Warrning",JOptionPane.INFORMATION_MESSAGE);
					
					 BrandTitle.setText(null);
				        ResultSet res1 = st.executeQuery("select max(Brand_ID) from Brand");
						if (res1.next()) {
							int BID = res1.getInt(1);
							++BID;
							BrandID.setText(String.valueOf(BID));
							BrandSave.setEnabled(true);
							BrandSave.setEnabled(true);
						}
					}
					}
					catch(Exception e) {System.out.println(e);}
					
				}
				else
				{
					if(et.getRowCount()==0)
						JOptionPane.showMessageDialog(null,"Empty row", "Warrning",JOptionPane.WARNING_MESSAGE);
					else{
						JOptionPane.showMessageDialog(null,"Please select the row", "Warrning",JOptionPane.WARNING_MESSAGE);
					}
				}
				
			}
		});
		
		
		Bt.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				String bid = Brandmodel.getValueAt(Bt.getSelectedRow(), 0).toString();
				String bName = Brandmodel.getValueAt(Bt.getSelectedRow(), 1).toString();
				BrandID.setText(bid);
				BrandTitle.setText(bName);
				BrandSave.setEnabled(false);
				
			}
		});
		// ***********************************************ENDING OF BRAND
		// PANEL******************************************************************************************************************************************************************************

		// ***********************************************BEGNNING OF BORROWER
		// PANEL******************************************************************************************************************************************************************************

		JPanel BorrowerPanel = new JPanel();
		BorrowerPanel.setBackground(Color.white);
		BorrowerPanel.setLayout(null);
		TP.add(BorrowerPanel);

		JLabel BorrowerPanelText1 = new JLabel("Borrower");
		BorrowerPanelText1.setBounds(20, 0, 750, 80);
		BorrowerPanelText1.setForeground(Color.red);
		BorrowerPanelText1.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		BorrowerPanel.add(BorrowerPanelText1);

		JSeparator BorrowerSeP1 = new JSeparator();
		BorrowerSeP1.setBounds(15, 60, 770, 1);
		BorrowerSeP1.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		BorrowerPanel.add(BorrowerSeP1);

		JLabel BID = new JLabel("Borrower ID"); // BID= Borrower ID
		BID.setBounds(35, 65, 122, 30);
		BID.setForeground(new Color(96, 96, 96));
		BID.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BorrowerPanel.add(BID);

		JTextField BorrowerID = new JTextField();
		BorrowerID.setBounds(30, 95, 200, 40);
		BorrowerID.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		BorrowerID.setBackground(Color.white);
		BorrowerID.setForeground(new Color(192, 192, 192));
		BorrowerID.setEditable(false);
		BorrowerID.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		BorrowerPanel.add(BorrowerID);

		try {
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1 = con.createStatement();
			ResultSet rus = st1.executeQuery("select max(Bor_ID) from Borrower");
			if (rus.next()) {
				int BorId = rus.getInt(1);
				++BorId;
				BorrowerID.setText(String.valueOf(BorId));
			}
		} catch (Exception evt) {
			System.out.println(evt);
		}

		JLabel BN = new JLabel("Full Name"); // BN= Borrower Name
		BN.setBounds(275, 65, 152, 30);
		BN.setForeground(new Color(96, 96, 96));
		BN.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BorrowerPanel.add(BN);

		JTextField BorrowerName = new JTextField();
		BorrowerName.setBounds(270, 95, 220, 40);
		BorrowerName.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		BorrowerName.setForeground(new Color(192, 192, 192));
		BorrowerName.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		BorrowerPanel.add(BorrowerName);

		JLabel B1error = new JLabel("  \u274C Enter the Name");
		B1error.setForeground(Color.red);
		B1error.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		B1error.setBounds(273, 138, 300, 15);
		B1error.setVisible(false);
		BorrowerPanel.add(B1error);

		BorrowerName.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				BorrowerName.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				B1error.setVisible(false);
			}
		});

		JLabel BNum = new JLabel("Contact Number"); // BNum= Borrower Number
		BNum.setBounds(550, 65, 152, 30);
		BNum.setForeground(new Color(96, 96, 96));
		BNum.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BorrowerPanel.add(BNum);

		JTextField BorrowerNumber = new JTextField();
		BorrowerNumber.setBounds(540, 95, 220, 40);
		BorrowerNumber.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		BorrowerNumber.setForeground(new Color(192, 192, 192));
		BorrowerNumber.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		BorrowerPanel.add(BorrowerNumber);

		JLabel B2error = new JLabel("  \u274C Enter contact number");
		B2error.setForeground(Color.red);
		B2error.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		B2error.setBounds(543, 138, 300, 15);
		B2error.setVisible(false);
		BorrowerPanel.add(B2error);

		BorrowerPanel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				BorrowerPanel.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				B2error.setVisible(false);
			}
		});
		JLabel BPA = new JLabel("Pay Amount"); // BPA= Borrower Pay Amount
		BPA.setBounds(35, 150, 152, 30);
		BPA.setForeground(new Color(96, 96, 96));
		BPA.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BorrowerPanel.add(BPA);

		JTextField PayAmount = new JTextField();
		PayAmount.setBounds(30, 180, 200, 40);
		PayAmount.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		PayAmount.setForeground(new Color(192, 192, 192));
		PayAmount.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		BorrowerPanel.add(PayAmount);

		JLabel B3error = new JLabel("  \u274C Enter the amount");
		B3error.setForeground(Color.red);
		B3error.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		B3error.setBounds(33, 223, 300, 15);
		B3error.setVisible(false);
		BorrowerPanel.add(B3error);

		PayAmount.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				PayAmount.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				B3error.setVisible(false);
			}
		});

		JLabel BDA = new JLabel("Due Amount"); // BDA= Borrower Due Amount
		BDA.setBounds(275, 150, 152, 30);
		BDA.setForeground(new Color(96, 96, 96));
		BDA.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BorrowerPanel.add(BDA);

		JTextField DueAmount = new JTextField();
		DueAmount.setBounds(270, 180, 220, 40);
		DueAmount.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		DueAmount.setForeground(new Color(192, 192, 192));
		DueAmount.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		BorrowerPanel.add(DueAmount);

		JLabel B4error = new JLabel("  \u274C Enter the due amount");
		B4error.setForeground(Color.red);
		B4error.setFont(new Font("LucidaGrande", Font.PLAIN, 11));
		B4error.setBounds(273, 223, 300, 15);
		B4error.setVisible(false);
		BorrowerPanel.add(B4error);

		DueAmount.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				DueAmount.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
				B4error.setVisible(false);
			}
		});

		JLabel DOPA = new JLabel("Last Date of Due Amount"); // DOPA= Date of
																// pay amount
		DOPA.setBounds(540, 150, 200, 30);
		DOPA.setForeground(new Color(96, 96, 96));
		DOPA.setFont(new Font("LucidaGrande", Font.BOLD, 17));
		BorrowerPanel.add(DOPA);

		JTextField LastDate = new JTextField();
		LastDate.setBounds(540, 180, 220, 40);
		LastDate.setText("");
		LastDate.setBorder(BorderFactory.createLineBorder(new Color(179, 179, 179)));
		LastDate.setForeground(new Color(192, 192, 192));
		LastDate.setFont(new Font("LucidaGrande", Font.PLAIN, 17));
		BorrowerPanel.add(LastDate);

		JLabel BR = new JLabel("Borrower Records");// Borrower Report
		BR.setBounds(20, 210, 750, 80);
		BR.setForeground(Color.red);
		BR.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		BorrowerPanel.add(BR);

		JSeparator BorrowerReport = new JSeparator();
		BorrowerReport.setBounds(15, 270, 770, 1);
		BorrowerReport.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 1));
		BorrowerPanel.add(BorrowerReport);
		
		
		
		DefaultTableModel Bromodel = new DefaultTableModel();  // Bromodel =Borrower table
		String Brocol[] = {"ID","Name","Contact No.","Pay Amount"," Due Amount", "Last Payable Data" };
		JTable Brot = new JTable(Bromodel);  // Brot = Borrower Table
		Brot.setRowHeight(30);
		Bromodel.setColumnIdentifiers(Brocol);
		JTableHeader brth = Brot.getTableHeader();    // brth = Borrower table header
		brth.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		brth.setForeground(Color.white);
		brth.setBackground(new Color(28, 37, 47));
		
		brth.getColumnModel().getColumn(0).setMaxWidth(80);
		
		brth.getColumnModel().getColumn(2).setMaxWidth(120);
		brth.getColumnModel().getColumn(2).setMinWidth(120);
		
		brth.getColumnModel().getColumn(3).setMaxWidth(115);
		brth.getColumnModel().getColumn(3).setMinWidth(115);
		
		brth.getColumnModel().getColumn(4).setMaxWidth(115);
		brth.getColumnModel().getColumn(4).setMinWidth(115);
		
		Brot.setFont(new Font("LucidaGrande", Font.PLAIN, 16));
		Brot.getTableHeader().setReorderingAllowed(false);
		JScrollPane Borrowerpane = new JScrollPane();
		Borrowerpane.setViewportView(Brot);
		Borrowerpane.setBounds(20,280,770,200);
		BorrowerPanel.add(Borrowerpane);
		
		try {
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
			Statement st1=con.createStatement();
			ResultSet res=st1.executeQuery("select * from Borrower");
			while(res.next())
			{
				String BroID=res.getString("Bor_ID");
				String BroName=res.getString("Bor_Name");
				String BroContact=res.getString("Contact_No");
				String PA=res.getString("PayAmount");
				String DA=res.getString("DueAmount");
				String BLastDate=res.getString("LastPayableDate");
				
				Bromodel.addRow(new Object[] {BroID, BroName, BroContact, PA,DA,BLastDate});
				
			}
			
		}
		catch(Exception e) {System.out.println(e); }
		

		JButton BorrowerSave = new JButton("Save");
		BorrowerSave.setBounds(50, 520, 150, 33);
		BorrowerSave.setBackground(new Color(0, 128, 255));
		BorrowerSave.setForeground(Color.white);
		BorrowerSave.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		BorrowerPanel.add(BorrowerSave);

		BorrowerSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (BorrowerName.getText().length() == 0) {
					BorrowerName.setBorder(BorderFactory.createLineBorder(Color.red));
					B1error.setVisible(true);
				} else if (BorrowerNumber.getText().length() == 0) {
					BorrowerNumber.setBorder(BorderFactory.createLineBorder(Color.red));
					B2error.setVisible(true);
				} else if (PayAmount.getText().length() == 0) {
					PayAmount.setBorder(BorderFactory.createLineBorder(Color.red));
					B3error.setVisible(true);
				} else if (DueAmount.getText().length() == 0) {
					DueAmount.setBorder(BorderFactory.createLineBorder(Color.red));
					B4error.setVisible(true);
				} else {
					try {

						Connection con = DriverManager.getConnection(
								"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Statement st1 = con.createStatement();
						int i = st1.executeUpdate("insert into Borrower(Bor_ID,Bor_Name,Contact_No,PayAmount,DueAmount,LastPayableDate) values('"+ BorrowerID.getText() + "','" + BorrowerName.getText() + "','"+ BorrowerNumber.getText() + "', '" + PayAmount.getText() + "', '"+ DueAmount.getText() + "','" + LastDate.getText() + "')");
						if (i > 0)
									{
									
										ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
										JOptionPane.showMessageDialog(null, "Borrwer added successfully.", "Done",JOptionPane.INFORMATION_MESSAGE, ig1);
										Bromodel.addRow(new Object[] {BorrowerID.getText(),BorrowerName.getText(),BorrowerNumber.getText(),PayAmount.getText(),DueAmount.getText(),LastDate.getText() });
										ResultSet rus = st1.executeQuery("select max(Bor_ID) from Borrower");
										if (rus.next()) {
											int BorId = rus.getInt(1);
											++BorId;
											BorrowerID.setText(String.valueOf(BorId));
											
											BorrowerName.setText("");
											BorrowerNumber.setText("");
											PayAmount.setText("");
											DueAmount.setText("");
											LastDate.setText("");
									
									
							
							}
							
						}
					} catch (Exception evt) {
						System.out.println(evt);
					}

				}
			}
		});

		JButton BorrowerEdit = new JButton("Edit");
		BorrowerEdit.setBounds(250, 520, 150, 33);
		BorrowerEdit.setBackground(new Color(0, 128, 255));
		BorrowerEdit.setForeground(Color.white);
		BorrowerEdit.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		BorrowerPanel.add(BorrowerEdit);
		BorrowerEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(Brot.getSelectedRowCount()==1) {
					Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
					Statement st=con.createStatement();
					int i=st.executeUpdate("update Borrower set Bor_Name='"+BorrowerName.getText()+"', Contact_No='"+BorrowerNumber.getText()+"', PayAmount='"+PayAmount.getText()+"', DueAmount='"+DueAmount.getText()+"', LastPayableDate= '"+LastDate.getText()+"' where Bor_ID ='"+BorrowerID.getText()+"' ");
					if(i>0) {
						int j=Brot.getSelectedRow();
						if(j>=0) {
							Bromodel.setValueAt(BorrowerName.getText(), j, 1);
							Bromodel.setValueAt(BorrowerNumber.getText(), j, 2);
							Bromodel.setValueAt(PayAmount.getText(), j, 3);
							Bromodel.setValueAt(DueAmount.getText(), j, 4);
							Bromodel.setValueAt(LastDate.getText(), j, 5);
							ImageIcon ig1 = new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
							JOptionPane.showMessageDialog(null, "Borrwer details updated successfully.", "Done",JOptionPane.INFORMATION_MESSAGE, ig1);
							
							ResultSet rus = st.executeQuery("select max(Bor_ID) from Borrower");
							if (rus.next()) {
								int BorId = rus.getInt(1);
								++BorId;
								BorrowerID.setText(String.valueOf(BorId));
								
								BorrowerName.setText("");
								BorrowerNumber.setText("");
								PayAmount.setText("");
								DueAmount.setText("");
								LastDate.setText("");
							} 
							BorrowerSave.setEnabled(true);
							Brot.removeRowSelectionInterval(j, 0);
						}
						
					}
					
				}	
					else
					{
							if(Brot.getRowCount()==0)
								JOptionPane.showMessageDialog(null,"Empty row", "Warrning",JOptionPane.WARNING_MESSAGE);
							else	
						    JOptionPane.showMessageDialog(null,"Please select the row", "Warrning",JOptionPane.WARNING_MESSAGE);		
					}
					
				} catch(Exception ev) {System.out.print(ev);}
				
			}
			
		});

		JButton BorrowerDelete = new JButton("Delete");
		BorrowerDelete.setBounds(450, 520, 150, 33);
		BorrowerDelete.setBackground(Color.red);
		BorrowerDelete.setForeground(Color.white);
		BorrowerDelete.setFont(new Font("LucidaGrande", Font.PLAIN, 26));
		BorrowerPanel.add(BorrowerDelete);
		BorrowerDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Brot.getSelectedRowCount()==1) {
					try {
							Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
							Statement st=con.createStatement();
							int i=st.executeUpdate("Delete from Borrower where Bor_ID='"+BorrowerID.getText()+"'");
							if(i>0)  {
								Bromodel.removeRow(Brot.getSelectedRow());
								JOptionPane.showMessageDialog(null,"Borrower Deleted", "Warrning",JOptionPane.INFORMATION_MESSAGE);
								
								ResultSet rus = st.executeQuery("select max(Bor_ID) from Borrower");
								if (rus.next()) {
									int BorId = rus.getInt(1);
									++BorId;
									BorrowerID.setText(String.valueOf(BorId));
									
									BorrowerName.setText("");
									BorrowerNumber.setText("");
									PayAmount.setText("");
									DueAmount.setText("");
									LastDate.setText("");
								} 
								}
						}
						catch(Exception ev) {System.out.println(ev);}
					
					}
					else
						{
								if(Brot.getRowCount()==0)
									JOptionPane.showMessageDialog(null,"Empty row", "Warrning",JOptionPane.WARNING_MESSAGE);
								else	
							    JOptionPane.showMessageDialog(null,"Please select the row", "Warrning",JOptionPane.WARNING_MESSAGE);		
						}
			}
		});
		
		Brot.addMouseListener(new MouseAdapter() {
			public void  mouseClicked(MouseEvent e) {
				BorrowerID.setText(Bromodel.getValueAt(Brot.getSelectedRow(), 0).toString());
				BorrowerName.setText(Bromodel.getValueAt(Brot.getSelectedRow(), 1).toString());
				BorrowerNumber.setText(Bromodel.getValueAt(Brot.getSelectedRow(), 2).toString());
				PayAmount.setText(Bromodel.getValueAt(Brot.getSelectedRow(), 3).toString());
				DueAmount.setText(Bromodel.getValueAt(Brot.getSelectedRow(),4).toString());
				LastDate.setText(Bromodel.getValueAt(Brot.getSelectedRow(), 5).toString());
				BorrowerSave.setEnabled(false);
			}
			
		});

		// ***********************************************ENDING OF Borrower
		// PANEL******************************************************************************************************************************************************************************

		// TP=new JTabbedPane();
		TP.setBounds(300, 197, 870, 600); // TP=TabbedPane
		TP.setBackground(Color.white);
		TP.setForeground(Color.black);
		TP.setBorder(BorderFactory.createLineBorder(new Color(245, 245, 250), 5));
		UIManager.put("TabbedPane.contentAreaColor", Color.white);
		UIManager.put("TP.selected", Color.black);
		frame.add(TP);

		upperline = new JPanel();
		upperline.setBounds(0, 0, 1200, 65);
		upperline.setBackground(Color.black);
		frame.add(upperline);

		buttomline = new JPanel();
		buttomline.setBounds(0, 800, 1200, 65);
		buttomline.setBackground(Color.black);
		frame.add(buttomline);

		JLabel menu = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\menu.png"));
		menu.setBounds(290, 75, 40, 40);
		frame.add(menu);

		JLabel adminicon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\user.png"));
		adminicon.setBounds(970, 75, 40, 40);
		frame.add(adminicon);

		JLabel username = new JLabel("Administrator");
		username.setFont(new Font("LucidaGrande", Font.BOLD, 21));
		username.setBounds(1013, 77, 200, 40);
		frame.add(username);

		JSeparator sp1 = new JSeparator();// SP in Separator below of Black
											// Border upperline
		sp1.setBounds(270, 122, 1200, 3);
		sp1.setBorder(BorderFactory.createLineBorder(new Color(245, 245, 250), 3));
		frame.add(sp1);

		JPanel BPanel = new JPanel(); // all the side panel button initialized
										// on it

		// **************************************************BEGINNING OF FIXED
		// LEFT SIDE
		// BUTTON***************************************************************************************************************************************************************************

		JLabel dashIcon2 = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\dash2.png"));
		dashIcon2.setBounds(10, 158, 30, 30);
		frame.add(dashIcon2);

		JButton dashText = new JButton("Dashboard");
		dashText.setBounds(50, 158, 107, 23);
		dashText.setForeground(new Color(160, 160, 160));
		dashText.setBackground(new Color(28, 37, 47));
		dashText.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		dashText.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(dashText);

		dashText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smsText.setText("SUPER MARKET MANAGEMENT SYSTEM ADMIN DASHBOARD ");

				TP.setSelectedIndex(0);
			}
		});

		JLabel saleIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sale.png"));
		saleIcon.setBounds(10, 195, 30, 30);
		frame.add(saleIcon);

		JButton sale = new JButton("Start Selling");
		sale.setBounds(50, 195, 119, 32);
		sale.setForeground(new Color(160, 160, 160));
		sale.setBackground(new Color(28, 37, 47));
		sale.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		sale.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(sale);

		sale.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smsText.setText("SELL DASHBOARD");
				costumerName.setText("  Enter Costumer Name");
				costumerNum.setText("  Enter Costumer Number");
				TP.setSelectedIndex(1);
			}
		});

		JLabel EmployeeIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\employee.png"));
		EmployeeIcon.setBounds(10, 238, 30, 30);
		frame.add(EmployeeIcon);

		JButton employee = new JButton("Add Employee");
		employee.setBounds(50, 238, 144, 32);
		employee.setForeground(new Color(160, 160, 160));
		employee.setBackground(new Color(28, 37, 47));
		employee.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		employee.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(employee);

		employee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smsText.setText("EMPLOYEE DASHBOARD");
				TP.setSelectedIndex(4);
			}
		});

		JLabel orderIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\order.png"));
		orderIcon.setBounds(10, 281, 25, 30);
		frame.add(orderIcon);

		JButton order = new JButton("Order Report");
		order.setBounds(50, 281, 130, 32);
		order.setForeground(new Color(160, 160, 160));
		order.setBackground(new Color(28, 37, 47));
		order.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		order.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(order);

		order.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Rmodel.setRowCount(0);
					Connection con=DriverManager.getConnection(	"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
					Statement st1=con.createStatement();
					ResultSet res=st1.executeQuery("select * from Costumers");
					while(res.next()) {
					String Rdetails[] = {res.getString("Order_Id"), res.getString("Cos_Name"), res.getString("Cos_number"), res.getString("Amount"), res.getString("Ord_Date"),res.getString("Payment_Status") };
					Rmodel.addRow(Rdetails);
				}
					
				}catch(Exception ev) {System.out.println(ev);}

				smsText.setText("ALL ORDER REPORT");
				TP.setSelectedIndex(5);
			}
		});

		JLabel productIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\product.png"));
		productIcon.setBounds(10, 324, 25, 30);
		frame.add(productIcon);

		JButton product = new JButton("Product Report");
		product.setBounds(50, 324, 148, 32);
		product.setForeground(new Color(160, 160, 160));
		product.setBackground(new Color(28, 37, 47));
		product.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		product.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(product);

		product.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pmodel.setRowCount(0);
				try {
					Connection con = DriverManager.getConnection(
							"jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
					Statement st1 = con.createStatement();
					ResultSet res = st1.executeQuery("Select * from Product");
					while (res.next()) {
						String ProID = res.getString("Pro_ID");
						String Pro_Code = res.getString("Product_Code");
						String Pro_Name = res.getString("Product_Name");
						String Pro_Brand = res.getString("Product_Brand");
						String Pro_category = res.getString("Product_Category");
						String Units = res.getString("Total_units");
						String Price = res.getString("Price_Per_Unit");

						String Pdetails[] = { ProID, Pro_Code, Pro_Name, Pro_Brand, Pro_category, Units, Price };

						Pmodel.addRow(Pdetails);

					}

				} catch (Exception evt) {
					System.out.println(evt);
				}
				
				
				smsText.setText("ALL PRODUCT REPORT");
				TP.setSelectedIndex(6);

			}
		});

		JLabel addproducticon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\addproduct.png"));
		addproducticon.setBounds(10, 367, 25, 30);
		frame.add(addproducticon);

		JButton addproduct = new JButton("Add Product");
		addproduct.setBounds(50, 367, 125, 32);
		addproduct.setForeground(new Color(160, 160, 160));
		addproduct.setBackground(new Color(28, 37, 47));
		addproduct.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		addproduct.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(addproduct);

		addproduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smsText.setText("ADD NEW PRODUCT");
				TP.setSelectedIndex(7);
			}
		});

		JLabel categIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\category.png"));
		categIcon.setBounds(10, 410, 25, 30);
		frame.add(categIcon);

		JButton Bcategory = new JButton("Category");
		Bcategory.setBounds(50, 410, 89, 32);
		Bcategory.setForeground(new Color(160, 160, 160));
		Bcategory.setBackground(new Color(28, 37, 47));
		Bcategory.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		Bcategory.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(Bcategory);

		Bcategory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smsText.setText("ALL CATEGORY REPORT");
				TP.setSelectedIndex(8);
			}
		});

		JLabel brandIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\brand.png"));
		brandIcon.setBounds(10, 453, 25, 30);
		frame.add(brandIcon);

		JButton Bbrand = new JButton("Brand");
		Bbrand.setBounds(50, 453, 62, 32);
		Bbrand.setForeground(new Color(160, 160, 160));
		Bbrand.setBackground(new Color(28, 37, 47));
		Bbrand.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		Bbrand.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(Bbrand);

		Bbrand.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smsText.setText("ALL BRAND REPORT");
				TP.setSelectedIndex(9);
			}
		});

		JLabel borrowerIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\borrower.png"));
		borrowerIcon.setBounds(10, 493, 25, 30);
		frame.add(borrowerIcon);

		JButton borrow = new JButton("Borrower");
		borrow.setBounds(50, 496, 95, 32);
		borrow.setForeground(new Color(160, 160, 160));
		borrow.setBackground(new Color(28, 37, 47));
		borrow.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		borrow.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(borrow);

		borrow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smsText.setText("BORROW CUSTOMERS");
				TP.setSelectedIndex(10);
			}
		});

		JLabel reportIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\report.png"));
		reportIcon.setBounds(10, 536, 25, 30);
		frame.add(reportIcon);

		JButton report = new JButton("Report");
		report.setBounds(50, 536, 69, 32);
		report.setForeground(new Color(160, 160, 160));
		report.setBackground(new Color(28, 37, 47));
		report.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		report.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(report);

		report.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				smsText.setText("ALL REPORT OF SUPER MARKET MANAGEMENT SYSTEM");
			}
		});

		JLabel logoutIcon = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\logout.png"));
		logoutIcon.setBounds(10, 579, 25, 30);
		frame.add(logoutIcon);

		JButton logout = new JButton("Logout");
		logout.setBounds(50, 579, 72, 32);
		logout.setForeground(new Color(160, 160, 160));
		logout.setBackground(new Color(28, 37, 47));
		logout.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
		logout.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		frame.add(logout);

		logout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				Login obj = new Login();
				frame.dispose();
			}
		});

		// **************************************************ENDING OF FIXED
		// LEFT SIDE
		// BUTTON***************************************************************************************************************************************************************************

		// Side Button Panel all the side button initialized on this Panel
		BPanel.setBackground(new Color(28, 37, 47));
		BPanel.setBounds(0, 125, 270, 835);
		frame.add(BPanel);

		smsText = new JLabel("SUPER MARKET MANAGEMENT SYSTEM ADMIN DASHBOARD");
		smsText.setFont(new Font("LucidaGrande", Font.BOLD, 28));
		smsText.setForeground(Color.black);
		smsText.setBounds(300, 120, 900, 70);
		frame.add(smsText);

		JSeparator sp2 = new JSeparator();// SP in Separator below of Black
											// Border 2nd upperline
		sp2.setBounds(270, 180, 1200, 1);
		sp2.setBorder(BorderFactory.createLineBorder(new Color(0, 128, 255), 1));
		frame.add(sp2);

		JLabel basket = new JLabel(
				new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\basket.png"));
		basket.setBounds(13, 72, 45, 45);
		frame.add(basket);

		JLabel sms = new JLabel("SMS SYSTEM");
		sms.setFont(new Font("LucidaGrande", Font.BOLD, 28));
		sms.setForeground(Color.white);
		sms.setBounds(58, 60, 300, 70);
		frame.add(sms);

		JPanel sidetext = new JPanel();
		sidetext.setBounds(0, 65, 270, 60);
		sidetext.setBackground(new Color(0, 128, 255));
		frame.add(sidetext);

		frame.setSize(1200, 900);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);

	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MainPage obj = new MainPage();
	}

}
