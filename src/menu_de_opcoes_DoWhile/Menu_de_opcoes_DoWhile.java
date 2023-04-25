package menu_de_opcoes_DoWhile;

import java.util.Scanner;

public class Menu_de_opcoes_DoWhile {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int opcao;
		double salario, imposto, aumentoSalario;
		
		do {
			System.out.println("*Menu de opções:* \n1 – Imposto, \n2 – Novo Salário, \n3 – Classificação, \n4 – Finalizar o programa. \n*Digite a opção desejada.* ");
			opcao = input.nextInt();
			if(opcao == 1) {
				System.out.println("Digite o salário");
				salario = input.nextDouble();
				if (salario < 500) {
					imposto = salario * 0.05;
					System.out.println("Valor do Imposto, R$"+ imposto);
				}else if (salario >= 500 && salario <= 850) {
					imposto = salario * 0.1;
					System.out.println("Valor do Imposto, R$"+ imposto);
				}else {
					imposto = salario * 0.15;
					System.out.println("Valor do Imposto, R$"+ imposto);
				}
			}
			
			if(opcao == 2) {
				System.out.println("Digite o salário");
				salario = input.nextDouble();
				if (salario > 1500) {
					aumentoSalario = salario + 250;
					System.out.println("Valor do novo salário, R$"+ aumentoSalario);
				}else if (salario >= 750 && salario <= 1500) {
					aumentoSalario = salario + 50;
					System.out.println("Valor do novo salário, R$"+ aumentoSalario);
				}else if (salario >= 450 && salario <= 750) {
					aumentoSalario = salario + 75;
					System.out.println("Valor do novo salário, R$"+ aumentoSalario);
				}else {
					aumentoSalario = salario + 100 ;
					System.out.println("Valor do novo salário, R$"+ aumentoSalario);
				}
			}
			
			if(opcao == 3) {
				System.out.println("Digite o salário");
				salario = input.nextDouble();
				if (salario < 700) {
					System.out.println("Mal remunerado");
				}else {
					System.out.println("Bem remunerado");
				}
			}
		} while (opcao != 4);
		System.out.println("Programa encerrado.");
	}

}
