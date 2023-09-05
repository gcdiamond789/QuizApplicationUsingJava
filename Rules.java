package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+ 
                "1. I don't need to hear your life story, just give me the answer." + "<br><br>" +
                "2. Don't give your friend false hope with your smile, your friend might think you know the answer when you don't." + "<br><br>" +
                "3. In life, you can choose your own path, but in this quiz, you don't get to choose your own questions." + "<br><br>" +
                "4. You can cry, but please don't make a scene." + "<br><br>" +
                "5. Be wise, not otherwise." + "<br><br>" +
                "6. Don't get nervous if your friend is answering more questions, they might know the Fisk better." + "<br><br>" +
                "7. This quiz is going to be a roller coaster, so be prepared for some ups and downs." + "<br><br>" +
                "8. Good Luck!!!" + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            // new Quiz(name);
        } else {
            setVisible(false);
            // new Login();
        }
    }
    
    public static void main(String[] args) {
        Rules first = new Rules("User");
    }
}