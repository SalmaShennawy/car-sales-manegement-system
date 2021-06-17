package carssalessystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Registeration extends JFrame implements ActionListener {
    
    private final JLabel label1 =new JLabel("First Name:");
    private final JLabel label2 =new JLabel("Last Name:");
    private final JLabel label3 =new JLabel("E-mail:");
    private final JLabel label4 =new JLabel("Password:");
    private final  JLabel label5 =new JLabel("Confirm Password:");
    private final JLabel label6 =new JLabel("Birthdate:");
    private final JLabel label7 =new JLabel("Phone Number:");
    private final JLabel label8 =new JLabel("Gender:");
    private final JLabel label9 =new JLabel("First Name Not Accepted");
    private final JLabel label10 =new JLabel("Last Name Not Accepted");
    private final JLabel label11 =new JLabel("E-mail Not Accepted");
    private final JLabel label12 =new JLabel("Password Not Accepted");
    private final JLabel label13=new JLabel("Please Renter password");
    private final JLabel label14=new JLabel("Birthdate Not Accepted");
    private final JLabel label15 =new JLabel("Phone Not Accepted");
    private final JLabel label16=new JLabel("Choose Gender");
    private final JLabel background=new JLabel();
    
    JTextField Fname = new JTextField();
    JTextField Lname = new JTextField();
    JTextField Email = new JTextField();
    JTextField day = new JTextField();
    JTextField month = new JTextField();
    JTextField year = new JTextField();
    JTextField phone = new JTextField();
    
    JPasswordField pass = new JPasswordField();
    JPasswordField confirm_pass = new JPasswordField();
    
    JRadioButton male = new JRadioButton("Male");
    JRadioButton female = new JRadioButton("Female");
    ButtonGroup g= new ButtonGroup();
     
    JButton submit=new JButton("SUBMIT");
    JButton back=new JButton("Back");
   
    Font F =new Font("Arial",Font.BOLD,14);
    
    public Registeration(){
        
        setTitle("Cars Sales Registration From");
        setSize(650,470);
        setVisible(true);
        setLocation(1300, 200);
        setLayout(null);
        setDefaultCloseOperation(3);
        
        background.setBounds(0, 0, 500, 500);
        background.setIcon(new ImageIcon("C:\\Users\\Abduallah Hussien\\Desktop\\carphoto.jpg"));
        label1.setBounds(40, 30, 90, 30);
        label1.setFont(F);
        label2.setBounds(label1.getX(),label1.getY()+40, 80, 30);
        label2.setFont(F);
        label3.setBounds(label1.getX(),label1.getY()+80, 80, 30);
        label3.setFont(F);
        label4.setBounds(label1.getX(),label1.getY()+120, 80,30);
        label4.setFont(F);
        label5.setBounds(label1.getX(),label1.getY()+160, 140,30);
        label5.setFont(F);
        label6.setBounds(label1.getX(),label1.getY()+200, 80, 30);
        label6.setFont(F);
        label7.setBounds(label1.getX(),label1.getY()+240, 120, 30);
        label7.setFont(F);
        label8.setBounds(label1.getX(),label1.getY()+280, 80, 30);
        label8.setFont(F);
        label9.setBounds(420, 30, 180, 30);
        label9.setFont(F);
        label9.setForeground(Color.red);
        label9.setVisible(false);
        label10.setBounds(label9.getX(),label1.getY()+40, 180, 30);
        label10.setFont(F);
        label10.setForeground(Color.red);
        label10.setVisible(false);
        label11.setBounds(label9.getX(),label1.getY()+80, 170, 30);
        label11.setFont(F);
        label11.setForeground(Color.red);
        label11.setVisible(false);
        label12.setBounds(label9.getX(),label1.getY()+120, 170,30);
        label12.setFont(F);
        label12.setForeground(Color.red);
        label12.setVisible(false);
        label13.setBounds(label9.getX(),label1.getY()+160, 180,30);
        label13.setFont(F);
        label13.setForeground(Color.red);
        label13.setVisible(false);
        label14.setBounds(label9.getX(),label1.getY()+200, 170, 30);
        label14.setFont(F);
        label14.setForeground(Color.red);
        label14.setVisible(false);
        label15.setBounds(label9.getX(),label1.getY()+240, 160, 30);
        label15.setFont(F);
        label15.setForeground(Color.red);
        label15.setVisible(false);
        label16.setBounds(label9.getX(),label1.getY()+280, 120, 30);
        label16.setFont(F);
        label16.setForeground(Color.red);
        label16.setVisible(false);
        
        Fname.setBounds(180,30,220,30);
        Lname.setBounds(Fname.getX(),Fname.getY()+40,220,30);
        Email.setBounds(Fname.getX(),Fname.getY()+80,220,30);
        pass.setBounds(Fname.getX(),Fname.getY()+120,220,30);
        confirm_pass.setBounds(Fname.getX(),Fname.getY()+160,220,30);
        day.setBounds(Fname.getX(),Fname.getY()+205,40,20);
        day.setText("DD");
        month.setBounds(Fname.getX()+90,Fname.getY()+205,40,20);
        month.setText("MM");
        year.setBounds(Fname.getX()+180,Fname.getY()+205,40,20);
        year.setText("YYYY");
        phone.setBounds(Fname.getX(),Fname.getY()+240,220,30);
        male.setBounds(Fname.getX(),Fname.getY()+280,60,30);
        female.setBounds(Fname.getX()+150,Fname.getY()+280,70,30);
        g.add(male);
        g.add(female);
        
        submit.setBounds(250,370,60,40);
        submit.setMargin(new Insets(0,0,0,0));
        submit.addActionListener(this);
        back.setBounds(1,402,50,30);
        back.setMargin(new Insets(0,0,0,0));
        back.addActionListener(this);
        
        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(Fname);
        add(Lname);
        add(Email);
        add(pass); 
        add(confirm_pass);
        add(day);
        add(month); 
        add(year);
        add(phone);
        add(label9);
        add(label10);
        add(label11);
        add(label12);
        add(label13);
        add(label14);
        add(label15);
        add(label16);
        add(male);
        add(female);
        add(submit);
        add(back);
        add(background);
         
        
    }
    
    private Boolean checkemail(){
        
        if(Email.getText().trim().isEmpty()){
            label11.setVisible(true);
            return false;
        }
        else if(Email.getText().indexOf('_')==-1||Email.getText().indexOf('@')==-1||Email.getText().indexOf('.')==-1){
            label11.setVisible(true);
            return false;
        }
        else{
            label11.setVisible(false);
             return true;
        }
    }
    
    private Boolean checkpass(){
        
        if(pass.getText().trim().isEmpty()||pass.getText().length()>8){
            label12.setVisible(true);
            if(!pass.getText().equals(confirm_pass.getText())||confirm_pass.getText().trim().isEmpty()){
            label13.setVisible(true);
            }
            return false;
        }
         else if(!pass.getText().equals(confirm_pass.getText())||confirm_pass.getText().trim().isEmpty()){
            label13.setVisible(true);
            return false;
        }
        else{
             label12.setVisible(false);
             label13.setVisible(false);
             return true;
        }
    }
    
    private Boolean checkname(){
        
        if(Fname.getText().trim().isEmpty()){
            label9.setVisible(true);
            if(Lname.getText().trim().isEmpty()){
            label10.setVisible(true);
            }
            return false;
        }
        else if (Lname.getText().trim().isEmpty()){
            label10.setVisible(true);
             return false;
        }
        else{
            label9.setVisible(false);
            label10.setVisible(false);
             return true;
        } 
    }
    
    private Boolean checkphone(){
        
         if(phone.getText().trim().isEmpty()||phone.getText().length()>11){
            label15.setVisible(true);
            return false;
        }
        try {
             int num=Integer.parseInt(phone.getText());
            } 
            catch (NumberFormatException nfe) {
             label15.setVisible(true);
             return false;
           }
        return true;
    }
    
    private Boolean checkgender(){
        
        if(!male.isSelected()&&!female.isSelected()){
            label16.setVisible(true);
            return false;
        }
        else{
            label16.setVisible(false);
             return true;
        }
    }
    
    private Boolean checkdate(){
        Boolean bool=true;
        if(day.getText().equals("DD")||month.getText().equals("MM")||year.getText().equals("YYYY")){
            label14.setVisible(true);
            bool=false;
        }
        else{
            label14.setVisible(false);
            try {
             int d=Integer.parseInt(day.getText());
             int m=Integer.parseInt(month.getText());
             int y=Integer.parseInt(year.getText());
             if(d>31||m>12||y>2002|d<1||m<1||y<1912){
                label14.setVisible(true);
                bool=false;   
             }
           } 
            catch (NumberFormatException nfe) {
             label14.setVisible(true);
             bool=false;
           }
        }
        return bool;
    }
    
    private Boolean checkvalidation(){
       this.checkdate();
       this.checkphone();
       this.checkemail();
       this.checkgender();
       this.checkname();
       this.checkpass();
    
      if(this.checkdate()&&this.checkphone()&&this.checkemail()&&this.checkgender()&&this.checkname()&&this.checkpass()){
            return true;
       }
       else{
           return false;
       }
    }
    
    public String getEmail() {
        return Email.getText();
    }

    public String getPass() {
        return pass.getText();
    }

    @Override
   public void actionPerformed(ActionEvent e) {
       if(e.getSource()==submit){
       this.checkvalidation();
       if(this.checkvalidation()){
           Boolean New=true;
            try{
             Class.forName("oracle.jdbc.driver.OracleDriver");  
             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
             Statement stmt=con.createStatement();  
             ResultSet rs=stmt.executeQuery("select * from User_info");
             while(rs.next()){
                 if(rs.getString(1).equals(this.getEmail())||rs.getString(2).equals(this.getPass())){
                    if(rs.getString(1).equals(this.getEmail())&&rs.getString(2).equals(this.getPass())){
                    JOptionPane.showMessageDialog(null, "Both Email And The Password Are Taken.");
                   } 
                    else if(rs.getString(2).equals(this.getPass())){
                        JOptionPane.showMessageDialog(null, "This Password is Taken Please Enter A New one.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "This Email is Taken Please Enter A New one.");
                    }
                    New=false;
                    break;
                 } 
             }
             if(New){
PreparedStatement in=con.prepareStatement("insert into User_info values('"+this.getEmail()+"','"+this.getPass()+"')");
                JOptionPane.showMessageDialog(null, "Registeration Confirmed Now Sign In With Your New Account","Completed",JOptionPane.PLAIN_MESSAGE );
              in.executeQuery();
             }
              con.close();
            }
            catch(ClassNotFoundException | SQLException error){
                System.err.println(error);
            }
       }
       else{
           JOptionPane.showMessageDialog(null, "Please Enter Full Information Correctly.");
       }
    }
       else if(e.getSource()==back){
          SignIn signinform =new SignIn();
          dispose();
       }
   }
}
