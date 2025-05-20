package estudos.java.introducao;
/*
O private modificador de acesso significa que somente o código dentro da própria classe pode acessar este campo Java.

O package modificador de acesso significa que apenas código dentro da própria classe, ou de outras classes no mesmo pacote,
 pode acessar o campo. Na verdade, você não escreve o modificador de pacote. Ao omitir qualquer modificador de acesso, o
  modificador de acesso assume o escopo do pacote por padrão.

O protecte dmodificador de acesso é como o packagemodificador, exceto que as subclasses da classe também podem acessar o
 campo, mesmo que a subclasse não esteja localizada no mesmo pacote.

O public modificador de acesso significa que o campo pode ser acessado por todas as classes do seu aplicativo.

Os campos estáticos Java estão localizados na classe, não nas instâncias da classe.

Campos Java não estáticos estão localizados nas instâncias da classe.

Quando você não pode alterar o valor de um campo final de qualquer maneira, em muitos casos faz sentido também declará-lo
static. Dessa forma, ele só existe na classe, não em todos os objetos. Aqui está um exemplo:

*\
 */
public class ModificadoresDeAcesso {
     public static String  NomeEmpresa = "BrasCar";
     public final String NomecomFinal = "Finally";
     public static final String NomeComFinalEStatic = "NomecomfinalEstatic";
}
