
public class TestAzzardo_Dado {

	public static void main(String[] args) {
		
		int ris1 = 0;
		int ris2 = 0;
		int ris3 = 0;
		int ris4 = 0;
		int ris5 = 0;
		int ris6 = 0;
		
		Dado1 d1 = new Dado1();
		Dado2 d2 = new Dado2();
		Dado3 d3 = new Dado3();
		
		
		for (int i=0; i<3000; i++) {
			int ris = d1.lancio();
			
			if (ris == 1) {
				ris1++;
			}
			else if (ris == 2){
				ris2++;
			}
			else if (ris == 3){
				ris3++;
			}
			else if (ris == 4){
				ris4++;
			}
			else if (ris == 5){
				ris5++;
			}
			else{
				ris6++;
			}
			
		} // end of for cycle
		
		System.out.println("Dado 1:");
		System.out.println(ris1 + " volte il valore 1");
		System.out.println(ris2 + " volte il valore 2");
		System.out.println(ris3 + " volte il valore 3");
		System.out.println(ris4 + " volte il valore 4");
		System.out.println(ris5 + " volte il valore 5");
		System.out.println(ris6 + " volte il valore 6");
		
		// dado 2
		ris1 = 0;
		ris2 = 0;
		ris3 = 0;
		ris4 = 0;
		ris5 = 0;
		ris6 = 0;
		

		for (int i=0; i<3000; i++) {
			int ris = d2.lancio();
			
			if (ris == 1) {
				ris1++;
			}
			else if (ris == 2){
				ris2++;
			}
			else if (ris == 3){
				ris3++;
			}
			else if (ris == 4){
				ris4++;
			}
			else if (ris == 5){
				ris5++;
			}
			else{
				ris6++;
			}
			
		} // end of for cycle
		
		System.out.println("Dado 2:");
		System.out.println(ris1 + " volte il valore 1");
		System.out.println(ris2 + " volte il valore 2");
		System.out.println(ris3 + " volte il valore 3");
		System.out.println(ris4 + " volte il valore 4");
		System.out.println(ris5 + " volte il valore 5");
		System.out.println(ris6 + " volte il valore 6");
		
		
		// dado 3
				ris1 = 0;
				ris2 = 0;
				ris3 = 0;
				ris4 = 0;
				ris5 = 0;
				ris6 = 0;
				

				for (int i=0; i<3000; i++) {
					int ris = d3.lancio();
					
					if (ris == 1) {
						ris1++;
					}
					else if (ris == 2){
						ris2++;
					}
					else if (ris == 3){
						ris3++;
					}
					else if (ris == 4){
						ris4++;
					}
					else if (ris == 5){
						ris5++;
					}
					else{
						ris6++;
					}
					
				} // end of for cycle
				
				System.out.println("Dado 3:");
				System.out.println(ris1 + " volte il valore 1");
				System.out.println(ris2 + " volte il valore 2");
				System.out.println(ris3 + " volte il valore 3");
				System.out.println(ris4 + " volte il valore 4");
				System.out.println(ris5 + " volte il valore 5");
				System.out.println(ris6 + " volte il valore 6");
	}

}
