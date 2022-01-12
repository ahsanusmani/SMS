import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Employee {
	   JPanel dashboardP;
	   JTabbedPane TP =new JTabbedPane();
       JPanel upperline,buttomline;
	   JFrame frame;
	   JLabel smsText;
	   // JLabel error1,error2,error3,error4,error5,error9;
	Employee () {
		frame=new JFrame("SMS System");
		frame.setLayout(null);
		
		Image icon= Toolkit.getDefaultToolkit().getImage("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\su1.png");
	    frame.setIconImage(icon);
		
//************************************************************************************************************************************************************************************************************************
		JSeparator sp3=new JSeparator();// Below the main button separator
		sp3.setBounds(270,181,1200,44);
		sp3.setBorder(BorderFactory.createLineBorder(new Color(245,245,250),44));
		frame.add(sp3);
		
		JSeparator sp4=new JSeparator();// Right side Separator
		sp4.setBounds(270,181,38,608);
		sp4.setBorder(BorderFactory.createLineBorder(new Color(245,245,250),38));
		sp4.setOrientation(SwingConstants.VERTICAL);
		frame.add(sp4);
		
		JSeparator sp5=new JSeparator();// Left side Separator
		sp5.setBounds(1155,181,36,608);
		sp5.setBorder(BorderFactory.createLineBorder(new Color(245,245,250),30));
		sp5.setOrientation(SwingConstants.VERTICAL);
		frame.add(sp5);
		
		JSeparator sp6=new JSeparator();// JTabbedPane Buttum line separator
		sp6.setBounds(300,790,870,10);
		sp6.setBorder(BorderFactory.createLineBorder(new Color(255,255,255),10));
		frame.add(sp6);
		
//*******************************************************************BEGINNING OF side button PANEL**********************************************************************************************************************************************************		
		
	
			
		
		
			//dashboard panel start
			
				dashboardP=new JPanel();
				dashboardP.setBackground(Color.white);
				dashboardP.setLayout(null);
				TP.add(dashboardP);	
				
				
				JLabel sidePic=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sPic.png"));
				sidePic.setBounds(530,2,320,537);
				dashboardP.add(sidePic);
				
				
				JLabel dashIcon2=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\dash2.png"));
				dashIcon2.setBounds(10,158,30,30);
				frame.add(dashIcon2);
				
				JButton dashText=new JButton("Dashboard");
				dashText.setBounds(50,158,107,23);
				dashText.setForeground(new Color(160,160,160));
				dashText.setBackground(new Color(28,37,47));
				dashText.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),3));
				dashText.setFont(new Font("Times New Roman",Font.PLAIN,23));
				frame.add(dashText);
				
				dashText.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						smsText.setText("SUPER MARKET MANAGEMENT SYSTEM ADMIN DASHBOARD ");
						
						TP.setSelectedIndex(0);
					}
				});
				
				JButton sellbutton = new JButton("Start Selling");
				sellbutton.setBounds(30,30,175,31);
				sellbutton.setBackground(new Color(0,128,255));
				sellbutton.setBorder(BorderFactory.createLineBorder(new Color(0,128,255),3));
				sellbutton.setForeground(Color.white);
				sellbutton.setFont(new Font("Roboto Mono Regular",Font.PLAIN,21));
				dashboardP.add(sellbutton);
				sellbutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						TP.setSelectedIndex(1);
					}
				});
				
				
					
				  
				  
				JButton order=new JButton("Order Report");
				order.setBounds(50,235,130,32);
				order.setForeground(new Color(160,160,160));
				order.setBackground(new Color(28,37,47));
				order.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),3));
				order.setFont(new Font("Times New Roman",Font.PLAIN,23));
				frame.add(order);
				
				order.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						smsText.setText("ALL ORDER REPORT");
						TP.setSelectedIndex(4);
					}
				});
				
				
				JLabel orderIcon=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\order.png"));
				orderIcon.setBounds(10,235,25,30);
				frame.add(orderIcon);
				
				
				JLabel logoutIcon = new JLabel(
						new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\logout.png"));
				logoutIcon.setBounds(10, 272, 25, 30);
				frame.add(logoutIcon);

				JButton logout = new JButton("Logout");
				logout.setBounds(50, 272, 72, 32);
				logout.setForeground(new Color(160, 160, 160));
				logout.setBackground(new Color(28, 37, 47));
				logout.setBorder(BorderFactory.createLineBorder(new Color(28, 37, 47), 3));
				logout.setFont(new Font("Times New Roman", Font.PLAIN, 23));
				frame.add(logout);
				
				
//*******************************************************************BEGINNING OF Dashboard PANEL**********************************************************************************************************************************************************
				
				
				
				JLabel saleIcon=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sale.png"));
				saleIcon.setBounds(10,195,30,30);
				frame.add(saleIcon);
				
				JButton sale=new JButton("Start Selling");
				sale.setBounds(50,195,119,32);
				sale.setForeground(new Color(160,160,160));
				sale.setBackground(new Color(28,37,47));
				sale.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),3));
				sale.setFont(new Font("Times New Roman",Font.PLAIN,23));
				frame.add(sale);
				
				sale.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
							smsText.setText("SELL DASHBOARD");
							TP.setSelectedIndex(1);
					}
				});
				
				JLabel saleL=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
		        saleL.setBounds(10,25,490,40);
		        dashboardP.add(saleL);
				
				JButton orderbutton = new JButton("Order Report");
				orderbutton.setBounds(30,100,162,31);
				orderbutton.setBackground(new Color(0,128,255));
				orderbutton.setBorder(BorderFactory.createLineBorder(new Color(0,128,255),3));
				orderbutton.setForeground(Color.white);
				orderbutton.setFont(new Font("Roboto Mono Regular",Font.PLAIN,21));
				dashboardP.add(orderbutton);
				
				orderbutton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						TP.setSelectedIndex(4);
					}
				});
					
			     JLabel orderL=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\b3.png"));
			     orderL.setBounds(10,95,490,40);
			     dashboardP.add(orderL);
			     
			     
			     
			     
			     
