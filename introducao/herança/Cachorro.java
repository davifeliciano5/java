package estudos.java.introducao.herança;

// Classe derivada: Cachorro
public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " (cachorro) diz: Au au!");
    }

    public void abanarRabo() {
        System.out.println(nome + " está abanando o rabo.");
    }
}
