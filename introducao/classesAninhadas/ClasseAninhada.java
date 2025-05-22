package estudos.java.introducao.classesAninhadas;

public class ClasseAninhada {
    private String teste = "Tem acesso a campos da classe envolvente";
    public class ClasseAninhadaSecundaria{
        String msg = "Está é uma classe que não é estatica, mas está aninhadas";
        public String testando(){
            return teste;
        }
    }
}
