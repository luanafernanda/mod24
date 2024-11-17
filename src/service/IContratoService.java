package service;

public interface IContratoService {
	
	String salvar();

   
	
	 String buscar(int id);
	 
	 boolean excluir(int id);
	 
	 boolean atualizar(int id, String novosDados);


}
