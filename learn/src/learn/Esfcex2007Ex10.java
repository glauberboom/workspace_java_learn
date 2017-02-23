package learn;

public class Esfcex2007Ex10 {
		public static void main(String args[]) {
		final String a = "A";
		final String b = "B";
		String c = a+b;
		String d = a+b;
		System.out.print((c==c) + ",");
		System.out.print(((a+b)==(a+b)) + ",");
		System.out.print(c==d);
		}
}
