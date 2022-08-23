package manipulando_strings;

public class Metodos{

    public void reverterString(String str){
        System.out.println("Entrada: "+str);
        StringBuilder strb = new StringBuilder(str);
        str = strb.reverse().toString();
        System.out.println("Saída : "+str);
    }

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