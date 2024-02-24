package contarvogais;

public class ContarQuantidadeVogais {
	
	private static final String[] ARRAY_VOGAIS = {"a", "e", "i", "o", "u"};
	
	public void contarVogais(String texto) {
		Integer quantidadeVogais = 0;
		
		for(int i=0; i<texto.length(); i++) {
			String character = String.valueOf(texto.charAt(i)).toLowerCase();
			for(String vogal : ARRAY_VOGAIS) {
				if(character.equals(vogal)) {
					quantidadeVogais++;
					System.out.println(character);
					break;
				}
			}
		}
		System.out.println("Existem "+quantidadeVogais+" vogais no texto.");
	}
}
