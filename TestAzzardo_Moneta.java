
public class TestAzzardo_Moneta {

	public static void main(String[] args) {
		final int numeroTiri = 1000;  //numero di tiri per il test
		final float percentualeTolleranza = ((numeroTiri * 15)/ 100);    //15% di tolleranza
		
		int testa = 0;
		int croce = 0;
		
		Moneta1 m1 = new Moneta1();
		Moneta2 m2 = new Moneta2();
		
		
		for (int i=0; i<numeroTiri; i++) {
			if (m1.lancio() == 0) {
				testa++;
			}
			else {
				croce++;
			}
			
		} // end of for cycle
		
		System.out.println("Moneta 1 e' uscito " + testa + " volte testa e " + croce + " volte croce");
		
		if ((testa > croce) && ((testa - croce) > percentualeTolleranza)) {
			System.out.println("Moneta 1 e' truccata");
		}
		if ((croce > testa) && ((croce - testa) > percentualeTolleranza)) {
			System.out.println("Moneta 1 e' truccata");
		}
		
		testa = 0;
		croce = 0;
		
		for (int i=0; i<numeroTiri; i++) {
			if (m2.lancio() == 0) {
				testa++;
			}
			else {
				croce++;
			}
			
		} // end of for cycle
		
		System.out.println("Moneta 2 e' uscito " + testa + " volte testa e " + croce + " volte croce");
		
		if ((testa > croce) && ((testa - croce) > percentualeTolleranza)) {
			System.out.println("Moneta 2 e' truccata");
		}
		if ((croce > testa) && ((croce - testa) > percentualeTolleranza)) {
			System.out.println("Moneta 2 e' truccata");
		}
		
	}

}
