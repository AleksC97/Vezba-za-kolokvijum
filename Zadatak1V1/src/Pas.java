
public class Pas {
	private String naziv;
	private String rasa;
	private int starost;
	private Boja boja;
	private boolean gladan;
	
	public Pas() {
		super();
	}

	public Pas(String naziv, String rasa, int starost, Boja boja, boolean gladan) {
		super();
		this.naziv = naziv;
		this.rasa = rasa;
		this.starost = starost;
		this.boja = boja;
		this.gladan = gladan;
	}

	public String getNaziv() {
		return naziv;
	}

	public String getRasa() {
		return rasa;
	}

	public int getStarost() {
		return starost;
	}

	public Boja getBoja() {
		return boja;
	}

	public boolean isGladan() {
		return gladan;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	
	boolean nahraniPsa(int kolicinaHrane) {
		if(kolicinaHrane > 10 && gladan) {
			return gladan = false;
		}
		return true;
	}
	
	void godinaProsla() {
		starost++;
	}

	@Override
	public String toString() {
		return "Naziv " + naziv + ", rasa " + rasa + ", starost " + starost + ", boja " + boja + ", gladan "
				+ gladan;
	}
	
}