//*******************************************************************ENDING OF DashBoard Button PANEL**********************************************************************************************************************************************************
				
//**********************************************BEGINNING OF SELLING PANEL*******************************************************************************************************************************************************************************				
					
					//Beginning start selling panel
					
				JPanel selling=new JPanel();
				selling=new JPanel();
				selling.setBackground(Color.white);
				selling.setLayout(null);
				TP.add(selling);
				
				
				JLabel text1=new JLabel("ENTER THE COSTUMER NAME AND MOBILE NUMBER TO START SELL");
				text1.setBounds(20,0,750,80);
				text1.setForeground(Color.red);
				text1.setFont(new Font("Times New Roman",Font.PLAIN,23));
				selling.add(text1);
				
				JSeparator sellSep=new JSeparator();
				sellSep.setBounds(15,60,770,2);
				sellSep.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),2));
				selling.add(sellSep);
				
				JTextField costumerName=new JTextField("  Enter Costumer Name");
				costumerName.setBounds(15,80,290,37);
				costumerName.setBorder(BorderFactory.createLineBorder(new Color(128,128,128)));
				costumerName.setForeground(new Color(192,192,192));
				costumerName.setFont(new Font("LucidaGrande",Font.PLAIN,17));
				selling.add(costumerName);
				
				 JLabel error6 = new JLabel("  \u274C Enter the Costumer Name");// Error label for not enter the username
		          error6.setForeground(Color.red);
		          error6.setFont(new Font("LucidaGrande",Font.PLAIN,12));
		          error6.setBounds(20,118,250,25);
		          error6.setVisible(false);
		          selling.add(error6);   
															
															costumerName.addKeyListener(new KeyAdapter() {
			   	        	   									@Override 
			   	        	   									public void keyTyped(KeyEvent e) {
			   	        	   										if(costumerName.getText().equals("  Enter Costumer Name"))  { costumerName.setText(""); 	}
			   	        	   																}
			   	        	   													});
															
															costumerName.addFocusListener(new FocusListener() {
																@Override
																public void focusGained(FocusEvent e) {}
																@Override
																public void focusLost(FocusEvent e) {
																	if(costumerName.getText().length()==0) {		costumerName.setText("  Enter Costumer Name");	  }
																									}
																							});
															
															
															  costumerName.addMouseListener(new MouseAdapter() {
																 public void mouseClicked(MouseEvent e) {
																	costumerName.setBorder(BorderFactory.createLineBorder(new Color(128,128,128)));
																	error6.setVisible(false);
																 }
															  });
				
				JTextField costumerNum=new JTextField("  Enter Costumer Number");
				costumerNum.setBounds(320,80,290,37);
				costumerNum.setBorder(BorderFactory.createLineBorder(new Color(128,128,128)));
				costumerNum.setForeground(new Color(192,192,192));
				costumerNum.setFont(new Font("LucidaGrande",Font.PLAIN,17));
				selling.add(costumerNum);
				
				  JLabel error7 = new JLabel("  \u274C Enter the current password");// Error label for not enter the current password
		          error7.setForeground(Color.red);
		          error7.setFont(new Font("LucidaGrande",Font.PLAIN,12));
		          error7.setBounds(325,118,250,25);
		          error7.setVisible(false);
		          selling.add(error7);  				
															costumerNum.addKeyListener(new KeyAdapter() {
			   	        	   									@Override 
			   	        	   									public void keyTyped(KeyEvent e) {
			   	        	   										if(costumerNum.getText().equals("  Enter Costumer Number"))  { costumerNum.setText(""); 	}
			   	        	   																}
			   	        	   													});
															
															costumerNum.addFocusListener(new FocusListener() {
																@Override
																public void focusGained(FocusEvent e) {}
																@Override
																public void focusLost(FocusEvent e) {
																	if(costumerNum.getText().length()==0) {		costumerNum.setText("  Enter Costumer Number");	  }
																									}
																							});
															
															costumerNum.addMouseListener(new MouseAdapter() {
																public void mouseClicked(MouseEvent e) {
																	costumerNum.setBorder(BorderFactory.createLineBorder(new Color(128,128,128)));
																	error7.setVisible(false);
																}
															});
					
				JButton startsell=new JButton("Start Sell");
				startsell.setBounds(630,80,170,37);
				startsell.setBackground(new Color(0,128,255));
				startsell.setForeground(Color.white);
				startsell.setFont(new Font("Times New Roman",Font.PLAIN,26));
				selling.add(startsell);
				
							     								
				    								startsell.addActionListener(new ActionListener() {
				    									public void actionPerformed(ActionEvent e) {
				    										if(costumerName.getText().equals("  Enter Costumer Name"))  {
				    											costumerName.setBorder(BorderFactory.createLineBorder(Color.red,1));
				    											//error1.setVisible(true);
				    										}
				    										
				    										else if(costumerNum.getText().equals("  Enter Costumer Number")) {
				    											 costumerNum.setBorder(BorderFactory.createLineBorder(Color.red,1));
				    											// error2.setVisible(true);
				    										}
				    										else
				    										TP.setSelectedIndex(2);
				    									}
				    								}); 
				
				JSeparator sellSep2=new JSeparator();
				sellSep2.setBounds(0,150,870,625);
				sellSep2.setBorder(BorderFactory.createLineBorder(new Color(245,245,250),625));
				selling.add(sellSep2);
				TP.add(selling);
					
			// Ending  start selling panel
				
	////***************************************************ENDING OF SELLING PANEL**************************************************************************************************************************************************************************			
				

				
				
	//*****************************************************BEGING OF MAIN SELLING PANEL************************************************************************************************************************************************************************			
				//Beginning of selling main Panel
				
				JPanel Mainselling=new JPanel();
				Mainselling.setBackground(Color.white);
				Mainselling.setLayout(null);
				
				TP.add(Mainselling);
				
				JLabel text2=new JLabel("Costumer and order Details");
				text2.setBounds(20,0,750,80);
				text2.setForeground(Color.red);
				text2.setFont(new Font("Times New Roman",Font.PLAIN,23));
				Mainselling.add(text2);
				
				JSeparator sellSep3=new JSeparator();
				sellSep3.setBounds(15,60,770,1);
				sellSep3.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
				Mainselling.add(sellSep3);
				
				JLabel OID=new JLabel("Order ID"); //OID=Oder ID
				OID.setBounds(23,75,80,30);
				OID.setForeground(Color.BLACK);
				OID.setFont(new Font("LucidaGrande",Font.BOLD,17));
				Mainselling.add(OID);
				
													
													JLabel OrderId=new JLabel("Order Id Number"); 
													OrderId.setBounds(230,75,150,30);
													OrderId.setForeground(new Color(96,96,96));
													OrderId.setFont(new Font("LucidaGrande",Font.PLAIN,17));
													Mainselling.add(OrderId);
				
													
													
			  
			    JLabel OD=new JLabel("Order Date"); //od=Order Date
				OD.setBounds(465,75,110,30);
				OD.setForeground(Color.BLACK);
				OD.setFont(new Font("LucidaGrande",Font.BOLD,17));
				Mainselling.add(OD);
				
													
													JLabel OrderDate=new JLabel("DD/MM//YYYY"); 
													OrderDate.setBounds(650,75,150,30);
													OrderDate.setForeground(new Color(96,96,96));
													OrderDate.setFont(new Font("LucidaGrande",Font.PLAIN,17));
													Mainselling.add(OrderDate);
										
				
													
				
				JLabel CosName=new JLabel("Costumer Name"); //od=Order Date
				CosName.setBounds(23,110,130,30);
				CosName.setForeground(Color.BLACK);
				CosName.setFont(new Font("LucidaGrande",Font.BOLD,17));
				Mainselling.add(CosName);
				
													
													JLabel CostumerName=new JLabel("Name"); 
													CostumerName.setBounds(230,110,150,30);
													CostumerName.setForeground(new Color(96,96,96));
													CostumerName.setFont(new Font("LucidaGrande",Font.PLAIN,17));
													Mainselling.add(CostumerName);
													
													
				
				JLabel MN=new JLabel("Costumer Number"); //Mobile Number
				MN.setBounds(465,110,150,30);
				MN.setForeground(Color.BLACK);
				MN.setFont(new Font("LucidaGrande",Font.BOLD,17));
				Mainselling.add(MN);
				
													
													JLabel MobileNum=new JLabel("97200XXXXX"); 
													MobileNum.setBounds(650,110,150,30);
													MobileNum.setForeground(new Color(96,96,96));
													MobileNum.setFont(new Font("LucidaGrande",Font.PLAIN,17));
													Mainselling.add(MobileNum);
					
				
				JSeparator sellSep6=new JSeparator();
				sellSep6.setBounds(15,70 ,770,40);
				sellSep6.setBorder(BorderFactory.createLineBorder(new Color(218,218,218),40));
				Mainselling.add(sellSep6);

													
				
				JLabel text3=new JLabel("Add Items into Cart");
				text3.setBounds(20,130,750,80);
				text3.setForeground(Color.red);
				text3.setFont(new Font("Times New Roman",Font.PLAIN,23));
				Mainselling.add(text3);
				
				JSeparator sellSep4=new JSeparator();
				sellSep4.setBounds(15,190,770,1);
				sellSep4.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
				Mainselling.add(sellSep4);

													
													
				JLabel SP=new JLabel("Select Product"); // SP= Select Product
				SP.setBounds(23,215,122,30);
				SP.setForeground(Color.BLACK);
				SP.setFont(new Font("LucidaGrande",Font.BOLD,17));
				Mainselling.add(SP);
				
												JTextField SearchPrduct=new JTextField();
												SearchPrduct.setBounds(180,215,200,30);
												SearchPrduct.setBorder(BorderFactory.createLineBorder(new Color(179,179,179)));
												SearchPrduct.setForeground(new Color(192,192,192));
												SearchPrduct.setFont(new Font("LucidaGrande",Font.PLAIN,17));
												Mainselling.add(SearchPrduct);		
				
				
				JLabel qun=new JLabel("Enter Quntity"); // qun=Quantity
				qun.setBounds(410,215,122,30);
				qun.setForeground(Color.BLACK);
				qun.setFont(new Font("LucidaGrande",Font.BOLD,17));
				Mainselling.add(qun);
				
												SpinnerModel sp=new SpinnerNumberModel(1,1,1000000,1);
												JSpinner spinner=new JSpinner(sp);
												spinner.setFont(new Font("LucidaGrande",Font.BOLD,17));
												spinner.setBounds(540,215,80,30);
												Mainselling.add(spinner);
																
																		
																	
																	JButton AddItemB=new JButton("Add Item");
																	AddItemB.setBounds(650,215,100,30);
																	AddItemB.setBackground(Color.red);
																	AddItemB.setBorder(BorderFactory.createLineBorder(Color.red));
																	AddItemB.setForeground(Color.white);
																	AddItemB.setFont(new Font("Times New Roman",Font.PLAIN,15));
																	Mainselling.add(AddItemB);
												
												
												
				JSeparator sellSep5=new JSeparator();
				sellSep5.setBounds(15,205,770,70);
				sellSep5.setBorder(BorderFactory.createLineBorder(new Color(218,218,218),70));
				Mainselling.add(sellSep5);
				
				JLabel text4=new JLabel("Order Item Details");
				text4.setBounds(20,270,400,80);
				text4.setForeground(Color.red);
				text4.setFont(new Font("Times New Roman",Font.PLAIN,23));
				Mainselling.add(text4);
				
				JSeparator sellSep7=new JSeparator();
				sellSep7.setBounds(15,330,770,1);
				sellSep7.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
				Mainselling.add(sellSep7);
				
				
				JLabel SProID=new JLabel("Prouct ID"); // SProID= show Product ID
				SProID.setBounds(23,345,122,30);
				SProID.setForeground(Color.white);
				SProID.setFont(new Font("LucidaGrande",Font.BOLD,17));
				Mainselling.add(SProID);	
				
				
								JLabel ProName=new JLabel("Prouct Name"); // ProaName= Product Name
								ProName.setBounds(140,345,122,30);
								ProName.setForeground(Color.white);
								ProName.setFont(new Font("LucidaGrande",Font.BOLD,17));
								Mainselling.add(ProName);	
												     
												        JLabel PPU=new JLabel("Price Per Unit"); // PPU= Price per unit
												        PPU.setBounds(290,345,122,30);
												        PPU.setForeground(Color.white);
												        PPU.setFont(new Font("LucidaGrande",Font.BOLD,17));
														Mainselling.add(PPU);	
														
																		
																		JLabel TU=new JLabel("Total Units"); // TC= total unit
																        TU.setBounds(440,345,122,30);
																        TU.setForeground(Color.white);
																        TU.setFont(new Font("LucidaGrande",Font.BOLD,17));
																		Mainselling.add( TU);	
				
																		
																					
																					JLabel TC=new JLabel("Total Cost"); // TC= total cost
																			        TC.setBounds(590,345,122,30);
																			        TC.setForeground(Color.white);
																			        TC.setFont(new Font("LucidaGrande",Font.BOLD,17));
																					Mainselling.add( TC);	
							
																										
																										JLabel  Action=new JLabel("Action"); // Action= For removing products
																										Action.setBounds(730,345,122,30);
																										Action.setForeground(Color.white);
																										Action.setFont(new Font("LucidaGrande",Font.BOLD,17));
																										Mainselling.add( Action);				
				JSeparator sellSep8=new JSeparator();
				sellSep8.setBounds(15,340,770,40);
				sellSep8.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
				Mainselling.add(sellSep8);
				
				
				
				@SuppressWarnings("unused")
				String column[]= { "Product ID","Product Name","Price Per Unit","Total Units","Total Cost"};
				@SuppressWarnings("unused")
				String row[][] = {
					{  "101","PN1","10","2","20" },
					{  "102","PN1","10","2","20" },
					{  "103","PN1","10","2","20" },
					{  "104","PN1","10","2","20" },
					{  "105","PN1","10","2","20" },
					{  "106","PN1","10","2","20" },
					{  "107","PN1","10","2","20" },
					{  "108","PN1","10","2","20" }
					
					
				};
				
				
				
				
				
				
				  JLabel TA=new JLabel("Total Amount:"); //TA= total amount label
				  TA.setBounds(570,475,125,30);
				  TA.setForeground(Color.BLACK);
				  TA.setFont(new Font("LucidaGrande",Font.BOLD,17));
					Mainselling.add(TA);
														
														JLabel TotalAmount=new JLabel("5000"); 
														TotalAmount.setBounds(700,475,150,30);
														TotalAmount.setForeground(new Color(96,96,96));
														TotalAmount.setFont(new Font("LucidaGrande",Font.BOLD,17));
														Mainselling.add(TotalAmount);
				
				JButton SSD =new JButton("Save Sell Details"); // SSD Save sell Details
				SSD.setBounds(650,510,172,29);
				SSD.setBackground(new Color(0,150,255));
				SSD.setForeground(Color.white);
				SSD.setFont(new Font("Times New Roman",Font.PLAIN,20));
				Mainselling.add(SSD);
							 
				    SSD.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							if(SearchPrduct.getText().length()==0) {
								ImageIcon ig1=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
									JOptionPane.showMessageDialog(null,"Select the Product ","Warrning",JOptionPane.WARNING_MESSAGE,ig1);
							}
							else {
								smsText.setText("Order Item of Order ID: ");
								TP.setSelectedIndex(3);
							}
							
						}
				    	
				    });
				
				
				//Ending of selling main Panel

				
