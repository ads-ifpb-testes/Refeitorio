import com.ifpb.DAO.AlunoDAO;
import com.ifpb.DAO.AlunoDaoImpl;
import com.ifpb.exceptions.CampoInvalidoException;
import com.ifpb.exceptions.MatriculaExistenteException;
import com.ifpb.model.DiasSemana;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class CriarAlunoTest {

    private AlunoDAO alunoDao;

    @Before
    public void testStart() throws MatriculaExistenteException, CampoInvalidoException{
        alunoDao = new AlunoDaoImpl();
        alunoDao.create("201812010003", "David", "2018.1", "ADS",
                Arrays.asList(DiasSemana.SEGUNDA, DiasSemana.QUINTA), Arrays.asList(DiasSemana.QUARTA, DiasSemana.SEXTA));
    }

    @Test
    public void cadastroAluno() throws MatriculaExistenteException, CampoInvalidoException{
        try{
            Assert.assertTrue(alunoDao.create("201801020005", "Marcelo", "2018.1", "Engenharia Civil",
                    Arrays.asList(DiasSemana.SEGUNDA, DiasSemana.TERCA, DiasSemana.QUARTA), Arrays.asList(DiasSemana.SEGUNDA, DiasSemana.SEXTA)));
        }
        catch (MatriculaExistenteException e){
            System.out.println(e.getMessage());
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void cadastroAlunoMatriculaRepetida() throws MatriculaExistenteException, CampoInvalidoException{
        try{
            Assert.assertFalse(alunoDao.create("201812010003", "Maria", "2018.1", "ADS",
                    Arrays.asList(DiasSemana.SEGUNDA, DiasSemana.QUINTA), Arrays.asList(DiasSemana.QUARTA, DiasSemana.SEXTA)));
        }
        catch (MatriculaExistenteException e){
            System.out.println(e.getMessage());
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void cadastroAlunoDadosFaltando() throws MatriculaExistenteException, CampoInvalidoException{
        try{
            Assert.assertFalse(alunoDao.create("201812010044", "Maria", null, null,
                    Arrays.asList(DiasSemana.SEGUNDA, DiasSemana.QUINTA), Arrays.asList(DiasSemana.QUARTA, DiasSemana.SEXTA)));
        }
        catch (MatriculaExistenteException e){
            System.out.println(e.getMessage());
        }
        catch (CampoInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
