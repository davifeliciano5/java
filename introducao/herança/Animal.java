package estudos.java.introducao.herança;

// Classe base
public class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public void emitirSom() {
        System.out.println("O animal faz um som.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }
}

