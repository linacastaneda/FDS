package interfacebanco;

public class Ahorro extends Cuenta implements Idepositos, Iretiros {

	private long intereses;
	
	public Ahorro (int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>this.saldo||valor<=0) {
			System.out.println("El retiro no se puede realizar");
		}
		else {
			this.saldo-=valor;
		}
		
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		if(valor<=0) {
			
			System.out.println("El valor a depositar es incorrecto");
		}
		else {
			
			this.saldo+=valor;
			intereses+=this.saldo*0.03;
		}
	}

	@Override
	public String toString() {
		return "Ahorro [intereses=" + intereses + ", numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo="
				+ saldo + "]";
	}
	
	
	
}	
