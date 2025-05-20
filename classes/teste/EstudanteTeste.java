package estudos.java.classes.teste;

import estudos.java.classes.dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Davi";
        estudante.idade = 20;
        estudante.sexo = 'M';

        System.out.println(estudante.nome +" "+estudante.idade+" "+estudante.sexo);
    }
}
