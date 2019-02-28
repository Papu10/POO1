package POO;

import java.util.Scanner;

public class Aluno {

	int matricula;
	String nome;
	int periodo;
	int idade;
	String curso;
	double cpf;
	double mensalidade=499.99;
	
	Scanner s = new Scanner(System.in);
	
	
	public void matricular() {
		
		System.out.println("Digite seu nome");
				nome = s.nextLine();
		
		System.out.println("Digite sua idade");
				idade = s.nextInt();
		
		System.out.println("Digite seu cpf");
				cpf = s.nextDouble();
		
		System.out.println("Digite o curso que deseja se matricular");
				curso = s.next();
				
		System.out.println("****************");
		
		System.out.println("****************");

	
		
	}
	public void exibir() {
		
		
	}
	public void conferir() {
		
		int opc;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("****** Conferindo Dados ******");
		
		System.out.println("Nome = "+nome);
		
		System.out.println("Idade = " + idade);
		
		System.out.println("CPF = "+ cpf);
		
		System.out.println("Curso em que foi matriculado ="+ curso);
		
		System.out.println("Custo mensal do curso = R$"+mensalidade);
		
		System.out.println("**********************************");
		
		System.out.println("Se estiver correto digite 1");
		
		System.out.println("Caso queria corrigir algo digite 2");
		
		opc = s.nextInt();
		
		switch(opc){
			
			case 1:
				System.out.println("Tudo certo, matricula concluida");
				
				System.exit(0);
				
				
		}
		
		
	}
	public void alterar() {
		System.out.println("Alterar algo");
		
	}
}
