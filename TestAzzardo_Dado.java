
public class TestAzzardo_Dado {

	public static void main(String[] args) {
		
		int result;

		// imposto il numero dei lanci dei dadi
		final int NUM_LANCI = 5000;

		// contatori per i risultati delle facce dei dadi
		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int cont5 = 0;
		int cont6 = 0;

		// variabili che conterrano la percentuale di uscita delle 6 facce
		double percentuale1;
		double percentuale2;
		double percentuale3;
		double percentuale4;
		double percentuale5;
		double percentuale6;

		// istanzio i tre tipi di Dadi
		Dado1 d1 = new Dado1();
		Dado2 d2 = new Dado2();
		Dado3 d3 = new Dado3();
		
		// Testo il dado d1
		for (int i=0; i<NUM_LANCI; i++) {

			result = d1.lancio();
			
			if (result == 1)
				cont1++;
			if (result == 2)
				cont2++;
			if (result == 3)
				cont3++;
			if (result == 4)
				cont4++;
			if (result == 5)
				cont5++;
			if (result == 6)
				cont6++;
		}

		// mostro le percentuali con al massimo 2 cifre decimali
		percentuale1 = Math.round(((cont1 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale2 = Math.round(((cont2 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale3 = Math.round(((cont3 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale4 = Math.round(((cont4 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale5 = Math.round(((cont5 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale6 = Math.round(((cont6 * 100.0) / NUM_LANCI) * 100.0) / 100.0;

		System.out.println("\nRisultati del lancio del primo dado");
		System.out.println("=====================================");
		System.out.println("Faccia 1: " +cont1 +" su " +NUM_LANCI + " lanci. (" +percentuale1 +"%)");
		System.out.println("Faccia 2: " +cont2 +" su " +NUM_LANCI + " lanci. (" +percentuale2 +"%)");
		System.out.println("Faccia 3: " +cont3 +" su " +NUM_LANCI + " lanci. (" +percentuale3 +"%)");
		System.out.println("Faccia 4: " +cont4 +" su " +NUM_LANCI + " lanci. (" +percentuale4 +"%)");
		System.out.println("Faccia 5: " +cont5 +" su " +NUM_LANCI + " lanci. (" +percentuale5 +"%)");
		System.out.println("Faccia 6: " +cont6 +" su " +NUM_LANCI + " lanci. (" +percentuale6 +"%)");
		
		// Testo il dado d2
		cont1 = cont2 = cont3 = cont4 = cont5 = cont6 = 0;
		for (int i=0; i<NUM_LANCI; i++) {

			result = d2.lancio();
			
			if (result == 1)
				cont1++;
			if (result == 2)
				cont2++;
			if (result == 3)
				cont3++;
			if (result == 4)
				cont4++;
			if (result == 5)
				cont5++;
			if (result == 6)
				cont6++;
		}

		// mostro le percentuali con al massimo 2 cifre decimali
		percentuale1 = Math.round(((cont1 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale2 = Math.round(((cont2 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale3 = Math.round(((cont3 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale4 = Math.round(((cont4 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale5 = Math.round(((cont5 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale6 = Math.round(((cont6 * 100.0) / NUM_LANCI) * 100.0) / 100.0;

		System.out.println("\nRisultati del lancio del secondo dado");
		System.out.println("=====================================");
		System.out.println("Faccia 1: " +cont1 +" su " +NUM_LANCI + " lanci. (" +percentuale1 +"%)");
		System.out.println("Faccia 2: " +cont2 +" su " +NUM_LANCI + " lanci. (" +percentuale2 +"%)");
		System.out.println("Faccia 3: " +cont3 +" su " +NUM_LANCI + " lanci. (" +percentuale3 +"%)");
		System.out.println("Faccia 4: " +cont4 +" su " +NUM_LANCI + " lanci. (" +percentuale4 +"%)");
		System.out.println("Faccia 5: " +cont5 +" su " +NUM_LANCI + " lanci. (" +percentuale5 +"%)");
		System.out.println("Faccia 6: " +cont6 +" su " +NUM_LANCI + " lanci. (" +percentuale6 +"%)");

		// Testo il dado d3
		cont1 = cont2 = cont3 = cont4 = cont5 = cont6 = 0;
		for (int i=0; i<NUM_LANCI; i++) {

			result = d3.lancio();
			
			if (result == 1)
				cont1++;
			if (result == 2)
				cont2++;
			if (result == 3)
				cont3++;
			if (result == 4)
				cont4++;
			if (result == 5)
				cont5++;
			if (result == 6)
				cont6++;
		}

		// mostro le percentuali con al massimo 2 cifre decimali
		percentuale1 = Math.round(((cont1 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale2 = Math.round(((cont2 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale3 = Math.round(((cont3 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale4 = Math.round(((cont4 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale5 = Math.round(((cont5 * 100.0) / NUM_LANCI) * 100.0) / 100.0;
		percentuale6 = Math.round(((cont6 * 100.0) / NUM_LANCI) * 100.0) / 100.0;

		System.out.println("\nRisultati del lancio del primo dado");
		System.out.println("=====================================");
		System.out.println("Faccia 1: " +cont1 +" su " +NUM_LANCI + " lanci. (" +percentuale1 +"%)");
		System.out.println("Faccia 2: " +cont2 +" su " +NUM_LANCI + " lanci. (" +percentuale2 +"%)");
		System.out.println("Faccia 3: " +cont3 +" su " +NUM_LANCI + " lanci. (" +percentuale3 +"%)");
		System.out.println("Faccia 4: " +cont4 +" su " +NUM_LANCI + " lanci. (" +percentuale4 +"%)");
		System.out.println("Faccia 5: " +cont5 +" su " +NUM_LANCI + " lanci. (" +percentuale5 +"%)");
		System.out.println("Faccia 6: " +cont6 +" su " +NUM_LANCI + " lanci. (" +percentuale6 +"%)");
	}

}
