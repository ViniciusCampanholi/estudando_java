package matrizIdentidade;

public class IdentificarMatrizIdentidade {

	public void identificar(Integer[][] matriz, Integer linha, Integer coluna) {
		Boolean linhaDiagonal = true;
		Boolean demaisLinhas = false;
		for (int iLinha = 0; iLinha < linha; iLinha++) {
			for (int iColuna = 0; iColuna < coluna; iColuna++) {
				if (iLinha == iColuna) {
					if (matriz[iLinha][iColuna] != 1) {
						linhaDiagonal = false;
						break;
					}
				} else {
					if (matriz[iLinha][iColuna] != 0) {
						demaisLinhas = true;
					}
				}
			}
		}
		if (linhaDiagonal && !demaisLinhas) {
			System.out.println("E uma matriz de identidade");
		} else {
			System.out.println("Não  euma matriz de identidade");
		}
	}

}
