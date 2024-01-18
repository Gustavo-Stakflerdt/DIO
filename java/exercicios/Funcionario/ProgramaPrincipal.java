package aulas.oo.part03.heranca.exemplo003;

public class ProgramaPrincipal {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(1000);
        Supervisor supervisor = new Supervisor(4000);
        Gerente gerente = new Gerente(7000);

        System.out.println("Salário do funcionário: R$" + funcionario.salário);
        System.out.println("Imposto a pagar: R$" + funcionario.imposto());

        System.out.println("------------------------------");

        System.out.println("Salário do supervisor: R$" + supervisor.salário);
        System.out.println("Imposto a pagar: R$" + supervisor.imposto());

        System.out.println("------------------------------");

        System.out.println("Salário do gerente: R$" + gerente.salário);
        System.out.println("Imposto a pagar: R$" + gerente.imposto());
    }
}
