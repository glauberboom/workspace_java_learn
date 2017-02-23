package learn;

public class Esfcex2006Ex4 extends Thread {
	String[] sa;
	public void A(String[] sa) {
		this.sa = sa;
	}
	public void run() {
		synchronized (sa) {
			System.out.print(sa[0] + sa[1] + sa[2]);
		}
	}
}
