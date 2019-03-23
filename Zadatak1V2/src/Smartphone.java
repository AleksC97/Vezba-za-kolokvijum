
public class Smartphone extends Telefon{
	private OSistem os;
	private StanjeUredjaja stanje;
	private int downloadProgres;
	
	public Smartphone() {
		stanje = StanjeUredjaja.ISKLJUCEN;
		downloadProgres = -1;
	}

	public Smartphone(OSistem os, StanjeUredjaja stanje, int downloadProgres, String brojTelefona) {
		super(brojTelefona);
		this.os = os;
		this.stanje = stanje;
		this.downloadProgres = downloadProgres;
	}
	
	boolean turnOff() {
		if(stanje == StanjeUredjaja.UKLJUCEN ) {
			stanje = StanjeUredjaja.ISKLJUCEN;
			downloadProgres = -1;
			return true;
		}
		return false;
	}
	
	boolean turnOn() {
		if(stanje == StanjeUredjaja.ISKLJUCEN ) {
			stanje = StanjeUredjaja.UKLJUCEN;
			downloadProgres = -1;
			return true;
		}
		return false;
	}
	
	boolean sleep() {
		if(stanje == StanjeUredjaja.UKLJUCEN) {
			stanje = StanjeUredjaja.STANDBY;
			downloadProgres = -1;
			return true;
		}
		return false;
	}
	
	boolean wakeUp() {
		if(stanje == StanjeUredjaja.STANDBY ) {
			stanje = StanjeUredjaja.UKLJUCEN;
			downloadProgres = -1;
			return true;
		}
		return false;
	}
	
	boolean finishUpdate() {
		if(stanje == StanjeUredjaja.AZURIRANJE && downloadProgres == 100) {
			stanje = StanjeUredjaja.UKLJUCEN;
			return true;
		}
		return false;
	}
	
	boolean startUpdate(int newVersionNumber) {
		if(stanje == StanjeUredjaja.UKLJUCEN) {
		 	stanje = StanjeUredjaja.AZURIRANJE;
			 os.setVerzija(newVersionNumber);
			downloadProgres = 0;
			return true;
		}
		return false;
	}
	
	boolean downloadBatch() {
		if(downloadProgres<100) {
			downloadProgres+=10;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Smartphone os " + os + ", stanje " + stanje + ", downloadProgres " + downloadProgres + " broj telefona "+ getBrojTelefona();
	} 
	

}
