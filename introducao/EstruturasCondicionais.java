package estudos.java.introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;

        if (idade<15){
            System.out.println("Categoria infantil");
        } else if (idade >=15 && idade < 18) {
            System.out.println("Categoria juvenil");
        }else{
            System.out.println("Categoria adulto");
        }

    }
}
