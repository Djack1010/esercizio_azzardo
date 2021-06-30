import java.util.ArrayList;

public class TestAzzardo_Moneta {

	public static void main(String[] args) {
		// ???
		int result;
		
		Moneta1 m1 = new Moneta1();
		Moneta2 m2 = new Moneta2();
		
		// TODO: implementare un test per scoprire quale delle due monete è truccata
		System.out.println("========= Test su m1 =========");
		eseguiTest(m1);
		System.out.println("");
		System.out.println("========= Test su m2 =========");
		eseguiTest(m2);
		System.out.println("");

	}
	public static void eseguiTest(OggettoLanciato moneta) {
		double numLanci=1000.0;
		// tolleranze statistiche
		double pMax=0.600;
		double pMin=1-pMax;
		
		// i valori rilevati non si limitano a 0 e 1 !!!		
		int testa=0;
		int croce=0;
		int altro=0;
		for (int i =0; i<numLanci; i++) {
			if((int)(moneta.lancio()) == 1)
			testa++;
			else if ((int)(moneta.lancio()) == 0)
				croce++;
			else 
				altro++;
		}
		System.out.println("Testa su " + numLanci + " lanci: " + testa);
		System.out.println("Croce su " + numLanci + " lanci: " + croce);
		System.out.println("Altro su " + numLanci + "  lanci: " + altro);
		
		// eseguo il controllo solo sul valore testa (=1)
		if(testa/numLanci>pMax || testa/numLanci<pMin)
			System.out.println(">>>>>>>>> QUESTA MONETA E' TRUCCATA ! <<<<<<<<<");
	}
}
