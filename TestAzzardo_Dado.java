
public class TestAzzardo_Dado {

	public static void main(String[] args) {
		
		int result;
		
		Dado1 d1 = new Dado1();
		Dado2 d2 = new Dado2();
		Dado3 d3 = new Dado3();
		
		float counter1 = 0;
		float counter2 = 0;
		float counter3 = 0;
		int iterazioni = 999999;
		for (int i = 0; i < iterazioni; i++){
		  System.out.println(i);
		  counter1 += d1.lancio();
		  counter2 += d2.lancio();
		  counter3 += d3.lancio();
		}
		
		System.out.println("Media Dado1: " + counter1 / iterazioni);
		System.out.println("Media Dado2: " +counter2 / iterazioni);
		System.out.println("Media Dado3: " +counter3 / iterazioni);
		

	}

}
