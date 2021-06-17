package carssalessystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class SignIn extends JFrame  implements ActionListener   {
       private final JButton signin= new JButton("SIGN IN");
       private final JButton register= new JButton("Register Now");
       
       private final JLabel title=new JLabel("Welcome To The Car Sales System");
       private final JLabel userlabel=new JLabel("User Name:");
       private final JLabel passlabel=new JLabel("Password:");
       private final JLabel background=new JLabel();
       
       private  JTextField username = new JTextField();
       private JPasswordField pass= new JPasswordField();
       
       private final JLabel registerlabel=new JLabel("Don't have an account?");
       
       public String getUsername() {
        return username.getText();
    }

    public String getPass() {
         return pass.getText();
    }
      SignIn(){
      
        setTitle("Cars Sales");
        setSize(500,500);
        setVisible(true);
        setLocation(1300, 200);
        setLayout(null);
        setDefaultCloseOperation(3);
        userlabel.setBounds(140, 70, 70, 30);
        passlabel.setBounds(140, 130, 70, 30);
        registerlabel.setBounds(190, 250, 140, 30);
        registerlabel.setFont(new Font("Arial",Font.BOLD,11));
        background.setBounds(0, -50, 500, 500);
        background.setIcon(new ImageIcon("C:\\Users\\Abduallah Hussien\\Desktop\\signincar.jpeg"));
        
        title.setBounds(70, 20, 400, 45);
        title.setFont(new Font("Arial",Font.BOLD,22));
        
        username.setBounds(140, 100, 210, 30);
        pass.setBounds(username.getX(),username.getY()+60, 210, 30);
        
        signin.setBounds(220, 220,55,30);
        signin.setFont(new Font("Arial",Font.BOLD,12));
        signin.setMargin(new Insets(0,0,0,0));
        signin.addActionListener(this);
        
        register.setBounds(signin.getX()-15, signin.getY()+60, 90, 30);
        register.setFont(new Font("Arial",Font.BOLD,12));
        register.setMargin(new Insets(0,0,0,0));
        register.addActionListener(this);
        
        
        add(signin);
        add(register);
        add(username);
        add(pass);
        add(userlabel);
        add(passlabel);
        add(registerlabel);
        add(title);
        add(background);
       
        
      }
      
            @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==register){
           Registeration f2= new Registeration();
           dispose();
        }
        else if(e.getSource()==signin){
            Boolean correct=false;
            if(this.getUsername().equals("Admin_User@gmail.com")&&this.getPass().equals("Administrator")){
                AdminPage adminPage = new AdminPage();
                correct = true;
                setVisible(false);
            }
            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");  
                Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
                Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from User_info");
                while(rs.next()){
                    if(rs.getString(1).equals(this.getUsername())&&rs.getString(2).equals(this.getPass())){
                    JOptionPane.showMessageDialog(null, "Entering To The Car Sales System.","Accepted Account",JOptionPane.PLAIN_MESSAGE );
                    correct =true;
                    UserPage userPage = new UserPage();
                    setVisible(false);
                    break;
                  }  
                }
                if(!correct){
                    JOptionPane.showMessageDialog(null, "Incorrect Email or Password");
                }
                con.close();
            } 
            catch(ClassNotFoundException | SQLException error){
                System.err.println(error);
            }
         
        }
            
    }   
}
    
 

    
    

