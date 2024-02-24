package palindromo;

public class IdenificarPalindromo {
	public static void main(String[] args) {
		
		String entrada = "Ame o poema";
		
		//pegar a string de entrada e remover todos os espaços usando o replaceAll
		String entradaSemEspaço = entrada.toLowerCase().replaceAll("\\s+", "");
		//decompoe a string sem espaços e um array
		String[] arrayEntrada = entradaSemEspaço.split("");
		//pega o tamanho do array com a string decomposta sem espaços
		int tamanhoArrayEntrada = arrayEntrada.length;
		//Declara um array com o mesmo tamanho do arrayEntrada
		String[] arrayInvertido = new String[tamanhoArrayEntrada];
		
//		Itere o array de entrada atribuindo de traz pra frente no array de entrada
		for(int i=0; i<tamanhoArrayEntrada; i++) {
			arrayInvertido[i] = arrayEntrada[tamanhoArrayEntrada-1-i];
		}
		
//		compara o arrays, se alguns dos elemenos forem diferentes enre sim então nao é um palindromo
//		break encerra se um elemento for diferene
		Boolean palindromo = true;
		for(int i=0; i<tamanhoArrayEntrada; i++) {
			if(!arrayInvertido[i].equals(arrayEntrada[i])){
				palindromo = false;
				break;
			}
		}
		
		if(palindromo) {
			System.out.println("E um palindromo");
		} else {
			System.out.println("Nao e um palidromo");
		}
	}
}
