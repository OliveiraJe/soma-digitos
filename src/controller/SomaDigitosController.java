package controller;

public class SomaDigitosController {
	public SomaDigitosController() {
		super();
	}
	
	public int soma(int a) {
		//condição de parada
		if(a == 0) {
			return 0;
		}
		
		//O último dígito é somado a chamada recursiva do número sem o último digito
		else {
			return (a % 10) + soma(a / 10);
		}
	}
}
