
public class Program {

	public static void main(String[] args) {
		OSistem o = new OSistem(Tip.ANDROID, 6);
		Smartphone p = new Smartphone(o,StanjeUredjaja.UKLJUCEN, 0, "0212121");
		System.out.println(o.toString());
	
		System.out.println(p.toString());
		System.out.println(p.turnOff());
		System.out.println(p.turnOn());
		System.out.println(p.sleep());
		System.out.println(p.wakeUp());
	
		System.out.println(p.startUpdate(7));
		System.out.println(p.toString());
		
		for(int i = 0; i<10; i++) {
			p.downloadBatch();
		}
		System.out.println(p.finishUpdate());
		System.out.println(p.toString());
	}

}
