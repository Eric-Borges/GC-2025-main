package teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        String url =
        String user =
        String pass =
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
            Connection conexao = DriverManager.getConnection(url, user, pass);
            Campeao c1 = new Campeao(1, "Kled")
        }
    }
}