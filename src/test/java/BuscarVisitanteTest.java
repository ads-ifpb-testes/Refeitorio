import com.ifpb.DAO.VisitanteDAO;
import com.ifpb.DAO.VisitanteDaoImpl;
import com.ifpb.exceptions.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuscarVisitanteTest {

    private VisitanteDAO visitanteDao;
    private String codigo;

    @Before
    public void testStart() throws CampoVazioException, CampoInvalidoException{
        visitanteDao = new VisitanteDaoImpl();
        codigo = visitanteDao.create("David", 3);
    }

    @Test
    public void buscarVisitante() throws CodigoInexistenteException, CodigoInvalidoException{
        try{
            Assert.assertNotNull(visitanteDao.read(codigo));
        }
        catch (CodigoInexistenteException e){
            System.out.println(e.getMessage());
        }
        catch (CodigoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buscarVisitanteInexistente() throws CodigoInexistenteException, CodigoInvalidoException{
        try{
            Assert.assertNull(visitanteDao.read("AAAAAAAA"));
            //chance de repetição: 1 em aprox. 2.821.109.907.000
        }
        catch (CodigoInexistenteException e){
            System.out.println(e.getMessage());
        }
        catch (CodigoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buscarVisitanteCodigoInvalido() throws CodigoInexistenteException, CodigoInvalidoException{
        try{
            Assert.assertNull(visitanteDao.read("1111"));
        }
        catch (CodigoInexistenteException e){
            System.out.println(e.getMessage());
        }
        catch (CodigoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