//***********************************************ENDING OF MAIN SELLING PANEL******************************************************************************************************************************************************************************
				    
				    
//***********************************************BEGNINNING OF ORDER DETAILS PANEL******************************************************************************************************************************************************************************
					
					
				    JPanel orderDetails=new JPanel();
				    orderDetails.setBackground(Color.white);
				    orderDetails.setLayout(null);
				    TP.add(orderDetails);
				
				    JLabel text5=new JLabel("Order Details");
					text5.setBounds(20,0,750,80);
					text5.setForeground(Color.red);
					text5.setFont(new Font("Times New Roman",Font.PLAIN,23));
					orderDetails.add(text5);
					
					JSeparator ordSep1=new JSeparator();
					ordSep1.setBounds(15,60,770,1);
					ordSep1.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
					orderDetails.add(ordSep1);
				    
													
					JLabel ORD=new JLabel("Order ID"); // ProaName= Product Name
					ORD.setBounds(25,75,122,30);
					ORD.setForeground(Color.white);
					ORD.setFont(new Font("LucidaGrande",Font.BOLD,17));
					orderDetails.add(ORD);	
					
												JSeparator ordSep2=new JSeparator();
												ordSep2.setBounds(15,70,170,40);
												ordSep2.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
												orderDetails.add(ordSep2);
					
					
					JLabel OrderId1=new JLabel("125XX"); 
					OrderId1.setBounds(225,75,150,30);
					OrderId1.setForeground(new Color(96,96,96));
					OrderId1.setFont(new Font("LucidaGrande",Font.PLAIN,17));
					orderDetails.add(OrderId1);
					
					
					
					
					JLabel OD1=new JLabel("Order Date"); // OD1= Order Date
					OD1.setBounds(425,75,122,30);
					OD1.setForeground(Color.white);
					OD1.setFont(new Font("LucidaGrande",Font.BOLD,17));
					orderDetails.add(OD1);	
					
												JSeparator ordSep3=new JSeparator();
												ordSep3.setBounds(410,70,170,40);
												ordSep3.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
												orderDetails.add(ordSep3);
					
					
					 JLabel OrderDate1=new JLabel("DD/MM/YYYY"); 
					 OrderDate1.setBounds(650,75,150,30);
					 OrderDate1.setForeground(new Color(96,96,96));
					 OrderDate1.setFont(new Font("LucidaGrande",Font.PLAIN,17));
					 orderDetails.add( OrderDate1);
					
					
												JSeparator ordSep4=new JSeparator();
												ordSep4.setBounds(15,110,770,1);
												ordSep4.setBorder(BorderFactory.createLineBorder(new Color(179,179,179),1));
												orderDetails.add(ordSep4);
					
					
					JLabel CN1=new JLabel("Costumer Name"); // CN1= costumer name 1
					CN1.setBounds(25,116,150,30);
					CN1.setForeground(Color.white);
					CN1.setFont(new Font("LucidaGrande",Font.BOLD,17));
					orderDetails.add(CN1);	
												
									JSeparator ordSep5=new JSeparator();
									ordSep5.setBounds(15,111,170,40);
									ordSep5.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
									orderDetails.add(ordSep5);
												
												
					JLabel costumerName1=new JLabel("Name");   
					costumerName1.setBounds(225,116,150,30);
					costumerName1.setForeground(new Color(96,96,96));
					costumerName1.setFont(new Font("LucidaGrande",Font.PLAIN,17));
					orderDetails.add( costumerName1);
						
					JLabel CN2=new JLabel("Contact Number"); // CN2 =contach Number
					CN2.setBounds(425,116,150,30);
					CN2.setForeground(Color.white);
					CN2.setFont(new Font("LucidaGrande",Font.BOLD,17));
					orderDetails.add(CN2);	
					
												JSeparator ordSep6=new JSeparator();
												ordSep6.setBounds(410,110,170,40);
												ordSep6.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
												orderDetails.add(ordSep6);
					
					
					 JLabel ContactNumber1=new JLabel("97200XXXX"); 
					 ContactNumber1.setBounds(650,116,150,30);
					 ContactNumber1.setForeground(new Color(96,96,96));
					 ContactNumber1.setFont(new Font("LucidaGrande",Font.PLAIN,17));
					 orderDetails.add( ContactNumber1);
												
												
					JSeparator ordSep7=new JSeparator();
					ordSep7.setBounds(15,150,770,1);
					ordSep7.setBorder(BorderFactory.createLineBorder(new Color(179,179,179),1));
					orderDetails.add(ordSep7);
												
					JLabel ORS=new JLabel("Order Status"); // ORS= Order status
					ORS.setBounds(25,157,122,30);
					ORS.setForeground(Color.white);
					ORS.setFont(new Font("LucidaGrande",Font.BOLD,17));
					orderDetails.add(ORS);	
					
												JSeparator ordSep8=new JSeparator();
												ordSep8.setBounds(15,152,170,40);
												ordSep8.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
												orderDetails.add(ordSep8);
					

					JLabel OrderStats=new JLabel("Paid/Borrow"); 
					OrderStats.setBounds(225,157,150,30);
					OrderStats.setForeground(new Color(96,96,96));
					OrderStats.setFont(new Font("LucidaGrande",Font.PLAIN,17));
					orderDetails.add(OrderStats);
					
					JLabel TA1=new JLabel("Total Amount"); // TA1=total amount 1
					TA1.setBounds(425,157,150,30);
					TA1.setForeground(Color.white);
					TA1.setFont(new Font("LucidaGrande",Font.BOLD,17));
					orderDetails.add(TA1);	
					
												JSeparator ordSep10=new JSeparator();
												ordSep10.setBounds(410,152,170,40);
												ordSep10.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
												orderDetails.add(ordSep10);
												
					JLabel TotalAmount1=new JLabel("5000"); 
					TotalAmount1.setBounds(650,157,150,30);
					TotalAmount1.setForeground(new Color(96,96,96));
					TotalAmount1.setFont(new Font("LucidaGrande",Font.PLAIN,17));
					orderDetails.add( TotalAmount1);
					
					
					JSeparator ordSep11=new JSeparator();
					ordSep11.setBounds(15,192,770,1);
					ordSep11.setBorder(BorderFactory.createLineBorder(new Color(179,179,179),1));
					orderDetails.add(ordSep11);
					
					
					
					JLabel text6=new JLabel("Order Items");
					text6.setBounds(20,200,750,80);
					text6.setForeground(Color.red);
					text6.setFont(new Font("Times New Roman",Font.PLAIN,23));
					orderDetails.add(text6);
					
					JSeparator ordSep12=new JSeparator();
					ordSep12.setBounds(15,260,770,1);
					ordSep12.setBorder(BorderFactory.createLineBorder(new Color(0,0,0),1));
					orderDetails.add(ordSep12);
					
					JLabel ProID1=new JLabel("Prouct ID"); // ProID= Product ID
					ProID1.setBounds(23,280,122,30);
					ProID1.setForeground(Color.white);
					ProID1.setFont(new Font("LucidaGrande",Font.BOLD,17));
					orderDetails.add(ProID1);	
					
					
									JLabel ProName1=new JLabel("Prouct Name"); // ProaName= Product Name
									ProName1.setBounds(140,280,122,30);
									ProName1.setForeground(Color.white);
									ProName1.setFont(new Font("LucidaGrande",Font.BOLD,17));
									orderDetails.add(ProName1);	
													     
													        JLabel PPU1=new JLabel("Price Per Unit"); // PPU= Price per unit
													        PPU1.setBounds(290,280,122,30);
													        PPU1.setForeground(Color.white);
													        PPU1.setFont(new Font("LucidaGrande",Font.BOLD,17));
													        orderDetails.add(PPU1);	
															
																			
																			JLabel TU1=new JLabel("Total Units"); // TC= total unit
																	        TU1.setBounds(440,280,122,30);
																	        TU1.setForeground(Color.white);
																	        TU1.setFont(new Font("LucidaGrande",Font.BOLD,17));
																	        orderDetails.add( TU1);	
					
																			
																						
																						JLabel TC1=new JLabel("Total Cost"); // TC= total cost
																				        TC1.setBounds(590,280,122,30);
																				        TC1.setForeground(Color.white);
																				        TC1.setFont(new Font("LucidaGrande",Font.BOLD,17));
																				        orderDetails.add( TC1);	
								
																											
																											JLabel  Action1=new JLabel("Action"); // Action= For removing products
																											Action1.setBounds(730,280,122,30);
																											Action1.setForeground(Color.white);
																											Action1.setFont(new Font("LucidaGrande",Font.BOLD,17));
																											orderDetails.add( Action1);		
					
					JSeparator ordSep14=new JSeparator();
					ordSep14.setBounds(15,275,770,40);
					ordSep14.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
					orderDetails.add(ordSep14);
					
					//sellSep8.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
					
					JLabel text14=new JLabel("Total Amount:");
					text14.setBounds(560,450,150,80);
					text14.setForeground(Color.red);
					text14.setFont(new Font("Times New Roman",Font.PLAIN,23));
					orderDetails.add(text14);
					
					JLabel TotalAmount2=new JLabel("1300");
					TotalAmount2.setBounds(710,450,750,80);
					TotalAmount2.setForeground(new Color(28,37,47));
					TotalAmount2.setFont(new Font("Times New Roman",Font.PLAIN,23));
					orderDetails.add(TotalAmount2);
												
					JButton Print=new JButton("PRINT RECIPT");
					Print.setBounds(300,520,150,30);
					Print.setBackground(Color.red);
					Print.setBorder(BorderFactory.createLineBorder(Color.red));
					Print.setForeground(Color.white);
					Print.setFont(new Font("LucidaGrande",Font.PLAIN,15));
					orderDetails.add(Print);

					
