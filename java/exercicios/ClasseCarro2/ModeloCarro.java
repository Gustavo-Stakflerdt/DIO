package aulas.oo.part02.construtores.exemplo003;

public class ModeloCarro {

    private final String marca;
    private final String modelo;
    private final String ano;

    public ModeloCarro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String marcaDoCarro(){
        return "A marca do carro é: " + this.marca;
    }

    public String modeloDoCarro(){
        return "O modelo do carro é: " + this.modelo;
    }

    public String anoDoCarro(){
        return "O ano do carro é: " + this.ano;
    }

    public String mensagemFinal(){
        return marcaDoCarro() + "\n" + modeloDoCarro() + "\n" + anoDoCarro();
    }


}
