package lab4;

import java.util.*;

class two_d{

    int cost = 40;
    double dimL,dimB, total;

    void price(){
        System.out.println("Enter the dimensions of length and breadth of the sheet in ft. respectively: ");
        Scanner sc = new Scanner(System.in);
        dimL= sc.nextDouble();
        dimB = sc.nextDouble();

        total = (dimL*dimB) / cost ;
    }

    void display(){
        System.out.println("The total cost is Rs. "+total);
    }

}

class three_d extends two_d{

    int Ncost = 60;
    double dimH;
    
    void price(){

        super.price();
        System.out.println("Enter the height of the box: ");
        Scanner sc = new Scanner(System.in);

        dimH= sc.nextDouble();

        total = (dimH*dimL*dimB)/Ncost;
    }

    void dis(){
        System.out.println("The total cost of the box is Rs. "+total);
    }


}



public class c1 {

    public static void main(String[] args) {
        three_d box = new three_d();

        box.price();
        box.dis();
    }
    
}
