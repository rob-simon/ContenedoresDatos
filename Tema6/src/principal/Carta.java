package principal;

public class Carta {

	String pal;
	String numero;
	static int numeroCarta=0;
	
	public Carta(String pal, String numero) {
		super();
		this.pal = pal;
		this.numero = numero;
		numeroCarta++;
	}

	public static int getNumeroCarta() {
		return numeroCarta;
	}



	public String getPal() {
		return pal;
	}

	public String getNumero() {
		return numero;
	}
	
	public boolean compara(Carta cartab){
		if (pal.equalsIgnoreCase(cartab.pal) && numero.equals(cartab.numero)){
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Carta numero=" + numero + ", pal=" + pal;
	}
	
	
	
}
