package interfacebanco;

public class Nomina extends Cuenta implements Iretiros{
	
	public Nomina(int numeroCuenta, String titular, long saldoinicial) {
		super(numeroCuenta, titular);
		this.saldo=saldoinicial;
	}
	
	public void retiro(long valor) {
		
		if(valor>this.saldo||valor<=0) {
			System.out.println("El retiro no se puede realizar");
		}
		else {
			this.saldo-=valor;
		}
	}

	@Override
	public String toString() {
		return "Nomina [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	

}
