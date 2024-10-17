package abstractacuenta;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ahorro cuenta1 = new Ahorro (1234, "pepita");
		
		cuenta1.deposito(50000);
		cuenta1.retiro(10000);
		System.out.println(cuenta1); 
		
		Corriente cuenta2 =new Corriente (4321, "pepito", 5000000 );
		
		cuenta2.deposito(5000000);
		cuenta2.retiro(8000000);
		System.out.println(cuenta2); 
	}

}
