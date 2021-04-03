package evaluacion;

public interface Pintar {	
			
	static String CambiaColor(casa c, String nuevo) {
		c.setColor(nuevo);
		return c.getColor();
	};
	
}
