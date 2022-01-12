import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;

public class ChangePassword {
      JFrame frame;
      JTextField username;
      JPasswordField current,ReType,NewPassword;
      JLabel error1,error2,error3,error4;
      ChangePassword() {
    	  frame=new JFrame("Change Password");
    	  frame.setLayout(null);
    	  
    	  Image icon= Toolkit.getDefaultToolkit().getImage("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\su1.png");
    	  frame.setIconImage(icon);
    	  
    	  JLabel key=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\key.png"));
		   key.setBounds(52,37,35,35);
		   frame.add(key);
		   
    	   JLabel CPLabel=new JLabel("Change Password");
    	   CPLabel.setFont(new Font("LucidaGrande",Font.BOLD,28));
		   CPLabel.setBounds(100,30,250,34);
		   frame.add(CPLabel);
    	  
		   								JLabel text=new JLabel("It's a good idea to use a strong password that you dont't ues elsewhere");
		   								text.setFont(new Font("Times New Roman",Font.BOLD,15));
		   								text.setForeground(Color.gray);
		   								text.setBounds(108,64,500,25);
		   								frame.add(text);
		   
		   									
		   								JSeparator sep1=new JSeparator();
		   								sep1.setBounds(28,100,570,1);
		   								sep1.setForeground(new Color(199,199,214));
		   								frame.add(sep1);
		   								
		   JLabel usernameL=new JLabel("Username");
		   usernameL.setFont(new Font("LucidaGrande",Font.BOLD,18));
		   usernameL.setForeground(Color.gray);
		   usernameL.setBounds(145,130,100,30);
		   frame.add(usernameL);
		   
		   								 username=new JTextField();
		   								username.setFont(new Font("LucidaGrande",Font.PLAIN,18));
		   								username.setBorder(BorderFactory.createLineBorder(new Color(199,199,214)));
		   								username.setBounds(247,133,250,25);
		   								frame.add(username);
		   
	
         JLabel CurrentL=new JLabel("Current Password");
		 CurrentL.setFont(new Font("LucidaGrande",Font.BOLD,18));
		 CurrentL.setForeground(Color.gray);
		 CurrentL.setBounds(80,175,250,30);
		 frame.add(CurrentL);

										 current=new JPasswordField();
										current.setFont(new Font("LucidaGrande",Font.PLAIN,18));
										current.setEchoChar('*');
										current.setBorder(BorderFactory.createLineBorder(new Color(199,199,214)));
										current.setBounds(247,178,250,25);
										frame.add(current);
															
														JLabel CshowIcon=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\view.png"));
														CshowIcon.setBounds(502,175,30,30);
														JLabel ChideIcon= new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\hide.png"));
														ChideIcon.setVisible(false);
														ChideIcon.setBounds(502,175,30,30);
														
														frame.add(CshowIcon);
														frame.add(ChideIcon);
														CshowIcon.addMouseListener(new MouseAdapter(){
		    	      	   									@Override
		    	      	   									   public void mousePressed(MouseEvent e){
		    	      	   										CshowIcon.setVisible(false);
		    	      	   										ChideIcon.setVisible(true);
		    	      	   										current.setEchoChar((char)0);
		    	      	   									}
		    	      	   								   @Override
	    	      	   									   public void mouseReleased(MouseEvent e){
	    	      	   									    ChideIcon.setVisible(false);
	    	      	   										CshowIcon.setVisible(true);
	    	      	   										current.setEchoChar('*');
	    	      	   										
	    	      	   									       
	    	      	   									}
		    	      	   								});
														
														
										
										
										
										
		 JLabel NewPass=new JLabel("New Password");
		 NewPass.setFont(new Font("LucidaGrande",Font.BOLD,18));
		 NewPass.setForeground(Color.gray);
		 NewPass.setBounds(104,218,250,30);
		 frame.add(NewPass);

										NewPassword=new JPasswordField();
										NewPassword.setFont(new Font("LucidaGrande",Font.PLAIN,18));
										NewPassword.setEchoChar('*');
										NewPassword.setBorder(BorderFactory.createLineBorder(new Color(199,199,214)));
										NewPassword.setBounds(247,221,250,25);
										frame.add(NewPassword);
										
										JLabel NshowIcon=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\view.png"));
										NshowIcon.setBounds(502,221,30,30);
										JLabel NhideIcon= new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\hide.png"));
										NhideIcon.setVisible(false);
										NhideIcon.setBounds(502,221,30,30);
										
										frame.add(NshowIcon);
										frame.add(NhideIcon);
										NshowIcon.addMouseListener(new MouseAdapter(){
      	   									@Override
      	   									   public void mousePressed(MouseEvent e){
      	   										NshowIcon.setVisible(false);
      	   										NhideIcon.setVisible(true);
      	   										 NewPassword.setEchoChar((char)0);
      	   									}
      	   								   @Override
	   									   public void mouseReleased(MouseEvent e){
	   									    NhideIcon.setVisible(false);
	   										NshowIcon.setVisible(true);
	   										NewPassword.setEchoChar('*');
	   										
	   									       
	   									}
      	   								});
										
										
										
	    JLabel REPass=new JLabel("Confirm Password");
		 REPass.setFont(new Font("LucidaGrande",Font.BOLD,18));
		 REPass.setForeground(Color.gray);
		 REPass.setBounds(72,256,250,30);
		 frame.add(REPass);

										ReType=new JPasswordField();
										ReType.setFont(new Font("LucidaGrande",Font.PLAIN,18));
										ReType.setEchoChar('*');
										ReType.setBorder(BorderFactory.createLineBorder(new Color(199,199,214)));
										ReType.setBounds(247,262,250,25);
										frame.add(ReType);
										
										JLabel RshowIcon=new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\view.png"));
										RshowIcon.setBounds(502,262,30,30);
										JLabel RhideIcon= new JLabel(new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\hide.png"));
										RhideIcon.setVisible(false);
										RhideIcon.setBounds(502,262,30,30);
										
										frame.add(RshowIcon);
										frame.add(RhideIcon);
										RshowIcon.addMouseListener(new MouseAdapter(){
      	   									@Override
      	   									   public void mousePressed(MouseEvent e){
      	   										RshowIcon.setVisible(false);
      	   										RhideIcon.setVisible(true);
      	   										 ReType.setEchoChar((char)0);
      	   									}
      	   								   @Override
	   									   public void mouseReleased(MouseEvent e){
	   									    RhideIcon.setVisible(false);
	   										RshowIcon.setVisible(true);
	   										ReType.setEchoChar('*');
	   										
	   									       
	   									}
      	   								});
										
										
		 
    	  
    	 JButton Forget=new JButton("Forgotten your Password?");
    	 Forget.setForeground(new Color(0,128,255));				// change Forget button foreground color
         Forget.setBackground(new Color(245,245,250));    // change Forget button background panel color
         Forget.setFont(new Font("LucidaGrande",Font.BOLD,16));  // change forget Button font
         Forget.setBorder(BorderFactory.createDashedBorder(new Color(245,245,250)));  //change Forget button border
         Forget.setBounds(28,326,210,21);   // set Forget button location
         frame.add(Forget);
         
         								Forget.addActionListener(new ActionListener() {
         								@Override	
         								public void actionPerformed(ActionEvent e) {
         									if(e.getSource()==Forget) {
         										@SuppressWarnings("unused")
												Forget obj=new Forget();
         									}
					
         									}
         								});
         								
         	//error1= not enter the username
          error1 = new JLabel("  \u274C Enter the username");// Error label for not enter the username
          error1.setForeground(Color.red);
          error1.setFont(new Font("LucidaGrande",Font.PLAIN,12));
          error1.setBounds(247,155,250,25);
          error1.setVisible(false);
          frame.add(error1);
          
       	 //error2= not enter the current password
          error2 = new JLabel("  \u274C Enter the current password");// Error label for not enter the current password
          error2.setForeground(Color.red);
          error2.setFont(new Font("LucidaGrande",Font.PLAIN,12));
          error2.setBounds(247,200,250,25);
          error2.setVisible(false);
          frame.add(error2);  
          
          //error3 = not enter the New password
          error3 = new JLabel("  \u274C Enter the New password");// Error label for not enter the New password
          error3.setForeground(Color.red);
          error3.setFont(new Font("LucidaGrande",Font.PLAIN,12));
          error3.setBounds(247,242,250,25);
          error3.setVisible(false);
          frame.add(error3);  
          
          //error4 = not enter the confirm password
          error4 = new JLabel("  \u274C Enter the Confirm password");// Error label for not enter the confirm password
          error4.setForeground(Color.red);
          error4.setFont(new Font("LucidaGrande",Font.PLAIN,12));
          error4.setBounds(247,286,250,25);
          error4.setVisible(false);
          frame.add(error4);  
         
         
         JSeparator sep2=new JSeparator();
         sep2.setBounds(28,349,570,1);
		 sep2.setForeground(new Color(199,199,214));
		 frame.add(sep2);
		 
		 JButton Save=new JButton("Save Changes");
		 Save.setBackground(new Color(0,128,255));
		 Save.setFont(new Font("LucidaGrande",Font.BOLD,17));
		 Save.setBorder(BorderFactory.createDashedBorder(new Color(0,128,255)));  
		 Save.setForeground(Color.white);
		 Save.setBounds(70,360,137,30);
		 Save.addActionListener(new ActionListener() {
			 @SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e)  {
				 
				 if((username.getText().length()==0)&&(current.getText().length()==0)&&(NewPassword.getText().length()==0)&&(ReType.getText().length()==0)) {
					 ImageIcon ig1=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\error.png");
					JOptionPane.showMessageDialog(null,"Enter all the details.","Warrning",JOptionPane.WARNING_MESSAGE,ig1); 
				 }
				 
				 else if(username.getText().length()==0) {
			        username.setBorder(BorderFactory.createLineBorder(Color.red,1));
					 
			      error1.setVisible(true);
					  
					 
				      username.addMouseListener(new MouseAdapter(){
								@Override
									   public void mouseClicked(MouseEvent e){
									username.setBorder(BorderFactory.createLineBorder(new Color(199,199,214)));
									error1.setVisible(false);
									}
								});
				 }
			 
				 else if(current.getText().length()==0) {
					    current.setBorder(BorderFactory.createLineBorder(Color.red,1));
						 
					      error2.setVisible(true);
							  
							 
						      current.addMouseListener(new MouseAdapter(){
										@Override
											   public void mouseClicked(MouseEvent e){
											current.setBorder(BorderFactory.createLineBorder(new Color(199,199,214)));
											error2.setVisible(false);
											}
										});
				 }
			 
				 else if(NewPassword.getText().length()==0) {
					 NewPassword.setBorder(BorderFactory.createLineBorder(Color.red,1));
					 
				      error3.setVisible(true);
						  
						 
					      NewPassword.addMouseListener(new MouseAdapter(){
									@Override
										   public void mouseClicked(MouseEvent e){
										NewPassword.setBorder(BorderFactory.createLineBorder(new Color(199,199,214)));
										error3.setVisible(false);
										}
									});
				 }
				 
				 
				 
				 else if(ReType.getText().length()==0) {
					 ReType.setBorder(BorderFactory.createLineBorder(Color.red,1));
					 
				      error4.setVisible(true);
						  
						 
					      ReType.addMouseListener(new MouseAdapter(){
									@Override
										   public void mouseClicked(MouseEvent e){
										ReType.setBorder(BorderFactory.createLineBorder(new Color(199,199,214)));
										error4.setVisible(false);
										}
									});
				 }
				 
				 else if(!(NewPassword.getText().equals(ReType.getText()))) {
			    	 ImageIcon ig1=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\cross.png");
						JOptionPane.showMessageDialog(null,"New password doesn't match.\nPlease re-enter a new password again","Warrning",JOptionPane.WARNING_MESSAGE,ig1); 
			    }
				 
				 else if((NewPassword.getText().equals(current.getText()))) {
			    	 ImageIcon ig1=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\cross.png");
						JOptionPane.showMessageDialog(null,"New password and confirm password is same","Warrning",JOptionPane.WARNING_MESSAGE,ig1); 
			    }


				 else {
					 try {
						//Connection con=DriverManager.getConnection("jdbc.ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Connection con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\sms.accdb");
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery("Select * from userTable");
						if(rs.next()) {
							
							if(username.getText().equals(rs.getString(1))) {
								
								if(current.getText().equals(rs.getString(2)))  {
										int i=st.executeUpdate("update userTable set password='"+NewPassword.getText()+"'where username='"+username.getText()+"'");
										if(i>0) {
													ImageIcon ig1=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\done.png");
													JOptionPane.showMessageDialog(null,"Password Changed.","Warrning",JOptionPane.WARNING_MESSAGE,ig1); 
													frame.dispose();
						  		 						}
										
										else {
											ImageIcon ig1=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\cross.png");
											JOptionPane.showMessageDialog(null,"Password is not Changed\nPlease try-ag","Warrning",JOptionPane.WARNING_MESSAGE,ig1);
										}
								}
								
								
								else {
									ImageIcon ig1=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\cross.png");
									JOptionPane.showMessageDialog(null,"You enter wrong password","Warrning",JOptionPane.WARNING_MESSAGE,ig1); 
								}
							}
							else {
								ImageIcon ig1=new ImageIcon("C:\\Users\\AHsan Usmani\\Desktop\\Programs\\Project GMS\\src\\cross.png");
								JOptionPane.showMessageDialog(null,"Please Enter a valid username","Warrning",JOptionPane.WARNING_MESSAGE,ig1); 
							
							     }
								
							
							
						}
						 
						 
					 
					
					 }
					 catch(Exception evt) { System.out.println(evt);  }
				 
				 }
				 
			 
				 
				 			 }
			 
		 });
		 frame.add(Save);
         
         
         
         
    	  
    	  frame.getContentPane().setBackground(new Color(245,245,250));//new Color(242,242,247)
    	  frame.setVisible(true);
    	 
    	  frame.setSize(650,450);
    	  frame.setLocationRelativeTo(null);
    	  frame.setResizable(false);
    	  
    	  frame.addWindowListener(new WindowAdapter(){
    		  public void windowClosing(WindowEvent e) {
    			  frame.dispose();
    		  }
    	  });
    	  
    	  
      }
      
    public static void main(String[] args) {
    	@SuppressWarnings("unused")
		ChangePassword obj=new ChangePassword();
    }
}
