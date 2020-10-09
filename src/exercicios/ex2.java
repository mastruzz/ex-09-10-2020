package exercicios;
import java.lang.reflect.Array;
import java.util.*;
public class ex2 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int somaP=0;
		int somaI=0;
		int x;
		int qi=0;
		int[] vetor = new int[6] ;
		
		for(x = 0; x < vetor.length; x++) {
			System.out.printf("Digite um numero: ");
			vetor[x] = scanner.nextInt();
			if(vetor[x] % 2 ==0) {
				somaP = vetor[x]+somaP;
				}else {
					somaI += vetor[x];
					qi++;
					
				}
			
			
				
					}
		System.out.printf("\n");
		for (x=0; x < vetor.length; x++) {
			System.out.print("[ " +vetor[x]+ " ]");
		}
		System.out.print("\nA soma dos pares é "+somaP);
		System.out.print("\nA soma dos ímpares é "+somaI);
		
	}

}
