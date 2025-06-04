package estudos.java.introducao.herança;

// Classe derivada: Gato
public class Gato extends Animal {
    private String cor;

    public Gato(String nome, String cor) {
        super(nome);
        this.cor = cor;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (gato) diz: Miau!");
    }

    public void arranharMoveis() {
        System.out.println(nome + " está arranhando os móveis.");
    }
}

