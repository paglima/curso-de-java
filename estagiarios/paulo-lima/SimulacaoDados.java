package ideais;

import javax.swing.JOptionPane;

public class SimulacaoDados {

    public static void main(String[] args) throws Exception {
       
        int [] estatistica = new int[7];
        int jogadas = Integer.parseInt(JOptionPane.showInputDialog("Diga o número de vezes"
                + " que o dado será lançado: "));
        jogadas(jogadas,estatistica);
        printArray(estatistica);

    }
    public static void printArray(int []array){
        for (int i = 1; i < array.length; i++) {
            System.out.print("["+(i)+"]"+array[i]+" ");
        }
    }
    public static void jogadas(int jogadas,int[]array){
        int dado=0;
        for (int i = 0; i <jogadas ; i++) {
            dado = (int)(Math.random()*6+1);
            System.out.println("Jogada "+(i+1)+":"+dado);
            array[dado]++;
        }
    }
}