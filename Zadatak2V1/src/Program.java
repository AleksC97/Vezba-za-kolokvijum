
public class Program {

	public static void main(String[] args) {
		Televizor t = new Televizor(Stanje.UKLJUCEN, 5, 3);
		ispisiTelevizor(t);
		t.ukljuci();
		ispisiTelevizor(t);
		t.iskljuci();
		ispisiTelevizor(t);
		t.ukljuci();
		ispisiTelevizor(t);
		t.pokvaren();
		ispisiTelevizor(t);
		t.popravi();
		ispisiTelevizor(t);
		t.pojacajZvuk();
		ispisiTelevizor(t);
		t.smanjiZvuk();
		ispisiTelevizor(t);
		t.promeniKanal(5);
		ispisiTelevizor(t);
	}
	public static void ispisiTelevizor(Televizor p) {
		System.out.println("Trenutna jacina zvuka je " + p.getJacinaZvuka()
		+ " ,a trenutni kanal je " + p.getTrenutniKanal());
	}
}
