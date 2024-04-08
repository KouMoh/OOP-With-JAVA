

import javax.swing.*;
import java.awt.*;

public class resume extends JFrame /*implements ActionListener*/ {

    JLabel name,roll,section;
    JTextField t1,t2,t3, t4, Result;
    JButton show, accept, reject;

    public resume(){
        

        name = new JLabel("Name");
        roll = new JLabel("Roll NO.");
        section = new JLabel("section");

        t1 = new JTextField(20);
        t2 = new JTextField(20);
        t3 = new JTextField(20);
        Result = new JTextField(100);


        show = new JButton("Show Candidate details");
        accept = new JButton("Accept the candidate");
        reject = new JButton("Reject the candidate");

        show.addActionListener(ae->{

            t1.setText("KOUSTAV MOHAPATRA");
            t2.setText("77");
            t3.setText("CSE");


        });

        accept.addActionListener(ae-> {
            Result.setText("Your application has been accepted!");
        });

        reject.addActionListener(ae->{
            Result.setText("Sorry, your application has been rejected!");
        });

        add(name);
        add(t1);
        
        add(roll);
        add(t2);
        
        add(section);
        add(t3);

        add(show);
        add(accept);
        add(reject);
        add(Result);

        setVisible(true);
        setTitle("RESUME");
        setLayout(new FlowLayout());
        setSize(200, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




    }

    public static void main(String[] args) {
        resume rm = new resume();
    }

   }



