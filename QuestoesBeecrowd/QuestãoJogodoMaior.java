package QuestoesBeecrowd;

import java.util.Scanner;

public class QuestãoJogodoMaior {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		while(n != 0) {
			Jogo maior = new Jogo();
			
			for(int i = 0; i < n;i++) {
				maior.vitoria(input.nextInt(),input.nextInt());
			}
			
			maior.pontuacao();
			n = input.nextInt();
		}
		
	}
}

class Jogo {
	
	int vitoriaJogador1;
	int vitoriaJogador2;
	
	public void vitoria(int numeroJogador1, int numeroJogador2) {
		if(numeroJogador1 == numeroJogador2) {
			return;
		}
		
		if(numeroJogador1 > numeroJogador2) {
			vitoriaJogador1++;
			return;
		}
		
		vitoriaJogador2++;
	}
	
	public void pontuacao() {
		System.out.println(vitoriaJogador1 + " " + vitoriaJogador2);
	}
}