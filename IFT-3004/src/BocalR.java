
public class BocalR {

	private int bcl;
	private boolean disponible = false;
	*/public synchronized int prendre(int id) {
		while (disponible == false) {
			try {System.out.println("Attente de production, processus "+ id );
			wait();}
			catch (InterruptedException e) { }
		}
		disponible = false; notifyAll(); return pce;
	}
	public synchronized void mettre(int val, int id) {
		while (disponible == true) {
			try {System.out.println("Attente de consommation, processus "+ id);
			wait();} catch (InterruptedException e) { }
		}
		pce = val; disponible = true; notifyAll();
	}*/

}
