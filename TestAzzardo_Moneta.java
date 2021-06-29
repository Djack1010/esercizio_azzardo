
public class TestAzzardo_Moneta {

	public static void main(String[] args) {
		
		int result;

		// imposto il numero dei lanci delle monete
		final int NUM_LANCI = 5000;

		// contatori per i risultati TESTA e CROCE
		// TESTA se lancio() ritorna 0
		// CROCE se lancio() ritorna 1
		int contTesta = 0;
		int contCroce = 0;

		// variabili che conterrano la percentuale di uscita delle 2 opzioni
		double percentualeTesta;
		double percentualeCroce;
		
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
		percentualeTesta = Math.round(((contTesta * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentualeCroce = Math.round(((contCroce * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		System.out.println("\nRisultati del lancio della moneta 1");
		System.out.println("===================================");
		System.out.println("Testa: " +contTesta +" su " +NUM_LANCI + " lanci. (" +percentualeTesta +"%)");
		System.out.println("Croce: " +contCroce +" su " +NUM_LANCI + " lanci. (" +percentualeCroce +"%)");
	    

		// Testo la moneta m2

		contTesta = 0;
		contCroce = 0;

		for (int i=0; i<NUM_LANCI; i++) {

			result = m2.lancio();
			
			if (result == 0)
				contTesta++;
			if (result == 1)
				contCroce++;
		}
		// mostro le percentuali con al massimo 2 cifre decimali
		percentualeTesta = Math.round(((contTesta * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentualeCroce = Math.round(((contCroce * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		System.out.println("\nRisultati del lancio della moneta 2");
		System.out.println("===================================");
		System.out.println("Testa: " +contTesta +" su " +NUM_LANCI + " lanci. (" +percentualeTesta +"%)");
		System.out.println("Croce: " +contCroce +" su " +NUM_LANCI + " lanci. (" +percentualeCroce +"%)");
	}

}
