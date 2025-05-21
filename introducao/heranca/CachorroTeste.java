package estudos.java.introducao.heranca;

public class CachorroTeste {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setNome("Toniho");
        dog.setLatir(true);

        System.out.println(dog.getNome());
        System.out.println(dog.getLatir());
    }
}
