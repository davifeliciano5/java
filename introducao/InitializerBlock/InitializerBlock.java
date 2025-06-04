package estudos.java.introducao.InitializerBlock;
/*
Blocos inicializadores estáticos sempre são executados antes dos blocos de
inicialização de instância, pois os blocos estáticos são executados no momento do
carregamento da classe.
No entanto, o bloco de instância é executado no momento da criação da instância.
 */

public class InitializerBlock {
    {
        System.out.println("oi");
    }
    static {
        System.out.println("oi sou o static");
    }
}
