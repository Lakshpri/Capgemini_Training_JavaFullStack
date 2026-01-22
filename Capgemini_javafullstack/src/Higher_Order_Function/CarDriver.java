package Higher_Order_Function;

public class CarDriver {
	//higher order function
	
	public static void m1(car c) {
		c.add(10, 10);
	}
	
	
    public static void main(String args[]) {
    	//first way
    	/*car c1=(a,b)->{
    		System.out.println(a+b);
    		};
    		m1(c1);
    }*/
    	
    	//2nd way
    //
    	m1((a,b)->{
    System.out.println(a+b);
    
});
    }
}

