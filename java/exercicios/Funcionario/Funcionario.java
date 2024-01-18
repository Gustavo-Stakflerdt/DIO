package aulas.oo.part03.heranca.exemplo003;

public class Funcionario {

    public int salário;

    public Funcionario(int salário){
        this.salário = salário;
    }

    public double imposto() {
        return this.salário * 0.01;
    }
}
