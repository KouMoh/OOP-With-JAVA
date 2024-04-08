package lab5;

interface Motor{
    int capacity = 10;
    void run();
    void consume();
}

class WashingMachine implements Motor{

    public void run(){
        System.out.println("The washing machine is running! ");

    }

    public void consume(){
        System.out.println("The washing machine is consuming "+capacity+"L of water");
    }


}

public class c2 {
    public static void main(String[] args) {
        
    WashingMachine wm = new WashingMachine();

    System.out.println("Capacity of Washing machine is: "+ wm.capacity);
    
    }
}
