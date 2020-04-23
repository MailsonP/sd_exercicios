import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class CalculadoraCliente {
	
	public static void main(String[] args) {
		Registry reg = null;
		ICalculadora calc;		
		try {
			reg = LocateRegistry.getRegistry(1099);
			calc = (ICalculadora) reg.lookup("calculadora");
			System.out.println("adição "+ calc.adicao(15, 15)); 
			System.out.println("subtração " + calc.subtrair(15, 15)); 
			System.out.println("divisão "+ calc.dividir(30, 2)); 
			System.out.println("multiplicação " + calc.multiplicar(5, 3));
			System.out.println("divisão" + calc.dividir(66, 3));
		} catch (RemoteException | NotBoundException e) {
				System.out.println(e);
				System.exit(0);
		}
	}		

}
