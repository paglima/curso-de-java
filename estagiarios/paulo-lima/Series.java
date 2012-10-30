package ideais;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

/*
Abra um arquivo chamado series.tv em qualquer diretório e escreva o nome
de suas 5 séries favoritas nele (uma por linha).
Encerre o fluxo de escrita.
Abra o arquivo e leia o conteúdo exibindo-o na saída.
Encerre o fluxo de leitura.

OBS: Essa classe contém o método main

*/

public class Series {
    private String[] seriesFavoritas;

    public Series(String[] seriesFavoritas) {
        this.seriesFavoritas = seriesFavoritas;
    }

    public void escreveNoArquivo(String nome) throws Exception {
        FileWriter arquivo = new FileWriter(nome);
        BufferedWriter buffered = new BufferedWriter(arquivo);
        int cont =0; // contador para nao imprimir linha em branco no arquivo
        for (int i = 0; i < seriesFavoritas.length; i++) {
            if(i==seriesFavoritas.length-1){
                buffered.write(seriesFavoritas[i]);
                break;
                // condição para não deixar a ultima linha em branco
            }
            buffered.write(seriesFavoritas[i]+ "\n");
        }
        buffered.close();
        arquivo.close();
    }

    public void abreLeExibeArquivo (String nome) throws Exception {
        boolean eof =false;
        String linha="";
        FileReader arquivo = new FileReader(nome);
        BufferedReader buffered = new BufferedReader(arquivo);
        while(!eof){
            linha=buffered.readLine();
            if(linha==null){
                eof=true;
                continue;
            }
            System.out.println(linha);
        }
        arquivo.close();
        buffered.close();
    }
    public void escreveNoArquivoFormatter(String nome) throws Exception {
        Formatter arquivoEscrita = new Formatter(new File(nome));
        for (int i = 0; i < seriesFavoritas.length; i++) {
            if(i==seriesFavoritas.length-1){
                arquivoEscrita.format("%s", seriesFavoritas[i]);
                break;
                // condição para não deixar a ultima linha em branco
            }
            arquivoEscrita.format("%s\n", seriesFavoritas[i]);
        }
        arquivoEscrita.close();
    }
    public void abreLeExibeArquivoScanner(String nome) throws Exception {
        Scanner arquivoLeitura = new Scanner(new File(nome));
        while(arquivoLeitura.hasNextLine()){
            System.out.println(arquivoLeitura.nextLine());
        }
        arquivoLeitura.close();
    }
    public static void main(String[] args) throws Exception {
        String[] seriesFavoritas = { "Two and a Half Men",
                                     "Chaves",
                                     "Todo Mundo Odeia o Chris",
                                     "Um Maluco no Pedaço",
                                     "Chapolin"};
        Series series = new Series(seriesFavoritas);
        series.escreveNoArquivo("series.tv");
        series.abreLeExibeArquivo("series.tv");
        //series.escreveNoArquivoFormatter("series.tv");
        //series.abreLeExibeArquivoScanner("series.tv");
    }
}