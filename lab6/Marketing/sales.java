package lab6.Marketing;

public class sales extends lab6.General.employee{

    sales(){
    super();
    }
    double tallowance() {

        double ear = earning();
        return 0.05* ear;

    }

    public static void main(String[] args) {
        sales s = new sales();

        System.out.println("The emp id: "+s.empid);
        System.out.println("The total earning is: "+s.earning());
    }


}


