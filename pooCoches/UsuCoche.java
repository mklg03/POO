package pooCoches;

public class UsuCoche {

	public static void main (String[] args) {
		
	Coche Renault = new Coche();
	
	Renault.establececolor();
	Renault.establecepesototal();


	System.out.println(Renault.dimelargo());
	System.out.println(Renault.dimeruedas());
	System.out.println(Renault.dimeancho());
	System.out.println(Renault.dimemotor());
	System.out.println(Renault.dimepesoPlataforma());
	System.out.println(" El color del coche es: "+Renault.dimecolor());
	System.out.println(" El peso total del coche es: "+Renault.dimepesototal());
	}
}
