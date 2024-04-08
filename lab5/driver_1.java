package lab5;
import java.util.*;

abstract class Student{

    String rollNo,regNo;

    void getinput(){
        System.out.println("Enter the Roll No of the student: ");

        Scanner sc = new Scanner(System.in);

        this.rollNo = sc.nextLine();

        System.out.println("Enter the Registration number of the sudent");

        this.regNo = sc.nextLine();

    }

    abstract void course();

}

class KIIT extends Student {

    String course;
    void course(){
        System.out.println("Enter the course this student is enrolled in: ");
         
        Scanner ob = new Scanner(System.in);
        
        course = ob.nextLine();

    }

}


public class driver_1 {

    public static void main(String[] args) {
        
        KIIT obj = new KIIT();

        obj.getinput();
        obj.course();

        System.out.println("The roll: "+obj.rollNo);
        System.out.println("The registration no. "+obj.regNo);
        System.out.println("The course taken: "+obj.course);


    }

}
