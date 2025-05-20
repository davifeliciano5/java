package estudos.java.introducao.teste;

import estudos.java.introducao.ModificadoresDeAcesso;

public class ModificadoresDeAcessoTeste {
    public static void main(String[] args) {
        ModificadoresDeAcesso modicador = new ModificadoresDeAcesso();

        System.out.println(ModificadoresDeAcesso.NomeEmpresa);
        System.out.println(modicador.NomecomFinal);
        System.out.println(ModificadoresDeAcesso.NomeComFinalEStatic);
    }
}
