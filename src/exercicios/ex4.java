package exercicios;
import java.util.*;
public class ex4 {
	public static void main(String args[]) {
		Scanner Sc = new Scanner(System.in);
		
		//construcao da matriz//
		
		int[][] matrizA = new int[2][2], matrizB = new int[2][2];
		int[][]	matrizSoma = new int[2][2],matrizSub = new int[2][2],matrizConst = new int[2][2];
		
		//cria a matriz A
		for ( int l = 0; l < matrizA.length; l++) {
			for(int c = 0; c < matrizA.length; c++) {
				System.out.printf("Digite um numero: M.A[%d][%d]: ",l +1, c +1);
				matrizA[l][c] = Sc.nextInt();
			}
			
		}
		//cria a matriz B
		for(int linha = 0; linha < matrizB.length; linha++) {
			for(int coluna = 0; coluna < matrizB.length; coluna++) {
				System.out.printf("Digite um numero: M.B[%d][%d]: ",linha +1, coluna +1);
				
				matrizB[linha][coluna] = Sc.nextInt();
			}
			
		}
		//soma matriz A e B
		
		for(int linha = 0; linha < matrizSoma.length; linha++) {
			for(int coluna = 0; coluna < matrizSoma.length; coluna++) {
				matrizSoma[linha][coluna] = matrizB[linha][coluna] + matrizA[linha][coluna];
		
		
			}
		}
		//SUBTRAÇÃO DAS MATRIZES
		for(int linha = 0; linha < matrizSub.length; linha++) {
			for(int coluna = 0; coluna < matrizSub.length; coluna++) {
				matrizSub[linha][coluna] = matrizA[linha][coluna] - matrizB[linha][coluna];
			}
		}
		
		//AQUI APARECE A MATRIZ PRONTA\\
		
		
		System.out.print("\n ------------ MATRIZ A ----------------\n");
		for(int linha = 0; linha < matrizA.length; linha++) {
			 for(int coluna = 0; coluna < matrizA.length ; coluna++) {
				 System.out.printf("\t [ %d %s", matrizA[linha][coluna]," ]");
				 
			 }
			 System.out.println();
			 }
		System.out.print("\n ------------ MATRIZ B ----------------\n");
		for(int linha = 0; linha < matrizB.length; linha++) {
			 for(int coluna = 0; coluna < matrizB.length ; coluna++) {
				 System.out.printf("\t [ %d %s", matrizB[linha][coluna]," ]");
				 
			 }
			 System.out.println();
			 }
		System.out.print("\n ------------ SOMA DAS MATRIZES ----------------\n");
		for(int linha = 0; linha < matrizB.length; linha++) {
			 for(int coluna = 0; coluna < matrizB.length ; coluna++) {
				 System.out.printf(" [ %d %s", matrizSoma[linha][coluna]," ]");
				 
			 }
			 System.out.println();
			 }
		System.out.print("\n ------------ SUBTRAÇÃO DAS MATRIZES ----------------\n");
		for(int linha = 0; linha < matrizB.length; linha++) {
			 for(int coluna = 0; coluna < matrizB.length ; coluna++) {
				 System.out.printf("[ %d %s", matrizSub[linha][coluna]," ]");
				 
			 }
			 System.out.println();
			 }
		
	}

}
