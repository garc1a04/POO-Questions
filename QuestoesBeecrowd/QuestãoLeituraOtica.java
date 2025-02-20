package QuestoesBeecrowd;

import java.util.Scanner;

public class QuestãoLeituraOtica {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		while(N != 0) {
			
			for(int i = 0;i < N;i++) {
				
				int vetor[] = new int[5];
				
				for(int j = 0; j < vetor.length;j++) {
					vetor[j] = input.nextInt();
				}
				
				Leitura otica = new Leitura(vetor);
				System.out.println(otica.alternativaMarcada());
			}
			
			N = input.nextInt();
		}
		
	}
}

class Leitura {
	
	private int valores[];
	
	public Leitura(int valores[]) {
		this.valores = valores;
	}
	
	public char alternativaMarcada() {
		boolean marcouDemais = false;
		char nota = '*';
		
		for(int i = 0; i < valores.length;i++) {

			if(valores[i] <= 127) {
				
				if(nota != '*') {
					marcouDemais = true;
					break;
				}
				
				nota = alternativas(i);
			}

			
		}
		
		return marcouDemais ? '*' : nota;
	}

	private char alternativas(int alternativa) {
		
		switch (alternativa) {		
			case 0:
				return 'A';
			case 1:
				return 'B';
			case 2:
				return 'C';
			case 3:
				return 'D';
			case 4:
				return 'E';
		}
		
		return '*';
	}
	
}