
//BLOCO ESTÁTICO

package br.org.serratec.calculadora;

public class Teste {
	public static void main(String[] args) {

		Compra.valor=5;
		
		Compra c1 = new Compra();
		c1.dado="20";
		
		Compra c2 = new Compra();
		c2.dado="30";
		
		c1.imprime();
		c2.imprime();

	}
	
	
	public static class Compra {
		public String dado;
		public static  int valor=10;
		static {
			valor = valor +1;
		}
		
		
		public void imprime() {
			System.out.println(" dado  " + dado + " / valor " + valor );
		}
	}
}
