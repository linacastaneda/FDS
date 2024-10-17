package abstractafigura;

public class Rectangulo extends Figura {

	private double ancho;
	private double alto;
	/**
	 * @param ancho
	 * @param alto
	 */
	public Rectangulo(double ancho, double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}
	@Override
	public void calcularArea() {

		this.area=ancho*alto;
	}
	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro=ancho*2 + alto*2;
	}
	/**
	 * @return the ancho
	 */
	public double getAncho() {
		return ancho;
	}
	/**
	 * @param ancho the ancho to set
	 */
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	/**
	 * @return the alto
	 */
	public double getAlto() {
		return alto;
	}
	/**
	 * @param alto the alto to set
	 */
	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	
}
