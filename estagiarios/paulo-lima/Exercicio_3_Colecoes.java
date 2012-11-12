package ideais;

import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
/*
 3 - Implemente um programa que receberá do usuário duas relações de números
 inteiros positivos e um caractere representando uma das seguintes operações:
+ união
* interseção
O programa deve retornar o resultado da operação sobre os dois grupos de números.
Ex.:
Entrada                       Saída
-------------------------     -------------------
1, 2, 3
+
3, 5, 7                       1, 2, 3, 5, 7

10, 9, 8, 7
*
2, 4, 6, 8                    8

OBS: Fiz o programa baseado na entrada do exemplo, nao fiz proteçoes
caso o usuario nao insira como o modelo.

*/
public class Exercicio_3_Colecoes {

    public static void main(String[] args){
        String [] linhas = new String[2];
        int controle;
        do{
            System.out.println("Digite uma sequencia de números: ");
            linhas[0]= new Scanner(System.in).nextLine();
            System.out.println("Digite a operação: ");
            char op = new Scanner(System.in).nextLine().charAt(0);
            System.out.println("Digite outra sequencia de números: ");
            linhas[1]= new Scanner(System.in).nextLine();
            String linha1ELinha3 = linhas[0]+", "+linhas[1];
            String[] linhasUmETres = linha1ELinha3.split(", ");
            String []linha1= linhas[0].split(", ");
            String []linha3= linhas[1].split(", ");
            switch(op){
                case '+': Set<Integer> treeSetUniao = new TreeSet<Integer>();
                          treeSetUniao = converteEFazUniao(linhasUmETres);
                          System.out.println("\nUNIAO"+treeSetUniao+"\n");
                          break;
                case '*': Set<Integer> treeSetIntersecao = new TreeSet<Integer>();
                          treeSetIntersecao = converteEFazIntersecao(linha1,linha3);
                          System.out.println("\nINTERSECAO"+treeSetIntersecao+"\n");
                          break;
                default: System.out.println("Digite um operador válido");
            }
            System.out.println("Digite 1 para continuar ou 0 para sair: ");
            controle = new Scanner(System.in).nextInt();
        }while(controle!=0 && controle==1);

    }
    
    private static Set<Integer> converteEFazUniao(String []vetor){
        Set<Integer> tree = new TreeSet<Integer>();
        for (int i = 0; i < vetor.length; i++) {
            tree.add(Integer.parseInt(vetor[i]));
        }
        return tree;
    }

    private static Set<Integer> converteEFazIntersecao(String[] linha1, String[] linha3) {
        Set<Integer> treeLinha1 = new TreeSet<Integer>();
        Set<Integer> treeLinha3 = new TreeSet<Integer>();
        for (int i = 0; i < linha1.length; i++) {
            treeLinha1.add(Integer.parseInt(linha1[i]));
        }
        for (int i = 0; i < linha3.length; i++) {
            treeLinha3.add(Integer.parseInt(linha3[i]));
        }
        treeLinha1.retainAll(treeLinha3);
        return treeLinha1;
    }
}