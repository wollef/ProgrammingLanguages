
public class P03_PlusGrandCommunDiviseur {

	public static void main(String[] args) {
		int a = 55;
		int b = 33;
		int resultat = calculePGCD(a,b);	
		System.out.println("le PGCD de "+a+" et "+b+" est "+resultat);
	}

   public static int calculePGCD(int na, int nb) {
	   int ia = na;
	   int ib = nb;
	   
	   while ( ib !=0) {
		   int itemp = ia;   
		   ia = ib;
		   ib = itemp % ib;
	   }	   
	   return ia;       
   }
}
