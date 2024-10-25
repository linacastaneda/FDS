package interfacebanco;

public class Vivienda extends Cuenta implements Idepositos{

	public Vivienda(int numeroCuenta, String titular) {
		super(numeroCuenta, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		
		if(valor<=0) {
			System.out.println("El valor a depositar es incorrecto");
		}
		else {
			this.saldo+=valor;
		}
		
	}

	@Override
	public String toString() {
		return "Vivienda [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	
	
	
	

}
