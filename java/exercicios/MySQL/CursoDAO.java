package ExercicioMySQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO {
    public List<Curso> list(){
        List<Curso> estudantes = new ArrayList<>();

        try (Connection conn = ConnectionFactory.getConnection()){
            String sql = ("SELECT * FROM curso");

            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                int duracaoHoras = rs.getInt("duracaoHoras");

                estudantes.add(new Curso(id, nome, duracaoHoras));
            }

        } catch (SQLException e) {
            System.out.println("Listagem de estudantes falhou!");
            e.printStackTrace();
        }

        return estudantes;
    }
}
