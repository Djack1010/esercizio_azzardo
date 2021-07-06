
public class TestAzzardo_Moneta {

	public static void main(String[] args) {
		
		int result;
		
		Moneta1 m1 = new Moneta1();
		Moneta2 m2 = new Moneta2();
		
		// TODO: implementare un test per scoprire quale delle due monete è truccata
		
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
