package estudos.java.introducao.Enums;

/*
 * Enumeração (enum) em Java
 *
 * Um enum (do inglês "enumeration") é um tipo especial de classe que representa um conjunto fixo de constantes.
 * Ele é usado quando sabemos de antemão todos os valores possíveis que uma variável pode assumir.
 * Por exemplo, dias da semana, estados civis, tipos de usuário, etc.
 *
 * Exemplo:
 *     public enum DiaDaSemana {
 *         SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;
 *     }
 *
 * Cada constante (como SEGUNDA, TERCA, etc.) é uma instância do próprio enum DiaDaSemana.
 *
 * Vantagens de usar enum:
 * - Código mais seguro e legível: evita o uso de strings ou números mágicos que podem causar erros.
 * - Permite associar dados e comportamentos a cada constante (com construtores, atributos e métodos).
 * - Facilita o uso em estruturas de controle como switch-case.
 *
 * Enums também podem ter atributos, métodos e construtores:
 *

 * Neste exemplo, cada constante possui um nível associado, e isso pode ser acessado através de um método.
 *
 * Em resumo: Enums trazem clareza, segurança e organização ao código quando lidamos com valores fixos.
 */

public enum NivelAcesso {
    ADMIN(3), MODERADOR(2), USUARIO(1);

    private int nivel;

    NivelAcesso(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }
}

/* Exemplo de uso
public class Sistema {
    public static void main(String[] args) {
        // Criando uma variável do tipo enum
        NivelAcesso acesso = NivelAcesso.ADMIN;

        // Usando switch com enum
        switch (acesso) {
            case ADMIN:
                System.out.println("Acesso total");
                break;
            case MODERADOR:
                System.out.println("Acesso moderado");
                break;
            case USUARIO:
                System.out.println("Acesso limitado");
                break;
        }

        // Acessando o valor associado
        System.out.println("Nível numérico: " + acesso.getNivel());
    }
}

 */
