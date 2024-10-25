package interfacebanco;

public class Cuenta {
	
	protected int numeroCuenta;
	protected String titular;
	protected long saldo;
	
	public Cuenta (int numeroCuenta, String titular ) {
		
		this.numeroCuenta=numeroCuenta;
		this.titular=titular;
		
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	
}
