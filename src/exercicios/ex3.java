package exercicios;
import java.util.*;
public class ex3 {
 public static void main(String ags[]) {
	 int[][] matriz = new int[3][3];
	 Scanner Sc = new Scanner(System.in);
	 int maior10 = 0;
	 
	 for(int linha = 0; linha < 3; linha++) {
		 for(int coluna = 0; coluna < 3 ; coluna++) {
			 System.out.printf("Digite um numero: M[%d][%d]: ",linha +1, coluna +1);
			 matriz[linha][coluna] = Sc.nextInt();
			 if(matriz[linha][coluna] > 10) {
				 maior10++;
			 }
			 
		 }
	 }
	 System.out.println("\n \t \t ----------- MATRIZ FORMADA --------------");
	 for(int linha = 0; linha < 3; linha++) {
		 for(int coluna = 0; coluna < matriz.length ; coluna++) {
			 System.out.printf("\t [ %d %s", matriz[linha][coluna]," ]");
			 
		 }
		 System.out.println();
		 }
	 System.out.println("\nA matriz tem  "+ maior10+ " elementos maior que 10!");
	
 }
}
