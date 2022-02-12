package pooCamioneta;

public class Camioneta {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	
	private String color;
	private int pesototal;
	private boolean asientosCuero, Climatizador;
	
	
	//Metodo Constructor: Inicialliza valores de las características del objeto
		
	public Camioneta() {
		ruedas= 4;
		largo= 3200;
		ancho= 800;
		motor= 1800;
		pesoPlataforma= 850;
	}

	//getter
	
	public String dimelargo()
	{
		return " El largo de la camioneta es: "+ largo+"";
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
		this.color="Azul";
	}
	
	public  String dimecolor()
	{
		return color;
	}
	
	
	
	public void establecepesototal() {
		this.pesototal= 3000;
	}
	
	public  int dimepesototal()
	{
		return pesototal;
	}

}
