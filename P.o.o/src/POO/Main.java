package POO;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int opcao;
				
	
	System.out.println("Você é :");
	System.out.println("1 - Aluno");
	System.out.println("2 - Professor");
		opcao = s.nextInt();
	
	
	switch(opcao) {
		case 1:
			Aluno pessoa = new Aluno();
			pessoa.matricular();
			pessoa.conferir();
			pessoa.alterar();
	
		
		
		
		
	}
	
}
}