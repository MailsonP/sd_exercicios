import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote{

	public int adicao(int a, int b) throws RemoteException; // Método de adição
	
	public int subtrair(int a, int b) throws RemoteException; // Método de subtração
	
	public int multiplicar(int a, int b) throws RemoteException;//Método de multiplicação
	
	public int dividir(int a, int b) throws RemoteException;//Método de divisão
}
