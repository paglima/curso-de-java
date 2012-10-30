package ideais;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/*
Implemente um programa para medir o tempo de execução de algumas
 classes da API de collections (pelo menos 4 delas) no que diz respeito
 a adicionar e percorrer elementos.
 Receba do usuário a quantidade de elementos que serão inseridos.
 Dica: Use System.currentTimeMillis() para pegar o tempo atual
 em milissegundos.
 */


public class Exercicio_4_Colecoes {

    public static void main(String[] args) {
       int qtdElementos = Integer.parseInt(JOptionPane.showInputDialog
               ("Diga a quatidade de elementos a ser inserida na coleçao"));
       ArrayList<Integer> arrayList = new ArrayList<Integer>();
       System.out.println("Tempo ArrayList: "+testaArrayList(qtdElementos,arrayList)+"\n");
       LinkedList<Integer> linkedList = new LinkedList<Integer>();
       System.out.println("Tempo LinkedList: "+testaLinkedList(qtdElementos,linkedList)+"\n");
       TreeSet<Integer> treeSet = new TreeSet<Integer>();
       System.out.println("Tempo TreeSet: "+testaTreeSet(qtdElementos,treeSet)+"\n");
       HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
       System.out.println("Tempo HashMap: "+ testaHashMap(qtdElementos,hashMap)+"\n");
    }
    public static long testaArrayList(int qtdElementos, ArrayList<Integer> arrayList){
        long inicio,fim;
        inicio=System.currentTimeMillis();
        for (int i = 1; i <= qtdElementos; i++) {
            arrayList.add(i);
        }
        Iterator<Integer> loop = arrayList.iterator();
        while(loop.hasNext()){
            System.out.println(loop.next());
        }
        fim=System.currentTimeMillis();
        return fim-inicio;
    }
    public static long testaLinkedList(int qtdElementos, LinkedList<Integer> linkedList){
        long inicio,fim;
        inicio=System.currentTimeMillis();
        for (int i = 1; i <= qtdElementos; i++) {
            linkedList.add(i);
        }
        Iterator<Integer> loop = linkedList.iterator();
        while(loop.hasNext()){
            System.out.println(loop.next());
        }
        fim=System.currentTimeMillis();
        return fim-inicio;
    }
    public static long testaTreeSet(int qtdElementos, TreeSet<Integer> treeSet){
        long inicio,fim;
        inicio=System.currentTimeMillis();
        for (int i = 1; i <= qtdElementos; i++) {
            treeSet.add(i);
        }
        Iterator<Integer> loop = treeSet.iterator();
        while(loop.hasNext()){
            System.out.println(loop.next());
        }
        fim=System.currentTimeMillis();
        return fim-inicio;
    }
    public static long testaHashMap(int qtdElementos, HashMap<Integer,Integer> hashmap){
        long inicio,fim;
        inicio=System.currentTimeMillis();
        for (int i = 1; i <= qtdElementos; i++) {
            hashmap.put(i,i);
        }
        Set<Integer> chaves = hashmap.keySet();
        Iterator<Integer> loop = chaves.iterator();
        while(loop.hasNext()){
            Integer chave = loop.next();
            System.out.println(chave+" "+ hashmap.get(chave));
        }
        fim=System.currentTimeMillis();
        return fim-inicio;
    }
}