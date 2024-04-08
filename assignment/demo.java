package assignment;
import java.util.*;
import assignment.geometry.*;

public class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r;
        System.out.println("Enter the radius of the circle: ");
        r =sc.nextInt();
        sc.close();

        circle cr = new circle();
        cr.setRadius(r);
        System.out.println("Area: "+cr.getRadius()*cr.getRadius()*3.14);
        System.out.println("Perimeter: "+cr.getRadius()*2*3.14);


    }
}
