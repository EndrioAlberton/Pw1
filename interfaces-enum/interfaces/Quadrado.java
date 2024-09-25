package interfaces;

public class Quadrado implements OperacoesFormas{
	private double lado;

	@Override
	public double calculaArea() {
		return Math.pow(lado, 2);
	}
	
	
}
