/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carssalessystem;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.*;

/**
 *
 * @author Abduallah Hussien
 */
public class BuyCar3 extends JFrame {
    view v = new view();
    private final ActionClass al = new ActionClass();
    private final JButton buy = new JButton("Buy Now");
    private final JButton back = new JButton("Back");
    private final JLabel title = new JLabel("Cars Sales System");
    private final JLabel background = new JLabel();
    public BuyCar3()
    {
        display();
    }
    public void display()
    {
        setTitle("Cars Sales System");
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(1300, 200);
        add(v);
        buy.setBounds(150, 280, 200, 40);
        buy.setBackground(Color.red);
        buy.setForeground(Color.white);
        back.setBounds(0, 430, 80, 23);
        back.setBackground(Color.white);
        title.setBounds(115, -17, 350, 75);
        title.setFont(new Font("atilic" , Font.ITALIC , 30));
        buy.addActionListener(al);
        back.addActionListener(al);
        v.add(buy);
        v.add(back);
        v.add(title);
        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abduallah Hussien\\Desktop\\car6.jpg")); // NOI18N
        background.setBounds(0, 40, 500, 500);
        v.add(background);
    }
     private class ActionClass  implements ActionListener
    {
        @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back)
        {
            
            UserPage page = new UserPage();
            setVisible(false);
        }
        else if(ae.getSource() == buy)
        {
            if(v.jTable1.getSelectedRowCount() == 0)
            {
               JOptionPane.showMessageDialog(null, "Please select car");
            }
            else{
                 try {  
        Class.forName("oracle.jdbc.driver.OracleDriver");
        // establish connection  
            Connection con=DriverManager.getConnection(  "jdbc:oracle:thin:@localhost:1521:orcl","hr","hr"); 
            int row = v.jTable1.getSelectedRow();
            String cell = v.jTable1.getModel().getValueAt(row, 0).toString();
            String query = "DELETE FROM Cars WHERE Car_ID = ? ";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, cell);   
            pst.executeUpdate();
//            JOptionPane.showMessageDialog(null, "Car deleted...");  
//        con.close();  
    } catch(Exception e) {System.out.println(e);  
      JOptionPane.showMessageDialog(null, e);
    }
            v.jTable1.getSelectedRowCount();
            setVisible(false);
            SellCar2 sellCar2 = new SellCar2();
        }
        }
}
     }
}
