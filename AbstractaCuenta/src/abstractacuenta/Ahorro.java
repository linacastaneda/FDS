package abstractacuenta;

public class Ahorro extends Cuenta{
	
	private long intereses;

	/**
	 * @param numeroCuenta
	 * @param titular
	 */
	public Ahorro(int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	@Override
	public void deposito(long valor) {
		
		intereses+=valor*0.03;
		this.saldo=valor-intereses;
		
		//System.out.println("el saldo tras el deposito es "+ this.saldo);
		
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>this.saldo) {
			//System.out.println("Saldo insuficiente");
		}
		else {
			
			this.saldo-=valor;
			//System.out.println(" El saldo luego del retiro es: "+ this.saldo);
		}
	}

	@Override
	public String toString() {
		return "AHORRO  intereses=" + intereses + ", numero de cuenta= " + numeroCuenta + ", titular= " + titular + ", saldo= "
				+ saldo;
	}


	
	
	

}
