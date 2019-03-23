
public class OSistem {
	private Tip tip;
	private int verzija;
	
	public OSistem() {
		tip = Tip.ANDROID;
		verzija = 1;
	}

	public OSistem(Tip tip, int verzija) {
		super();
		this.tip = tip;
		this.verzija = verzija;
	}

	public Tip getTip() {
		return tip;
	}

	public int getVerzija() {
		return verzija;
	}

	public void setTip(Tip tip) {
		this.tip = tip;
	}

	public void setVerzija(int verzija) {
		this.verzija = verzija;
	}

	@Override
	public String toString() {
		return "OSistem tip " + tip + ", verzija " + verzija;
	}
	
	
}
