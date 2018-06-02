
public class P02_PlusGrandNombre {

	public static void main(String[] args) {
		int tableauDeNombres[] = { 12, 56, 42, 87, 23, 14, 3, 97, 18, 23, 52, 35 };
		
		int positionPlusGrandNombre = 0;
		for (int posNombreExamin=0; posNombreExamin<tableauDeNombres.length ; posNombreExamin++) {
			System.out.println("le nombre " + posNombreExamin +" est "+tableauDeNombres[posNombreExamin]);
			if( tableauDeNombres[posNombreExamin] > tableauDeNombres[positionPlusGrandNombre]) {
				System.out.println("le nombre " + posNombreExamin +" ("+tableauDeNombres[posNombreExamin]+") est plus grand que le nombre "+positionPlusGrandNombre+" ("+tableauDeNombres[positionPlusGrandNombre]+")");
				positionPlusGrandNombre = posNombreExamin;
			}
		}
		System.out.println("le plus grand nombre est le "+positionPlusGrandNombre + " (" + tableauDeNombres[positionPlusGrandNombre] +")" );		
	}
}
