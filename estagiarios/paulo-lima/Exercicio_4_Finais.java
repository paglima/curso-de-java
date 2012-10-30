package ideais;

import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 Crie um programa que recebe do usuário uma url e exibe os headers devolvidos
 após submeter a url. As linhas abaixo realizam a conexão e devolvem os headers:

URL url = new URL("http://www.google.com");
URLConnection conexao = url.openConnection();
Map<String, List<String>> headers = conexao.getHeaderFields();

Percorra os headers através de suas chaves no mapa e exiba os valores. 
Capture as exceções que podem vir a ocorrer e exiba o retorno do método 
getMessage() da exceção.
 
 */
public class Exercicio_4_Finais {
    public static void main(String[] args){
        try{
            System.out.print("Digite uma URL: ");
            URL url = new URL(new Scanner(System.in).nextLine());
            URLConnection conexao = url.openConnection();
            Map<String, List<String>> headers = conexao.getHeaderFields();
            Set<String> chaves=headers.keySet();
            Iterator<String> percorreChave = chaves.iterator();
            String chave;
            while(percorreChave.hasNext()){
               chave=percorreChave.next();
               System.out.println(headers.get(chave));
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
