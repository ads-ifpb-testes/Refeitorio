import com.ifpb.DAO.AlunoDAO;
import com.ifpb.DAO.AlunoDaoImpl;
import com.ifpb.exceptions.AlunoInexistenteException;
import com.ifpb.exceptions.CampoInvalidoException;
import com.ifpb.exceptions.MatriculaExistenteException;
import com.ifpb.exceptions.MatriculaInvalidaException;
import com.ifpb.model.DiasSemana;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class RemoverAlunoTest {

    private AlunoDAO alunoDao;

    @Before
    public void testStart() throws MatriculaExistenteException, CampoInvalidoException{
        alunoDao = new AlunoDaoImpl();
        alunoDao.create("201812010003", "David", "2018.1", "ADS",
                Arrays.asList(DiasSemana.SEGUNDA, DiasSemana.QUINTA), Arrays.asList(DiasSemana.QUARTA, DiasSemana.SEXTA));
    }

    @Test
    public void removerAluno() throws AlunoInexistenteException, MatriculaInvalidaException{
        try{
            Assert.assertTrue(alunoDao.delete("201812010003"));
        }
        catch (AlunoInexistenteException e){
            System.out.println(e.getMessage());
        }
        catch (MatriculaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void removerAlunoInexistente() throws AlunoInexistenteException, MatriculaInvalidaException{
        try{
            Assert.assertFalse(alunoDao.delete("201812010555"));
        }
        catch (AlunoInexistenteException e){
            System.out.println(e.getMessage());
        }
        catch (MatriculaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void removerAlunoMatriculaInvalida() throws AlunoInexistenteException, MatriculaInvalidaException{
        try{
            Assert.assertFalse(alunoDao.delete("2222222"));
        }
        catch (AlunoInexistenteException e){
            System.out.println(e.getMessage());
        }
        catch (MatriculaInvalidaException e){
            System.out.println(e.getMessage());
        }
    }
}
