import java.util.Scanner;

public class asgn2 {

    public static void main(String[] args) {
        int input,flag;
        flag =1;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        int counter=0;
        int posCounter=0;
        int negCounter=0;
        while(flag==1){
            System.out.println("Enter the number: ");
            input = sc.nextInt();
            
            if (input ==0)
                break;
            else if(input>0)
                posCounter++;
            else
                negCounter++;
                
            counter++;
            total += input;
        }
        sc.close();
        float FlotTotal= (float) total;

        System.out.println("Number of positive inputs: "+posCounter);
        System.out.println("Number of negative inputs: "+negCounter);

        System.out.println("The average is: "+ (FlotTotal)/counter);

    }


}
