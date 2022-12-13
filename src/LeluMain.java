
public class LeluMain {

	public static void main(String[] args) {
		

	}

}

class Lelu{
	
	public String nimi;
	public int paino;
	
	
	
	public Lelu() {
		nimi="";
		paino=0;
	}
	
	public Lelu (String lelunNimi, int lelunPaino) {
		nimi = lelunNimi;
		paino = lelunPaino;
	}
	
	public void tulostaTiedot() {
		System.out.println("Nimi: " + nimi);
		System.out.println("Paino: " + paino);
	}
	
	
	
}

class VieteriAuto extends Lelu{
	
	public int nopeus;
	
	public VieteriAuto() {
		nimi="";
		paino=0;
		nopeus=0;
	}
	
	public void kiihdyta() {
		nopeus = nopeus ++;
	}
	
	@Override
	public void tulostaTiedot() {
		super.tulostaTiedot();
		System.out.println("Nopeus: " + nopeus);
	}
}