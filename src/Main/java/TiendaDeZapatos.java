
public class TiendaDeZapatos {

	public static void main(String[] args) {

		class Dependiente implements Datafono {

			@Override
			public void cobrar() {
				System.out.println("Acerando datafono...");
				System.out.println(" ");
			}
		}
		Dependiente juan = new Dependiente();

		TargetaDeCredito tc = new TargetaDeCredito(juan);
		Paypal py = new Paypal(juan);
		DeudaCuentaBancaria dcb = new DeudaCuentaBancaria(juan);

		tc.procesa();
		py.procesa();
		dcb.procesa();

	}
}
