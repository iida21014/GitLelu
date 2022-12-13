
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