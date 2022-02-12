package pooCoches;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int pesototal;
	private boolean asientosCuero, Climatizador;
	
	
	//Metodo Constructor: Inicialliza valores de las características del objeto
		
	public Coche() {
		ruedas= 4;
		largo= 2000;
		ancho= 500;
		motor= 1600;
		pesoPlataforma= 500;
	}

	//getter
	
	public String dimelargo()
	{
		return " El largo del coche es: "+ largo+"";
	}
	public String dimeruedas()
	{
		return " El numero de ruedas es: "+ ruedas+"";
	}
	
	public String dimeancho()
	{
		return " El ancho del chasis es: "+ ancho+"";
	}
	
	public String dimemotor()
	{
		return " El peso del motor es: "+ motor+"";
	}
	
	public String dimepesoPlataforma()
	{
		return " El peso de la plataforma es: "+ pesoPlataforma+"";
	}
	
	
	
	public void establececolor() {
		this.color="Amarillo";
	}
	
	public  String dimecolor()
	{
		return color;
	}
	
	
	
	public void establecepesototal() {
		this.pesototal= 2500;
	}
	
	public  int dimepesototal()
	{
		return pesototal;
	}

	
	}

