package learn;

public class Esfcex2012Ex58 {
		public interface Eletrodomestico {
		public boolean ligado ();
		}
		public abstract class TV implements Eletrodomestico {
		public boolean ligado () {
		return (true);
		}
		public abstract void setNome(String nome);
		}
		public class LCD extends TV{
		private String nomeInterno;
		public void setNome(String nome){
		this.nomeInterno = nome;
		}
		}
		}

