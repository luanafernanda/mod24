package Test;

import service.ContratoService;
import service.IContratoService;
import dao.mocks.ContratoDao;
import dao.mocks.IContratoDao;

import org.junit.Assert;
import org.junit.Test;


public class ContratoServiceTest {
	
	 @Test
	    public void salvarTest() {
	        IContratoDao dao = new ContratoDao();
	        IContratoService service = new ContratoService(dao);
	        String retorno = service.salvar();
	        Assert.assertEquals("Sucesso", retorno);
	    }

	    @Test(expected = UnsupportedOperationException.class)
	    public void esperadoErroNoSalvarComBancoDeDadosTest() {
	        IContratoDao dao = new ContratoDao();
	        IContratoService service = new ContratoService(dao);
	        String retorno = service.salvar();
	        Assert.assertEquals("Sucesso", retorno);
	    }

	    @Test
	    public void buscarTest() {
	        
	        IContratoDao dao = new ContratoDao();
	        IContratoService service = new ContratoService(dao);

	        
	        service.salvar();

	        
	        String contrato = dao.buscar(1);

	      
	        Assert.assertEquals("Contrato 1", contrato);
	    }
	    
	    @Test
	    public void excluirTest() {
	    
	        IContratoDao dao = new ContratoDao();
	        IContratoService service = new ContratoService(dao);

	     
	        service.salvar();

	      
	        boolean excluido = dao.excluir(1);

	        
	        Assert.assertTrue(excluido);

	        
	        String contrato = dao.buscar(1);
	        Assert.assertNull(contrato);
	    }
	    
	    @Test
	    public void atualizarTest() {
	        
	        IContratoDao dao = new ContratoDao();
	        IContratoService service = new ContratoService(dao);

	        
	        service.salvar();

	        
	        boolean atualizado = dao.atualizar(1, "Contrato Atualizado");

	       
	        Assert.assertTrue(atualizado);

	        
	        String contratoAtualizado = dao.buscar(1);
	        Assert.assertEquals("Contrato Atualizado", contratoAtualizado);
	    }

	    

}
