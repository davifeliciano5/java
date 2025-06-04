package estudos.java.introducao.herança;

// Classe principal com o main
public class Programa {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal("Bicho");
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador");
        Gato meuGato = new Gato("Mimi", "Branco");

        // Chamada dos métodos
        meuAnimal.emitirSom();
        meuAnimal.dormir();

        System.out.println();

        meuCachorro.emitirSom();  // Override
        meuCachorro.dormir();     // Herdado
        meuCachorro.abanarRabo(); // Específico

        System.out.println();

        meuGato.emitirSom();         // Override
        meuGato.dormir();            // Herdado
        meuGato.arranharMoveis();    // Específico

        System.out.println();

        // Polimorfismo: usar Animal como tipo genérico
        Animal[] animais = {meuCachorro, meuGato};
        for (Animal a : animais) {
            a.emitirSom(); // Chama o método correto mesmo sendo Animal
        }
    }
}
