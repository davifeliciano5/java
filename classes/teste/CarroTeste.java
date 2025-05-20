package estudos.java.classes.teste;

import estudos.java.classes.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.Modelo = "GM-Chevrolet";
        carro.nome = "Celta";
        carro.Ano = "2006/2007";

        System.out.println(carro.nome+" "+carro.Modelo+" "+carro.Ano);
    }
}
