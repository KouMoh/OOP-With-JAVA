package exception_handling;


class MyException extends Exception{

    MyException(String message){
        super(message);
    }

    private int detail;

    MyException(int a){
        detail = a;
    }

    public String toString(){
        return "My Exception["+ detail +"]";
    }

}






public class user {
    
    static void compute(int a) throws MyException {

        System.out.println("Called compute("+a +")");

        if(a>10)
            throw new MyException(a);
        else
            System.out.println("Normal exit");



    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);

        } catch(MyException e){
            System.out.println(e);
        }
    }
}