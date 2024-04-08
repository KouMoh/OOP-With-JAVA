package lab4;

import java.util.*;

public class elec {
    public static void main(String[] args) {
        
    int units;
    double cost =0;
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the units of electricity: ");

    units = sc.nextInt();
    sc.close();

    if(units<=50)
        cost  = cost + units*0.5;
    
    else if( units >50 && units<=150)
        cost = cost + (units-50) * 0.75 + 25;

    else if(units>150 && units<=250)
        cost = cost + (units-150) * 1.20 + (25 + 75) ;
    else {
        cost = cost + (units-250) * 1.50 + (25+75+120);
        
    }

    System.out.println("The total bill is Rs."+(cost +( cost*(0.2))));
}

}
