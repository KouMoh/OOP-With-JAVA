package exception_handling;

class ThrowOne{
    void Throwyo() throws IllegalAccessException {
        System.out.println("Inside there is an exception!");
        throw new IllegalAccessException("yo");
    }
}


public class thethrow {
    
    public static void main(String[] args) {
        ThrowOne vr = new ThrowOne();
        try{
            vr.Throwyo();
        }
        catch(IllegalAccessException e){
            System.out.println(e.getMessage());
        }
    }
    

}
