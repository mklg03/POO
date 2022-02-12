package pooMoto;

public class Moto {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int pesototal;
	private boolean asientosCuero, Climatizador;
	
	
	//Metodo Constructor: Inicialliza valores de las características del objeto
		
	public Moto() {
		ruedas= 2;
		largo= 700;
		ancho= 200;
		motor= 400;
		pesoPlataforma= 490;
	}

	//getter
	
	public String dimelargo()
	{
		return " El largo de la moto es: "+ largo+"";
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
		this.color="Negro";
	}
	
	public  String dimecolor()
	{
		return color;
	}
	
	
	
	public void establecepesototal() {
		this.pesototal= 1500;
	}
	
	public  int dimepesototal()
	{
		return pesototal;
	}

	

}
