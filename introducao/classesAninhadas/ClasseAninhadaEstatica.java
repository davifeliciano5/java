package estudos.java.introducao.classesAninhadas;

/*
Classes aninhadas não estáticas (classes internas) têm acesso aos campos da classe envolvente,
 mesmo que sejam declaradas privadas.


 Se uma classe interna Java declara campos ou métodos com os mesmos nomes que os campos ou métodos da classe que a
  envolve, diz-se que os campos ou métodos internos sobrepõem -se aos campos ou métodos externos.
 */

public class ClasseAninhadaEstatica {


    public static class SegundaClasseStatic{
        String msg = "Está é a segunda classe aninhada";

    }

}
