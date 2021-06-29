
public class TestAzzardo_Moneta {

	public static void main(String[] args) {
		
		int result;

		// imposto il numero dei lanci delle monete
		final int NUM_LANCI = 5000;

		// variabili booleane per il controllo delle percentuali di uscita
		boolean checkMoneta1 = false;
		boolean checkMoneta2 = false;

		// contatori per i risultati TESTA e CROCE
		// TESTA se lancio() ritorna 0
		// CROCE se lancio() ritorna 1
		int contTesta = 0;
		int contCroce = 0;

		// variabili che conterrano la percentuale di uscita delle 2 opzioni
		double percentualeTestaM1;
		double percentualeCroceM1;
		
		Moneta1 m1 = new Moneta1();
		Moneta2 m2 = new Moneta2();
		
		// Testo la moneta m1	
		for (int i=0; i<NUM_LANCI; i++) {

			result = m1.lancio();
			
			if (result == 0)
				contTesta++;
			if (result == 1)
				contCroce++;
		}

		// mostro le percentuali con al massimo 2 cifre decimali
		percentualeTestaM1 = Math.round(((contTesta * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentualeCroceM1 = Math.round(((contCroce * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		System.out.println("\nRisultati del lancio della moneta 1");
		System.out.println("===================================");
		System.out.println("Testa: " +contTesta +" su " +NUM_LANCI + " lanci. (" +percentualeTestaM1 +"%)");
		System.out.println("Croce: " +contCroce +" su " +NUM_LANCI + " lanci. (" +percentualeCroceM1 +"%)");
	    
	    // verifico se la moneta e' truccata
	    // ammetto che e' truccata se una percentuale è maggiore dell'altra di almeno 10 punti
	   	if ((percentualeTestaM1 <= (percentualeCroceM1 - 10)) || (percentualeTestaM1 >= (percentualeCroceM1 + 10))) {
	   		checkMoneta1 = true;
	   	}

		// Testo la moneta m2
		// variabili che conterrano la percentuale di uscita delle 2 opzioni
		double percentualeTestaM2;
		double percentualeCroceM2;

		contTesta = contCroce = 0;

		for (int i=0; i<NUM_LANCI; i++) {

			result = m2.lancio();
			
			if (result == 0)
				contTesta++;
			if (result == 1)
				contCroce++;
		}
		// mostro le percentuali con al massimo 2 cifre decimali
		percentualeTestaM2 = Math.round(((contTesta * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentualeCroceM2 = Math.round(((contCroce * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		System.out.println("\nRisultati del lancio della moneta 2");
		System.out.println("===================================");
		System.out.println("Testa: " +contTesta +" su " +NUM_LANCI + " lanci. (" +percentualeTestaM2 +"%)");
		System.out.println("Croce: " +contCroce +" su " +NUM_LANCI + " lanci. (" +percentualeCroceM2 +"%)");

		// verifico se la moneta e' truccata
	    // ammetto che e' truccata se una percentuale è maggiore dell'altra di almeno 10 punti
	    if ((percentualeTestaM2 <= (percentualeCroceM2 - 10)) || (percentualeTestaM2 >= (percentualeCroceM2 + 10))) {
	   		checkMoneta1 = true;
	    }

		if (checkMoneta1)
			System.out.println("\nLa moneta truccata e' la UNO");

		if (checkMoneta2)
			System.out.println("\nLa moneta truccata e' la DUE");
	}



}
