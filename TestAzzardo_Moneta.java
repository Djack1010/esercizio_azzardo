
public class TestAzzardo_Moneta {

	public static void main(String[] args) {
		
		int testa = 0;
		int croce = 0;
		
		Moneta1 m1 = new Moneta1();
		Moneta2 m2 = new Moneta2();
		
		
		for (int i=0; i<1000; i++) {
			if (m1.lancio() == 0) {
				testa++;
			}
			else {
				croce++;
			}
			
		} // end of for cycle
		
		System.out.println("Moneta 1 e' uscito " + testa + " volte testa e " + croce + " volte croce");
		
		testa = 0;
		croce = 0;
		
		for (int i=0; i<1000; i++) {
			if (m2.lancio() == 0) {
				testa++;
			}
			else {
				croce++;
			}
			
		} // end of for cycle
		
		System.out.println("Moneta 2 e' uscito " + testa + " volte testa e " + croce + " volte croce");
		
	}

}
