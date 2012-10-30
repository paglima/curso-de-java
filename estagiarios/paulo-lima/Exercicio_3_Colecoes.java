package ideais;

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

Fiz o programa baseado na entrada do exemplo, nao fiz proteçoes
caso o usuario nao insira como o modelo.

*/
public class Exercicio_3_Colecoes {

    public static void main(String[] args) {
        System.out.println("Digite uma relação de números: ");
        String [] leitor = new String[7];
        leTeclado(leitor);
        String linha1Elinha3 = leitor[0]+", "+leitor[2];
        String[] linha5 = leitor[4].split(", ");
        String[] linha7 = leitor[6].split(", ");
        String[]linha1ComLinha3= linha1Elinha3.split(", ");
        Set<Integer> treeSetUniao = new TreeSet<Integer>();
        Set<Integer> treeSetIntersecao = new TreeSet<Integer>();
        converteEFazUniao(linha1ComLinha3,treeSetUniao);
        treeSetIntersecao=converteEFazIntersecao(linha5,linha7);
        System.out.println("\nUNIAO"+treeSetUniao);
        System.out.println("INTERSECAO"+treeSetIntersecao);
    }
    
    private static void converteEFazUniao(String []vetor,Set<Integer> tree){
        for (int i=0; i < vetor.length; i++) 
            tree.add(Integer.parseInt(vetor[i]));
    }

    private static Set<Integer> converteEFazIntersecao(String[] linha5, String[] linha7) {
        Set<Integer> treeLinha5 = new TreeSet<Integer>();
        Set<Integer> treeLinha7 = new TreeSet<Integer>();
        for (int i = 0; i < linha5.length; i++) {
            treeLinha5.add(Integer.parseInt(linha5[i]));
        }
        for (int i = 0; i < linha7.length; i++) {
            treeLinha7.add(Integer.parseInt(linha7[i]));
        }
        treeLinha7.retainAll(treeLinha5);
        return treeLinha7;
    }
    private static void leTeclado(String []linhas) {
        for (int i = 0; i < linhas.length; i++) 
            linhas[i]= new Scanner(System.in).nextLine();    
    }
}