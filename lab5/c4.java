package lab5;

import java.util.*;

interface Employee {
   abstract void getDetails(String ID, String Name);
}

interface Manager_2 extends Employee{
    void getDeptDetails(String ID , String Name);
}

class Head implements Manager_2 {
    String empID,deptID,empName,empDept;

    public void getDetails(String ID,String Name){

        this.empID=ID;
        this.empName=Name;
    }

    public void getDeptDetails(String ID, String Name){
        this.deptID=ID;
        this.empDept=Name;
    }

    void display(){
        System.out.println("\n\n*********EMPLOYEE DETAILS*************\n\n\n");
        System.out.println("Employee id -  "+this.empID);
        System.out.println("Employee name - "+this.empName);
        System.out.println("Department id - "+this.deptID);
        System.out.println("Department name - "+this.empDept);
    }

}

public class c4 {
    public static void main(String[] args) {
        Head hd = new Head();
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the employee id: ");
        hd.empID=sc.nextLine();
        System.out.println("Enter the employee name: ");
        hd.empName=sc.nextLine();

        System.out.println("Enter the department id: ");
        hd.deptID=sc.nextLine();
        System.out.println("Enter the department name: ");
        hd.empDept=sc.nextLine();

        sc.close();

        hd.display();
    }
    
}
