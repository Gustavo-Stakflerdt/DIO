package aulas.oo.part03.heranca.exemplo003;

public class Gerente {

    public int salário;

    public Gerente(int salário){
        this.salário = salário;
    }

    public double imposto() {
        return this.salário * 0.07;
    }
}
