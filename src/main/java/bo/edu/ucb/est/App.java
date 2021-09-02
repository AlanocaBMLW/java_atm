package bo.edu.ucb.est;

import java.util.Scanner;

import bo.edu.ucb.est.modelo.Banco;
import bo.edu.ucb.est.modelo.Cliente;
import bo.edu.ucb.est.modelo.Cuenta;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inicializando Datos del Banco");
		Banco bisa = new Banco("BANCO BISA");
		// agregas cliente jperez
		Cliente jperez = new Cliente(" Juan Perez", "jperez", "3333");
		Cuenta cta1Jperez = new Cuenta("BOB", "Caja Ahorros", 12000.0);
		jperez.agregarCuenta(cta1Jperez);
		Cuenta cta2Jperez = new Cuenta("USD", "Cuenta Corriente", 100.0);
		jperez.agregarCuenta(cta2Jperez);
		bisa.agregarCliente(jperez);
		// agregas cliente mgomez
		Cliente mgomez = new Cliente("Maria Gomez", "mgomez", "4444");
		Cuenta cta1Mgomez = new Cuenta("BOB", "Caja Ahorros", 0.0);
		mgomez.agregarCuenta(cta1Mgomez);
		bisa.agregarCliente(mgomez);
		// agregas cliente cgomez
		Cliente cgomez = new Cliente("Carlos Gomez", "cgomez", "3333");
		Cuenta cta1Cgomez = new Cuenta("BOB", "Caja Ahorros", 100.0);
		cgomez.agregarCuenta(cta1Cgomez);
		Cuenta cta2Cgomez = new Cuenta("USD", "Cuenta Corriente", 1000.0);
		cgomez.agregarCuenta(cta2Cgomez);
		Cuenta cta3Cgomez = new Cuenta("BOB", "Caja Ahorros", 100000.0);
		cgomez.agregarCuenta(cta3Cgomez);
		bisa.agregarCliente(cgomez);
		// mi codigo
		Cliente clienteMenu;
		boolean flag = true;
		String codigoMenu = "";
		String pinMenu = "";
		//inicio sesion
		System.out.println("Ingrese su codigo: \n");
		codigoMenu = sc.nextLine();
		System.out.println("Ingrese el pin de seguridad: \n");
		pinMenu = sc.nextLine();
		clienteMenu = bisa.buscarClientePorCodigo(codigoMenu, pinMenu);
		//final inicio sesion
		int decision = 0;
		while (flag) {// menu de despliegue
			System.out.println("\n\n\n\n\n\nEscoja su opcion\n1.) Ver Saldo\n" + "2.)Retiro\n3.)Deposito\n4.)Salir");
			decision = sc.nextInt();
			if (decision >= 1 || decision < 5) {
				if (decision == 1) {
					for(int i=0;i<clienteMenu.getCuentas().size();i++) {
						System.out.println("Cuentas \n");
						System.out.println(clienteMenu.getCuentas().get(i).getSaldo());
					}
					
				} else if (decision == 2) {

				} else if (decision == 3) {

				} else if (decision == 4) {
					flag = false;
				}
			} else {
				System.out.println("\n\nIngrese un numero correcto!");
			}

		} // fin de while de menu

	}
}
