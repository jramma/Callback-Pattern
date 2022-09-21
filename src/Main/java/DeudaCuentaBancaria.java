
public class DeudaCuentaBancaria {

	private Datafono factura;
	private boolean deuda;

	public DeudaCuentaBancaria(Datafono p) {
		factura = p;
	}

	public void procesa() {

		deuda = true;

		if (deuda) {
			System.out.println("Creando deuda en cuenta bacnaria");
			factura.cobrar();

		}
	}

}
