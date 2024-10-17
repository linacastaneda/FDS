package abstractafigura;

public abstract class Figura {
	
	protected double area;
	protected double perimetro;
	
	
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	/**
	 * @return the perimetro
	 */
	public double getPerimetro() {
		return perimetro;
	}
	/**
	 * @param perimetro the perimetro to set
	 */
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public abstract void calcularArea();
	public abstract void calcularPerimetro();
	

}
