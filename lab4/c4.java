package lab4;

import java.util.*;
class Account{

    int acc_no;
    double balance;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account number");
        acc_no = sc.nextInt();
        System.out.println("Enter the balance: ");
        balance= sc.nextDouble();
    }

    void disp(){
        System.out.println("The account number: "+acc_no);
        System.out.println("The balance: "+balance);
    }

}

class Person extends Account{

    String name;
    int aadhar;

    void input(){
        super.input();
        System.out.println("Enter the name: ");

        Scanner sc = new Scanner(System.in);

        name = sc.nextLine();
        System.out.println("Enter the aadhar: ");
        aadhar= sc.nextInt();
    }

    void disp(){
        super.disp();
        System.out.println("The name: "+name);
        System.out.println("The Aadhar: "+aadhar);
    }

}


public class c4 {

    public static void main(String[] args) {
        Person[] obj = new Person[3];

        for (int i = 0; i < obj.length; i++) {
            obj[i] = new Person();
        }

        System.out.println("Enter the details of the 1st person: ");
        obj[0].input();

        System.out.println("Enter the details of the 2nd person: ");
        obj[1].input();

        System.out.println("Enter the details of the 3rd person: ");
        obj[2].input();

        System.out.println("Person 1 details: ");
        obj[0].disp();

        System.out.println("Person 2 details: ");
        obj[1].disp();

        System.out.println("Person 3 details: ");
        obj[2].disp();
    }
    
}
