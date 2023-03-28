package manipulando_strings;

public class Metodos{

    // Reverte uma string
    public void reverterString(String str){
        System.out.println("Entrada: "+str);
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println("Saída : "+str);
    }

    // Limita a exibição da string até a quantidade de caracteres limite
    public String limitandoExibicao(String input){
        int limite = 5;
        String output;
        if(input.length()>5){
            output = input.substring(0, limite);
        } else{
            output = input;
        }
        return output;
    }
}