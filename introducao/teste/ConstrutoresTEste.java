package estudos.java.introducao.teste;

import estudos.java.introducao.Construtores;


public class ConstrutoresTEste {
    public static void main(String[] args) {
        Construtores construtor = new Construtores(20,"Davi");
        System.out.println(construtor.nome);
        System.out.println(construtor.idade);
    }
}
