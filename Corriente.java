package interfacebanco;

public class Corriente extends Cuenta implements Iretiros,Idepositos{
	
	private long sobregiro;
	
	public Corriente(int numeroCuenta, String titular, long sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro=sobregiro;
		
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
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>(this.saldo+sobregiro)||valor<=0) {
			
			System.out.println("El retiro de ese monto no se puede realizar");
		}
		else if (valor>this.saldo)
		{
			this.saldo-=valor;
			sobregiro=sobregiro+this.saldo;
			
		}
		else 
		{
			this.saldo-=valor;
			
		}
		
	}

	@Override
	public String toString() {
		return "Corriente [sobregiro=" + sobregiro + ", numeroCuenta=" + numeroCuenta + ", titular=" + titular
				+ ", saldo=" + saldo + "]";
	}
	
	
	

}
