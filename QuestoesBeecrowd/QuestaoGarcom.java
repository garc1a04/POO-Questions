package QuestoesBeecrowd;

import java.util.Scanner;

public class QuestaoGarcom {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroBandejas = input.nextInt();
		Garcom garcom = new Garcom();
		
		for(int i = 0; i < numeroBandejas; i++) {
			garcom.bandeja(input.nextInt(), input.nextInt());
		}
		
		System.out.println(garcom.coposQuebrados);
	}
}


class Garcom {
	
	int coposQuebrados;
	
	public void bandeja(int latas,int copos) {
		if(latas <= copos) {
			return;
		}
		
		coposQuebrados += copos;
	}
	
	
}