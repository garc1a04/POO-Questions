package QuestoesBeecrowd;

import java.util.Scanner;

public class QuestaoOg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int filhos = input.nextInt();
		int filhas = input.nextInt();
		
		while(filhos != 0 && filhas != 0) {
			Og og = new Og();
			
			og.adicionasFilhos(filhas, filhos);
			System.out.println(og.totalFilhas());
		}
		
	}
}

class Og {
	
	int filhas;
	int filhos;
	
	
	public void adicionasFilhos(int filhas,int filhos) {
		this.filhas = filhas;
		this.filhos = filhos;
	}
	
	public int totalFilhas() {
		return filhas+filhos;
	}
}