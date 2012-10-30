package ideais;

/*
Crie a classe Carga com o atributo double peso.
Ela terá um construtor e um método setter para o peso.
Valide o peso (peso > 0) antes de jogar no atributo e caso seja inválido
lance a exceção IllegalArgumentException do pacote lang.

OBS: Essa classe contém o método main

*/
public class Carga {

    double peso;

    public Carga() {
    }

    public Carga(double peso) {
        if(peso<0){
            throw new IllegalArgumentException();
        }
        this.peso = peso;
    }

    public void setPeso(double peso) throws Exception {
        if(peso<0){
            throw new IllegalArgumentException();
        }
        this.peso = peso;
    }

    public static void main(String[] args) throws Exception {
        Carga carga = new Carga(9000.4);
        carga.setPeso(7000.34);
        carga.setPeso(-5);
        System.out.println(carga.peso);
    }
}