//***********************************************ENDING OF ORDER DETAILS PANEL******************************************************************************************************************************************************************************								    
				    
//***********************************************BEGNNING OF ORDER REPORT PANEL******************************************************************************************************************************************************************************
					
					JPanel OrderReport=new JPanel();
				    OrderReport.setBackground(Color.white);
					OrderReport.setLayout(null);
					TP.add( OrderReport);
					
					JLabel OPD=new JLabel("ID"); // OPD= Order Product ID
					OPD.setBounds(20,10,122,30);
					OPD.setForeground(Color.white);
					OPD.setFont(new Font("LucidaGrande",Font.BOLD,17));
					OrderReport.add(OPD);	
					
					
									JLabel ORName=new JLabel("Costumer Name"); // ORName=Order Name
									ORName.setBounds(85,10,150,30);
									ORName.setForeground(Color.white);
									ORName.setFont(new Font("LucidaGrande",Font.BOLD,17));
									OrderReport.add(ORName);	
													     
													        JLabel OCMN=new JLabel("Contact Number"); // OCMN=Order costumer mobile number
													        OCMN.setBounds(255,10,150,30);
													        OCMN.setForeground(Color.white);
													        OCMN.setFont(new Font("LucidaGrande",Font.BOLD,17));
													        OrderReport.add(OCMN);	
															
																			
																			JLabel OCRA=new JLabel("Total Amount"); // OCRA=order costumer total amount
																			OCRA.setBounds(430,10,140,30);
																			OCRA.setForeground(Color.white);
																			OCRA.setFont(new Font("LucidaGrande",Font.BOLD,17));
																	        OrderReport.add(OCRA);	
					
																			
																						
																						JLabel OT=new JLabel("Date"); // OT=oder date
																						OT.setBounds(610,10,122,30);
																						OT.setForeground(Color.white);
																						OT.setFont(new Font("LucidaGrande",Font.BOLD,17));
																						OrderReport.add(OT);	
								
																											
																											JLabel  OAction=new JLabel("Action"); // OAction= order Action
																											OAction.setBounds(740,10,122,30);
																											OAction.setForeground(Color.white);
																											OAction.setFont(new Font("LucidaGrande",Font.BOLD,17));
																											OrderReport.add( OAction);		
					
					JSeparator orderSep1=new JSeparator();
					orderSep1.setBounds(10,5,830,40);
					orderSep1.setBorder(BorderFactory.createLineBorder(new Color(28,37,47),40));
					OrderReport.add(orderSep1);
					
					
					
					
					
					
	//***********************************************ENDING OF ORDER REPORT PANEL******************************************************************************************************************************************************************************				
					
					
	
