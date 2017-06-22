package learn;

public class excecoes {
		public static void main(String[] args)
		{
		try { throwException (); }
		catch (Exception exception) { System.out.printf (" 1 ");}
		}
		public static void throwException () throws Exception
		{
		try { System.out.printf (" 2 "); throw new Exception (); }
		catch (RuntimeException runtimeException) { System.out.printf (" 3 ");}
		finally {System.out.printf (" 4 ");}
		}
	}

