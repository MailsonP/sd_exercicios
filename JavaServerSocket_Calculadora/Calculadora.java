public class Calculadora {
	public String sayHello(String nome, String sobrenome) {
		return "Fala " + nome + " " + sobrenome;
	}

	public double soma(double oper1, double oper2) {
		return oper1 + oper2;
	}

	public double menos(double oper1, double oper2) {
		return oper1 - oper2;
	}

	public double vezes(double oper1, double oper2) {
		return oper1 * oper2;
	}

	public double dividir(double oper1, double oper2) {
		return oper1 / oper2;
	}
}