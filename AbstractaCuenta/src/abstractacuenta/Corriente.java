package abstractacuenta;

public class Corriente extends Cuenta{
	
	private long sobregiro;

	/**
	 * @param numeroCuenta
	 * @param titular
	 * @param sobregiro
	 */
	public Corriente(int numeroCuenta, String titular, long sobregiro) {
		super(numeroCuenta, titular);
		this.sobregiro = sobregiro;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		this.saldo+=valor;
		
		//System.out.println("su saldo tras el deposito es " + this.saldo);
	}

	@Override
	public void retiro(long valor) {
		// TODO Auto-generated method stub
		if(valor>(this.saldo+sobregiro))
		{
			//System.out.println("el retiro no se piede realizar");
			
		}
		else if (this.saldo<valor&&valor<=(this.saldo +sobregiro))
		{
			this.saldo=sobregiro-valor;
			sobregiro=sobregiro+this.saldo;
			//System.out.println("su saldo tras el retiro es " + this.saldo + " y tiene un sobregiro disponible de " + sobregiro);
		}
		else 
		{
			this.saldo-=valor;
			//System.out.println("Su saldo tras el retiro es " + this.saldo + " y tiene un sobregiro disponible de " + sobregiro);
			
		}
		
	}

	@Override
	public String toString() {
		return "CORRIENTE   sobregiro= " + sobregiro + ", numero de cuenta= " + numeroCuenta + ", titular= " + titular
				+ ", saldo= " + saldo;
	}
	
	

}
