package exercicio_02;

public class Velha {
	private static char[][] grade = new char[3][3];
	public static void preenche() {
		for(int i = 0; i < 3; i++) {
	    	for(int j = 0; j < 3; j++) {
	        	grade[i][j] = ' ';
	    	}
		}
	}
	
	public static void jogo(){
		for (int i = 0; i < 3; i++) { 
	        for (int j = 0; j < 3; j++) {
	        	if(j==2) {
	        		System.out.print(grade[i][j]);
	        		break;
	        	}
	            System.out.print(grade[i][j] + "|");
	        }
	        System.out.println();
		}
	}
	public static void J1(int x,int y) {
		if(grade[x-1][y-1]=='O'||grade[x-1][y-1]=='X') {
			System.out.println("Jogada inválida.");
		}
		else{grade[x-1][y-1]='X';}
	}
	public static void J2(int x,int y) {
		if(grade[x-1][y-1]=='X'||grade[x-1][y-1]=='O') {
			System.out.println("Jogada inválida.");
		}
		else{grade[x-1][y-1]='O';}
			}
	public static boolean THEGAME() {
		for(int j=0;j<3;j++) {
			int i = 0;
			if(grade[i][j]=='X'&& grade[i+1][j]=='X' && grade[i+2][j]=='X') {
				Velha.J1win();
				return true;
			}
			if(grade[j][i]=='X'&& grade[j][i+1]=='X' && grade[j][i+2]=='X') {
				Velha.J1win();
				return true;
			}
			if(grade[i][j]=='O'&& grade[i+1][j]=='O' && grade[i+2][j]=='O') {
				Velha.J2win();
				return true;
			}
			if(grade[j][i]=='O'&& grade[j][i+1]=='O' && grade[j][i+2]=='O') {
				Velha.J2win();
				return true;
			}
			if(grade[i][i]=='X'&& grade[i+1][i+1]=='X'&& grade[i+2][i+2]=='X') {
			Velha.J1win();
			return true;
		}
			if(grade[i][i]=='O'&& grade[i+1][i+1]=='O'&& grade[i+2][i+2]=='O') {
				Velha.J2win();
				return true;
			}
		}
		int x = 0;
		for(int i = 0; i < 3; i++) {
		    for(int j = 0; j < 3; j++) {
		       if(grade[i][j] != ' ') {
		    	   x++;
		       }
		    }
		}
		if(x==9) {
			Velha.Empate();
			return true;
		}
		return false;
	}
	private static void J1win() {
		System.out.println("PARABÉNS JOGADOR 1!!!\n Você venceu!");
	}
	private static void J2win() {
		System.out.println("PARABÉNS JOGADOR 2!!!\n Você venceu!");
	}
	private static void Empate() {
		System.out.println("EMPATOU QUE PENA HAHAHAHAHAHAHAHAHAHAAHAHHAH!");
	}
}
