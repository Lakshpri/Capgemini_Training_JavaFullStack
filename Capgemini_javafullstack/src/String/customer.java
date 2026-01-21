package String;
import java.util.Scanner;

	public class customer extends atm {

	    public customer(Double money) {
	        setMoney(money);
	        setBalance(money);
	    }

	    public customer(String name, Double money) {
	        this(money);        
	        setName(name);
	    }
	}

  
