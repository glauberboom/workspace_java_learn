package learn;

public class Esfcex2012Ex57 {
	public static void main(String args[]) {
		int op, acumulador = 0;
			op = 0;
		while (op < 9) {
			++op;
			switch(op%3) {
			case 1:
				acumulador += op;
			case 2:
				acumulador -= op;
				break;
			default:
				continue;
			} 
		acumulador += op;
		}
		System.out.println (acumulador);
		}
}
