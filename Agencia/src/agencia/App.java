package agencia;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Piloto piloto = new Piloto("Pepito", 30);
		Persona persona = new Persona (1234, "pepita", 23, 'F');
		Persona persona2 = new Persona (4567, "rodolfo", 45, 'M');
		Ciudad ciudadSalida = new Ciudad (2345, "Bogota");
		Ciudad ciudadLlegada = new Ciudad (4560, "Santa Marta");
		Vuelo vuelo1 = new Vuelo (4570, ciudadSalida, ciudadLlegada, 100, 1, piloto);
		System.out.println(vuelo1);
		vuelo1.adicionarSilla(new Silla("345ADC", persona));
		vuelo1.adicionarSilla(new Silla("1456WDE", persona2));
		vuelo1.mostrarlista();
	
	}

}
