package learn;

public class Esfcex2007Ex11 {
		public static void main(String args[]) {
		String a = "A";
		String b = "B";
		String c = a+b;
		System.out.print(((a+b)==(a+b)) + ",");
		System.out.print(c.intern()==("A"+"B"));
		}
}
