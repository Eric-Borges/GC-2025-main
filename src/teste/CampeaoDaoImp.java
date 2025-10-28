package teste;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Stack;

public class CampeaoDaoImp {
    private final Connection con;

    public CampeaoDaoImp(Connection con);

    public void inserir(campeao campeao) throws SQLException

    Statement stmt = con.createStatement();
}
