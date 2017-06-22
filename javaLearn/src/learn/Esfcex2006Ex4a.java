/*package learn;

public class Esfcex2006Ex4a{
	private static String[] sa = new String[]{
			"X","Y","Z"
	};
	public static void main (String[] args) {
		synchronized (sa) {
			Thread t1 = new A(sa);
			t1.start();
			sa[0] = "A"; sa[1] = "B"; sa[2] = "C";
		}
	}
}
*/

