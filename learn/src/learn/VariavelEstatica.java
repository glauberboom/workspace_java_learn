package learn;

public class VariavelEstatica {
	private static int a = 0;
	public VariavelEstatica(){
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) {
		VariavelEstatica x = new VariavelEstatica();
		VariavelEstatica y = new VariavelEstatica();
		VariavelEstatica z = new VariavelEstatica();
		
	}

}
