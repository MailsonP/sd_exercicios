import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculadora extends Remote{

	public int adicao(int a, int b) throws RemoteException; // M�todo de adi��o
	
	public int subtrair(int a, int b) throws RemoteException; // M�todo de subtra��o
	
	public int multiplicar(int a, int b) throws RemoteException;//M�todo de multiplica��o
	
	public int dividir(int a, int b) throws RemoteException;//M�todo de divis�o
}
