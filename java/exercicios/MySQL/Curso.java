package ExercicioMySQL;

public class Curso {
    private int id;
    private String nome;
    private int duracaoHoras;

    public Curso(int id, String nome, int duracaoHoras){
        this.id = id;
        this.nome = nome;
        this.duracaoHoras = duracaoHoras;
    }

    public Curso(){}

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getDuracaoHoras(){
        return duracaoHoras;
    }

    public void setDuracaoHoras(int duracaoHoras){
        this.duracaoHoras = duracaoHoras;
    }

    @Override
    public String toString(){
        final StringBuilder sb = new StringBuilder("Estudante: ");
        sb.append("\n   id -> ").append(id);
        sb.append("\n   nome -> ").append(nome);
        sb.append("\n   estudo (duração em horas) -> ").append(duracaoHoras);
        sb.append("\n----------------------------------------");
        return sb.toString();
    }
}
