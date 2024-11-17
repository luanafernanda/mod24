package dao.mocks;

import java.util.HashMap;
import java.util.Map;

public class ContratoDao implements IContratoDao {
	
	 private Map<Integer, String> contratos = new HashMap<>();
	    private int idCounter = 1;

    @Override
    public void salvar() {
       // throw new UnsupportedOperationException("Não funciona com o banco");
    	String contrato = "Contrato " + idCounter;
        contratos.put(idCounter++, contrato);  
        System.out.println("Contrato salvo: " + contrato);
    }

	@Override
	public String buscar(int id) {
		 return contratos.get(id);
	}

	@Override
	public boolean excluir(int id) {
		if (contratos.containsKey(id)) {
            contratos.remove(id);
            System.out.println("Contrato com ID " + id + " excluído.");
            return true;
        }
        return false;  
	}

	@Override
	public boolean atualizar(int id, String novosDados) {
		if (contratos.containsKey(id)) {
            contratos.put(id, novosDados);
            System.out.println("Contrato com ID " + id + " atualizado para: " + novosDados);
            return true;
        }
        return false;  
    }
	}


