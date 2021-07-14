import java.util.Scanner;

public class Desafio01 {
	/*
	 * � muito comum que programas que realizam cadastros de pessoas precisem
	 * validar a sigla do estado a que elas pertencem. Crie uma fun��o que receba
	 * uma String contendo a sigla de um estado e verifique se esse estado existe ou
	 * n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista,
	 * ele deve retornar um boolean false. A main do seu programa deve conter a
	 * digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para
	 * afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.
	 * 
	 */

	public static boolean existeEstado1(String siglaDoEstado) {
		if (siglaDoEstado.equalsIgnoreCase("AC") || siglaDoEstado.equalsIgnoreCase("AL")
				|| siglaDoEstado.equalsIgnoreCase("AP") || siglaDoEstado.equalsIgnoreCase("AM")
				|| siglaDoEstado.equalsIgnoreCase("BA") || siglaDoEstado.equalsIgnoreCase("CE")
				|| siglaDoEstado.equalsIgnoreCase("ES") || siglaDoEstado.equalsIgnoreCase("GO")
				|| siglaDoEstado.equalsIgnoreCase("MA") || siglaDoEstado.equalsIgnoreCase("MT")
				|| siglaDoEstado.equalsIgnoreCase("MS") || siglaDoEstado.equalsIgnoreCase("MG")
				|| siglaDoEstado.equalsIgnoreCase("PA") || siglaDoEstado.equalsIgnoreCase("PB")
				|| siglaDoEstado.equalsIgnoreCase("PR") || siglaDoEstado.equalsIgnoreCase("PE")
				|| siglaDoEstado.equalsIgnoreCase("PI") || siglaDoEstado.equalsIgnoreCase("RJ")
				|| siglaDoEstado.equalsIgnoreCase("RN") || siglaDoEstado.equalsIgnoreCase("RO")
				|| siglaDoEstado.equalsIgnoreCase("RR") || siglaDoEstado.equalsIgnoreCase("SC")
				|| siglaDoEstado.equalsIgnoreCase("SP") || siglaDoEstado.equalsIgnoreCase("SE")
				|| siglaDoEstado.equalsIgnoreCase("TO") || siglaDoEstado.equalsIgnoreCase("DF")) {
			return true;
		}
		return false;
	}
	
	public static boolean existeEstado2(String estado) {
		String estados[] = {"SP", "AC", "TO", "DF", "SE" , "RR", "SC", "RN", "RO", "PI", "RJ", "PE", "PR", "PA", "PB", "MS", "MG", "MA", "MT", "ES", "GO", "BA", "CE", "AM", "AP", "AL"};
		
		for(int i=0; i<estados.length; i++) {
			if(estados[i].equalsIgnoreCase(estado)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		String sigla;

		System.out.println("Digite a sigla do Estado");
		sigla = leitor.next();

		if (existeEstado2(sigla)) {
			System.out.println("Estado existe");
		} else {
			System.out.println("Estado n�o existe");
		}
		
		leitor.close();

	}
}
