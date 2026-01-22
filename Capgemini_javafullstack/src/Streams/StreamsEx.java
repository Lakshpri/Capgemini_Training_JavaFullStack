package Streams;
import java.util.ArrayList;
import java.util.List;
public class StreamsEx {
         public static void main(String[] args) {
        	 ArrayList<Integer> a1=new ArrayList<Integer>();
        	 a1.add(1);
        	 a1.add(2);
        	 a1.add(3);
        	 a1.add(4);
        	  List s1= a1.stream().filter(a->a%2==0).toList();
        	  System.out.println(s1);
         }
	
	
	
	
	
}
