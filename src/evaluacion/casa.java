package evaluacion;
import java.util.ArrayList;

public class casa {
	private ArrayList<habitacion> cuarto;
	private ArrayList<Persona> inquilinos;
	private String color;
	private ArrayList<Persona> duenio;
	
	public casa(String color) {
		this.color = color;
		this.cuarto = new ArrayList<habitacion>();
		this.inquilinos = new ArrayList<Persona>();
		this.duenio = new ArrayList<Persona>();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void AgregarCuarto(habitacion h) {
		this.cuarto.add(h);
	}
	
	public void AgregarInquilino(Persona i) {
		this.inquilinos.add(i);
	}
	
	public void AgregarDuenio(Persona d) {
		this.duenio.add(d);
	}
	
	public String ImprimirInquilinos() {		
		String datos = "";
		for(Persona in:inquilinos) {
			datos += "Mi nombre es: "+in.getNombre()+" Mi edad es:"+in.getEdad()+"\n";
		}
		return datos;
	}
	
	public int AreaTotal() {
		int area = 0;
		
		for(habitacion ha:cuarto) {
			area += ha.getMetraje();
		}
		
		return area;
	}
	
}
