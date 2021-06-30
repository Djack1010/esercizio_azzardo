
public class TestAzzardo_Moneta {

	public static void main(String[] args) {
		
		int tiri = 1000;
		int testa = 0;
		int croce = 0;
		float tolleranza = (tiri*10)/100; //tolleranza del 10%
		
		
		Moneta1 m1 = new Moneta1();
		Moneta2 m2 = new Moneta2();
		
		//test moneta 1
		for(int i = 0; i < tiri; i++){
			
			if(m1.lancio() == 0)
				testa++;
			else
				croce++;
		}
		System.out.println("Moneta1: è uscito testa " + testa + " volte e croce " + croce + " volte");
		
		if(testa > croce && (testa - croce) > tolleranza)
			System.out.println("La moneta truccata è moneta1");
		if(croce > testa && (croce - testa) > tolleranza)
			System.out.println("La moneta truccata è moneta1");
		
		testa = 0;
		croce = 0;
		
		//test moneta 2
		for(int i = 0; i < tiri; i++){
			
			if(m2.lancio() == 0)
				testa++;
			else
				croce++;
		}
		System.out.println("Moneta2: è uscito testa " + testa + " volte e croce " + croce + " volte");
		
		if(testa > croce && (testa - croce) > tolleranza)
			System.out.println("La moneta truccata è moneta2");
		if(croce > testa && (croce - testa) > tolleranza)
			System.out.println("La moneta truccata è moneta2");
		
	}

}
