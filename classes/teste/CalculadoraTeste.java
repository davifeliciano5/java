package estudos.java.classes.teste;

import estudos.java.classes.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("******************************");
        calculadora.subtraiDoisNumero();
        System.out.println("******************************");
        calculadora.multiplicaDoisNumeros(4,2);
        System.out.println("******************************");
        double resultado = calculadora.divideDoisNumeros(10,5);
        System.out.println(resultado);
    }
}
