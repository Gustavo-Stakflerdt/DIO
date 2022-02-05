package ExercicioMySQL;

import java.sql.SQLOutput;
import java.util.List;

public class QueryExecution {
    public static void main(String[] args) {
        CursoDAO cursoDAO = new CursoDAO();

        List<Curso> estudantes = cursoDAO.list();

        estudantes.stream().forEach(System.out::println);
    }
}
