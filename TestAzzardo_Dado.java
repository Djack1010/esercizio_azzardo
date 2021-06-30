
public class TestAzzardo_Dado {

	public static void main(String[] args) {
		// ??
		int result;
		
		Dado1 d1 = new Dado1();
		Dado2 d2 = new Dado2();
		Dado3 d3 = new Dado3();
		
		// TODO: implementare un test per scoprire quale dei tre dadi Ã¨ truccato.
		System.out.println("========= Test su d1 =========");
		eseguiTest(d1);
		System.out.println("");
		System.out.println("========= Test su d2 =========");
		eseguiTest(d2);
		System.out.println("");
		System.out.println("========= Test su d3 =========");
		eseguiTest(d3);
		System.out.println("");
	}
	
	public static void eseguiTest(OggettoLanciato dado) {		
		double numLanci=100.0;
		// tolleranza statistica
		double pMax=1/6.0+0.1;
		
		int uno=0;
		int due=0;
		int tre=0;
		int quattro=0;
		int cinque=0;
		int sei=0;
		
		for (int i=0; i<numLanci; i++) {
			switch (dado.lancio()) {
			case 1:
				uno++;
				break;		
			case 2:
				due++;
				break;
			case 3:
				tre++;
				break;	
			case 4:
				quattro++;
				break;	
			case 5:
				cinque++;
				break;
			case 6:
				sei++;
				break;
				// eventuali casi non previsti
			default: case 7:
				System.out.print(dado.lancio() + " - ");
				break;
			}


		}

		System.out.println("Uno su " + numLanci + " lanci: " + uno);
		System.out.println("Due su " + numLanci + " lanci: " + due);
		System.out.println("Tre su " + numLanci + " lanci: " + tre);
		System.out.println("Quattro su " + numLanci + " lanci: " + quattro);
		System.out.println("Cinque su " + numLanci + " lanci: " + cinque);
		System.out.println("Sei su " + numLanci + " lanci: " + sei);
		
		// spezzo in due per maggiore leggibilità
		if(uno/numLanci>pMax || due/numLanci>pMax || tre/numLanci>pMax)
			System.out.println(">>>>>>>>> QUESTO DADO E' TRUCCATO ! <<<<<<<<<");
		if(quattro/numLanci>pMax || cinque/numLanci>pMax || sei/numLanci>pMax)
			System.out.println(">>>>>>>>> QUESTO DADO E' TRUCCATO ! <<<<<<<<<");
	}
}