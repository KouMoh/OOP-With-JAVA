package lab5;
import java.util.*;

interface Money {
    double earnings();
    double deductions();
    double bonus();

}

class Manager implements Money{

    int basicSal;
    Manager(){
        System.out.println("Enter the basic salary: ");
        Scanner sc = new Scanner(System.in);
        this.basicSal= sc.nextInt();
        sc.close();
    }

    public double earnings(){
        double DA = 0.8* this.basicSal;
        double HRA = 0.15* this.basicSal;

        return (this.basicSal + DA + HRA);
    }

    public double deductions(){
        return (0.12*this.basicSal);
    }

    public double bonus(){
        return 0;
    }

    void display(){
        System.out.println("Earnings - "+this.earnings());
        System.out.println("Deductions - "+this.deductions());
        System.out.println("Bonus - "+this.bonus());
    }
}

class Substaff extends Manager {

    Substaff(){
        super();
    }

    public double bonus(){
        return (0.5*this.basicSal);
    }
}



public class c3 {

    public static void main(String[] args) {
        Substaff sf = new Substaff();
        sf.display();
    }
    
}
