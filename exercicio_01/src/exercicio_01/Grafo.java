package exercicio_01;
import java.util.Random;
public class Grafo {
	public static boolean[][] construir(int x) {
		boolean[][] matrizvf = new boolean[x][x];
		Random rd = new Random();
		for(int i=0;i<x;i++) {
			for(int j = 0; j<x;j++) {
				if(i==j) {
					matrizvf[i][j] = false;
				}
				else {
					matrizvf[i][j] = rd.nextBoolean();
				}
			}
		}
		return(matrizvf);
	}
	
	
	
	public static void vizinhos(boolean grafo[][], int n1, int n2) {
		if(grafo[n1][n2]== true) {
			System.out.println("Os vértices são vizinhos.");
		}
		if(grafo[n1][n2]== false) {
			System.out.println("Os vértices não sao vizinhos.");
		}
	}
	
	public static void listavizinho(boolean grafo[][], int n1, int x) {
		int j = 0;
		int[] acumuladora = new int[x];
		for(int i=0;i<x;i++) {
			if(grafo[n1][i]==true) {
				acumuladora[j] = i+1;
				j++;
			}
		}
		System.out.println("Os vizinhos do vértice " + n1 + " são:");
		for(int i = 0; i<x; i++) {
			if(acumuladora[i]==0) {
				break;
			}
			System.out.println(acumuladora[i]);
		}
	}
}
