package QuestoesBeecrowd;

import java.util.Scanner;

public class QuestãoInstruçõesdoRobô {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i = 0; i < N;i ++) {
			int instrucoes = input.nextInt();
			Robo meuRobo = new Robo();
			
			input.nextLine();
			for(int j = 0; j < instrucoes;j++) {
				meuRobo.instrucoes(input.nextLine());
			}
			
			System.out.println(meuRobo.getpX());
		}
		
	}
}

class Robo {
	
	private int pX;
	private String memoria[];
	private int tamanho;
	
	public Robo() {
		this.memoria = new String[110];
		this.pX = 0;
		this.tamanho = 0;
	}
	
	public void instrucoes(String instrucao) {
		memoria[tamanho++] = instrucao;
		
		if(instrucao.equals("RIGHT")) {
			pX++;			
			return;
		} else if(instrucao.equals("LEFT")) {
			pX--;
			return;
		}
		int numero = Integer.parseInt(instrucao.substring(8,instrucao.length()));
		
		sameAs(numero);
	}

	private void sameAs(int numero) {
		tamanho--;
		instrucoes(memoria[numero-1]);
	}

	public int getpX() {
		return pX;
	}
}