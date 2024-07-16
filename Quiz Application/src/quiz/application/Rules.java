package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start,back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,90,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,16));
        rules.setText(
                "<html>"+
                "1. Login Required: Participants must log in to access the quiz." + "<br><br>" + 
                "2. Time Limit: Each quiz has a predefined time limit. The timer starts when the quiz begins." + "<br><br>" +
                "3. Lifeline: 50-50 lifeline can be used only once." + "<br><br>" +      
                "4. Answer Submission: All answers must be submitted before the quiz ends. Unanswered questions will be marked as incorrect." + "<br><br>" +
                "5. Question Types: Quiz includes multiple choice questions." + "<br><br>" +
                "6. Scoring: Points are awarded for each correct answer. Incorrect or unanswered questions receive no points." + "<br><br>" +
                "7. Prohibited Actions: No cheating, copying, or use of unauthorized resources during the quiz." + "<br><br>" +
                "<html>"
        );
        add(rules);
        
        
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            setVisible(false);
            new Quiz(name);
            
        } else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[]args){
        new Rules("User");
    }
}
