import java.awt.*;
import javax.swing.*;
public class yo {

    static class sw extends JFrame{
        sw(){
    
            JLabel l = new JLabel("Hello World"); //Card layout
            JLabel l1 = new JLabel("HIYA!");
            
            add(l);
            add(l1);
            
            setLayout(new FlowLayout());// for selecting a particular layout for our frame
            setVisible(true);
            setSize(400,400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        }
    }
    public static void main(String[] args) {
        sw obj = new sw();
    }
    
}

