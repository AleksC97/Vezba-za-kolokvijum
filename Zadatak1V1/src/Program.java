
public class Program {

	public static void main(String[] args) {
		
		Pas pas= new Pas("Rex", "Retriver", 10, Boja.SMEDJA, true);
		System.out.println(pas.toString());
		
		System.out.println(pas.nahraniPsa(50));
		
		pas.godinaProsla();
		System.out.println(pas.toString());
		ispisiPsa(pas);
	
	}
	public static void ispisiPsa(Pas p) {
		System.out.println(p.getNaziv());
	}

}
