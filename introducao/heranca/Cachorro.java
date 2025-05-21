package estudos.java.introducao.heranca;

public class Cachorro extends HerancaAnimal{

    public String getNome(){
        return this.nome;
    }
    public String getLatir(){
        if (this.latir == false){
            return "Este animal não late";
        }
        return "AUUUUUUUUUU hau hau hau";
    }

}
