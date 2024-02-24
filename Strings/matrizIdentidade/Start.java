package matrizIdentidade;

public class Start {
	public static void main(String[] args) {
		Integer linhas = 3;
		Integer colunas = 3;
		Integer[][] matriz = new Integer[linhas][colunas];

		// linha 0
		matriz[0][0] = 1;
		matriz[0][1] = 0;
		matriz[0][2] = 0;
		// linha 1
		matriz[1][0] = 0;
		matriz[1][1] = 1;
		matriz[1][2] = 0;
		// linha 2
		matriz[2][0] = 0;
		matriz[2][1] = 0;
		matriz[2][2] = 1;

		IdentificarMatrizIdentidade entrada = new IdentificarMatrizIdentidade();
		entrada.identificar(matriz, linhas, colunas);
	}
}