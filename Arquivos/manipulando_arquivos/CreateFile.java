package manipulando_arquivos;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args){
        try{
            File file = new File("Exercicios_avulsos\\src\\manipulando_arquivos\\arquivo_de_teste.txt");
            if(file.createNewFile()){
                System.out.println("Arquivo criado: " + file.getName());
            } else {
                System.out.println("Arquivo nao foi criado, talvez já exista");
            }
        } catch(IOException e){
            System.out.println("Ocorreu algum erro");
            e.printStackTrace();
        }

        
    }
    
}