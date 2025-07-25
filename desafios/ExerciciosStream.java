package Aula3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStream {
    //1 - Dada a lista de números inteiros abaixo, filtre apenas os
    // números pares e imprima-os.
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(e -> e % 2 ==0)
            .forEach(System.out::println);

    //2 - Dada a lista de strings abaixo,
    // converta todas para letras maiúsculas e imprima-as.
    List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(e -> e.toUpperCase())
            .forEach(System.out::println);

    //3 - Dada a lista de números inteiros abaixo, filtre os
    // números ímpares, multiplique cada
    // um por 2 e colete os resultados em uma nova lista.
    List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5, 6);
    List<Integer> novaLista = numeros1.stream()
            .filter(e -> e % 2 !=0)
            .map(e -> e * 2)
            .collect(Collectors.toList());
        novaLista.forEach(System.out::println);


    //4 - Dada a lista de strings abaixo, remova as duplicatas
    // (palavras que aparecem mais de uma vez) e imprima o resultado.
    List<String> palavras1 = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        palavras1.stream()
                .collect(Collectors.toSet())
            .forEach(System.out::println);
    //5 - Dada a lista de sublistas de números inteiros abaixo,
    // extraia todos os números
    // primos em uma única lista e os ordene em ordem crescente.
    List<List<Integer>> listaDeNumeros = Arrays.asList(
            Arrays.asList(1, 2, 3, 4),
            Arrays.asList(5, 6, 7, 8),
            Arrays.asList(9, 10, 11, 12)
    );
    List<Integer> novaListaDeNumeros = listaDeNumeros.stream()
            .flatMap(List::stream)
            .collect(Collectors.toList());
       novaListaDeNumeros.forEach(System.out::println);


    //6 - Dado um objeto Pessoa com os campos nome e
    // idade, filtre as pessoas com mais de 18 anos, extraia os nomes
    // e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.
    List<Pessoa> pessoas = Arrays.asList(
            new Pessoa("Alice", 22),
            new Pessoa("Bob", 17),
            new Pessoa("Charlie", 19)
    );
        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
            .sorted(Comparator.comparing(e -> e.getNome()))
            .forEach(e -> System.out.println(e.getNome()));

    //7 - Você tem uma lista de objetos do tipo Produto,
    // onde cada produto possui os atributos nome (String),
    // preco (double) e categoria (String). Filtre todos os
    // produtos da categoria "Eletrônicos" com preço menor que R$ 1000,
    // ordene-os pelo preço em ordem crescente e colete o resultado
    // em uma nova lista.
    List<Produto> produtos = Arrays.asList(
            new Produto("Smartphone", 800.0, "Eletrônicos"),
            new Produto("Notebook", 1500.0, "Eletrônicos"),
            new Produto("Teclado", 200.0, "Eletrônicos"),
            new Produto("Cadeira", 300.0, "Móveis"),
            new Produto("Monitor", 900.0, "Eletrônicos"),
            new Produto("Mesa", 700.0, "Móveis")
    );
    List<Produto> novaListaProduto = produtos.stream()
            .filter(e-> e.getCategoria() == "Eletrônicos" && e.getPreco() < 1000.00)
            .sorted(Comparator.comparingDouble(c -> c.getPreco()))
            .collect(Collectors.toList());

        novaListaProduto.stream()
                .forEach(System.out::println);
}
