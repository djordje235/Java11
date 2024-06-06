import java.util.*;

 public class Glavna{
		 public static void main(String args[]) {
		       
		        Scanner scanner = new Scanner(System.in);
		        int n = scanner.nextInt();
		        Object[] niz = new Object[n];
		        
		        for(int i = 0; i< n/2;i++) {
		        	niz[i] = new K1();
		        }
		        for(int i = n/2; i< n;i++) {
		        	niz[i] = new K2();
		        }
		        
		    }
 }