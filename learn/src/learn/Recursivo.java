package learn;

import java.util.Scanner;


public class Recursivo {
	
	static int recursivo(int n){
		if((n%2)==0){
			return(2);
		}else{
			return(recursivo(n+2));
		}
	}
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		System.out.printf("Informe um número para a recursivo: ");
		n = ler.nextInt();
		recursivo(n);
		System.out.println(n);	
	}
}
