package atividade5;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {

		Scanner grava = new Scanner (System.in);
		
		int menu=1;
		
		
		do {
			
			System.out.println("Digite o n�mero indicado para abrir uma op��o:\n1- Calculo de dinheiro gasto com cigarro na sua vida.\n2-Quociente e resto da divis�o entre dois n�meros.\n0 - Sair do programa");
			menu = grava.nextInt();
			
			if(menu==1) {
				System.out.println("Digite a quantidade de anos que voc� fuma:");
				int anos;
				anos = grava.nextInt();
				System.out.println("Digite a quantidade de cigarros que voc� fuma ao dia:");
				int macos;
				macos = grava.nextInt();
				System.out.println("Digite o pre�o unit�rio do seu cigarro:");
				float preco;
				preco = grava.nextFloat();
				float totalgasto = (anos*365)*macos*preco;
				System.out.println("Voc� j� gastou R$ " + totalgasto +",00");
				System.out.println("\n");
				menu++;
				
				
				
			} else if(menu==2) {
				System.out.println("Digite o dividendo: ");
				float dividendo;
				dividendo = grava.nextFloat();
				System.out.println("Digite o divisor: ");
				float divisor;
				divisor = grava.nextFloat();
				System.out.println("O quociente dessa divis�o � " + (dividendo/divisor) + " e o resto � " + (dividendo%divisor) );
				System.out.println("\n");
				menu++;
				
				
			} 
			
			
			
			
		}while(menu!=0);
	}

}
