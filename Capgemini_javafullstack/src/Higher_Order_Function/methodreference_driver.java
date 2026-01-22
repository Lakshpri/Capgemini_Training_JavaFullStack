package Higher_Order_Function;

public class methodreference_driver {

    public static void m1() {
        System.out.println("something");
    }

    public static void main(String[] args) {

        methodreference i = methodreference_driver::m1;
        i.m1();
    }
    
    /*
     * public void m(){
     * System.out.println("Something") 
     * }
     * public static void main(String args[]){
     * InterClass i= new InterClass();
     * Inter i1=i::m;
     * i1.m1();    */
}

