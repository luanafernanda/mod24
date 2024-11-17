package dao.mocks;

public interface IContratoDao {

	void salvar();
	
	String buscar(int id);
    
    
    boolean excluir(int id);
    
    
    boolean atualizar(int id, String novosDados);

    
}
