package Adv_num;

import java.util.Scanner;

public class adivinha_numero {
	
	public static void main(String[] args) {
		
		Scanner tcd = new Scanner(System.in);
		
		int numSecreto = (int)(Math.random()*100);
		
		System.out.println("Digite um número para adivinhar");
		
		int numDigitado = tcd.nextInt();
		
		boolean isCorrect  = false;
		while (!isCorrect) {
			
			if(numDigitado > numSecreto) {
				System.out.println("O número secreto é menor");
			}
			
			if(numDigitado < numSecreto) {
				System.out.println("O número secreto é maior");
			}
			if(numDigitado == numSecreto) {
				System.out.println("Você ganhou");
				isCorrect = true;
				}
			numDigitado =tcd.nextInt();
		}
			
		}
	
}

