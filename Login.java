
package quiz.application;
//JFrame class is in swing package
//swing package come from the extended package of java so javax.swing.*;  
import javax.swing.*;
//color class is in awt package
import java.awt.*;
//ActionListener interface comes from java.awt.event.* packagae
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    //defining rules and back button globally to use in actionPermormed method
    JButton rules, back;
    JTextField tfname;

    Login(){
        //change background color
        getContentPane().setBackground(new Color(255,255,255));
        //we are making our own layout
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.gif"));

        //adding image i1 component to frame
        JLabel image = new JLabel(i1);
        //setBounds(distance from left, distance from top, length, width)
        image.setBounds(0,0,600,500);
        add(image);

        //adding heading 
        JLabel heading = new JLabel("Fisk FunFact Quiz");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(0,0,255));
        add(heading);

        //adding name 
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(0,0,255));
        add(name);

        tfname = new  JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        tfname.setForeground(new Color(0,0,255));
        add(tfname);

        //Rules button
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(new Color(255,215,0));
        rules.addActionListener(this);
        add(rules);

        //back button
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(new Color(255,215,0));
        back.addActionListener(this);
        add(back);

          
        //setSize(length,width) of frame
        setSize(1200,500); 

        //setLocation(distance from left, distance from top)
        //defult location is from top leftcorner
        setLocation(200,150);
        //to make frame
        setVisible(true); //bydefult visibility of frame is hidden

        

    }

    //if you implement interface to the class, we need to override all the unimplemented methods or abstract methods
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);

            new Rules(name);

        }else if(ae.getSource() == back){
            setVisible(false);
        }

    }


    public static void main(String[] args){
        Login first = new Login();
    }
}