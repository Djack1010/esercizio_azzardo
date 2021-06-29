
public class TestAzzardo_Dado {

	public static void main(String[] args) {
		
		int result;

		int cont1 = 0;
		int cont2 = 0;
		int cont3 = 0;
		int cont4 = 0;
		int cont5 = 0;
		int cont6 = 0;
		
		Dado1 d1 = new Dado1();
		Dado2 d2 = new Dado2();
		Dado3 d3 = new Dado3();
		
		// TODO: implementare un test per scoprire quale dei tre dadi è truccato.

		for (int i=0; i<1000; i++) {

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

		System.out.println("Faccia 1 su 1000 lanci: " +cont1);
		System.out.println("Faccia 2 su 1000 lanci: " +cont2);
		System.out.println("Faccia 3 su 1000 lanci: " +cont3);
		System.out.println("Faccia 4 su 1000 lanci: " +cont4);
		System.out.println("Faccia 5 su 1000 lanci: " +cont5);
		System.out.println("Faccia 6 su 1000 lanci: " +cont6);
	}

}
