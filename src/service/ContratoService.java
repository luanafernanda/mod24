package service;

import dao.mocks.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }
    
    
    @Override
    public String buscar(int id) {
        String contrato = contratoDao.buscar(id);
        if (contrato == null) {
            return "Contrato não encontrado.";
        }
        return contrato;
    }

    @Override
    public boolean excluir(int id) {
        boolean excluido = contratoDao.excluir(id);
        return excluido;
    }

    @Override
    public boolean atualizar(int id, String novosDados) {
        boolean atualizado = contratoDao.atualizar(id, novosDados);
        return atualizado;
    }
}
