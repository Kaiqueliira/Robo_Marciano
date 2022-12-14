package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {

		Scanner input = new Scanner(System.in);

		System.out.println("Olá me chamo Marciano, vou te passar algumas informações.");
		System.out.println("Para Calculos Matematicos digite: some, subtraia, multiplique ou divida");
		System.out.println("Se falar agir, te faço algumas coisas especiais...");

		boolean iniciar = true;

		Robo robo =  new Robo();

		while(iniciar) {
			System.out.println("Marciano: - Só falar, que te respondo.");
			String resposta = input.nextLine();

			if(!resposta.toUpperCase().equals("FIM")) {

				System.out.println(robo.responda(resposta));

			}else {

				System.out.println("Marciano: - Te vejo em Breve...");
				iniciar=false;
			}


		}
	}
}
