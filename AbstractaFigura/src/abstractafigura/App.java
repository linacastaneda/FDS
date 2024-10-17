package abstractafigura;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo circulo1= new Circulo (120);
		circulo1.calcularArea();
		circulo1.calcularPerimetro();
		System.out.println("el area del circulo es " + circulo1.getArea());
		System.out.println("el perimetro del circulo es " + circulo1.getPerimetro());
		
		Triangulo triangulo1 = new Triangulo ( 5,6,7);
		triangulo1.calcularArea();
		triangulo1.calcularPerimetro();
		
		System.out.println("el area del triangulo es " + triangulo1.getArea());
		System.out.println("el perimetro del triangulo es " + triangulo1.getPerimetro());
		
		Rectangulo rectangulo1 = new Rectangulo(6,12);
		rectangulo1.calcularArea();
		rectangulo1.calcularPerimetro();
		
		System.out.println(" el area del rectangulo es "+ rectangulo1.getArea());
		System.out.println(" el perimetro del rectangulo es " + rectangulo1.getPerimetro());
		
	}

}
