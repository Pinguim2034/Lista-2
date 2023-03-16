package exercicio_02;
import java.util.Scanner;
public class Exercicio_02 {
	public static void main (String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem-vindo ao jogo da velha!");
		System.out.println("Essas são as posições do jogo:\n1;1|1;2|1;3\n2;1|2;2|2;3\n3;1|3;2|3;3\n");
		System.out.println("O jogador 1 é o X e o jogador 2 é o O. Vamos começar:");
		Velha.preenche();
		do {
			int x, y;
			System.out.println("Jogador 1 insira as coordenadas:");
			x = scan.nextInt();
			y = scan.nextInt();
			
			Velha.J1(x, y);
			Velha.jogo();
			if(Velha.THEGAME()==true) {
				break;
			}
			System.out.println("Jogador 2 insira as coordenadas:");
			x = scan.nextInt();
			y = scan.nextInt();
			Velha.J2(x, y);
			Velha.jogo();
			if(Velha.THEGAME()==true) {
				break;
			}
		}while(Velha.THEGAME() == false);
		scan.close();
	}
}