/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalessystem;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author Abduallah Hussien
 */
public class AdminPage extends JFrame{
    JFrame frame = new JFrame();
    MouseClass me = new MouseClass();
    ActionClass ac = new ActionClass();
    //panels
    view p4 = new view();
    private final JPanel p3 = new JPanel();
    private final JPanel p2 = new JPanel();
    private final JPanel p1 = new JPanel();
    //buttons
    private final JButton addbutton = new JButton("Add Car");
    private final JButton dbutton = new JButton("Delete Car");
    private final JButton save = new JButton("Save");
    private final JButton delete = new JButton("Delete");
    private final JButton back = new JButton("Back");
    private final JButton back2 = new JButton("Back");
    private final JButton back3 = new JButton("Back");
    private final JButton view = new JButton("View Cars List");  
    private final JButton logout = new JButton("Log Out");
    //labels
    private final JLabel l1 = new JLabel("Enter Car ID");
    private final JLabel l2 = new JLabel("Enter Car Model");
    private final JLabel l3 = new JLabel("Enter Car Colour");
    private final JLabel l6 = new JLabel("Enter Car Price");    
    private final JLabel l4 = new JLabel("Cars Sales System");
    private final JLabel l5 = new JLabel("Cars Sales System"); 
    private final JLabel l8 = new JLabel("Cars Sales System");
    private final JLabel l9 = new JLabel("Cars Sales System");
    private final JLabel l7 = new JLabel("Please enter The ID of the car you want to delete");  
    private final JLabel l11 = new JLabel();
    private final JLabel l12 = new JLabel();
    private final JLabel l10 = new JLabel();
    private final JLabel l13 = new JLabel();
    //texts fields
    private final JTextField t1 = new JTextField();
    private final JTextField t2 = new JTextField();
    private final JTextField t3 = new JTextField();
    private final JTextField t4 = new JTextField();
    private final JTextField t5 = new JTextField();    
    public AdminPage()
    {
        Display("Welcome Admin");
        Display();
    }
    private void Display(String s){
     JOptionPane.showMessageDialog(null, s,"Admin entered",JOptionPane.PLAIN_MESSAGE );

    }
    private void Display()
    {
        //window
        frame.setTitle("Cars Sales System");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(1300, 200);
        frame.add(p1);
        frame.setVisible(true);
        //panel 1
        p1.setLayout(null);
        p1.setBackground(Color.black);
         logout.setBounds(0, 430, 80, 23);
        logout.setBackground(Color.white);
        logout.setForeground(Color.black);
        logout.addActionListener(ac);
        logout.addMouseListener(me);
        p1.add(logout);
        l11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abduallah Hussien\\Desktop\\carbck4.jpg")); // NOI18N
        l11.setBounds(0, 0, 500, 500);
        addbutton.setBounds(160, 150, 140, 30);
        addbutton.setBackground(Color.white);
        dbutton.setBounds(160, 210, 140, 30);
        dbutton.setBackground(Color.white);
        p1.add(dbutton);
        view.setBounds(160, 270, 140, 30);
        view.setBackground(Color.white);
        view.addActionListener(ac);
        view.addMouseListener(me);
        p1.add(view);
        p1.add(addbutton);
        addbutton.addActionListener(ac);
        addbutton.addMouseListener(me);
        dbutton.addActionListener(ac);
        dbutton.addMouseListener(me);
        l4.setBounds(100, 0, 350, 75);
        l4.setFont(new Font("atilic" , Font.ITALIC , 30));        
        l4.setForeground(Color.white);
        p1.add(l4);
       
        p1.add(l11); 
        //panel 2
        p2.setLayout(null);
        l10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abduallah Hussien\\Desktop\\carbck2.jpg")); // NOI18N
        l10.setBounds(0, 0, 500, 500);
        l1.setForeground(Color.white);
        l1.setFont(new Font("atilic" , Font.BOLD , 15));
        l1.setBounds(80, 115, 120, 20);
        l2.setForeground(Color.white);
        l2.setFont(new Font("atilic" , Font.BOLD , 15));
        l2.setBounds(80, 155, 120, 20);
        l3.setForeground(Color.white);
        l3.setFont(new Font("atilic" , Font.BOLD , 15));
        l3.setBounds(80, 195, 120, 20);
        l6.setForeground(Color.white);
        l6.setFont(new Font("atilic" , Font.BOLD , 15));
        l6.setBounds(80, 235, 120, 20);
        l5.setBounds(100, 0, 350, 75);
        l5.setFont(new Font("atilic" , Font.ITALIC , 30));        
        l5.setForeground(Color.white);
        p2.add(l5);
        p2.add(l1);
        p2.add(l2);
        p2.add(l3);
        p2.add(l6);
        t1.setBounds(260, 115, 140, 20);
        t2.setBounds(260, 155, 140, 20);
        t3.setBounds(260, 195, 140, 20);
        t4.setBounds(260, 235, 140, 20);
        p2.add(t1);
        p2.add(t2);
        p2.add(t3);
        p2.add(t4);
        save.setBounds(180, 285, 120, 25);
        save.setBackground(Color.white);
        back2.setBounds(0, 430, 80, 23);
        back2.setBackground(Color.white);
        back2.addActionListener(ac);
        back2.addMouseListener(me);
        p2.add(back2);
        p2.add(save);
        save.addActionListener(ac);
        save.addMouseListener(me);
        p2.add(l10);
        //panel 3
        p3.setLayout(null);
        p3.setBackground(Color.black);
        l13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abduallah Hussien\\Desktop\\carbck.jpg")); // NOI18N
        l13.setBounds(0, 0, 500, 500);
        l8.setBounds(100, 0, 350, 75);
        l8.setFont(new Font("atilic" , Font.ITALIC , 30));        
        l8.setForeground(Color.white);
        p3.add(l8);
        l7.setBounds(70, 150, 350, 20);
        l7.setForeground(Color.white);
        l7.setFont(new Font("atilic" , Font.BOLD , 15));
        p3.add(l7);
        back.setBounds(0, 430, 80, 23);
        back.setBackground(Color.white);
        back.addActionListener(ac);
        back.addMouseListener(me);
        p3.add(back);
        t5.setBounds(160, 200, 160, 20);
        p3.add(t5);
        delete.setBounds(180, 260, 100, 25);
        delete.setBackground(Color.white);
        p3.add(delete);
        delete.addMouseListener(me);
        delete.addActionListener(ac);
        p3.add(l13);
        //panel 4
        l9.setBounds(100, 0, 350, 75);
        l9.setFont(new Font("atilic" , Font.ITALIC , 30));        
        l9.setForeground(Color.white);
        p4.add(l9);
        l12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abduallah Hussien\\Desktop\\Back3.jpg")); // NOI18N
        l12.setBounds(0, 40, 500, 500);
        p4.setBackground(Color.black);
        back3.setBounds(0, 430, 80, 23);
        back3.setBackground(Color.white);
        back3.addActionListener(ac);
        back3.addMouseListener(me);
        p4.add(back3);
        p4.add(l12);
    }
     private class ActionClass  implements ActionListener
    {
        @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == addbutton)
        {
            p1.setVisible(false);
            frame.add(p2);
            p2.setVisible(true);
        }
        else if(ae.getSource() == dbutton)
        {
            p1.setVisible(false);
            frame.add(p3);
            p3.setVisible(true);
        }
        else if(ae.getSource() == logout)
        {
            SignIn signIn = new SignIn();
            frame.setVisible(false);
        }
        else if(ae.getSource() == save)
        {
            try {  
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // establish connection  
            Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
            String query = "INSERT INTO Cars(Car_ID , Car_Model , Car_Colour , Car_Price) VALUES( ? , ? , ? , ?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, t1.getText());
            pst.setString(2, t2.getText());
            pst.setString(3, t3.getText());
            pst.setString(4, t4.getText());    
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "New Car inserted...");  
//        con.close();  
    } catch(Exception e) {System.out.println(e);  
      JOptionPane.showMessageDialog(null, e);
    }
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
    } 
        else if(ae.getSource() == delete)
        {
            try {  
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // establish connection  
            Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
            String query = "DELETE FROM Cars WHERE Car_ID = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, t5.getText());   
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Car deleted...");  
//        con.close();  
    } catch(Exception e) {System.out.println(e);  
      JOptionPane.showMessageDialog(null, e);
    }
            t5.setText("");
        }
       else if(ae.getSource() == back)
        {
               p2.setVisible(false);
               p1.setVisible(true);
               p3.setVisible(false);
        }
        else if(ae.getSource() == back2)
        {
               p2.setVisible(false);
               p1.setVisible(true);
               p3.setVisible(false);
        }
          else if(ae.getSource() == back3)
        {
               p2.setVisible(false);
               p1.setVisible(true);
               p3.setVisible(false);
               p4.setVisible(false);
        }
        else if(ae.getSource() == view)
        {
            frame.add(p4);
            p4.setVisible(true);
            p1.setVisible(false);
            p2.setVisible(false);
            p3.setVisible(false);
        }
        }
    }
      private class MouseClass implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent me) {
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
            if(me.getSource() == save)
            {
            save.setBackground(Color.black);
            save.setForeground(Color.white);
            }
            else if(me.getSource() == delete)
            {
            delete.setBackground(Color.black);
            delete.setForeground(Color.white);
            }
            else if(me.getSource() == logout)
            {
            logout.setBackground(Color.black);
            logout.setForeground(Color.white);
            }
            else if(me.getSource() == view)
            {
            view.setBackground(Color.black);
            view.setForeground(Color.white);
            }
            else if(me.getSource() == addbutton)
            {    
            addbutton.setBackground(Color.black);
            addbutton.setForeground(Color.white);
            }
            else if(me.getSource() == dbutton)
            {    
            dbutton.setBackground(Color.black);
            dbutton.setForeground(Color.white);
            }
             else if(me.getSource() == back)
            {    
            back.setBackground(Color.black);
            back.setForeground(Color.white);
            }
            else if(me.getSource() == back2)
            {    
            back2.setBackground(Color.black);
            back2.setForeground(Color.white);
            }
            else if(me.getSource() == back3)
            {    
            back3.setBackground(Color.black);
            back3.setForeground(Color.white);
            }
        }

        @Override
        public void mouseExited(MouseEvent me) {
            if(me.getSource() == save)
            {
            save.setBackground(Color.white);
            save.setForeground(Color.black);
            }
            else if(me.getSource() == delete)
            {
            delete.setBackground(Color.white);
            delete.setForeground(Color.black);
            }
            else if(me.getSource() == logout)
            {
            logout.setBackground(Color.white);
            logout.setForeground(Color.black);
            }
            else if(me.getSource() == view)
            {
                view.setBackground(Color.white);
                view.setForeground(Color.black);
            }
            else if(me.getSource() == addbutton)
            {
            addbutton.setBackground(Color.white);
            addbutton.setForeground(Color.black);
            }
            else if(me.getSource() == dbutton)
            {
            dbutton.setBackground(Color.white);
            dbutton.setForeground(Color.black);
            }
            else if(me.getSource() == back)
            {
                back.setBackground(Color.white);
                back.setForeground(Color.black);
            }
            else if(me.getSource() == back2)
            {
                back2.setBackground(Color.white);
                back2.setForeground(Color.black);
            }
            else if(me.getSource() == back3)
            {
                back3.setBackground(Color.white);
                back3.setForeground(Color.black);
            }
        }

        }

}

