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
        String resposta=" ";
        for (int i = 0; i < tarefas.size(); i++) {
            resposta+=tarefas.get(i)+"/";
        }
        return resposta.substring(0, resposta.length()-1);
    }
}

class TesteLembrete {

    public static void main(String[] args){

        Lembrete[] lembretes = new Lembrete[7];
        inicializa(lembretes);
        Map<String,Lembrete> mapa = new LinkedHashMap<String, Lembrete>();
        String[] dias = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta",
                                                    "Sabado", "Domingo"};
        for (int i = 0; i < dias.length; i++) {
            mapa.put(dias[i],lembretes[i]);
        }
        menu(lembretes,dias);
        System.out.println(mapa);
    }

    private static void menu(Lembrete[] lembretes, String[] dias) {
        String dia="";
        do{
            dia = JOptionPane.showInputDialog("Diga um dia da semana: ");
            boolean adicionou = false;
            for (int i = 0; i < dias.length; i++) {
                if(dia.equals(dias[i])){
                    lembretes[i].addTarefas(JOptionPane.showInputDialog("Diga uma tarefa para "+dia+": "));
                    adicionou=true;
                }
            }
            if(!adicionou && !dia.equals("STOP")){
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