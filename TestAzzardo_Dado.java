
public class TestAzzardo_Dado {

	public static void main(String[] args) {
		
		int tiri = 3000;
		float tolleranza = (tiri*10)/100;
		int res1 = 0;
		int res2 = 0;
		int res3 = 0;
		int res4 = 0;
		int res5 = 0;
		int res6 = 0;
		
		int massimo = 0;
		int minimo = 0;
		
		Dado1 d1 = new Dado1();
		Dado2 d2 = new Dado2();
		Dado3 d3 = new Dado3();
		
		//test dado 1
		for(int i = 0; i < tiri; i++){
			
			switch(d1.lancio()){
				
				case 1
				res1++;
				break;
				
				case 2
				res2++;
				break;
				
				case 3
				res3++;
				break;
				
				case 4
				res4++;
				break;
				
				case 5
				res5++;
				break;
				
				case 6
				res6++;
				break;
			
			}
			System.out.println("Dado 1: ");
			System.out.println(res1 + " volte faccia 1");
			System.out.println(res2 + " volte faccia 2");
			System.out.println(res3 + " volte faccia 3");
			System.out.println(res4 + " volte faccia 4");
			System.out.println(res5 + " volte faccia 5");
			System.out.println(res6 + " volte faccia 6");
		} 
		
		massimo = Math.max(ris1, Math.max(ris2, Math.max(res3, Math.max(res4, Math.max(res5, Math.max(res6)))));		
		minimo =  Math.min(ris1, Math.min(ris2, Math.min(res3, Math.min(res4, Math.min(res5, Math.min(res6)))));
		
		if((massimo - minimo) > tolleranza)
			System.out.println("Dado1 è truccato");
		
		res1 = 0;
		res2 = 0;
		res3 = 0;
		res4 = 0;
		res5 = 0;
		res6 = 0;
		
		//test dado 2
		
		for(int i = 0; i < tiri; i++){
			
			switch(d2.lancio()){
				
				case 1
				res1++;
				break;
				
				case 2
				res2++;
				break;
				
				case 3
				res3++;
				break;
				
				case 4
				res4++;
				break;
				
				case 5
				res5++;
				break;
				
				case 6
				res6++;
				break;
			
			}
			System.out.println("Dado 2: ");
			System.out.println(res1 + " volte faccia 1");
			System.out.println(res2 + " volte faccia 2");
			System.out.println(res3 + " volte faccia 3");
			System.out.println(res4 + " volte faccia 4");
			System.out.println(res5 + " volte faccia 5");
			System.out.println(res6 + " volte faccia 6");
		} 
		
		massimo = Math.max(ris1, Math.max(ris2, Math.max(res3, Math.max(res4, Math.max(res5, Math.max(res6)))));		
		minimo =  Math.min(ris1, Math.min(ris2, Math.min(res3, Math.min(res4, Math.min(res5, Math.min(res6)))));
		
		if((massimo - minimo) > tolleranza)
			System.out.println("Dado 2 è truccato");
		
		res1 = 0;
		res2 = 0;
		res3 = 0;
		res4 = 0;
		res5 = 0;
		res6 = 0;
		
		//test dado 3
		
		for(int i = 0; i < tiri; i++){
			
			switch(d3.lancio()){
				
				case 1
				res1++;
				break;
				
				case 2
				res2++;
				break;
				
				case 3
				res3++;
				break;
				
				case 4
				res4++;
				break;
				
				case 5
				res5++;
				break;
				
				case 6
				res6++;
				break;
			
			}
			System.out.println("Dado 3: ");
			System.out.println(res1 + " volte faccia 1");
			System.out.println(res2 + " volte faccia 2");
			System.out.println(res3 + " volte faccia 3");
			System.out.println(res4 + " volte faccia 4");
			System.out.println(res5 + " volte faccia 5");
			System.out.println(res6 + " volte faccia 6");
		} 
		
		massimo = Math.max(ris1, Math.max(ris2, Math.max(res3, Math.max(res4, Math.max(res5, Math.max(res6)))));		
		minimo =  Math.min(ris1, Math.min(ris2, Math.min(res3, Math.min(res4, Math.min(res5, Math.min(res6)))));
		
		if((massimo - minimo) > tolleranza)
			System.out.println("Dado 3 è truccato");
		
	}

}
