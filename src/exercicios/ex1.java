package exercicios;
import java.util.*;
public class ex1 {
	public static void main(String args[]) {
		int b;
		int[] a = {1,0,5,-2,-5,7};
		
		
		b = a[0]+ a[1] + a[5];
		System.out.println("A soma de A[0] + A[1] + A[5] é "+ b);
		
		a[3] = 100;
		
		for(int x = 0; x < 6 ; x++) {
			
		System.out.println("[ "+a[x]+" ]");
		
		}
		
	}
	
}
