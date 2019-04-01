import com.ifpb.DAO.VisitanteDAO;
import com.ifpb.DAO.VisitanteDaoImpl;
import com.ifpb.exceptions.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CriarVisitanteTest {

    private VisitanteDAO visitanteDao;

    @Before
    public void testStart() throws CampoVazioException, CampoInvalidoException{
        visitanteDao = new VisitanteDaoImpl();
        visitanteDao.create("David", 3);
    }

    @Test
    public void cadastroVisitante() throws CampoVazioException, CampoInvalidoException{
        try{
            Assert.assertNotNull(visitanteDao.create("Rafael", 3));
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
        catch (CampoVazioException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void cadastroVisitanteCampoVazio() throws CampoVazioException, CampoInvalidoException{
        try{
            Assert.assertNull(visitanteDao.create(null, 3));
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
        catch (CampoVazioException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void cadastroVisitanteDiasInvalidos() throws CampoVazioException, CampoInvalidoException{
        try{
            Assert.assertNull(visitanteDao.create("Marcos", -3));
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
        catch (CampoVazioException e){
            System.out.println(e.getMessage());
        }
    }
}
