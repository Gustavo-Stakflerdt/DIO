package aulas.oo.part02.construtores.exemplo003;

public class CarroProgramaPrincipal {

    public static void main(String[] args){

        ModeloCarro modeloCarro = new ModeloCarro("BMW", "BMW X5", "2019");

        // Acessando todos os dados separadamente:
        // System.out.println(modeloCarro.marcaDoCarro());
        // System.out.println(modeloCarro.modeloDoCarro());
        // System.out.println(modeloCarro.anoDoCarro());

        System.out.println(modeloCarro.mensagemFinal());
    }

}
