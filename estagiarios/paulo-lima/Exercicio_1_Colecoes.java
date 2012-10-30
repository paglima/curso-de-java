package ideais;

import java.util.TreeSet;

/*
1 - Gere todos os números entre 1 e 1000 e ordene em ordem
decrescente utilizando um TreeSet.
*/

public class Exercicio_1_Colecoes {
    public static void main(String[] args) {
        TreeSet<Integer> numerosDecrescentes = new TreeSet<Integer>();
        for (int i =1; i<=1000 ; i++) {
            numerosDecrescentes.add(i);
        }
        System.out.println(numerosDecrescentes.descendingSet());
    }
}