package primoscliente;

import java.util.Scanner;

import soap.primosserver.PrimosCalc;
import soap.primosserver.PrimosCalcService;;

public class Main {

	public static void main(String[] args) {
		
		p = new Primos().getPrimosPort();
		
		int option = 0;

		Scanner sc = new Scanner(System.in);

		while (option != 6) {

			System.out.println("Numeros Primos:");
			System.out.println("1 - Primos:");
			System.out.println("2 - Sair:");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Escolha 1.");
				option = 1;
				
				@WebMethod(operationName = "primo")
				@WebResult(name = "resultado_primo")
		        for (@WebParam(name = "numero") int i = 2; i <= 100; i++) {
		            if( p.testandoPrimo(i) )
		                System.out.println(i + " é primo.");
		        }
				
				break;

			case 2:				
				System.out.println("Escolha 2.");
				option = 6;
				
				break;

			default:
				break;
			}
		}		
	}

}
