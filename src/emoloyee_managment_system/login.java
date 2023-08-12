
package emoloyee_managment_system;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login extends FinalProject{
    JFrame f=new JFrame();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    
      ImageIcon icon1 = new ImageIcon("C:\\project\\finalProject\\src\\new emp.png");
      ImageIcon icon2 = new ImageIcon("new.jpg");
    JTextField tf1=new JTextField();
    JPasswordField tf2=new JPasswordField();
    JTextField tf3=new JTextField();
    JTextField tf4=new JTextField();
    JTextField tf5=new JTextField();
    JTextField tf6=new JTextField();
    JTextField tf7=new JTextField();
    
    
    
    JLabel lb1=new JLabel("Welcom to employee managment system");
    JLabel lb2=new JLabel("please Login in first ");
    JLabel lb3=new JLabel("User Name");
    JLabel lb4=new JLabel("password");
    JLabel lb5=new JLabel();
    JLabel lb6=new JLabel();
    JLabel lb7=new JLabel();
    JLabel lb8=new JLabel("");
    JLabel lb9=new JLabel("salary");





    JButton bu1=new JButton("Login");
    JButton bu2=new JButton("Register For New Employee");
    JButton bu3=new JButton("about us");
    JButton bu4=new JButton("edit employee information");
    JButton bu5=new JButton("delet employee");
    JButton bu6=new JButton("Log Out");
    JButton bu7=new JButton();
    JButton bu8=new JButton();
    JButton bu9=new JButton();
    JButton bu10=new JButton();
    JButton bu11=new JButton();
    
    
    
  
    
    lgg lg =new lgg();
    login(){
       
        f.setSize(500,500);
        f.setTitle("Employe Managment System");
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);
        f.setBackground(Color.yellow);
        
        lb1.setBounds(35,10, 400, 40);
        lb1.setFont(new Font("fg",Font.BOLD,20));
        f.add(lb1);
        
        p1.setLayout(null);
        p1.setBounds(50,60,350,300);
        //p1.setBackground(new Color( 0.0.0.0));
        f.add(p1);
        
        
        


// Code adding the component to the parent container - not shown here

        
        lb2.setBounds(120,0,150,40);
        p1.add(lb2);
        lb2.setFont(new Font("fg",Font.BOLD,14));
        lb2.setForeground(black);
        
        lb3.setBounds(20,40,80,40);
        p1.add(lb3);
        lb3.setFont(new Font("fg",Font.BOLD,14));
        lb3.setForeground(black);
        
        lb4.setBounds(20,70,80,40);
        p1.add(lb4);
        lb4.setFont(new Font("fg",Font.BOLD,14));
        lb4.setForeground(black);
        
        tf1.setBounds(120,50,150,20);
        p1.add(tf1);
        
        
        
        tf2.setBounds(120,87,150,20);
        p1.add(tf2);
        
       bu1.setBounds(150, 180, 70, 30);
       p1.add(bu1);
       
       bu1.addActionListener(lg);
    }

    
    
    private class lgg  implements ActionListener{
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bu1){
            String us="abel";
            String pass="abel123";
           if(tf1.getText().equals(us)&&tf2.getText().equals(pass)){
               home1 home2 = new home1();
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.dispose();
           }
           else if(tf1.getText().matches("[a-zA-Z0-9]*") &&tf2.getText().matches("[a-zA-Z0-9]*")){
               JOptionPane.showMessageDialog(null, "incorrect user name and password,please try agin");
               tf1.setText("");
               tf2.setText("");
           }
           
        }
    }
    
}
}


