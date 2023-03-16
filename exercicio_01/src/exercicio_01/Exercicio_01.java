package exercicio_01;
import java.util.Scanner;
public class Exercicio_01 {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		int x;
		System.out.println("Insira a quantidade de vértices do grafo:");
		x = scan.nextInt();
		boolean[][] grafo = Grafo.construir(x);
		int n1, n2;
		System.out.println("Insira dois números para ver se são vizinhos:");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		Grafo.vizinhos(grafo, n1-1, n2-1);
		System.out.println("Insira um vértice para saber todos os seus vizinhos:");
		n1 = scan.nextInt();
		Grafo.listavizinho( grafo, n1, x);
		scan.close();
	}
}
