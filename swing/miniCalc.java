import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class miniCalc extends JFrame implements ActionListener {

    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton b;
    JLabel l;
    JLabel add;

        miniCalc(){

            t1 = new JTextField(5);
            t2 = new JTextField(5);
            t3 = new JTextField(1);


            b = new JButton("Calculate");



            l = new JLabel("Result: ");

            
            add(t1);
            add(t3);
            add(t2);
            add(b);
            add(l);

            b.addActionListener(this);
            
            setLayout(new FlowLayout());// for selecting a particular layout for our frame
            setVisible(true);
            setSize(150,200);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        }

        public void actionPerformed(ActionEvent ae){

            float n1 = Float.parseFloat(t1.getText());
            String symbol = t3.getText();
            float n2 = Float.parseFloat(t2.getText());
            float value;

            if(symbol.equals("+")){
                 value = n1+n2;
                 l.setText(value+"");

            }
            else if(symbol.equals("-")){
                value = n1-n2;
                l.setText(value+"");
            }
            else if(symbol.equals("*")){
                value = n1*n2;
                l.setText(value+"");
            }
            else if(symbol.equals("/")){
                value = n1/n2;
                l.setText(value+"");
            }
            else
                l.setText("Error!");

            

        }
    
    public static void main(String[] args) {
       miniCalc obj = new miniCalc();
    }
    



}
