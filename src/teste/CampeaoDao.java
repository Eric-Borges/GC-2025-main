package teste;
import java.util.List;

public interface CampeaoDao {
    void inserir (Campeao campeao);
    List<Campeao> listar();
}
