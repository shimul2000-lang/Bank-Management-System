import java.awt.*;
import java.util.Random;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class SignupThree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
         JCheckBox c1,c2,c3,c4,c5,c6,c7;
      JButton submit,cancel;
       String formno;
    SignupThree(String formno)
    {
        this.formno=formno;

        setLayout(null);
        JLabel type=new JLabel("Page 3: Account Details");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(280,40,400,40);
        add(type);
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,150,20);
        add(r1);

        JLabel l1=new JLabel("Account Type");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(100,140,250,30);
        add(l1);
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        JLabel carddetail=new JLabel("This Is Your 16 Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD,12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        JLabel pin=new JLabel("Pin");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        JLabel pinddetail=new JLabel("This Is Your 4 Digit Password");
        pinddetail.setFont(new Font("Raleway",Font.BOLD,12));
        pinddetail.setBounds(100,400,300,20);
        add(pinddetail);
        JLabel pinnumber=new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pinnumber.setBounds(330,370,300,30);
        add(pinnumber);
        JLabel services=new JLabel("Services Required");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,400,30);
        add(services);
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        c4=new JCheckBox("Email and SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        c6=new JCheckBox("E StateMent");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        c7=new JCheckBox("I Hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,680,700,30);
        add(c7);
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        add(cancel);
getContentPane().setBackground(Color.WHITE);

 ButtonGroup groupaccount=new ButtonGroup();
       groupaccount.add(r1);
       groupaccount.add(r2);
       groupaccount.add(r3);
       groupaccount.add(r4);


        setSize(850,820);
        setLocation(350,0);
        setVisible(true);




    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==submit)
        {
          String accounType=null;
          if(r1.isSelected())
          {
accounType="Saving Account";
          }
          else if(r2.isSelected())
          {
            accounType="Fixed  Deposit Account";
          }
          else if(r3.isSelected())
          {
            accounType="Current Account";
          }
          else if(r4.isSelected())
          {
            accounType="Recurring Deposit Account";
          }
          Random random=new Random();
          String cardnumber=""+Math.abs(random.nextLong()%90000000L+5040936000000000L);
          String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
          String facility="";
          if(c1.isSelected())
          {
            facility=facility+"ATM Card";
          }
          else if(c2.isSelected())
          {
            facility=facility+"Internet Banking";
          }
          else if(c3.isSelected())
          {
            facility=facility+"Mobile Banking";
          }
          else if(c4.isSelected())
          {
            facility=facility+"Email And SMS Alerts";

          }
          else if(c5.isSelected())
          {
            facility=facility+"Cheque Book";
          }
          else if(c6.isSelected())
          {
            facility=facility+"E-Statement";
          }
          try {
            if(accounType.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Account Type Is Required");

            }
            else {
                Conn conn=new Conn();
                String query="insert into signupthree values('"+formno+"','"+accounType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                String query1="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
              conn.s.executeUpdate(query1);
            conn.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null,"Card Number" + cardnumber+"\n Pin:" + pinnumber);
         setVisible(false);
         new Deposit(pinnumber).setVisible(false);

            }
          } catch (Exception e) {
            System.out.println(e);
          }
        }
        else if(ae.getSource()==cancel)
        {
setVisible(false);
new Login().setVisible(true);

        }
    }
    public static void main(String[] args) {
        new SignupThree("");
    }
}
