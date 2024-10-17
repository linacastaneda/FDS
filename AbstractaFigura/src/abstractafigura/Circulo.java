package abstractafigura;

public class Circulo extends Figura{

	private double radio;
	
	public Circulo (double radio) {
		this.radio=radio;
	}

	@Override
	public void calcularArea() {
		
		this.area=Math.PI * Math.pow(this.radio, 2);
		
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro= 2* Math.PI * this.radio; 
	}
	
	
	
}
