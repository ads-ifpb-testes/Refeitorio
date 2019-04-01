import com.ifpb.DAO.AlunoDAO;
import com.ifpb.DAO.AlunoDaoImpl;
import com.ifpb.exceptions.CampoInvalidoException;
import com.ifpb.exceptions.CampoVazioException;
import com.ifpb.exceptions.MatriculaExistenteException;
import com.ifpb.model.DiasSemana;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BuscarAlunoTest {

    private AlunoDAO alunoDao;

    @Before
    public void testStart() throws MatriculaExistenteException, CampoInvalidoException{
        alunoDao = new AlunoDaoImpl();
        alunoDao.create("201812010003", "David", "2018.1", "ADS",
                Arrays.asList(DiasSemana.SEGUNDA, DiasSemana.QUINTA), Arrays.asList(DiasSemana.QUARTA, DiasSemana.SEXTA));
    }

    @Test
    public void buscarAluno() throws CampoVazioException, CampoInvalidoException {
        try{
            Assert.assertNotNull(alunoDao.read("201812010003"));
        }
        catch (CampoVazioException e){
            System.out.println(e.getMessage());
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buscarAlunoInexistente() throws CampoVazioException, CampoInvalidoException {
        try{
            Assert.assertNull(alunoDao.read("201812010067"));
        }
        catch (CampoVazioException e){
            System.out.println(e.getMessage());
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void buscarAlunoMatriculaInvalida() throws CampoVazioException, CampoInvalidoException {
        try{
            Assert.assertNull(alunoDao.read("2018124"));
        }
        catch (CampoVazioException e){
            System.out.println(e.getMessage());
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
