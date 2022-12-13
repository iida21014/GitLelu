
public class LeluMain {

	public static void main(String[] args) {
		
		Lelu nukke = new Lelu("Molla", 20);
		
		nukke.tulostaTiedot();
		
		VieteriAuto auto1 = new VieteriAuto("Kilpuri", 10, 10);		
		
		auto1.tulostaTiedot();

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
		System.out.println("Paino: " + paino + "g");
	}
	
	
	
}

class VieteriAuto extends Lelu{
	
	public int nopeus;
	
	public VieteriAuto() {
		nimi="";
		paino=0;
		nopeus=0;
	}
	
	public VieteriAuto(String lelunNimi, int lelunPaino, int lelunNopeus ) {
		nimi=lelunNimi;
		paino=lelunPaino;
		nopeus=lelunNopeus;
	}
	public void kiihdyta() {
		nopeus = nopeus ++;
	}
	
	@Override
	public void tulostaTiedot() {
		super.tulostaTiedot();
		System.out.println("Nopeus: " + nopeus + "km/h");
	}
}