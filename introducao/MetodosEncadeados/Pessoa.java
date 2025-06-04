package estudos.java.introducao.MetodosEncadeados;
/*
 * Encadeamento de métodos (Method Chaining)
 *
 * Essa técnica permite chamar vários métodos em sequência usando uma única linha de código.
 * Para isso funcionar, cada método deve retornar a própria instância do objeto, ou seja, retornar "this".
 * No exemplo abaixo, a classe PessoaBuilder possui métodos como setNome(), setIdade() e setCidade()
 * que todos retornam um objeto do tipo PessoaBuilder.
 *
 * Isso permite escrever algo como:
 *     new PessoaBuilder().setNome("João").setIdade(30).setCidade("São Paulo").build();
 *
 * O método build() retorna o objeto final do tipo Pessoa.
 *
 * Vantagens do method chaining:
 * - Código mais limpo e legível.
 * - Evita repetição de variáveis temporárias.
 * - Facilita a construção de objetos complexos de forma organizada.
 *
 * Essa abordagem é muito comum no padrão de projeto Builder e em APIs fluent (como o StringBuilder, por exemplo).
 */

public class Pessoa {
    private String nome;
    private int idade;
    private String cidade;


    private Pessoa(){}

    public static class PessoaBuilder{
        private Pessoa pessoa;

        public PessoaBuilder(){
            pessoa = new Pessoa();
        }

        public  PessoaBuilder setNome(String nome){
            pessoa.nome = nome;
            return this;
        }

        public PessoaBuilder setIdade(int idade){
            pessoa.idade = idade;
            return this;
        }

        public PessoaBuilder setCidade(String cidade){
            pessoa.cidade = cidade;
            return this;
        }
        public Pessoa build(){
            return pessoa;
        }
    }
    public void apresentar(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Cidade: "+cidade);
    }
}
