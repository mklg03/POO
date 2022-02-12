package pooMoto;

import pooMoto.Moto;

public class UsuMoto {
	
	public static void main (String[] args) {
		
		Moto Vera = new Moto();
		
		Vera.establececolor();
		Vera.establecepesototal();


		System.out.println(Vera.dimelargo());
		System.out.println(Vera.dimeruedas());
		System.out.println(Vera.dimeancho());
		System.out.println(Vera.dimemotor());
		System.out.println(Vera.dimepesoPlataforma());
		System.out.println(" El color de la moto es: "+Vera.dimecolor());
		System.out.println(" El peso total de la moto es: "+Vera.dimepesototal());
		}

}
