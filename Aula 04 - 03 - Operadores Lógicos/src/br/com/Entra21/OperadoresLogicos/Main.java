package br.com.Entra21.OperadoresLogicos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Operadores L�gicos");
		
		System.out.println("&& = express�o restritiva");
		
		byte idade = 18;
		float altura = 1.82f;
		double dinheiro;
		boolean resultado;
		
		resultado = idade<18; //true
		
		resultado = altura>2.0f; //false
		
		resultado = (idade < 18) && (altura >= 2.0f);
//					  (false)    &&   (false) 
		
//							   (false)
		idade = 15;
		altura = 1.9f;
		
		resultado = (idade < 18) && (altura >= 2.0f);
		
		idade = 20;
		altura = 2.10f;
		dinheiro = 20000;
		
		resultado = (idade >= 18) && (altura >= 2.0f) && (dinheiro >= 50000);
		
		idade = 30;
		altura = 2.15f;
		dinheiro = 100000;
		
		resultado = (idade <= 18) && (altura >= 2.0f) && (dinheiro >= 50000);
				
		idade = 40;
		altura = 2.35f;
		dinheiro = 100000;
		
		resultado = ( (idade>=18)  &&  (idade<=40) ) && (altura<2.35) && (dinheiro>50000);
		
		
		//------------------------------------------------------------------
		
		System.out.println("|| = express�o inclusiva");
		
		idade = 17;
		dinheiro = 1000;
		
		resultado = (idade>191) || (dinheiro>=1000);
//					 	(false) || (dinheiro>=1000)
		
		//			 	(false) || (true)
		
		//		       	  	  (true)
		
		resultado = (idade<=14) || (idade>=18);
//						(false) || (idade>=18)
		
		//				(false) || (false)
		
		//					  (false)
		
		idade = 3;
		
		resultado = (idade<=14) || (idade>=18);
//   				     (true) || (idade>=18)
		
		//			     (true) || (false)
		
		//					  (true)
	}

}
