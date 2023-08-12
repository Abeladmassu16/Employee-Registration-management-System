package emoloyee_managment_system;

import java.awt.Color;
import static java.awt.Color.*;
import static java.awt.Color.white;
import static java.awt.Event.HOME;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.*;
import static java.awt.event.WindowEvent.WINDOW_CLOSING;
import javax.swing.JOptionPane;

public class    home1 extends login {
    
    JFrame fr = new JFrame();
    ACL al =new ACL();
    action all=new action();
    
    home1(){
              

        
    fr.setLayout(null);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(600,650);
        fr.setResizable(false);
        fr.setTitle("HOME");
        fr.setVisible(true);
        
        p2.setLayout(null);
        p2.setBounds(0,0,600,650);
       
        
        //ImageIcon icon1=new ImageIcon("work.png"); 
        bu2.setBounds(30, 200, 500, 100);
       // bu2.setBackground(Color(204,204,255));
     
        
        
        fr.add(bu2);
        
        
        bu3.setBounds(30, 310, 500, 100);
       //bu3.setBackground(Color(204,204,255));
        p2.add(bu3);
        lb5.setBounds(300, 110, 220, 30);
        p2.add(lb5);
        
        //bu4.setBounds(30, 240, 500, 100);
       // bu4.setBackground(Color(204,204,255));
      //  p2.add(bu4);
        lb6.setBounds(30, 250, 220, 30);
        p2.add(lb6);
        
         //bu5.setBounds(30, 360, 500, 100);
        //bu5.setBackground(Color(204,204,255));
      //  p2.add(bu5);
        lb7.setBounds(300, 250, 220, 30);
        p2.add(lb7);
        
        
         bu6.setBounds(240, 480, 100, 50);
       // bu6.setBackground(Color(204,204,255));
        p2.add(bu6);
        fr.add(p2);
        
        lb4.setBounds(0,0,600,650);
        lb4.setIcon(icon1);
        p2.add(lb4);
                
         bu2.addActionListener(al) ;
         bu6.addActionListener(all);
}

    
   private  class ACL implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           
             newemp nw=new newemp();
             nw.setVisible(true);
            
             
//this.dispatchEvent(new WindowEvent(this ,WINDOW_CLOSING));
    }

   }
   
    private  class action implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==bu6){
            //sfr.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            int dialogResult = JOptionPane.showConfirmDialog (null, 
                    "Do you want to logout","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){
                login nw =new login();
                //fr.setVisible(false);
                fr.dispose();
            }
            
           
           }
            
    }
   }
}
