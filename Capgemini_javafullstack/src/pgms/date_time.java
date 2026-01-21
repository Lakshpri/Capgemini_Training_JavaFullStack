package pgms;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
public class date_time {
  public static void main(String[] args) {
	  //Date Example
	  
	  LocalDate today = LocalDate.now();
	  System.out.println(today);	  
	//currency example
	  double amount=123456789;
	  NumberFormat usdformat=NumberFormat.getCurrencyInstance(Locale.US);
	  System.out.println(usdformat.format(amount));
	  
	  // parsing a strin+=-
	  
	  String datestr ="20/01/2026";
	  DateTimeFormatter df= DateTimeFormatter.ofPattern("dd/MM/yyyy");
	  LocalDate date= LocalDate.parse(datestr,df);
	  System.out.println(date);
	  
	  //Tokenizing the STring
	  String csv="Apple,orange,banaana";
	  String[] fruits=csv.split(",");
	  System.out.println(Arrays.toString(fruits));//if didnt used the arrays.tostring will get refernce this is tokenizing
	  
	  //formatting the output
	  System.out.printf("item:%s| price:%d", "coffe",20);//printf kandippa irukanum but mostly namma use panrathavechi format pananum na String irukanum
	  String res =String.format("item:%s| price:%d", "coffe",20);
	  System.out.println(res);
  }
}