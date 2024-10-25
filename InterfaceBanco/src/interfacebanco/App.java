package interfacebanco;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vivienda cuenta1 = new Vivienda (1234, "Pepita" );
	
		cuenta1.deposito(7000);
		System.out.println(cuenta1);
		
		Nomina cuenta2 = new Nomina (5678, "Pepito", 4000);
		
		cuenta2.retiro(6000);
		System.out.println(cuenta2);
		
		Ahorro cuenta3 = new Ahorro (9012, "Pachita");
		
		cuenta3.deposito(3000);
		cuenta3.retiro(2000);
		cuenta3.deposito(3000);
		System.out.println(cuenta3);
		
		Corriente cuenta4 = new Corriente (3456, "Pachito", 5000);
		
		cuenta4.deposito(5000);
		cuenta4.retiro(8000);
		System.out.println(cuenta4);
	
		

	}

}
