package aulas.oo.part01.paradigma.exemplo001;

public class ExercicioClasseCarro {

    public int quantidade = 4;
    public boolean resp = true;

    public int AddOuSubtrai() {
        if (resp) {
            quantidade += 1;
            System.out.println("Adicionando uma pessoa no carro.");
        } else {
            quantidade -= 1;
            System.out.println("Removendo uma pessoa do carro.");
        }
        return quantidade;
    }

    public int quantidadeFinal = AddOuSubtrai();

    public String falarQuantidade() {
        return "Há " + quantidadeFinal + " pessoas dentro do carro." ;
    }
}
