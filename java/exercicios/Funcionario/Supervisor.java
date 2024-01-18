package aulas.oo.part03.heranca.exemplo003;

public class Supervisor {

    public int salário;

    public Supervisor(int salário){
        this.salário = salário;
    }

    public double imposto() {
        return this.salário * 0.04;
    }
}
