package QuestoesBeecrowd;

import java.util.Scanner;

public class QuestãoDeQuemeaVez {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = input.nextInt();
		
		for(int i = 0; i < N; i++) {
			Jogador player1 = new Jogador(input.next(), input.next());
			Jogador player2 = new Jogador(input.next(), input.next());
			
			player1.setDedos(input.nextLong());
			player2.setDedos(input.nextLong());
			
			Jogo parImpar = new Jogo(player1,player2);
			System.out.println(parImpar.ganhador());
		}
		
	}
}

class Jogo {
	
	private Jogador player1;
	private Jogador player2;
	
	public Jogo(Jogador player1, Jogador player2) {
		this.player1 = player1;
		this.player2 = player2;
	}
	
	
	public String ganhador() {
		long soma = player1.getDedos() + player2.getDedos();
		
		if(player1.getEscolha().equals("PAR")) {
			
			if(soma%2 == 0) {
				return player1.getNome();
			}
			
			return player2.getNome();
		}
		
		
		if(soma%2 == 1) {
			return player1.getNome();
		}
		
		return player2.getNome();
	}
	
}

class Jogador {
	
	private String nome;
	private String escolha;
	private long dedos;
	
	public Jogador(String nome, String escolha) {
		this.nome = nome;
		this.escolha = escolha;
	}
 	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscolha() {
		return escolha;
	}
	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
	public long getDedos() {
		return dedos;
	}
	public void setDedos(long dedos) {
		this.dedos = dedos;
	}
	
	
	
}