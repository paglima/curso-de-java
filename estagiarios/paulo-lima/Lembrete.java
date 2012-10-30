package ideais;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

/*
Crie uma classe Lembrete com um atributo List<String> tarefas.
Em um método main, crie um mapa cujas chaves serão os dias
da semana(String) e os valores serão objetos da classe Lembrete.
Escreva algum código demonstrando a estrutura criada.

OBS: A funçao main está nesse arquivo
*/
public class Lembrete {
    List<String> tarefas;

    public Lembrete() {
        tarefas = new LinkedList<String>();
    }

    public void addTarefas(String tarefa){
        tarefas.add(tarefa);
    }
    
    @Override
    public String toString() {
        String resp=" ";
        for (int i = 0; i < tarefas.size(); i++) {
            resp+=tarefas.get(i)+"/";
        }
        return resp.substring(0, resp.length()-1);
    }
}

class TesteLembrete {

    public static void main(String[] args){

        Lembrete[] lembretes = new Lembrete[7];
        inicializa(lembretes);
        Map<String,Lembrete> mapa = new LinkedHashMap<String, Lembrete>();
        mapa.put("Segunda", lembretes[0]);
        mapa.put("Terça", lembretes[1]);
        mapa.put("Quarta", lembretes[2]);
        mapa.put("Quinta", lembretes[3]);
        mapa.put("Sexta", lembretes[4]);
        mapa.put("Sabado", lembretes[5]);
        mapa.put("Domingo", lembretes[6]);
        menu(lembretes);
        System.out.println(mapa);
    }

    private static void menu(Lembrete[] lembretes) {
        String dia="";
        do{
            dia = JOptionPane.showInputDialog("Diga um dia da semana: ");
            if(dia.equals("Segunda")){
                lembretes[0].addTarefas(JOptionPane.showInputDialog("Diga uma tarefa para "+dia+": "));
            }else if(dia.equals("Terça")){
                lembretes[1].addTarefas(JOptionPane.showInputDialog("Diga uma tarefa para "+dia+": "));
            }else if(dia.equals("Quarta")){
                lembretes[2].addTarefas(JOptionPane.showInputDialog("Diga uma tarefa para "+dia+": "));
            }else if(dia.equals("Quinta")){
                lembretes[3].addTarefas(JOptionPane.showInputDialog("Diga uma tarefa para "+dia+": "));
            }else if(dia.equals("Sexta")){
                lembretes[4].addTarefas(JOptionPane.showInputDialog("Diga uma tarefa para "+dia+": "));
            }else if(dia.equals("Sabado")){
                lembretes[5].addTarefas(JOptionPane.showInputDialog("Diga uma tarefa para "+dia+": "));
            }else if(dia.equals("Domingo")){
                lembretes[6].addTarefas(JOptionPane.showInputDialog("Diga uma tarefa para "+dia+": "));
            }else if(dia.equals("STOP")){
                continue;
            }else{
                JOptionPane.showMessageDialog(null,"Diga um dia da semana válido!!");
            }
         }while(!dia.equals("STOP"));
    }

    private static void inicializa(Lembrete[] lembretes) {
        for (int i = 0; i < lembretes.length; i++) {
            lembretes[i]=new Lembrete();
        }
    }
}