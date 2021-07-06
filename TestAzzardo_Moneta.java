
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
		
		float counter_m1 = 0;
		float counter_m2 = 0;
		int numero_lanci = 999999;

		for(int i=0; i<numero_lanci;i++){

			counter_m1 += m1.lancio();
			counter_m2 += m2.lancio();
		
		}

		float media_m1 = counter_m1 / numero_lanci;
		float media_m2 = counter_m2 / numero_lanci;
		
		System.out.println("Media moneta 1: " + media_m1);
		System.out.println("Media moneta 2: " + media_m2);

	}



}
