package evaluacion;

public class principal implements Pintar {
	
	public static void main(String[] args) {
		
		casa hogar = new casa("Crema");
		
		Persona inqui1 = new Persona("Albert Ramirez", 28);
		hogar.AgregarInquilino(inqui1);
		Persona inqui2 = new Persona("Pablo Quezada", 18);
		hogar.AgregarInquilino(inqui2);
		Persona inqui3 = new Persona("Laura Torres", 22);
		hogar.AgregarInquilino(inqui3);
		
		System.out.print(hogar.ImprimirInquilinos());
		
		habitacion ha1 = new habitacion("celeste", 15);
		hogar.AgregarCuarto(ha1);
		habitacion ha2 = new habitacion("celeste", 11);
		hogar.AgregarCuarto(ha2);
		habitacion ha3 = new habitacion("celeste", 19);
		hogar.AgregarCuarto(ha3);
		
		System.out.println("El area Total es: "+hogar.AreaTotal());
		
		System.out.println("La casa ahora es: "+Pintar.CambiaColor(hogar,"Verde"));
		
	}

}
