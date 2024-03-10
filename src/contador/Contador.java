package contador;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = terminal.nextInt();
		
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	static boolean validarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException  {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
			
		} else if(parametroUm == 0 && parametroDois == 0) {
			throw new ParametrosInvalidosException("Os parametros devem ser diferentes de 0!");
		}
		
		return true;
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(validarParametros(parametroUm, parametroDois)) {
			int contagem = parametroDois - parametroUm;
			
			for(int i=0; i < contagem; i++) {
				System.out.println("Imprimindo o numero " + (i+1));
			}
		}
	}
}