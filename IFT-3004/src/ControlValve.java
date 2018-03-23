
public class ControlValve {

	private int ctrV;
	private boolean disponible = false;
	public synchronized int requeteValve(int id) {
		while (disponible == false) {
			try {System.out.println("Demande pour la valve, " + id );
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
	}

}
