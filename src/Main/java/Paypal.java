
public class Paypal {

	private Datafono factura;
	private boolean deuda;

	public Paypal(Datafono p) {
		factura = p;
	}

	public void procesa() {

		deuda = true;

		if (deuda) {
			System.out.println("Cobrando en Paypal");
			factura.cobrar();

		}
	}

}
