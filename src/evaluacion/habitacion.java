package evaluacion;

public class habitacion {

	private String color;
	private double metraje;
	
	public habitacion(String color, double metraje) {
		this.color = color;
		this.metraje = metraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMetraje() {
		return metraje;
	}

	public void setMetraje(double metraje) {
		this.metraje = metraje;
	}
	
}
