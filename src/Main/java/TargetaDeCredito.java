
public class TargetaDeCredito {

	private Datafono factura;
	private boolean deuda;

	public TargetaDeCredito(Datafono p) {
		factura = p;
	}

	public void procesa() {

		deuda = true;

		if (deuda) {
			System.out.println("Cobrando en tarjeta de crédito");
			factura.cobrar();

		}
	}

}
