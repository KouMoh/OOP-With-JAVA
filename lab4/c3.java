package lab4;

import java.util.*;

class Apple{
    
    void show(){
        System.out.println("This is an apple!");
    }
}

class Banana extends Apple{

    void show(){
        System.out.println("This is a banana!");
    }
}

class Cherry extends Apple{
    void show(){
        System.out.println("This is a cherry!");
    }
}



public class c3 {

    public static void main(String[] args) {
        Apple obj = new Apple();

        Scanner sc = new Scanner(System.in);
        String input;

        while(1>0){

        System.out.println("Enter the fruit: ");
        input = sc.nextLine();

        if(input.equals("Apple")){
            obj.show();
        }
        else if(input.equals("Banana")){
            obj = new Banana();
            obj.show();
        }
        else if(input.equals("Cherry")){

            obj = new Cherry();

            obj.show();
        }
        else if(input.equals("End")){
            break;
        }
        else{
            System.out.println("Invalid input!");
        }        

    }

    sc.close();

    }
}
