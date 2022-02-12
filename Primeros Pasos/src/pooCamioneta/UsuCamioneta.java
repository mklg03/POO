package pooCamioneta;

import pooCamioneta.Camioneta;

public class UsuCamioneta {
	
public static void main (String[] args) {
		
		Camioneta Jeep = new Camioneta();
		
		Jeep.establececolor();
		Jeep.establecepesototal();


		System.out.println(Jeep.dimelargo());
		System.out.println(Jeep.dimeruedas());
		System.out.println(Jeep.dimeancho());
		System.out.println(Jeep.dimemotor());
		System.out.println(Jeep.dimepesoPlataforma());
		System.out.println(" El color de la camioneta es: "+Jeep.dimecolor());
		System.out.println(" El peso total de la camioneta es: "+Jeep.dimepesototal());
		}

}
