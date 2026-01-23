package pgms;
import java.util.Scanner;
public class Mirror_sequence {
 public static boolean isMirror(int[] arr) {
	 int n=arr.length;
	 if(n%2!=0) {
	return false;
	 }
	 for(int i=0;i<n/2;i++) {
		 if(arr[i]!=arr[n-1-i]) {
			 return false;
		 }
	 }
	 return true;
}
 public static void main(String args[]) {
	 int[] arr= {1,2,3,3,6,1};
	 System.out.println(isMirror(arr));
 }
}