//*******************************************************************BEGINNING OF DASHBOARD PANEL**********************************************************************************************************************************************************
				
				
				//TP=new JTabbedPane();
				TP.setBounds(300,197,870,600);		// TP=TabbedPane
				TP.setBackground(Color.white);
				TP.setForeground(Color.black);
				TP.setBorder(BorderFactory.createLineBorder(new Color(245,245,250),5));
				UIManager.put("TabbedPane.contentAreaColor", Color.white);
				UIManager.put("TP.selected", Color.black);
				frame.add(TP);		
				

					upperline = new JPanel();
					upperline.setBounds(0,0,1200,65);
					upperline.setBackground(Color.black);
					frame.add(upperline);
					
					buttomline = new JPanel();
					buttomline.setBounds(0,800,1200,65);
					buttomline.setBackground(Color.black);
					frame.add(buttomline);


					JLabel menu=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\menu.png"));
					menu.setBounds(290,75,40,40);
					frame.add(menu);
					
					JLabel adminicon=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\user.png"));
					adminicon.setBounds(970,75,40,40);
					frame.add(adminicon);
					
					JLabel username=new JLabel("Employeee");
					username.setFont(new Font("LucidaGrande",Font.BOLD,21));
					username.setBounds(1013,77,200,40);
					frame.add(username);
					JPanel BPanel =new JPanel();  // all the side panel button initialized on it
				   // Side Button Panel all the side button initialized on this Panel
				BPanel.setBackground(new Color(28,37,47));
				BPanel.setBounds(0,125,270,835);
				frame.add(BPanel);
				
				
				
																
				
				
			    smsText=new JLabel("SUPER MARKET MANAGEMENT SYSTEM ADMIN DASHBOARD");
				smsText.setFont(new Font("LucidaGrande",Font.BOLD,28));
				smsText.setForeground(Color.black);
				smsText.setBounds(300,120,900,70);
				frame.add(smsText);
				
				
				JSeparator sp2=new JSeparator();// SP in Separator below of Black Border 2nd upperline
				sp2.setBounds(270,180,1200,1);
				sp2.setBorder(BorderFactory.createLineBorder(new Color(0,128,255),1));
				frame.add(sp2);
				
				
				
				 JLabel basket =new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\basket.png"));
				 basket.setBounds(13,72,45,45);
				 frame.add(basket);
				    
				JLabel sms=new JLabel("SMS SYSTEM");
				sms.setFont(new Font("LucidaGrande",Font.BOLD,28));
				sms.setForeground(Color.white);
				sms.setBounds(58,60,300,70);
				frame.add(sms);
				 
				JPanel sidetext =new JPanel();
				sidetext.setBounds(0,65,270,60);
				sidetext.setBackground(new Color(0,128,255));
			    frame.add(sidetext);
			    

		frame.setSize(1200,900);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.white);		
		
		
		
		
	}
	
	
	
 public static void main(String[] args) {
	 @SuppressWarnings("unused")
	Employee obj=new Employee();
 }
}
