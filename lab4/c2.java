package lab4;

import java.util.*;

class plate{

    int length, width;

    plate(){
        System.out.println("Enter the dimensions of the length and width: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        width = sc.nextInt();
    }

}

class box extends plate{

    int height;

    box(){

        System.out.println("Enter the height of the box: ");

        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
    }

}

class wood_box extends box {
    int thick;

    wood_box(){
        System.out.println("Enter the thickness of the box: ");

        Scanner sc = new Scanner(System.in);
        thick = sc.nextInt();
    }

    void display(){
        System.out.println("The dimensions are: ");

        System.out.println("Length: "+length);
        System.out.println("Width "+width);
        System.out.println("Height: "+height);      
        System.out.println("Thickness: "+thick);

    }
}



public class c2 {

    public static void main(String[] args) {
        
        wood_box obj = new wood_box();
        obj.display();
    }
    
}
