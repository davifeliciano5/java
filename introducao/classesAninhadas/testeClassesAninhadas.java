package estudos.java.introducao.classesAninhadas;

public class testeClassesAninhadas {
    public static void main(String[] args) {
        ClasseAninhadaEstatica.SegundaClasseStatic segunda = new ClasseAninhadaEstatica.SegundaClasseStatic();
        System.out.println(segunda.msg);

        ClasseAninhada segundasemStatic = new ClasseAninhada();
        ClasseAninhada.ClasseAninhadaSecundaria interno = segundasemStatic.new ClasseAninhadaSecundaria();
        System.out.println(interno.msg);
        System.out.println(interno.testando());
    }
}
