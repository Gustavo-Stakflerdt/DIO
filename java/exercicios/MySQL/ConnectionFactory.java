package ExercicioMySQL;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    private ConnectionFactory() {
        throw new UnsupportedOperationException();
    }

    public static Connection getConnection(){
        Connection connection = null;

        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("connection.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            String url = "jdbc:mysql://localhost:3306/digital_innovation_one?useTimezone=true&serverTimezone=UTC";
            String user = prop.getProperty("db.user.login");
            String password = prop.getProperty("db.user.password");

            try{
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e){
                System.out.println("Falha ao tentar criar conexão!");
                throw new RuntimeException(e);
            }

        } catch (IOException e) {
            System.out.println("FALHA ao tentar carregar arquivos de propriedades");
            e.printStackTrace();
        }

        return connection;
    }
}
