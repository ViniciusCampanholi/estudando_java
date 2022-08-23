package manipulando_strings;

// Exibindo apenas uma parte da string
public class Truncando {

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