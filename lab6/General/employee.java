package lab6.General;

 import java.util.*;

public class employee{

    double basic,salary;
    protected int empid;
    private String ename;

    public employee(){



        System.out.println("Enter employee id: ");
        Scanner sc = new Scanner(System.in);
        this.empid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter employee name: ");
        this.ename = sc.nextLine(); 
        System.out.println("Enter the basic salary: ");
        this.basic = sc.nextDouble();
        sc.close();


    }

    public double earning(){
        return basic + (0.8*basic) + (0.15*basic); 
    }

}

